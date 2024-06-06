package com.cibertec.springproject.rest;
import com.cibertec.springproject.model.Pet;
import com.cibertec.springproject.service.IPetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PetController {

IPetServices petServices;

@Autowired
public PetController(IPetServices petServices){

}

    //@PostMapping: GRABAR
    //@GetMapping:consultar
    //@PutMapping:actualizar
    //@DeleteMapping:eliminar
   //@GetMapping("/")//el metodo que esta debajo lo expone en una ruta * "/" *
    //public List<String>getAll(){
     //List<String> pets = new ArrayList<>();
       // pets.add("Bethobeen");
        //pets.add("LAZY");
        //pets.add("LUCY");
    //return pets ;
    //}
    @GetMapping("/pets")//el metodo que esta debajo lo expone en una ruta * "/" *
    public List<Pet>getAll(){

    return petServices.GetAllPets();

    }

}
