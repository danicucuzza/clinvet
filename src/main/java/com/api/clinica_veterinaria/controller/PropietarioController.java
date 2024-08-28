package com.api.clinica_veterinaria.controller;

import com.api.clinica_veterinaria.model.Propietario;
import com.api.clinica_veterinaria.service.IPropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propietarios")
public class PropietarioController {

    @Autowired
    private IPropietarioService iPropietarioService;

    @PostMapping("/crear")
    public String crearPropietario(@RequestBody Propietario propietario) {
        iPropietarioService.savePropietarios(propietario);
        return "El propitario fue creado correctamente";
    }

    @GetMapping("/traer")
    public List<Propietario> getPropietarios() {
        return iPropietarioService.getPropietarios();
    }

    @DeleteMapping("/eliminar/{id}")
    public String deletePropietario(@PathVariable Long id_propietario) {
        iPropietarioService.deletePropietario(id_propietario);
        return "El propietario fue eliminado correctamente";
    }

    @PutMapping("/editar")
    public String editPropietario(@RequestBody Propietario propietario) {
        iPropietarioService.editPropietario(propietario);
        return "El propietario fue editado correctamente";
    }
}
