package controleFluxo;

public class CaixaEletronico {

    public static void controleFluxoSimples() {
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
            System.out.printf("Novo saldo: R$ %.2f\n", saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }

    public static void controleFluxoComposto() {
        int nota = 8;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void controleFluxoEncadeado() {
        double nota = 6.9;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Prova de recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
    public static void main(String[] args) {
        controleFluxoEncadeado();
    }
}
