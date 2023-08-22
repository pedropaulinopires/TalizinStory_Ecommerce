package com.talizinstory.ecommerce.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 150)
    @Column(nullable = false, unique = true, length = 150)
    private String nome;


    @ManyToMany
    @JoinTable(name = "produto_sessoes", joinColumns = {@JoinColumn(name = "produto_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "sessao.id", referencedColumnName = "id")})
    private List<Sessao> sessoes;


    @Column(nullable = false)
    private String imagemPrincipal;

    @Column(nullable = false)
    private List<String> imagens;

    @Size(min = 5, max = 600)
    @Column(nullable = false, length = 600)
    private String descricao;

    @Size(min = 5, max = 600)
    @Column(nullable = false, length = 600)
    private String caracteristicas;




}
