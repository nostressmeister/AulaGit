import java.util.Scanner;

public class Ex3 {

    public void nomeUsuario() {

        Scanner nome = new Scanner(System.in);
        System.out.println("Informe o nome do usuário? ");
        String nome2 = nome.next();

        for (int i=0; i<=9; i++){
            System.out.println(nome2);
        }


    }
}


//Leia o nome do usuário e escreva o nome dele na tela 10 vezes.