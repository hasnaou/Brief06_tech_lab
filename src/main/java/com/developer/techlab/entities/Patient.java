package com.developer.techlab.entities;


import com.developer.techlab.entities.enums.Sexe;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "patient_table")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "email")
    private String email;

    @Column(name = "tele")
    private String tele;

    @Column(name = "sexe")
    private Sexe sexe;

    @OneToMany
    @JoinColumn(name = "id_analyse")
    List<Analyse> analyses = new ArrayList<>();

}
