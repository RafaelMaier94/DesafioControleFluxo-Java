import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        try {
            Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            terminal.close();

            contar(parametroUm, parametroDois);
        } catch (InputMismatchException e) {
            System.out.println("Devem ser inseridos números inteiros");
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo paramêtro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
