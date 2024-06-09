package com.examen.demo.exa.services;

import com.examen.demo.exa.model.PetProf;

import java.util.List;

public interface IPetServices {
//listar
    List<PetProf> GetAllPets();
    //guardar
    PetProf SavePet(PetProf entity);
    //busqedarpor id
    PetProf FindProfById(int Id);
    //eliminar
    PetProf DeleteProfById(int Id);
    //actualizar
    PetProf UpdateProf(Integer Id, PetProf  petProf);


}
