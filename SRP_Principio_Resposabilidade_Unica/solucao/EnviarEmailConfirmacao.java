package SRP_Principio_Resposabilidade_Unica.solucao;

import SRP_Principio_Resposabilidade_Unica.solucao.violacao.SmtpGmail;
import SRP_Principio_Resposabilidade_Unica.solucao.violacao.Pedido;
/**
 * SRP SOLUÇÃO
 */
public class EnviarEmailConfirmacao {

    public void enviarEmailConfirmacao(Pedido pedido) {
        SmtpGmail smtp = new SmtpGmail("usuarioSmtp", "senhaSmtp");
        String nome = pedido.getNomeCliente();
        String email = pedido.getEmailCliente();

        String html = "Caro cliente ".concat(nome).concat(", seu Pedido ")
                .concat(pedido.getId().toString()).concat(" foi confirmado!😎");

        smtp.enviar(html, email);
    }

}