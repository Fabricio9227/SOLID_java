package DIP_Principio_Inversao_Dependencia.violacao.solucao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;

/**
 * DIP SOLUÇÃO
 */
public interface IBancoDadosRepository {
    
    boolean salvar(Pedido pedido);

}