package DIP_Principio_Inversao_Dependencia.violacao.solucao;

import DIP_Principio_Inversao_Dependencia.violacao.ConexaoOracle;
import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;
/**
 * DIP SOLUÇÃO
 */
public class OracleRepository implements IBancoDadosRepository {

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