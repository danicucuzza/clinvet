package com.api.clinica_veterinaria.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascotaPropietarioDTO {

    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_propietario;
    private String apellido_propietario;

    public MascotaPropietarioDTO() {
    }

    public MascotaPropietarioDTO(String nombre_mascota, String especie, String raza, String nombre_propietario, String apellido_propietario) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_propietario = nombre_propietario;
        this.apellido_propietario = apellido_propietario;
    }
}
