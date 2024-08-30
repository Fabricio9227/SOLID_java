package OCP_Principio_Aberto_Fechado.violacao;

import SRP_Principio_Resposabilidade_Unica.solucao.EnviarEmailConfirmacao;
import SRP_Principio_Resposabilidade_Unica.solucao.PostgresRepository;
import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;

    /**
 * OCP VIOLAÇÃO - REQUERIDO MUDANÇAS NO PROCESSO E MUDAMOS DIRETAMENTE NA CLASSE, O QUE É UMA VIOLAÇÃO DO "SOLID", PORÉM, ESTÁ FUNCIONAL.
 */

public class ProcessaPedido {

    public void processar(Pedido pedido) {

        // Antes do processamento, verifica se o produto tem algum item, chamando o método "possuiItens()"
        if (!pedido.possuiItens()) {
            throw new RuntimeException("Não é possível continuar! Pedido sem itens.");
        }
        

        PostgresRepository pgRepo = new PostgresRepository(); //Cria o objeto "pgRepo" da classe "PostgresRepository()"

        EnviarEmailConfirmacao enviarEmail = new EnviarEmailConfirmacao(); //Cria o objeto "enviarEmail" da classe "EnviarEmailConfirmacao()"
        
        // Regra de negócio processar pedido
        System.out.println("Regra de negócio ao processar pedido...");


        //Seta alguns valores aos atributos de cliente
        pedido.setNomeCliente("sandrolaxx");
        pedido.setEmailCliente("sandrolax@gmail.com");
        pedido.setId(47);


        // Após setar os valores de pedido, vamos chamar os métodos de dentro das classes "PostgresRepository" e "EnviarEmailConfirmacao"
        pgRepo.salvar(pedido);

        enviarEmail.enviarEmailConfirmacao(pedido);

        // Depois do processamento, verifica se os dados estão válidos, se não, joga uma nova Exception
        if (!pedido.isValid()) {
            throw new RuntimeException("Não é possível continuar! Pedido sem Id");
        }
    }
}
