package robo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int alunosResgatados = 0;
		int bugsEncontrados = 0;
		
		Scanner s = new Scanner(System.in);
		Random aleatorio = new Random();
		
		String nomeJogador;
		int tamanhoX, tamanhoY, x, y, opcao, tamanhoMovimento;
		
		ArrayList<Robo> robos = new ArrayList<>();
		
		System.out.print("Digite o nome do jogador: ");
		nomeJogador = s.nextLine();
		
		System.out.println("Bem-vindo ao jogo " + nomeJogador);
		
		System.out.print("Digite a dimensao X do tabuleiro: ");
		tamanhoX = s.nextInt();
		
		System.out.print("Digite a dimensao Y do tabuleiro: ");
		tamanhoY = s.nextInt();
		
		Plano plano = new Plano(tamanhoX, tamanhoY);
		
		System.out.print("Digite a posicao X do robo Andador: ");
		x = s.nextInt();
		System.out.print("Digite a posicao Y do robo Andador: ");
		y = s.nextInt();
		
		Andador andador = new Andador(tamanhoY, x, y, plano);
		robos.add(andador);
		
		System.out.print("Digite a posicao X do robo Bispo: ");
		x = s.nextInt();
		System.out.print("Digite a posicao Y do robo Bispo: ");
		y = s.nextInt();
		
		Bispo bispo = new Bispo(tamanhoY, x, y, plano);
		robos.add(bispo);
		
		System.out.print("Digite a posicao X do robo Cavalo: ");
		x = s.nextInt();
		System.out.print("Digite a posicao Y do robo Cavalo: ");
		y = s.nextInt();
		
		Cavalo cavalo = new Cavalo(tamanhoY, x, y, plano);
		robos.add(cavalo);
		
		System.out.print("Digite a posicao X do robo Peao: ");
		x = s.nextInt();
		System.out.print("Digite a posicao Y do robo Peao: ");
		y = s.nextInt();
		
		Peao peao = new Peao(tamanhoY, x, y, plano);
		robos.add(peao);
		
		System.out.print("Digite a posicao X do robo Rainha: ");
		x = s.nextInt();
		System.out.print("Digite a posicao Y do robo Rainha: ");
		y = s.nextInt();
		
		Rainha rainha = new Rainha(tamanhoY, x, y, plano);
		robos.add(rainha);
		
		System.out.print("Digite a posicao X do robo Rei: ");
		x = s.nextInt();
		System.out.print("Digite a posicao Y do robo Rei: ");
		y = s.nextInt();
		
		Rei rei = new Rei(tamanhoY, x, y, plano);
		robos.add(rei);
		
		System.out.print("Digite a posicao X do robo Torre: ");
		x = s.nextInt();
		System.out.print("Digite a posicao Y do robo Torre: ");
		y = s.nextInt();
		
		Torre torre = new Torre(tamanhoY, x, y, plano);
		robos.add(torre);
			
		int numeroAlunos = tamanhoX * tamanhoY;
		int numeroBugs = tamanhoX * tamanhoY;
		
		while((numeroAlunos + numeroBugs) > (tamanhoX * tamanhoY / 2)) {
			System.out.print("Digite o numero de Alunos: ");
			numeroAlunos = s.nextInt();
			
			System.out.print("Digite o numero de Bugs: ");
			numeroBugs = s.nextInt();
			
			if ((numeroAlunos + numeroBugs) > (tamanhoX * tamanhoY / 2)) {
				System.out.println("Número muito grande de alunos e bugs, digite novamente!");
			}
		}
		
		//System.out.println("Alunos");
		
		while(numeroAlunos > 0) {
			x = 1 + aleatorio.nextInt(tamanhoX);
			y = 1 + aleatorio.nextInt(tamanhoY);
			if(!plano.getCelula(x, y).getAluno() && (plano.getCelula(x, y).getRobos().size() == 0)) {
				//System.out.println("(" + x + ", " + y + ")");
				plano.getCelula(x, y).setAluno(true);
				numeroAlunos--;
			}
		}
		
		
		//System.out.println("Bugs");
		
		while(numeroBugs > 0) {
			x = 1 + aleatorio.nextInt(tamanhoX);
			y = 1 + aleatorio.nextInt(tamanhoY);
			if(!plano.getCelula(x, y).getBug() && !plano.getCelula(x, y).getAluno() && (plano.getCelula(x, y).getRobos().size() == 0)) {
				//System.out.println("(" + x + ", " + y + ")");
				plano.getCelula(x, y).setBug(true);
				numeroBugs--;
			}
		}
		
		while(!plano.verificaFimJogo()) {
			plano.imprimirPlano();
			for (int i = 0; i < robos.size(); i++) {
				opcao = 0;
				Boolean valido = false;
				while((opcao < 1 || opcao > 3) || !valido) {
					System.out.println("Robo: " + robos.get(i).getNome());
					System.out.println("Digite:\n1 - Avancar\n2 - Retroceder\n3 - Sair do Jogo");
					opcao = s.nextInt();
					if(opcao == 1) {
						System.out.print("Digite o tamanho do movimento: ");
						tamanhoMovimento = s.nextInt();
						valido = robos.get(i).Avancar(tamanhoMovimento);
					}else if(opcao == 2) {
						System.out.print("Digite o tamanho do movimento: ");
						tamanhoMovimento = s.nextInt();
						valido = robos.get(i).Retroceder(tamanhoMovimento);
					}else if(opcao == 3) {
						return;
					}else {
						System.out.println("Opção Inválida, Digite novamente!");
					}
					
					if(!valido) {
						System.out.println("Movimento Invalido, digite novamente!");
					}
				}
			}
			plano.atualizaPontuacao();
			alunosResgatados += plano.alunosEncontrados();
			bugsEncontrados += plano.bugsEncontrados();
			System.out.println("Numero de alunos resgatados: " + alunosResgatados);
			System.out.println("Numero de bugs ocorridos: " + bugsEncontrados);
			
		}
		
		System.out.println("Fim de jogo");
		
		for (int i = 0; i < robos.size(); i++) {
			System.out.println("Robo: " + robos.get(i).getNome() + "\t\t Pontucao = " + robos.get(i).getPontuacao());
		}
		
	}
		

}
