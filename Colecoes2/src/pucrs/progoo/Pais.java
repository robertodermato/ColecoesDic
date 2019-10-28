package pucrs.progoo;

public class Pais {

    private int codigo;
    private String nome;
    private long populacao;

    public Pais(int codigo, String nome, long populacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    @Override
    public String toString() {
        return "País " + nome + " Código:" + codigo +  " População: " + populacao;
    }
}
