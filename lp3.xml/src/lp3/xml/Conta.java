package lp3.xml;

/**
 *
 * @author 31206018
 */
public class Conta {
    private String nome;
    private int id;
    private int valor;
    private String tipo;

    public Conta() {
    }

    public Conta(String nome, int id, int valor, String tipo) {
        this.nome = nome;
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Detalhes da Conta - {" + "nome=" + nome + ", id=" + id + ", valor=" + valor + ", tipo=" + tipo + '}';
    }
    
    
    
    
}
