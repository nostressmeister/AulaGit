import java.util.Scanner;

public class Ex12 {

    public void numerosPares() {

            int cont = 0;
            for (int i = 0; i < 5; i++) {

            Scanner numero = new Scanner(System.in);
            System.out.println("Informe um numero: ");
            int numero1 = numero.nextInt();

            if (numero1 % 2 ==0) {
                cont = cont + 1;
            }
        }
        System.out.println(+cont+" numero(s) são pares!");
    }
}

//12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares