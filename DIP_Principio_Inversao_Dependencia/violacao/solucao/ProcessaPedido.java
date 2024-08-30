package DIP_Principio_Inversao_Dependencia.violacao.solucao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;

/**
 * DIP SOLUÇÃO
 */
public class ProcessaPedido {

    private IBancoDadosRepository dbRepo;

    private IEnvioEmailRepository mailRepo;

    public ProcessaPedido(IBancoDadosRepository dbRepo, IEnvioEmailRepository mailRepo) {
        this.dbRepo = dbRepo;
        this.mailRepo = mailRepo;
    }

    public void processar(Pedido pedido) {
        // Regra de negócio processar pedido
        System.out.println("Regra de negócio ao processar pedido...");
        pedido.setNomeCliente("sandrolaxx");
        pedido.setEmailCliente("sandrolax@gmail.com");
        pedido.setId(47);

        dbRepo.salvar(pedido);

        mailRepo.enviarEmailConfirmacao(pedido);
    }

}