package apresentacao;

public class Peao extends Robo{

	public Peao(int id, int posicaox, int posicaoy) {
		super(id, "Peao", "p", posicaox, posicaoy);
	}
	
	@Override
public Boolean AlterarPosicao(int x, int y) {
		
		if(this.getPosicaox() == x && Math.abs(this.getPosicaoy() - y) <= 1){
			setPosicaox(x);
			setPosicaoy(y);
			return true;
		}
		
		return false;
	}

}
