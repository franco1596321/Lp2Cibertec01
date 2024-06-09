package com.examen.examf.services;


import java.util.List;

public interface PetServices {


    List<Pet> GetAllPets();
    Pet SavePet(Pet entity);
    List<Pet> SearchPets(String name);









}
