import java.util.Scanner;

public class Ex13 {

    public void numerosCem() {

        int cont = 0;
        for (int i = 0; i < 5; i++) {

            Scanner numero = new Scanner(System.in);
            System.out.println("Informe um numero: ");
            int numero1 = numero.nextInt();

            if (numero1 > 0 && numero1<100){
                cont = cont + 1;
            }
        }

        System.out.println("A quantidade de números que estão entre 0 e 100 é de "+cont);
    }
}


//13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.