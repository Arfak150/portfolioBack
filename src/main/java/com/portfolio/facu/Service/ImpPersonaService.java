package com.portfolio.facu.Service;

import com.portfolio.facu.Entity.Persona;
import com.portfolio.facu.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService {

    @Autowired
    IPersonaRepository IPersonaRepository;

    public List<Persona> list() {
        return IPersonaRepository.findAll();
    }

    public Optional<Persona> getOne(int id) {
        return IPersonaRepository.findById(id);
    }

    public Optional<Persona> getByNombre(String nombre) {
        return IPersonaRepository.findByNombre(nombre);
    }

    public void save(Persona persona) {
        IPersonaRepository.save(persona);
    }

    public void delete(int id) {
        IPersonaRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return IPersonaRepository.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return IPersonaRepository.existsByNombre(nombre);
    }

}
