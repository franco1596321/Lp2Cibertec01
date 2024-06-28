using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;


// NOTA: puede usar el comando "Rename" del menú "Refactorizar" para cambiar el nombre de interfaz "IService1" en el código y en el archivo de configuración a la vez.
[ServiceContract]//--> Servicios que se van a exponer
public interface IService
{
    //TODOS LOS SERVICIOS QUE VAN A SER EXPUESTOS TIENEN QUE ESTAR EN 
    //UNA INTERFACE y la interface tiene que ser decorada--> [ServiceContract]
    //METODOS
    [OperationContract]//--> Operaciones/Metodos que se van a exponer
    PersonaModel GetPersonInformationByDni(string dni);




}
