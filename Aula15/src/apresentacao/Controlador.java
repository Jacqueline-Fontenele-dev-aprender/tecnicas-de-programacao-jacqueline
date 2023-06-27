package apresentacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Controlador {
	
	private int m;
	private int n;
	private int iter;
	private PosicaoBotao [][] botoes;
	private ArrayList<Robo> robos;
	private int pontuacao;
	
	public Controlador(int m, int n) {
		super();
		this.m = m;
		this.n = n;
		this.iter = 0;
		this.robos = new ArrayList<>();
		this.pontuacao = 0;
	}
	
	public int getIter() {
		return iter;
	}



	public void setIter(int iter) {
		this.iter = iter;
	}



	public int getPontuacao() {
		return pontuacao;
	}



	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}



	public boolean verificaFimJogo(){
		for (int i = 0; i < this.m; i++) {
			for (int j = 0; j < this.n; j++) {
				if(this.botoes[i][j].isAluno() && this.botoes[i][j].getBotao().getText().equals("#")){
					return false;
				}
			}
		}
		return true;
	}
	
	public void adicionarRobosInicial() {
		Andador andador = new Andador(0, 0, 0);
		this.botoes[0][0].adicionarRobo(andador);
		this.robos.add(andador);
		
		Bispo bispo = new Bispo(1, 0, 1);
		this.botoes[0][1].adicionarRobo(bispo);
		robos.add(bispo);
		
		Cavalo cavalo = new Cavalo(2, 0, 2);
		this.botoes[0][2].adicionarRobo(cavalo);
		robos.add(cavalo);
		
		Peao peao = new Peao(3, 0, 3);
		this.botoes[0][3].adicionarRobo(peao);
		robos.add(peao);
		
		Rainha rainha = new Rainha(4, 0, 4);
		this.botoes[0][4].adicionarRobo(rainha);
		robos.add(rainha);
		
		Rei rei = new Rei(5, 0, 5);
		this.botoes[0][5].adicionarRobo(rei);
		robos.add(rei);
		
		Torre torre = new Torre(6, 0, 6);
		this.botoes[0][6].adicionarRobo(torre);
		robos.add(torre);
		
		int numeroAlunos = 5;
		
		Random aleatorio = new Random();
		
		while(numeroAlunos > 0) {
			int x = aleatorio.nextInt(this.m);
			int y = aleatorio.nextInt(this.n);
			if(!this.botoes[x][y].isAluno() && !this.botoes[x][y].isBug()) {
				this.botoes[x][y].setAluno(true);
				numeroAlunos--;
			}
		}
		
		
		int numeroBugs = 5;
		
		while(numeroBugs > 0) {
			int x = aleatorio.nextInt(this.m);
			int y = aleatorio.nextInt(this.n);
			if(!this.botoes[x][y].isAluno() && !this.botoes[x][y].isBug()) {
				this.botoes[x][y].setBug(true);
				numeroBugs--;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Escolha a posicao do robo " + robos.get(iter % robos.size()).getNome());
	}
	
	public void executarAcao(int x, int y){
		
		int x_anterior = robos.get(iter % robos.size()).getPosicaox();
		int y_anterior = robos.get(iter % robos.size()).getPosicaoy();
		
		boolean aluno = this.botoes[x][y].isAluno() && (this.botoes[x][y].getBotao().getText().equals("#"));
		boolean bug = this.botoes[x][y].isBug() && (this.botoes[x][y].getBotao().getText().equals("#"));
		
		if(robos.get(iter % robos.size()).AlterarPosicao(x, y)){
			botoes[x_anterior][y_anterior].removerRobo(robos.get(iter % robos.size()));
			botoes[x][y].adicionarRobo(robos.get(iter % robos.size()));
			iter++;
			if(aluno){
				this.pontuacao += 10;
			}else {
				this.pontuacao -= 15;
			}
			
			if(verificaFimJogo()) {
				JOptionPane.showMessageDialog(null, "Fim de Jogo! Pontuacao: " + this.pontuacao);
			}
			
			JOptionPane.showMessageDialog(null, "Escolha a posicao do robo " + robos.get(iter % robos.size()).getNome());
		}else{
			JOptionPane.showMessageDialog(null, "Movimento Invalido");
			JOptionPane.showMessageDialog(null, "Escolha a posicao do robo " + robos.get(iter % robos.size()).getNome());
		}
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public PosicaoBotao[][] getBotoes() {
		return botoes;
	}

	public void setBotoes(PosicaoBotao[][] botoes) {
		this.botoes = botoes;
	}

	public ArrayList<Robo> getRobos() {
		return robos;
	}

	public void setRobos(ArrayList<Robo> robos) {
		this.robos = robos;
	}
	
	
	

}
