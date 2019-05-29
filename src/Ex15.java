import java.util.Scanner;

public class Ex15 {

    public void numerosSoma(){

        int soma=0;

        for (int i =0; i>=0;i++) {
            Scanner numero = new Scanner(System.in);
            System.out.println("Informe um numero: ");
            int numero1 = numero.nextInt();

            if (numero1>0){
                soma = soma + numero1;
            }
            else{
                break;
            }
        }

        System.out.println("A soma dos números é "+soma);

    }
}


//15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números.
// Encerre a execução quando um número negativo for digitado.