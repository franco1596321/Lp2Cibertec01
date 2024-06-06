package com.cibertec.springproject.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor//CONSTRUCTOR SIN ARGUMENTOS
@AllArgsConstructor//CONSTRUCTOR CON ARGUMENTOS
@Getter
@Setter
public class Pet
{
    private int Id;
    private String Name;
    private int Age;

}
