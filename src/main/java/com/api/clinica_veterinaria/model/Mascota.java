package com.api.clinica_veterinaria.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;

    @OneToOne
    @JoinColumn (name = "id_propietario", referencedColumnName = "id_propietario")
    private Propietario propietario;

    public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre, String especie, String raza, String color) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }
}
