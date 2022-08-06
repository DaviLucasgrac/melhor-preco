package br.com.melhorpreco;
//importar class Scanner
import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Melhorpreco melhorpreco=new Melhorpreco();

//comando leia
Scanner leia = new Scanner(System.in);
 
//pergunta o usuario e lê a resposta
System.out.println("preço da gasolina:");
melhorpreco.gasolina= leia.nextDouble();

//pergunta o usuario e lê a resposta
System.out.println("preço do alcool");
melhorpreco.alcool=leia.nextDouble();

melhorpreco.diferenca=melhorpreco.alcool/melhorpreco.gasolina;

System.out.println(" O alcool custa " + melhorpreco.diferenca +" por cento da gasolina, portanto, "+ melhorpreco.difpreco());
	}

}
 