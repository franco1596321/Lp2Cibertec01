package com.cibertec.springproject.services;

import com.cibertec.springproject.model.Pet;

import java.util.List;
import java.util.Optional;


public interface IPetServices {
    List<Pet> GetAllPets();
    Optional<Pet> GetById(int id);
    Pet SavePet(Pet entity);
    List<Pet> SearchPets(String name);
}
