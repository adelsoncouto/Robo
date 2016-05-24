package br.com.adelsoncouto.gui;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.util.ArrayList;
import javax.swing.JToggleButton;

import br.com.adelsoncouto.util.Arquivo;
import br.com.adelsoncouto.util.Configuracao;

public class RoboIni implements Runnable {
	private boolean repete;
	private static Robot rob;

	public static int getVelocidade() {
		return velocidade;
	}

	public static void setVelocidade(int aVelocidade) {
		velocidade = aVelocidade;
	}

	private static int velocidade = 10;
	private static ArrayList listTarefas;
	private static ArrayList vens = new ArrayList();
	private static ArrayList lista = new ArrayList();
	private int idListTarefas;
	private int idLista;
	private boolean ver;
	private boolean observa;

	public RoboIni() {
		this.repete = true;

		this.idListTarefas = 0;
		this.idLista = 0;
	}

	public void inicia(String aTarefa) {
		listTarefas = Arquivo.carregaConfigList(aTarefa);
		for (int l = 0; l < listTarefas.size(); l++) {
			Configuracao conf = (Configuracao) listTarefas.get(l);
			if (conf.getCampo().toUpperCase().equals("VEM")) {
				Posicao posicao = new Posicao();
				posicao.setNome(conf.getValor().toUpperCase());
				posicao.setPosicao(l);
				vens.add(posicao);
			}
		}
		try {
			rob = new Robot();
			rob.setAutoWaitForIdle(true);
		} catch (AWTException e) {
			Principal.setMensagem("Erro nas tarefas: " + e);
		}
		new Thread(this).start();
	}

	public void tarefas() {
		Configuracao acao = (Configuracao) listTarefas.get(this.idListTarefas);
		String ac = acao.getCampo().toUpperCase();
		String av = acao.getValor();
		if (this.observa) {
			ac = ac.replaceAll("OBSERVOUTRUE", "");
		} else {
			ac = ac.replaceAll("OBSERVOUFALSE", "");
		}

		if (this.ver) {
			ac = ac.replaceAll("VIUTRUE", "");
		} else {
			ac = ac.replaceAll("VIUFALSE", "");
		}

		if (ac.equals("LISTA")) {
			String[] list = av.split(",");
			String listArquivo = list[0];
			String listSeparador = list[1];
			ArrayList listLista = Arquivo.carregaStringList(listArquivo);
			for (int x = 0; x < listLista.size(); x++) {
				String[] ll = listLista.get(x).toString().split(listSeparador);
				lista.add(ll);
			}
		}

		if (ac.equals("LISTATECLAS")) {
			String[] v = (String[]) lista.get(this.idLista);
			Tarefas.teclas(v[Integer.parseInt(av)], rob);
		}
		if (ac.equals("LISTATECLACODIGO")) {
			String[] v = (String[]) lista.get(this.idLista);
			Tarefas.teclaCodigo(rob, v[Integer.parseInt(av)]);
		}

		if (ac.equals("LISTAPROXIMO")) {
			this.idLista += 1;
			if (this.idLista >= lista.size()) {
				setRepete(false);
				Principal.jtbTarefas.setSelected(false);
				this.idLista = 0;
				listTarefas.clear();
				lista.clear();
				vens.clear();
				this.idListTarefas = 0;
			}
		}

		if (ac.equals("FILMA")) {
			String[] c = av.split(",");
			Tarefas.filma(rob, Integer.parseInt(c[0]), Integer.parseInt(c[1]));
		}

		if (ac.equals("OCULTA")) {
			Frame[] f = Principal.getFrames();
			for (int i = 0; i < f.length; i++) {
				if (f[i].getTitle().toUpperCase().equals("ROB O ROBÔ")) {
					f[i].setVisible(false);
				}
			}
		}
		if (ac.equals("MOSTRA")) {
			Frame[] f = Principal.getFrames();
			for (int i = 0; i < f.length; i++) {
				if (f[i].getTitle().toUpperCase().equals("ROB O ROBÔ")) {
					f[i].setVisible(true);
				}
			}
		}

		if (ac.equals("TECLAS"))
			Tarefas.teclas(av, rob);
		if (ac.equals("TECLACODIGO"))
			Tarefas.teclaCodigo(rob, av);
		if (ac.equals("TECLAFUNCAO")) {
			String[] v = av.split(",");
			boolean a = false;
			boolean s = false;
			if (v[1].toUpperCase().equals("TRUE"))
				a = true;
			if (v[2].toUpperCase().equals("TRUE"))
				s = true;
			Tarefas.teclaFuncao(v[0], a, s, rob);
		}

		if (ac.equals("OBSERVA")) {
			String[] v = av.split(",");
			this.observa = Tarefas.observa(Integer.parseInt(v[0]), Integer.parseInt(v[1]), Integer.parseInt(v[2]), rob);
		}
		if (ac.equals("ESPERA")) {
			Tarefas.espera(rob, Integer.parseInt(av));
		}
		if (ac.equals("CLICA"))
			Tarefas.clica(rob);
		if (ac.equals("PARAR")) {
			setRepete(false);
			Principal.jtbTarefas.setSelected(false);
		}

		if (ac.equals("MOVE")) {
			String[] v = av.split(",");
			Tarefas.move(Integer.parseInt(v[0]), Integer.parseInt(v[1]), rob);
		}
		if (ac.equals("VER")) {
			String[] v = av.split(",");
			this.ver = Tarefas.ver(rob, Integer.parseInt(v[0]), Integer.parseInt(v[1]), Integer.parseInt(v[2]),
					Integer.parseInt(v[3]), Integer.parseInt(v[4]), Integer.parseInt(v[5]));
		}
		if (ac.equals("VAI")) {
			this.idListTarefas = getPosicao(av).getPosicao();
		} else {
			this.idListTarefas += 1;
		}
		if (this.idListTarefas == listTarefas.size()) {
			setRepete(false);
			Principal.jtbTarefas.setSelected(false);
			this.idListTarefas = 0;
			listTarefas.clear();
			lista.clear();
			vens.clear();
		}
	}

	public void run() {
		while (isRepete()) {
			try {
				Thread.sleep(getVelocidade());
				tarefas();
			} catch (InterruptedException ie) {
				Principal.setMensagem("Erro: " + ie);
			}
		}
	}

	public boolean isRepete() {
		return this.repete;
	}

	public void setRepete(boolean repete) {
		this.repete = repete;
	}

	private Posicao getPosicao(String nome) {
		Posicao pos = null;
		for (int x = 0; x < vens.size(); x++) {
			Posicao p = (Posicao) vens.get(x);
			if (p.getNome().equals(nome.toUpperCase())) {
				pos = p;
			}
		}
		return pos;
	}

	private class Posicao {
		private String nome;
		private int posicao;

		private Posicao() {
		}

		public String getNome() {
			return this.nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getPosicao() {
			return this.posicao;
		}

		public void setPosicao(int posicao) {
			this.posicao = posicao;
		}
	}
}

/*
 * Location: /opt/lampp/htdocs/robo/Robo.jar!/gui/RoboIni.class Java compiler
 * version: 6 (50.0) JD-Core Version: 0.7.1
 */