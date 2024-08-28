package com.api.clinica_veterinaria.service;

import com.api.clinica_veterinaria.model.Propietario;

import java.util.List;

public interface IPropietarioService {

    public List<Propietario> getPropietarios();

    public void savePropietarios(Propietario propietario);

    public void editPropietario(Propietario propietario);

    public void deletePropietario(Long id_propietario);

    public Propietario findPropietario(Long id_propietario);
}
