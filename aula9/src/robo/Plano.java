package robo;

import java.util.ArrayList;

public class Plano {

	private ArrayList<Celula> listaCelulas;
	private int tamanhoX;
	private int tamanhoY;

	public Plano(int tamanhoX, int tamanhoY) {
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
		listaCelulas = new ArrayList<Celula>();
			int contador = 1;
			for (int i = 1; i <= tamanhoX; i++) {
				for (int j = 1; j <= tamanhoY; j++) {
					Celula celula = new Celula(contador, i, j);
					listaCelulas.add(celula);
					contador++;
				}
			}
	}
	
	public int getTamanhoX() {
		return tamanhoX;
	}

	public void setTamanhoX(int tamanhoX) {
		this.tamanhoX = tamanhoX;
	}

	public int getTamanhoY() {
		return tamanhoY;
	}

	public void setTamanhoY(int tamanhoY) {
		this.tamanhoY = tamanhoY;
	}

	public ArrayList<Celula> getListaCelulas() {
		return listaCelulas;
	}

	public void setListaCelulas(ArrayList<Celula> listaCelulas) {
		this.listaCelulas = listaCelulas;
	}

	public Celula getCelula(int x, int y) {
		for (int i = 0; i < listaCelulas.size(); i++) {
			if (listaCelulas.get(i).getPosicaoX() == x && listaCelulas.get(i).getPosicaoY() == y) {
				return listaCelulas.get(i);
			}
		}
		return null;
	}
	
	public void atualizaPontuacao(){
		for (int i = 0; i < this.listaCelulas.size(); i++) {
			if(this.listaCelulas.get(i).getAluno() && !this.listaCelulas.get(i).getVisitado() && (this.listaCelulas.get(i).getRobos().size() > 0)) {
				for (int j = 0; j < this.listaCelulas.get(i).getRobos().size(); j++) {
					this.listaCelulas.get(i).getRobos().get(j).setPontuacao(this.listaCelulas.get(i).getRobos().get(j).getPontuacao() + 10);
				}
				this.listaCelulas.get(i).setVisitado(true);
			}else if(this.listaCelulas.get(i).getBug() && !this.listaCelulas.get(i).getVisitado() && (this.listaCelulas.get(i).getRobos().size() > 0)) {
				for (int j = 0; j < this.listaCelulas.get(i).getRobos().size(); j++) {
					this.listaCelulas.get(i).getRobos().get(j).setPontuacao(this.listaCelulas.get(i).getRobos().get(j).getPontuacao() - 15);
				}
				this.listaCelulas.get(i).setVisitado(true);
			}
		}
	}
	
	public int alunosEncontrados(){
		int contador = 0;
		for (int i = 0; i < this.listaCelulas.size(); i++) {
			if(this.listaCelulas.get(i).getAluno() && this.listaCelulas.get(i).getVisitado()) {
				contador++;
			}
		}
		return contador;
	}
	
	public int bugsEncontrados(){
		int contador = 0;
		for (int i = 0; i < this.listaCelulas.size(); i++) {
			if(this.listaCelulas.get(i).getBug() && this.listaCelulas.get(i).getVisitado()) {
				contador++;
			}
		}
		return contador;
	}
	
	public Boolean verificaFimJogo(){
		for (int i = 0; i < this.listaCelulas.size(); i++) {
			if(this.listaCelulas.get(i).getAluno() && !this.listaCelulas.get(i).getVisitado()) {
				return false;
			}
		}
		return true;
	}

	public void imprimirPlano() {
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("\t");
		for (int j = 1; j <= this.tamanhoY; j++) {
			System.out.print("\t" + j);
		}
		System.out.println();
		
		for (int i = this.tamanhoX; i >= 1; i--) {
			System.out.print(i + "\t");
			for (int j = 1; j <= this.tamanhoY; j++) {
				if(this.getCelula(i, j).getRobos().size() == 1) {
					System.out.print(this.getCelula(i, j).getRobos().get(0).getSigla() + "\t");
				}else if(this.getCelula(i, j).getRobos().size() > 1) {
					System.out.print("M\t");
				}else {
					if(this.getCelula(i, j).getVisitado()) {
						if(this.getCelula(i, j).getAluno()) {
							System.out.print("A\t");
						}else if(this.getCelula(i, j).getBug()) {
							System.out.print("B\t");
						}else {
							System.out.print("V\t");
						}
					}else {
						System.out.print("#\t");
					}
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("Legenda: \nA - Aluno \nB - Bug \nV - Visitado \n# - Nao Visitado \na - Andador\nb - Bispo\nc - Cavalo\np - Peao\nr - Rainha\nR - Rei\nt - Torre\nM - mais de um robo na mesma celula");
		System.out.println("--------------------------------------------------------------");
	}

}
