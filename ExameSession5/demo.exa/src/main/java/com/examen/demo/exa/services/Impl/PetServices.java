package com.examen.demo.exa.services.Impl;

import com.examen.demo.exa.model.PetProf;
import com.examen.demo.exa.repository.IPetRepository;
import com.examen.demo.exa.services.IPetServices;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PetServices  implements IPetServices {

    IPetRepository _petRepository;


    @Autowired
    public PetServices(IPetRepository petRepository) {
        _petRepository = petRepository;
    }

    @Override
    public List<PetProf> GetAllPets() {

        return _petRepository.findAll();
    }

    @Override
    public PetProf SavePet(PetProf entity) {
        PetProf petsaved = _petRepository.save(entity);
        return petsaved;
    }


    @Override
    public PetProf FindProfById(int Id) {
        Optional<PetProf> InDB = _petRepository.findById(Id);
        if (InDB.isPresent())
            return InDB.get();
        else
            return new PetProf();
    }


    @Override
    public PetProf DeleteProfById(int Id) {
        Optional<PetProf> Bd = _petRepository.findById(Id);
        if (Bd.isPresent()) {
            _petRepository.deleteById(Id);

        }
        return Bd.get();
    }

    @Override
    public PetProf UpdateProf(Integer Id, PetProf petProf) {
        Optional<PetProf> existProf = _petRepository.findById(Id);
        if (existProf.isPresent()) {
            PetProf profUpdate = existProf.get();
            profUpdate.setNombre(petProf.getNombre());
            profUpdate.setEdad(petProf.getEdad());
            profUpdate.setCurso(petProf.getCurso());
            _petRepository.save(profUpdate);
            return petProf;
        } else {
            return petProf;
        }
    }
}



