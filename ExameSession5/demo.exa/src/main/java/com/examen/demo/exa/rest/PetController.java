package com.examen.demo.exa.rest;


import com.examen.demo.exa.model.PetProf;
import com.examen.demo.exa.repository.IPetRepository;
import com.examen.demo.exa.services.IPetServices;
import jakarta.persistence.EntityNotFoundException;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {

    /*Consultar:Get
     * Grabar:Post
     * Actualizar:Put
     * Eliminar:Delete
     * */

    IPetServices petServices;

    @Autowired
    public PetController(IPetServices petServices) {
        this.petServices = petServices;
    }

    //Listar
    @GetMapping("/pets")
    public List<PetProf> getAll() {
        return petServices.GetAllPets();
    }

    //BuscarPórId
    @GetMapping("/pets/{Id}")
    public PetProf getAll(@PathVariable int Id) {
        return petServices.FindProfById(Id);
    }

    //grabar
    @PostMapping("/pet")
    public PetProf savePet (PetProf entity) {
        return petServices.SavePet(entity);
    }

    //Delete
    @DeleteMapping("/pets/{Id}")
    public PetProf deletePet(@PathVariable int id) {
        return petServices.DeleteProfById(id);
    }

    //actualizar
    @PutMapping("/pet/{Id}")
    public ResponseEntity<Integer>updateProf(@PathVariable Integer Id,
                                             @RequestBody  PetProf  petProf){
        Integer update = IPetServices.UpdateProf(Id,petProf);
        if(update == 1){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}




