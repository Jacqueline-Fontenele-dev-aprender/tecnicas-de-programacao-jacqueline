package apresentacao;

public class Rei extends Robo{

	public Rei(int id, int posicaox, int posicaoy) {
		super(id, "Rei", "R", posicaox, posicaoy);
	}
	
	@Override
	public Boolean AlterarPosicao(int x, int y) {
		
		if((this.getPosicaox() + this.getPosicaoy()) == (x + y) && Math.abs(this.getPosicaox() - x) <= 2){
			setPosicaox(x);
			setPosicaoy(y);
			return true;
		}
		
		return false;
	}	
}
