using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Web;

/// <summary>
/// Descripción breve de PersonaModel
/// </summary>
[DataContract]//Todos los servicios tienen que tener <--
              //,[contrac]--> contrato
              //se define contrato, es decir se tiene que respetar las cosas que se 
              //definen en el proyecto 
public class PersonaModel
{
    [DataMember(Name ="Codigo",Order =1)]//--> propiedad dentro del contrato, cosa que no este decorada, no podra ser manipulada
                //basicamente son mienbros del contrato,se coloca a todas las propiedas con la que "yo" opere
                //Name-->MayorSeguridad En caso de hack, ORDER--> orden de propiedades, en caso de listado,decides el orden
    public int Id { get; set; }
    [DataMember]
    public string FullName { get; set; }
    [DataMember]
    public string LastName { get; set; }
    [DataMember]
    public string DocumentType { get; set; }
    [DataMember]
    public string DocumentNumber   { get; set; }
    [DataMember]
    public string DateOfBirthay { get; set; }





    public PersonaModel()
    {
    





    }

}