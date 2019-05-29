import java.util.Scanner;

public class Ex4 {
    public void nomeNumero() {

        Scanner nome = new Scanner(System.in);
        System.out.println("Informe o nome do usuário: ");
        String nome2 = nome.next();

        Scanner numero = new Scanner(System.in);
        System.out.println("Informe o número do usuário: ");
        int numero2 = numero.nextInt();

        Scanner numeroN = new Scanner(System.in);
        System.out.println("Informe um número para repetição: ");
        int numero3 = numeroN.nextInt();

        for (int i=0; i<numero3; i++){
            System.out.println("O nome do usuário é: "+nome2+" "+i);
        }

    }

}

//4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes.