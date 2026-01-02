package src.models;

public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String email, String matricula) {
        super(nombre, edad, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy estudiante de IDS, me llamo: " + getNombre() + "con matricula: " + getMatricula());
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Matricula: " + matricula);
    }

    public void estudiar() {
        System.out.println(getNombre() + "Esta estudiando ahora ... XD");
    }
}