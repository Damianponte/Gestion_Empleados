public class Programador extends Empleado implements Evaluable{

    public Programador(String nombre, String apellido, double sueldo) {
        super(nombre, apellido, sueldo);
    }

    @Override
    public double evaluarRendimiento() {
        return 0;
    }
}
