package com.cibertec.springproject.services.Impl;

import com.cibertec.springproject.model.Pet;
import com.cibertec.springproject.repository.PetRepository;
import com.cibertec.springproject.services.IPetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetServices implements IPetServices {

    PetRepository _petRepository;

    @Autowired
    public PetServices (PetRepository petRepository){
        _petRepository = petRepository;
    }


    @Override
    public List<Pet> GetAllPets() {
        return _petRepository.findAll();
    }

    @Override
    public Optional<Pet> GetById(int id) {
        return _petRepository.findById(id);
    }

    @Override
    public Pet SavePet(Pet entity) {
        return _petRepository.save(entity);
    }

    @Override
    public List<Pet> SearchPets(String name) {
        return null;
    }
}
