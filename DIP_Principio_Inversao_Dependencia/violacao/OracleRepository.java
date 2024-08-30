package DIP_Principio_Inversao_Dependencia.violacao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;

/**
 * DIP VIOLAÇÃO
 */
public class OracleRepository {

    public boolean salvar(Pedido pedido) {
        ConexaoOracle dbConnection = new ConexaoOracle("database.url");

        try {
            dbConnection.salvar(pedido);
        } catch (Exception e) {
            // log
            return false;
        }

        return true;
    }

}