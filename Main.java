import src.models.Persona;

public class Main {
    public static void main(String[] args) {
        Persona personaGiron = new Persona("Ivan", 20, "243667@ids.upchiapas.edu.mx");
        Persona personaAmeth = new Persona("Ameth", 20, "233363@ids.upchiapas.edu.mx");  

        //Carro mazda = new Carro("valores");

        personaGiron.saludar();
        personaGiron.showInformation();
        personaAmeth.saludar();
        personaAmeth.showInformation();

        personaGiron.setEdad(80);
        System.out.println("edad: " + personaGiron.getEdad() + " " + "nombre " + personaGiron.getNombre());
    }
}

/*
    [X] Encapsulamiento
    [ ] Abstraccion
    [ ] Polimorfismo
    [ ] Herencia
*/