package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame {

	public Janela() {
	
		this.setSize(800, 600);
		
		JPanel painel1 = new JPanel();
			
		painel1.setLayout(new GridLayout(8,8));
		
		PosicaoBotao [][] botoes = new PosicaoBotao[8][8];
		
		Controlador controlador = new Controlador(8, 8);
		controlador.setBotoes(botoes);
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				JButton novoBotao = botao();
				botoes[i][j] = new PosicaoBotao(i, j, novoBotao, controlador);
				novoBotao.addActionListener(botoes[i][j]);
				painel1.add(novoBotao);
			}
		}
					
		this.add(painel1, BorderLayout.CENTER);
		
		this.setTitle("Jogo Xadrez Modificado");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		controlador.adicionarRobosInicial();
	}

	public JButton botao() {
		JButton b1 = new JButton("#");
		b1.setBackground(Color.CYAN);
		return b1;
	}
	
}
