package DIP_Principio_Inversao_Dependencia.violacao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.ProcessaPedido;
import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;

/**
 * DIP VIOLAÇÃO
 */
public class Main {
    
    public static void main(String[] args) {
        
        ProcessaPedido processaPedido = new ProcessaPedido();

        processaPedido.processar(new Pedido());

    }

}