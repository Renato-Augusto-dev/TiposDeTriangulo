//Importando a biblioteca Scanner
import java.util.Scanner;

public class TiposDeTriangulo {
    public static void main(String[] args) {
        //Criando um objeto do tipo scanner
        Scanner leitor = new Scanner(System.in);

        //Declarando variaveis
        int lado1, lado2, lado3, soma1, soma2, soma3;
        String triangulo = "";

        //Coletando dados e guardado na variavel
        System.out.print("Qual é o valor do primeiro lado: ");
         lado1 = leitor.nextInt();

        System.out.print("Qual é o valor do segundo lado: ");
        lado2 = leitor.nextInt();

        System.out.print("Qual é o valor do terceiro lado:");
        lado3 = leitor.nextInt();

        //Fazendo a soma dos lados para descubrir se é um triangulo
         soma1 = lado1 + lado2;
         soma2 = lado2 + lado3;
         soma3 = lado3 + lado1;

        //Descubrindo se é um numero é um triangulo
        if (soma1 < lado3 && soma2 < lado1 && soma3 < lado2 ) {
            //Descubrindo o tipo do triangulo
            if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
                triangulo = "EQUILATERO";
            }
            else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
                triangulo = "ESCALENO";
            }
            else {
                triangulo = "ISOLENES";
            }
            //Mostrando o resultado para o usuario
            System.out.printf("Esse é um triangulo do tipo %s", triangulo);
        }else {
            System.out.println("Esses numeros não sao um triangulo");
        }

    }
}
