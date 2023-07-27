package com.talizinstory.ecommerce.domain;

import com.talizinstory.ecommerce.enums.BooleanEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(min = 3, max = 100)
    @Column(unique = true, length = 100, nullable = false)
    private String nome;

    @Column(nullable = false)
    private BooleanEnum destaque;

    @ManyToMany(mappedBy = "sessoes")
    private List<Produto> produtos;
}
