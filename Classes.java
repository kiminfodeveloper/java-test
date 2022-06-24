public class Classes {

    public static void main (String[] args){

        int idade;
        idade = 21;
        double salario;
        salario = 1900.20;
        System.out.println("Meu nome é Kevyn, minha idade é: " + idade + ", e meu salário é: " + salario);

        int soma = 10 + 5;
        System.out.println("Soma dos valores 10 + 5 é igual: " + soma + ".");

        int subtracao = 10 - 5;
        System.out.println("Subtração dos valores 10 - 5 é igual: " + subtracao + ".");

        int multiplicacao = 7 * 5;
        System.out.println("Multiplicação dos valores 7 * 5 é igual: " + multiplicacao + ".");

        int divisao = 5 / 2;
        System.out.println("Divisão dos valores 5 / 2 é igual: " + divisao + ", note que o resultado foi 2, existe algo de errado aqui.");

        double segundadivisao = 5 / 2;
        System.out.println("Divisão dos valores 5 / 2 é igual: " + segundadivisao + ", note que o resultado agora foi 2.0, ainda não está certo.");
        
        double terceiradivisao = 5.0 / 2;
        System.out.println("Divisão dos valores 5 / 2 é igual: " + terceiradivisao + ", agora sim, está certo!");
    }

}
