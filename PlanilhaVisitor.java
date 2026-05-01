public class PlanilhaVisitor implements Visitor {

    public void visitar(RelatorioA relatorio) {
        System.out.println("Gerando Planilha: " + relatorio.dados);
    }

    public void visitar(RelatorioB relatorio) {
        System.out.println("Gerando Planilha: " + relatorio.dados);
    }
}