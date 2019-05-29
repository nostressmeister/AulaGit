import java.util.Scanner;

public class Ex7 {

    public void mediaIdade() {

        int soma = 0;
        int media =0;


        for (int i = 1; i <=3; i++) {
            Scanner idade = new Scanner(System.in);
            System.out.println("Informe a idade: ");
            int idade1 = idade.nextInt();
            //System.out.println(i);

            if (i <= 3) {
                soma = soma + idade1;
            }

            media=soma/i;
        }
        System.out.println("A soma das idades é: "+soma+". A média das idades é: "+media);
    }
}

//7) Leia a idade de 20 pessoas e exiba a média das idades.