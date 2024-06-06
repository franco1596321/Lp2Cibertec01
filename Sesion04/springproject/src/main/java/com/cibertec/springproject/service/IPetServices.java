package com.cibertec.springproject.service;

import com.cibertec.springproject.model.Pet;

import java.util.List;

public interface IPetServices {
    //LISTAR
    List<Pet> GetAllPets();
    Pet SavePet(Pet entity);
        //BUSCAR
        List<Pet> SearchPets(String name);
            //
}
