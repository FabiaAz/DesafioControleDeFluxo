import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
         Scanner terminal = new Scanner(System.in);

        System.out.println("Entre com o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Entre com o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois );
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        System.out.println("Imprimindo os números:");
        for (int i = 1; i <= contagem; i++) {
            System.out.println(" Imprimindo o número" + i);
        }
    }
}

    
