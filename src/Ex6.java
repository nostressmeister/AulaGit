import java.util.Scanner;

public class Ex6 {

    public void somaIdade() {

        int soma = 0;

        for (int i = 0; i < 20; i++) {
            Scanner idade = new Scanner(System.in);
            System.out.println("Informe a idade: ");
            int idade1 = idade.nextInt();

            if (i <= 20) {
                soma = soma + idade1;

            }

        }
        System.out.println("A soma das 20 idades é "+soma);
    }
}



//6) Leia a idade de 20 pessoas e exiba a soma das idades.