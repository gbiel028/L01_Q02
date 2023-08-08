import java.util.Scanner;

public class L01_Q02 {

	public static void main(String[] args) {
		String nomeAluno;
		double n1, n2, n3, m;

		Scanner LerNome = new Scanner(System.in);
		Scanner LerNotas = new Scanner(System.in);

		System.out.println("Aluno: ");
		nomeAluno = LerNome.nextLine();
		System.out.println("N. 01: ");
		n1 = LerNotas.nextDouble();
		System.out.println("N. 02: ");
		n2 = LerNotas.nextDouble();
		System.out.println("N. 03: ");
		n3 = LerNotas.nextDouble();

		m = (n1 + n2 + n3) / 3;

		if (m >= 7) {
			System.out.println(nomeAluno + " Aprovado! Média: " + m);
		}else {
			System.out.println(nomeAluno + " Reprovado! Média: " + m);
		}
		LerNotas.close();
		LerNome.close();

	}

}
