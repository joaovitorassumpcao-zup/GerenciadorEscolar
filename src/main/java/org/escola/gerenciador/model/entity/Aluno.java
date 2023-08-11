package org.escola.gerenciador.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
@Table(name = "TB_alunos")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL, orphanRemoval = true)
    private Matricula matricula;

}