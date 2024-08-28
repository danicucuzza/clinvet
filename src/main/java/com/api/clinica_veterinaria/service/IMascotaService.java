package com.api.clinica_veterinaria.service;

import com.api.clinica_veterinaria.dto.MascotaPropietarioDTO;
import com.api.clinica_veterinaria.model.Mascota;

import java.util.List;

public interface IMascotaService {

    public List<Mascota> getMascotas();

    public void saveMascota(Mascota mascota);

    public void deleteMascota(Long id_mascota);

    public Mascota findMascota(Long id_mascota);

    public void editMascota(Mascota mascota);

    public List<Mascota> getPerroRaza();

    public List<MascotaPropietarioDTO> getMascotaPropietario();
}
