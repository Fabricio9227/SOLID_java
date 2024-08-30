package DIP_Principio_Inversao_Dependencia.violacao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.ConexaoPostgres;
import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;

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