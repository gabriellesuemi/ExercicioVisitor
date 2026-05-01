public class PDFVisitor implements Visitor {

    public void visitar(RelatorioA relatorio) {
        System.out.println("Gerando PDF: " + relatorio.dados);
    }

    public void visitar(RelatorioB relatorio) {
        System.out.println("Gerando PDF: " + relatorio.dados);
    }
}
