package OCP_Principio_Aberto_Fechado.violacao.solucao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;
import SRP_Principio_Resposabilidade_Unica.solucao.violacao.ProcessaPedido;

/**
 * OCP SOLUÇÃO - Este principio diz que nossas classes estão abertas para extensão e fechadas para modificação
 */

public class ProcessaPedidoComAlteracao extends ProcessaPedido {
    
        public ProcessaPedidoComAlteracao(Pedido pedido) {
        // Antes do processamento
        if (!pedido.possuiItens()) {
            throw new RuntimeException("Não é possível continuar! Pedido sem itens.");
        }
        
        super.processar(pedido);

        // Depois do processamento
        if (!pedido.isValid()) {
            throw new RuntimeException("Não é possível continuar! Pedido sem Id");
        }

    }

}
