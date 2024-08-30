package SRP_Principio_Resposabilidade_Unica.solucao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;
import SRP_Principio_Resposabilidade_Unica.solucao.violacao.ProcessaPedido;

//S - Single Responsibility Principle (Princípio da Responsabilidade Única)

public class Main {
    public static void main(String[] args) {
        // Exemplo processar
        ProcessaPedido processa = new ProcessaPedido();
                Pedido pedido = new Pedido();

        processa.processar(pedido);
    }

}