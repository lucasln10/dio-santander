package dio.domain.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    private Long agencia;

    @Column(scale = 13, precision = 17)
    private BigDecimal balanco;

    @Column(name = "limite_adicional", scale = 13, precision = 17)
    private BigDecimal limite;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Long getAgencia() {
        return agencia;
    }

    public void setAgencia(Long agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getBalanco() {
        return balanco;
    }

    public void setBalanco(BigDecimal balanco) {
        this.balanco = balanco;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }
}
