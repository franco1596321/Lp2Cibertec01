package com.cibertec.springproject.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class ReniecClient extends WebServiceGatewaySupport { //webSERVICE-->viene de la libreria de springboot wslclient <--

    public PersonaModel getPersonByDni(String dni){

        ObjectFactory fact = new ObjectFactory();
        JAXBElement<String> dniReq = fact.createString(dni); //JAXBEELEMENT-->libreria que permite, crear el cliente de wsdl,(es para consumo soap)
        // createstring(dni)-->crearndo cadena

        GetPersonInformationByDni request = new GetPersonInformationByDni();
        request.setDni(dniReq);

        PersonaModel response = (PersonaModel) getWebServiceTemplate() //-->invocacion
                .marshalSendAndReceive(request);//-->si quiero hacer conversion de un objeto, pongo el objeto entre parentesis
                                                    //(personamodel) *entreParentesis*
        return response;
    }

}
