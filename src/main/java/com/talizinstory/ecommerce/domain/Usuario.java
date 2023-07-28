package com.talizinstory.ecommerce.domain;

import com.talizinstory.ecommerce.enums.BooleanEnum;
import com.talizinstory.ecommerce.enums.SexoEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Size(min = 2, max = 80)
    @Column(nullable = false, length = 80)
    private String nome;

    @Column(nullable = false)
    private SexoEnum sexo;

    @Size(min = 11, max = 200)
    @Column(nullable = false, unique = true, length = 200)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Size(min = 14, max = 14)
    @Column(nullable = false, unique = true, length = 14)
    private String cpf;

    @Size(min = 3, max = 20)
    @Column(nullable = false, length = 20)
    private String celular;

    @Column(nullable = false)
    private LocalDateTime dataNascimento;

    @Size(min = 8, max = 10)
    @Column(nullable = false, length = 10)
    private String cep;

    @Size(min = 5, max = 200)
    @Column(nullable = false, length = 200)
    private String endereco;

    @Column(nullable = false)
    private Integer numero;

    @Size(max = 200)
    @Column(length = 200)
    private String complemento;

    @Size(max = 200)
    @Column(length = 200)
    private String referencia;

    @Size(min = 5, max = 200)
    @Column(nullable = false, length = 200)
    private String bairro;

    @Size(min = 5, max = 200)
    @Column(nullable = false, length = 200)
    private String cidade;

    @Size(min = 5, max = 200)
    @Column(nullable = false, length = 200)
    private String estado;

    @Column(nullable = false)
    private BooleanEnum contaAtiva;

    @Column(nullable = false)
    private Integer codigoVerificacao;

    @Column(nullable = false)
    private LocalDateTime dataCodigoVerificacao;

    @ManyToMany
    @JoinTable(name = "usuario_produtoCarrinho", joinColumns = {@JoinColumn(name = "usuario.id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "ProdutoCarrinho.id", referencedColumnName = "id")})
    private List<ProdutoCarrinho> produtosCarrinho;

    @ManyToMany
    @JoinTable(name = "usuario_compras", joinColumns = {@JoinColumn(name = "usuario.id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "Compras.id", referencedColumnName = "id")})
    private List<Compras> comprasUsuario;

    @OneToOne(mappedBy = "compraUsuario")
    private Compras compras;

}
