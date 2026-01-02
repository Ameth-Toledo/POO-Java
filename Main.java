import src.models.Estudiante;
//import src.models.Persona;
import src.models.Profesor;

public class Main {
    public static void main(String[] args) {
        //Persona personaGiron = new Persona("Ivan", 20, "243667@ids.upchiapas.edu.mx");
        //Persona personaAmeth = new Persona("Ameth", 20, "233363@ids.upchiapas.edu.mx");  

        //personaGiron.saludar();
        //personaGiron.showInformation();
        //personaAmeth.saludar();
        //personaAmeth.showInformation();

        //personaGiron.setEdad(80);
        //System.out.println("edad: " + personaGiron.getEdad() + " " + "nombre " + personaGiron.getNombre());

        Estudiante estudiante = new Estudiante("Edy", 23, "243223@ids.upchiapas.edu.mx", "243223");
        Profesor profesor = new Profesor("Horacio", 35, "solis@ids.upchiapas.edu.mx", "POO");

        System.out.println("Estudiante");
        estudiante.showInformation();

        System.out.println("\n");

        System.out.println("Profesor");
        profesor.showInformation();

        System.out.println("\n");

        System.out.println("Polimorfismo Estudiante");
        estudiante.saludar();
        estudiante.estudiar();

        System.out.println("Polimorfismo Profesor");
        profesor.saludar();
        profesor.enseñar();
    }
}

/*
    [X] Encapsulamiento
    [ ] Abstraccion
    [X] Polimorfismo
    [X] Herencia
*/


/*
    Clase: Una clase es una representacion del mundo real, en donde definimos los atributos o caracteristicas de esa representacion, por ejemplo una persona tiene un nombre
    una edad un email, y una persona puede comer, caminar o saludar

    Objeto: Es una instancia de la clase creada, en donde ahora ya le vamos a pasar los atributos: ejemplo: Persona giron = new Persona(atributos);

    Encapsulamiento: Es proteguer los atributos para que sean atributos privados y solo se puedan acceder a ellos a traves de los getters y setters

    Herencias: Es heredar atributos de una clase padre, por ejemplo
    Clase padre: Persona.java
    Clases hijas: Estudiante y Profesor

    ¿Por que?:
    por que la representacion del mundo real seria una persona pero las otra clases seria como la representacion de la entidad.

    entonces lo que hace la magia seria el metodo super, por que super obtiene todo los atributos y metodos de la clase padre y ya en mi clase hija solo mando a traer los 
    atributos.

    Polimofismo: Imagina una hacha de platilina y un machete de platilina, los dos tienen el mismo proposito de cortar pero hacen diferente funcion, puedes usar el mismo metodo 
    pero siempre uno va a ser diferente de otro, por ejemplo el Estudiante llega a la universidad a estudiar() y el profesor llega a la universidad a enseñar();
*/