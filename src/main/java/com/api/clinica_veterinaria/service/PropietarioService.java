package com.api.clinica_veterinaria.service;
import com.api.clinica_veterinaria.model.Propietario;
import com.api.clinica_veterinaria.repository.IPropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioService implements IPropietarioService{

    @Autowired
    private IPropietarioRepository iPropietarioRepository;


    @Override
    public List<Propietario> getPropietarios() {
        List<Propietario> listaPropietarios = iPropietarioRepository.findAll();
        return listaPropietarios;
    }

    @Override
    public void savePropietarios(Propietario propietario) {
        iPropietarioRepository.save(propietario);
    }

    @Override
    public void editPropietario(Propietario propietario) {
        this.savePropietarios(propietario);
    }

    @Override
    public void deletePropietario(Long id_propietario) {
        iPropietarioRepository.deleteById(id_propietario);
    }

    @Override
    public Propietario findPropietario(Long id_propietario) {
        return  iPropietarioRepository.findById(id_propietario).orElse(null);
    }
}
