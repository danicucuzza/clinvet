package com.api.clinica_veterinaria.service;
import com.api.clinica_veterinaria.dto.MascotaPropietarioDTO;
import com.api.clinica_veterinaria.model.Mascota;
import com.api.clinica_veterinaria.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    private IMascotaRepository iMascotaRepository;

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = iMascotaRepository.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        iMascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        iMascotaRepository.deleteById(id_mascota);
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        return iMascotaRepository.findById(id_mascota).orElse(null);
    }

    @Override
    public void editMascota(Mascota mascota) {
        this.saveMascota(mascota);
    }

    @Override
    public List<Mascota> getPerroRaza() {
        return null;
    }

    @Override
    public List<MascotaPropietarioDTO> getMascotaPropietario() {
        return null;
    }
}
