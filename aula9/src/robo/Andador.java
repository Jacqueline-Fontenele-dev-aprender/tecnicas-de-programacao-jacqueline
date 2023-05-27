package robo;

public class Andador extends Robo{

	public Andador(int id, int posicaox, int posicaoy, Plano plano) {
		super(id, "Andador", "a", posicaox, posicaoy, plano);
	}
	
	@Override
	public Boolean Avancar(int tamanhoMovimento) {
		
		Celula antigaCelula = this.getPlano().getCelula(this.getPosicaox(), this.getPosicaoy());
		Celula novaCelula = this.getPlano().getCelula(this.getPosicaox() + tamanhoMovimento, this.getPosicaoy());
		
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
		Celula antigaCelula = this.getPlano().getCelula(this.getPosicaox(), this.getPosicaoy());
		Celula novaCelula = this.getPlano().getCelula(this.getPosicaox() - tamanhoMovimento, this.getPosicaoy());
		
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
