import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

        System.out.println("digite o primeiro parâmentro: ");
        int paramUm = terminal.nextInt();
        System.out.println("digite o segundo parâmentro (obs* O segundo parâmetro deve ser maior que o primeiro): ");
        int paramDois = terminal.nextInt();

        
        try {
            contar(paramUm, paramDois);
        } catch (ParamentrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            terminal.close();
        }
        
    }

    static void contar(int parametroUm, int parametroDois) throws ParamentrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParamentrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;

            for(int i = 1; i <= contagem; i++)  {
                System.out.println(" Imprimindo o número: " + i);
            }
        }
        

    }    
}

class ParamentrosInvalidosException extends Exception {
       public ParamentrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}