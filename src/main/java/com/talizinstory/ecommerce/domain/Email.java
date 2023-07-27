package com.talizinstory.ecommerce.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fromEmail;

    @Size(min = 11, max = 200)
    @Column(nullable = false, length = 200)
    private String toEmail;

    @Size(min = 3, max = 200)
    @Column(nullable = false, length = 200)
    private String subject;

    @Column(nullable = false)
    private String text;
}
