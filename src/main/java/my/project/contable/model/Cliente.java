package my.project.contable.model;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo; // Fisica ou Juridica

    @OneToOne(cascade = CascadeType.ALL)
    private DadosPessoais dadosPessoais;

    public Cliente(Long id) {
        this.id = id;
    }

    // Getters e Setters
}
