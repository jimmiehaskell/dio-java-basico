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

    public static void resultadoEscolar() {
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Prova de recuperação" : "Reprovado";

        System.err.printf("Resultado: %s.\n", resultado);
    }

    public static void sistemaMedida() {
        String sigla = "G";

        // if (sigla == "P") {
        //     System.out.println("PEQUENO");
        // } else if (sigla == "M") {
        //     System.out.println("MEDIO");
        // } else if (sigla == "G") {
        //     System.out.println("GRANDE");
        // } else {
        //     System.out.println("INDEFINIDO");
        // }

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }

    public static void main(String[] args) {
        sistemaMedida();
    }
}
