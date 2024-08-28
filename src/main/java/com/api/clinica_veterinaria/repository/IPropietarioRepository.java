package com.api.clinica_veterinaria.repository;
import com.api.clinica_veterinaria.model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPropietarioRepository extends JpaRepository<Propietario, Long> {
}
