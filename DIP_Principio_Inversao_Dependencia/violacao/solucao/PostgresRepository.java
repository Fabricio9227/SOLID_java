package DIP_Principio_Inversao_Dependencia.violacao.solucao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.ConexaoPostgres;
import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;

/**
 * DIP SOLUÇÃO
 */
public class PostgresRepository implements IBancoDadosRepository {

    public boolean salvar(Pedido pedido) {
        ConexaoPostgres dbConnection = new ConexaoPostgres("database.url");

        try {
            dbConnection.salvar(pedido);
        } catch (Exception e) {
            // log
            return false;
        }

        return true;
    }

}