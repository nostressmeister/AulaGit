import java.util.Scanner;

public class Ex10 {

    public void tabuadaNumero (){

        int cont =0;

            Scanner numero = new Scanner(System.in);
            System.out.println("Informe um número: ");
            int numero1 = numero.nextInt();

            for (int i = 0; i < 11; i++){

            cont = i;
            int total = numero1*i;

            System.out.println(numero1+"x"+i+" = "+total);
        }
    }
}

//10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.