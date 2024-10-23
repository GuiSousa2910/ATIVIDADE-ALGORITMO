package school.sptech;

public class Avaliacao {
    private String descricao;
    private Double qtdEstrelas;

    public Avaliacao() {}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getQtdEstrelas() {
        return qtdEstrelas;
    }

    public void setQtdEstrelas(Double qtdEstrelas) {
        this.qtdEstrelas = qtdEstrelas;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "descricao='" + descricao + '\'' +
                ", qtdEstrelas=" + qtdEstrelas +
                '}';
    }
}
