public class Empleado {

    private String nombre;
    private String apellido;
    private double sueldo;
    private final int id;
    private static int contador=1;

    public Empleado(String nombre, String apellido, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        contador++;
        this.id = contador;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public double getSueldo() {

        return sueldo;
    }

    public int getId() {

        return id;
    }


    public void mostrarInfo(){
        System.out.println(nombre + apellido + "con el identificador de : "
                + id + " tiene un sueldo de: " + sueldo);

    }

}
