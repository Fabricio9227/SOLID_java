package DIP_Principio_Inversao_Dependencia.violacao.solucao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;


public class Main {
    public static void main(String[] args) {

        PostgresRepository pgRepo = new PostgresRepository();
        OracleRepository oracleRepository = new OracleRepository();
        EnviarEmailConfirmacao sendMail = new EnviarEmailConfirmacao();

        Pedido pedido = new Pedido();

        ProcessaPedido orderProcessor = new ProcessaPedido(pgRepo, sendMail);

        orderProcessor.processar(pedido);
    }

}

