package apresentacao;

public class Cavalo extends Robo{

	public Cavalo(int id, int posicaox, int posicaoy) {
		super(id, "Cavalo", "c", posicaox, posicaoy);
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
