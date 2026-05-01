public class XMLVisitor implements Visitor {

    public void visitar(RelatorioA relatorio) {
        System.out.println("Gerando XML: " + relatorio.dados);
    }

    public void visitar(RelatorioB relatorio) {
        System.out.println("Gerando XML: " + relatorio.dados);
    }
}