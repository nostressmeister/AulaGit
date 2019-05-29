import java.util.Scanner;

public class Ex8 {

    int maior=0;

    public void pessoasMaiores(){
        for (int i = 1; i <=20; i++) {
            Scanner idade = new Scanner(System.in);
            System.out.println("Informe a idade: ");
            int idade1 = idade.nextInt();

            if (idade1 >= 18) {
                maior = maior+1;
            }
        }
        System.out.println("Das 20 idades lidas "+maior+" são maiores de idade");
    }

}

//8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.