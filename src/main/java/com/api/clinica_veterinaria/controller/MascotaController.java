package com.api.clinica_veterinaria.controller;

import com.api.clinica_veterinaria.model.Mascota;
import com.api.clinica_veterinaria.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

    @Autowired
    private IMascotaService iMascotaService;

    @PostMapping("/crear")
    public String crearMascota(@RequestBody Mascota mascota) {
        iMascotaService.saveMascota(mascota);
        return "La mascota fue creada correctamente";
    }

    @GetMapping("/traer")
    public List<Mascota> getMascotas() {
        return iMascotaService.getMascotas();
    }

    @PutMapping("/editar")
    public String editMascota(@RequestBody Mascota mascota) {
        iMascotaService.editMascota(mascota);
        return "La mascota fue editada correctamente";
    }

    @DeleteMapping("/eliminar/{id}")
    public String deleteMascota (@PathVariable Long id_mascota) {
        iMascotaService.deleteMascota(id_mascota);
        return "La mascota fue eliminada correctamente";
    }

    
}
