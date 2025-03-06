package dio.domain.model;

import jakarta.persistence.*;

import java.util.List;



@Entity(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;

    @OneToOne(cascade = CascadeType.ALL)
    private Cartao cartao;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Funcionalidades> funcionalidades;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Novidades> novidades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public List<Funcionalidades> getFuncionalidades() {
        return funcionalidades;
    }

    public void setFuncionalidades(List<Funcionalidades> funcionalidades) {
        this.funcionalidades = funcionalidades;
    }

    public List<Novidades> getNovidades() {
        return novidades;
    }

    public void setNovidades(List<Novidades> novidades) {
        this.novidades = novidades;
    }
}
