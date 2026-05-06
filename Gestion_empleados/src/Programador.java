public class Programador extends Empleado implements Evaluable{

    private int lineasCodigo;
    private String lenguajePrincipal;

    public Programador(String nombre, String apellido, double sueldo, int lineasCodigo, String lenguajePrincipal) {
        super(nombre, apellido, sueldo);
        this.lineasCodigo = lineasCodigo;
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public double evaluarRendimiento() {
        return lineasCodigo / 100.0;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}
