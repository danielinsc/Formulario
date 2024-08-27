import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Formulario {

    public static boolean validarNome(String nome) {
        return Pattern.matches("^[A-Za-zÀ-ÿ]+$", nome);
    }

    public static boolean validarSobrenome(String sobrenome) {
        return Pattern.matches("^[A-Za-zÀ-ÿ]+$", sobrenome);
    }

    public static boolean validarCpf(String cpf) {
        return Pattern.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", cpf);
    }

    public static boolean validarEmail(String email) {
        return Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$", email);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> dadosCadastrais = new ArrayList<>();
        String nome, sobrenome, cpf, email;

        do {
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();
            if (!validarNome(nome)) {
                System.out.println("Nome inválido. Tente novamente.");
            }
        } while (!validarNome(nome));

        do {
            System.out.print("Digite o sobrenome: ");
            sobrenome = scanner.nextLine();
            if (!validarSobrenome(sobrenome)) {
                System.out.println("Sobrenome inválido. Tente novamente.");
            }
        } while (!validarSobrenome(sobrenome));

        do {
            System.out.print("Digite o CPF (xxx.xxx.xxx-xx): ");
            cpf = scanner.nextLine();
            if (!validarCpf(cpf)) {
                System.out.println("CPF inválido. Tente novamente.");
            }
        } while (!validarCpf(cpf));

        do {
            System.out.print("Digite o email: ");
            email = scanner.nextLine();
            if (!validarEmail(email)) {
                System.out.println("Email inválido. Tente novamente.");
            }
        } while (!validarEmail(email));

        dadosCadastrais.add(new String[]{nome, sobrenome, cpf, email});

        System.out.println("\nDados Cadastrais:");
        for (String[] dados : dadosCadastrais) {
            System.out.println("Nome: " + dados[0]);
            System.out.println("Sobrenome: " + dados[1]);
            System.out.println("CPF: " + dados[2]);
            System.out.println("Email: " + dados[3]);
        }

        scanner.close();
    }
}
