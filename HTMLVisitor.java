public class HTMLVisitor implements Visitor {

    public void visitar(RelatorioA relatorio) {
        System.out.println("Gerando HTML: " + relatorio.dados);
    }

    public void visitar(RelatorioB relatorio) {
        System.out.println("Gerando HTML: " + relatorio.dados);
    }
}