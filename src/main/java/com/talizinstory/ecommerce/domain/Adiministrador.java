package com.talizinstory.ecommerce.domain;

import com.talizinstory.ecommerce.enums.BooleanEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Adiministrador {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Size(min = 2, max = 80)
    @Column(nullable = false, length = 80)
    private String nome;

    @Size(min = 11, max = 200)
    @Column(nullable = false, length = 200)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private BooleanEnum acessoAdiministrador;
}
