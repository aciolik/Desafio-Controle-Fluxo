
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            throw new RuntimeException(e);
        }

    }

    static void contar (int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroDois > parametroUm){
            int contagem = parametroDois - parametroUm;
            for (int NumeroLista = 0; NumeroLista <= contagem ; NumeroLista++){
                System.out.println("Imprimindo número " + NumeroLista);
            }
        }
        else {
            System.out.println("Parâmetro Dois deve ser maior que parâmetro Um");
        }

    }
}