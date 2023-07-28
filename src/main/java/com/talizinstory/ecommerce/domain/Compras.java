package com.talizinstory.ecommerce.domain;

import com.talizinstory.ecommerce.enums.BooleanEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "compras_produtosVendas", joinColumns = {@JoinColumn(name = "compras_id", referencedColumnName = "id")}
            , inverseJoinColumns = {@JoinColumn(name = "produtoVenda_id", referencedColumnName = "id")})
    private List<ProdutoVenda> produtosVendas;

    @Column(nullable = false)
    private BigDecimal valorTotal;

    @Column(length = 200)
    private String codigoRastreio;

    @Column(nullable = false)
    private LocalDateTime dataCompra;

    private LocalDateTime dataEntrega;

    private BooleanEnum postado;

    private BooleanEnum entregue;

    @OneToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario compraUsuario;

    @ManyToMany(mappedBy = "comprasUsuario")
    private List<Usuario> usuarios;

    @OneToOne(mappedBy = "compras")
    private Venda venda;

}
