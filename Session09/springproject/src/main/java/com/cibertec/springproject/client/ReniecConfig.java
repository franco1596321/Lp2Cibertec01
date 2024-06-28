package com.cibertec.springproject.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;



@Configuration  //SE DECORA PARA QUE SPRINGBOOT entienda que esta clase no se tiene que invocar, para que se ejecute, colocando configuration,
// java entiende, que esta clase se ejecuta en segundo plano


public class ReniecConfig {
    //Hara configuracion donde se especifica donde esta el contrato
    // y el wsdl, configuracion general para que todo pueda vivir

    @Bean //TODOS LOS OBJETOS CREADOS DENTRO DE CONFIGURATION TIENE QUE TENER BEAN
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.cibertec.springproject.client");  //COLOCAR RUTA DONDE SE CREA EL PROYECTO DEL WSDL ESPECIFICADO EN wsdl del POM
        return marshaller;
    }

    @Bean //TODOS LOS OBJETOS CREADOS DENTRO DE CONFIGURATION TIENE QUE TENER BEAN
    public ReniecClient reniecClient(Jaxb2Marshaller marshaller) {  // COMUNICADOR CON EL SERVICIO,//(Jaxb2Marshaller marshaller), se nombre al objeto que se menciona arriba

        ReniecClient client = new ReniecClient();
        client.setDefaultUri("http://localhost:55547/Service.svc");//URL donde se encuentra el servicio que intento consumir
        client.setMarshaller(marshaller);//todo lo que se coloco arriba
        client.setUnmarshaller(marshaller);//forma de quitar la configuracion , mandando el mismo objeto
        return client;
    }
}
