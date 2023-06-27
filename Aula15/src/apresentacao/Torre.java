package apresentacao;

public class Torre extends Robo{

	public Torre(int id, int posicaox, int posicaoy) {
		super(id, "Torre", "t", posicaox, posicaoy);
	}
	
	@Override
	public Boolean AlterarPosicao(int x, int y) {
		
		if(this.getPosicaoy() == y && Math.abs(this.getPosicaox() - x) <= 2){
			setPosicaox(x);
			return true;
		}
		
		return false;
	}
	
}
