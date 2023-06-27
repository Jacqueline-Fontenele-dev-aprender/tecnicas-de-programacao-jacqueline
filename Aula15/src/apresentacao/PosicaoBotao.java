package apresentacao;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class PosicaoBotao implements ActionListener {
    private int x;
    private int y;
    private JButton botao;
    private Controlador controlador;
    private ArrayList<Robo> robos;
    private boolean aluno;
    private boolean bug;

    public PosicaoBotao(int x, int y, JButton botao, Controlador controlador) {
        this.x = x;
        this.y = y;
        this.robos = new ArrayList<>();
        this.botao = botao;
        this.controlador = controlador;
        this.aluno = false;
        this.bug = false;
    }
    
    public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public Controlador getControlador() {
		return controlador;
	}



	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}



	public ArrayList<Robo> getRobos() {
		return robos;
	}



	public void setRobos(ArrayList<Robo> robos) {
		this.robos = robos;
	}



	public JButton getBotao() {
		return botao;
	}

	public void setBotao(JButton botao) {
		this.botao = botao;
	}

	void adicionarRobo(Robo robo){
    	this.robos.add(robo);
    	if(this.robos.size() == 1) {
    		this.botao.setText(robos.get(0).getSigla());
    	}else{
    		this.botao.setText("M");
    	}
    }
    
    void removerRobo(Robo robo){
    	this.robos.remove(robo);
    	if(this.robos.size() == 1) {
    		this.botao.setText(robos.get(0).getSigla());
    	}else{
    		this.botao.setText("V");
    	}
    }
    
	public boolean isAluno() {
		return aluno;
	}

	public void setAluno(boolean aluno) {
		this.aluno = aluno;
	}

	public boolean isBug() {
		return bug;
	}

	public void setBug(boolean bug) {
		this.bug = bug;
	}

	@Override
    public void actionPerformed(ActionEvent e) {
    	this.controlador.executarAcao(x, y);
    }
}
