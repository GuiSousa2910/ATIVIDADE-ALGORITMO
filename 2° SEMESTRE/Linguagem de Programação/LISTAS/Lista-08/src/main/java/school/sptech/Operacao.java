package school.sptech;

public class Operacao {

    private String categoria;
    private String descricao;
    private Double valor;

    public Operacao(String categoria, String descricao, Double valor) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.valor = 0.0;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
