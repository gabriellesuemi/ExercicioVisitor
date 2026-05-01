public class RelatorioB implements Relatorio {
    String dados = "Dados do Relatorio B";

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}