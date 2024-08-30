package SRP_Principio_Resposabilidade_Unica.solucao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;
import SRP_Principio_Resposabilidade_Unica.solucao.violacao.ConexaoPostgres;
/**
 * SRP SOLUÇÃO
 */
public class PostgresRepository {

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