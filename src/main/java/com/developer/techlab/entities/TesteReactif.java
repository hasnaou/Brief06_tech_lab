package com.developer.techlab.entities;


import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "analyse_reactif_table")
public class TesteReactif {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_teste")
    private Teste teste;

    @ManyToOne
    @JoinColumn(name = "id_reactif")
    private Reactif reactif;

    @Column(name = "quantite")
    private int quantite;

}
