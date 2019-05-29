import java.util.Scanner;

public class Ex9 {

public void pessoaNova () {

    int menorIdade = 10000;
    String menorNome=null;

        for (int i =0; i<10; i++) {

            Scanner nome = new Scanner(System.in);
            System.out.println("Informe o seu nome: ");
            String nome1 = nome.next();

            Scanner idade = new Scanner(System.in);
            System.out.println("Informe a sua idade: ");
            int idade1 = idade.nextInt();

            menorIdade = idade1;

            if (idade1 <= menorIdade){
                menorIdade = idade1;
                menorNome = nome1;
            }

            }
    System.out.println("A menor idade lida é: "+menorIdade+" seu nome é: "+menorNome);
        }

    }



//9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.