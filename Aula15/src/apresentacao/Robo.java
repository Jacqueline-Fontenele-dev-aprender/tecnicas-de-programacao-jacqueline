package apresentacao;

abstract class Robo {

	private int id;
	private String nome;
	private String sigla;
	private int posicaox;
	private int posicaoy;
	private int pontuacao;

	public Robo(int id, String nome, String sigla, int posicaox, int posicaoy) {
		super();
		this.id = id;
		this.nome = nome;
		this.sigla = sigla;
		this.posicaox = posicaox;
		this.posicaoy = posicaoy;
		this.pontuacao = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getPosicaox() {
		return posicaox;
	}

	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}

	public int getPosicaoy() {
		return posicaoy;
	}

	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Boolean AlterarPosicao(int x, int y) {
		
		if(this.getPosicaoy() == y){
			setPosicaox(x);
			return true;
		}
		
		return false;
	}
}
