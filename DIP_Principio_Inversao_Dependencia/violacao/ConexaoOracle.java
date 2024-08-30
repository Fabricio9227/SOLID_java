package DIP_Principio_Inversao_Dependencia.violacao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;

public class ConexaoOracle {

    public ConexaoOracle(String dbUrl) {
        // Simulando criação de conexão no oracle
    }
    
    public void salvar(Pedido order) {
        System.out.println("Salvando pedido no ORACLE...");
        // Persistindo dados no banco real
    }

}