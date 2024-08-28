package com.api.clinica_veterinaria.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Propietario {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id_propietario;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;

    public Propietario() {
    }

    public Propietario(Long id_propietario, String dni, String nombre, String apellido, String celular) {
        this.id_propietario = id_propietario;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
}
