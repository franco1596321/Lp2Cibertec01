package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.model.Programming;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Programming.class);

        try (SessionFactory sessionFactory = configuration.buildSessionFactory()){ //HACE TEST CON EL SQL SERVER //SI FALLA NO CONECTA

            Session session = sessionFactory.openSession();

            Programming programming = new Programming(); //OBJETO QUE NO PERTENECE A SQL
            programming.setId(1);                           //OBJETO
            programming.setName("JAVA");                    //OBJETO
            programming.setDescription("Open Sources");     //OBJETO
            programming.setStatus('A');                     //OBJETOz

            //INICIO OPERACION(ES)
            session.beginTransaction();

            // INI COMANDO PARA GRABAR
            //session.persist(programming);//CONEXION SQL SERVER
            // FIN COMANDO PARA GRABAR


            // INI COMANDO PARA LEER

            List<Programming> listado = new ArrayList<>();

            listado = session.createQuery("from Programming", Programming.class).list(); //cargar el array con la tabla de la bd //PROGRAMMING ES LA CLASE*

            // FIN COMANDO PARA LEER

            //CIERRE OPERACION(ES)
            session.getTransaction().commit(); //EL COMMIT HACE QUETODO SE REFLEJE EN LA BASE DE DATOS



        }

        //System.out.println( "Hello World!" );
    }
}
