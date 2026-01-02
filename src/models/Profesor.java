package src.models;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, int edad, String email, String materia) {
        super(nombre, edad, email);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void saludar() {
        System.out.println("Buenos dias chavos... Soy el profesor" + getNombre() + "Y les dare la materia de: " + materia);
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("El profesor da la materia de: " + materia);
    }

    public void enseñar() {
        System.out.println(getNombre() + "Esta enseñado ahora ... XD");
    }
}
