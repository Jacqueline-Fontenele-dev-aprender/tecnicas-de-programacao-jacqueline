package robo;

public class Peao extends Robo{

	public Peao(int id, int posicaox, int posicaoy, Plano plano) {
		super(id, "Peao", "p", posicaox, posicaoy, plano);
	}
	
	@Override
	public Boolean Avancar(int tamanhoMovimento) {
		
		if(tamanhoMovimento > 1) return false;
		
		Celula antigaCelula = this.getPlano().getCelula(this.getPosicaox(), this.getPosicaoy());
		Celula novaCelula = this.getPlano().getCelula(this.getPosicaox(), this.getPosicaoy() + tamanhoMovimento);
		
		try {
			antigaCelula.removerRobo(this);
			novaCelula.adicionarRobo(this);
			this.setPosicaox(novaCelula.getPosicaoX());
			this.setPosicaoy(novaCelula.getPosicaoY());
		}catch (Exception e) {
			return false;
		}
		
		return true;
	}

	@Override
	public Boolean Retroceder(int tamanhoMovimento) {

		if(tamanhoMovimento > 1) return false;
		
		Celula antigaCelula = this.getPlano().getCelula(this.getPosicaox(), this.getPosicaoy());
		Celula novaCelula = this.getPlano().getCelula(this.getPosicaox(), this.getPosicaoy() - tamanhoMovimento);
		
		try {
			antigaCelula.removerRobo(this);
			novaCelula.adicionarRobo(this);
			this.setPosicaox(novaCelula.getPosicaoX());
			this.setPosicaoy(novaCelula.getPosicaoY());
		}catch (Exception e) {
			return false;
		}
		
		return true;
	}
}
