import java.util.Scanner;

public class Ex14 {

    public void intervaloNumeros() {

        int cont = 0;
        int cont1 =0;
        int cont2=0;
        for (int i = 0; i < 5; i++) {

            Scanner numero = new Scanner(System.in);
            System.out.println("Informe um numero: ");
            int numero1 = numero.nextInt();

            if (numero1 >= 0 && numero1 <= 100) {
                cont = cont + 1;
            }
            if (numero1 >= 101 && numero1 <= 200) {
                cont1 = cont1 + 1;
            }
            if (numero1 > 200){
                cont2 = cont2 + 1;
            }

        }
        System.out.println("A quantidade de numeros entre 0 e 100 é de "+cont+". Numeros entre 101 e 200 é de "+cont1+" e o total de números maiores que 200 é "+cont2);
    }
}


//14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100,
// quantos estão entre 101 e 200 e quantos são maiores de 200.