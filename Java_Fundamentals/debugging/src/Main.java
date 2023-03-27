import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String[] alunos = {"Joao", "Marcia", "Marcel"};

        Double media = calculaMedia(alunos, scanner);

        System.out.printf("Media da turma: %f", media);
    }

    private static Double calculaMedia(String[] alunos, Scanner scanner) {

        Double soma = 0d;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            Double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;

    }
}