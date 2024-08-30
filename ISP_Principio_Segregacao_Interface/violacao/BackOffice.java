package ISP_Principio_Segregacao_Interface.violacao;

public class BackOffice implements IGerarRelatorioVendas {

    @Override
    public void gerarExcel() {
        System.out.println("Show! Super útil para mim");
    }
    
    @Override
    public void gerarPDF() {
        System.out.println("Show! Super útil para mim");
    }
    
}