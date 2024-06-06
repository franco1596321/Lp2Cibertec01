package com.cibertec.springproject.service.impl;

import com.cibertec.springproject.model.Pet;
import com.cibertec.springproject.service.IPetServices;

import java.util.ArrayList;
import java.util.List;

public class PetServices implements IPetServices {


    @Override
    public List<Pet> GetAllPets() {
        List<Pet> petsList = new ArrayList<>();
        petsList.add(new Pet(1,"Lucy",2));
        petsList.add(new Pet(2,"Bethobeen",3));
        return petsList;
        }

    @Override
    public Pet SavePet(Pet entity) {
        return null;
    }

    @Override
    public List<Pet> SearchPets(String name) {
        return List.of();
    }
}
