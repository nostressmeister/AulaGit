import java.util.Scanner;

public class Ex11 {

    public void numerosMaiores (){
        int cont=0;
        for (int i =0; i <5; i++) {

            Scanner numero = new Scanner(System.in);
            System.out.println("Informe um numero: ");
            int numero1 = numero.nextInt();

            if (numero1 > 8){
                cont = cont +1;
            }

        }
        System.out.println("O total de números maiores que 8 é "+cont+" numero(s)");
    }
}



//11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.
