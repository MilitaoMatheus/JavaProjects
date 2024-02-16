import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Login!");

        // Cadastro do usuário
        System.out.print("Digite seu nome de usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        System.out.print("Confirme sua senha: ");
        String confirmacaoSenha = scanner.nextLine();

        // Verificar se a senha foi confirmada corretamente
        if (senha.equals(confirmacaoSenha)) {
            System.out.println("Cadastro realizado com sucesso!");

            // Simulação de login
            System.out.println("\nFaça o login:");

            System.out.print("Nome de usuário: ");
            String nomeUsuarioLogin = scanner.nextLine();

            System.out.print("Senha: ");
            String senhaLogin = scanner.nextLine();

            // Verificar se as credenciais de login são válidas
            if (nome.equals(nomeUsuarioLogin) && senha.equals(senhaLogin)) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + nome + "!");
            } else {
                System.out.println("Credenciais inválidas. Tente novamente.");
            }
        } else {
            System.out.println("Erro: As senhas não coincidem. Tente novamente.");
        }

        scanner.close();
    }
}



