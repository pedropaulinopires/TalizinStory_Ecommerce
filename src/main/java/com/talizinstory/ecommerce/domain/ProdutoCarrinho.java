package com.talizinstory.ecommerce.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class ProdutoCarrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 150)
    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false)
    private Integer quantidadeSelecionada;

    @Column(nullable = false)
    private BigDecimal valorTotal;

    @ManyToMany(mappedBy = "produtosCarrinho")
    private List<Usuario> usuarios;

}
