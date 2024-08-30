package SRP_Principio_Resposabilidade_Unica.solucao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;

/**
 * SRP SOLUÇÃO
 */
public class ProcessaPedido {

    public void processar(Pedido pedido) {
        PostgresRepository pgRepo = new PostgresRepository();
        EnviarEmailConfirmacao enviarEmail = new EnviarEmailConfirmacao();
        
        // Regra de negócio processar pedido
        System.out.println("Regra de negócio ao processar pedido...");
        pedido.setNomeCliente("sandrolaxx");
        pedido.setEmailCliente("sandrolax@gmail.com");
        pedido.setId(47);

        pgRepo.salvar(pedido);

        enviarEmail.enviarEmailConfirmacao(pedido);
    }

}