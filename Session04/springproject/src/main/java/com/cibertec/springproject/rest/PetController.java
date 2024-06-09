package com.cibertec.springproject.rest;


import com.cibertec.springproject.model.Pet;
import com.cibertec.springproject.services.IPetServices;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/pet")
public class PetController {

    IPetServices petServices;

    @Autowired
    public PetController(IPetServices petServices) {
        this.petServices=petServices;
    }


    @GetMapping("")
    public List<Pet> GetAllPets() {
        return petServices.GetAllPets();
    }

    @GetMapping("{id}")
    public Pet GetById(@PathVariable int id) {
        return petServices.GetById(id).get();
    }

    @PostMapping("")
    public Pet SavePet(@RequestBody Pet entity) {
        return petServices.SavePet(entity);
    }

}
