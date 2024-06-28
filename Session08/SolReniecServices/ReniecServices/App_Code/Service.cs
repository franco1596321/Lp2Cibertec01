using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using System.Xml.Linq;

// NOTA: puede usar el comando "Rename" del menú "Refactorizar" para cambiar el nombre de clase "Service1" en el código, en svc y en el archivo de configuración.
public class Service : IService
{
    IList<PersonaModel> list = new List<PersonaModel>();

    private const string DNI = "DNI";

    public Service()
    {
        list.Add(new PersonaModel()
        {
            Id = 1,
            FullName = "Luis Alex",
            LastName = "Cordova Leon",
            DocumentType = DNI,
            DocumentNumber = "1578811",
            DateOfBirthay = DateTime.Now.ToString("dd/MM/yyyy")
        });

        list.Add(new PersonaModel()
        {
            Id = 2,
            FullName = "Jorge",
            LastName = "Soto Lopez",
            DocumentType = DNI,
            DocumentNumber = "22222",
            DateOfBirthay = DateTime.Now.ToString("dd/MM/yyyy")
        });
        list.Add(new PersonaModel()
        {
            Id = 3,
            FullName = "Liseth",
            LastName = "Gomez",
            DocumentType = DNI,
            DocumentNumber = "1111",
            DateOfBirthay = DateTime.Now.ToString("dd/MM/yyyy")
        });
    }
    public PersonaModel GetPersonInformationByDni(string dni)
    {
    var result  = list.Where(c => c.DocumentNumber == dni).SingleOrDefault();
        return result;
    }
}
