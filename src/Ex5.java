import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {

          public void calculoSoma(){
              int soma=0;

            for (int i = 0; i < 10; i++) {
                Scanner numero = new Scanner(System.in);
                System.out.println("Informe o número do usuário: ");
                int numero1 = numero.nextInt();

                if (i<=10){
                    soma = soma + numero1;
                }
            }
              System.out.println("O valor da soma desses número é: "+soma);
          }

        }

//5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.