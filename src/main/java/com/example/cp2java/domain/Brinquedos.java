package com.example.cp2java.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Table(name = "TB_CP2_BRINQUEDOS")
@Entity(name = "TB_CP2_BRINQUEDOS")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Brinquedos {
    @Id
    private int id;

    private String nome_brinquedo;

    private double preco;

    private int classificacao;

    private double tamanho;

    private String tipo;

    private String descricao;
}
