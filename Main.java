public class Main {
    public static void main(String[] args) {

        Relatorio r1 = new RelatorioA();
        Relatorio r2 = new RelatorioB();

        Visitor pdf = new PDFVisitor();
        Visitor xml = new XMLVisitor();
        Visitor html = new HTMLVisitor();
        Visitor planilha = new PlanilhaVisitor();

        r1.aceitar(pdf);
        r1.aceitar(html);

        r2.aceitar(xml);
        r2.aceitar(planilha);
    }
}