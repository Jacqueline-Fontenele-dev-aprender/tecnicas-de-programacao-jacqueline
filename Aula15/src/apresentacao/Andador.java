package apresentacao;

public class Andador extends Robo{

	public Andador(int id, int posicaox, int posicaoy) {
		super(id, "Andador", "a", posicaox, posicaoy);
	}
	
	@Override
	public Boolean AlterarPosicao(int x, int y) {
		
		if(this.getPosicaoy() == y){
			setPosicaox(x);
			return true;
		}
		
		return false;
	}

}
