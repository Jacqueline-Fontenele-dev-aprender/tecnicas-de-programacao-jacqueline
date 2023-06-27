package apresentacao;

public class Rainha extends Robo{

	public Rainha(int id, int posicaox, int posicaoy) {
		super(id, "Rainha", "r", posicaox, posicaoy);
	}
	
	@Override
	public Boolean AlterarPosicao(int x, int y) {
		
		if((this.getPosicaox() - this.getPosicaoy()) == (x - y) && Math.abs(this.getPosicaox() - x) <= 4){
			setPosicaox(x);
			setPosicaoy(y);
			return true;
		}
		
		return false;
	}

}
