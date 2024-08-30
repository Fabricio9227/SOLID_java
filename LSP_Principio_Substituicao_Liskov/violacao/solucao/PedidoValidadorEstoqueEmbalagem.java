package LSP_Principio_Substituicao_Liskov.violacao.solucao;

import LSP_Principio_Substituicao_Liskov.violacao.Item;
import LSP_Principio_Substituicao_Liskov.violacao.Pedido;
import LSP_Principio_Substituicao_Liskov.violacao.PedidoValidadorEstoque;

/**
 * LSP SOLUÇÃO
 */
public class PedidoValidadorEstoqueEmbalagem extends PedidoValidadorEstoque {

    @Override
    public boolean isValid(Pedido pedido) {
        for (Item item : pedido.getItens()) {
            if (!item.emEstoque()) {
                return false;
            }

            if (!item.foiEmbalado()) {
                // LOG do erro - Não quebrar o contrato da herança
                return false;
            }
        }

        return true;
    }

}