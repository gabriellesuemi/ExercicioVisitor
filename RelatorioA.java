public class RelatorioA implements Relatorio {
    String dados = "Dados do Relatorio A";

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}