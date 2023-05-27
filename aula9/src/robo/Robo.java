package robo;

abstract class Robo {

	private int id;
	private String nome;
	private String sigla;
	private int posicaox;
	private int posicaoy;
	private Plano plano;
	private int pontuacao;

	public Robo(int id, String nome, String sigla, int posicaox, int posicaoy, Plano plano) {
		super();
		this.id = id;
		this.nome = nome;
		this.sigla = sigla;
		this.posicaox = posicaox;
		this.posicaoy = posicaoy;
		this.plano = plano;
		this.pontuacao = 0;
		this.plano.getCelula(posicaox, posicaoy).adicionarRobo(this);		
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

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Boolean Avancar(int tamanhoMovimento) {
		
		Celula antigaCelula = this.plano.getCelula(this.posicaox, this.posicaoy);
		Celula novaCelula = this.plano.getCelula(this.posicaox + tamanhoMovimento, this.posicaoy);
		
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

	public Boolean Retroceder(int tamanhoMovimento) {
		Celula antigaCelula = this.plano.getCelula(this.posicaox, this.posicaoy);
		Celula novaCelula = this.plano.getCelula(this.posicaox - tamanhoMovimento, this.posicaoy);
		
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
