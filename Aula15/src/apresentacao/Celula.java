package apresentacao;

import java.util.ArrayList;

public class Celula {

	private int posicaoX;
	private int posicaoY;
	private int id;
	private ArrayList<Robo> robos;
	private Boolean visitado;
	private Boolean aluno;
	private Boolean bug;
	
	public Celula(int id, int x , int y) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		robos = new ArrayList<>();
		this.visitado = false;
		this.aluno = false;
		this.bug = false;
	}
	
	

	public Boolean getVisitado() {
		return visitado;
	}



	public void setVisitado(Boolean visitado) {
		this.visitado = visitado;
	}



	public Boolean getAluno() {
		return aluno;
	}



	public void setAluno(Boolean aluno) {
		this.aluno = aluno;
	}



	public Boolean getBug() {
		return bug;
	}



	public void setBug(Boolean bug) {
		this.bug = bug;
	}



	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void adicionarRobo(Robo robo){
		this.visitado = true;
		this.robos.add(robo);
	}
	
	public Boolean removerRobo(Robo robo){
		for (int i = 0; i < robos.size(); i++) {
			if(robo.equals(robos.get(i))) {
				robos.remove(i);
				return true;
			}
		}
		return false;
	}

	public ArrayList<Robo> getRobos() {
		return robos;
	}

	public void setRobos(ArrayList<Robo> robos) {
		this.robos = robos;
	}
	
	

}
