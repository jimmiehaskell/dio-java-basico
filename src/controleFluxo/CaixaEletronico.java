package controleFluxo;

public class CaixaEletronico {

    public static void controleFluxoSimples() {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
        }

        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }

    public static void controleFluxoComposto() {
        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        controleFluxoComposto();
    }
}
