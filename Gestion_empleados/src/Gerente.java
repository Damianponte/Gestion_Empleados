public class Gerente  extends Empleado implements Evaluable{

private int numeroProyectos;
private int numeroEmpleadosACargo;

    public Gerente(String nombre, String apellido, double sueldo, int numeroProyectos, int numeroEmpleadosACargo) {
        super(nombre, apellido, sueldo);
        this.numeroProyectos = numeroProyectos;
        this.numeroEmpleadosACargo = numeroEmpleadosACargo;
    }

    @Override
    public double evaluarRendimiento() {
        return 0;
    }

    public int getNumeroProyectos() {
        return numeroProyectos;
    }

    public int getNumeroEmpleadosACargo() {
        return numeroEmpleadosACargo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}
