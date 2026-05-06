public class Programador extends Empleado implements Evaluable{

    private int lineasCodigo;
    private String lenguajePrincipal;

    public Programador(String nombre, String apellido, double sueldo, int lineasCodigo, String lenguajePrincipal) {
        super(nombre, apellido, sueldo);
        this.lineasCodigo = lineasCodigo;
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public int getLineasCodigo() {
        return lineasCodigo;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    @Override
    public double evaluarRendimiento() {
        return lineasCodigo / 100.0;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Programador: " + getNombre() + " " + getApellido() +
                " | ID: " + getId() +
                " | Lenguaje: " + lenguajePrincipal +
                " | Líneas: " + lineasCodigo);
    }
}
