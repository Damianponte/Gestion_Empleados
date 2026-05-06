
import java.io.*;
import java.util.*;

public class GestionFicheros {


    private List<Empleado> listaEmpleados = new ArrayList<>();
    private Set<String> departamentos = new HashSet<>();
    private Map<Integer, Empleado> mapaEmpleados = new HashMap<>();

    public void escribirFicheros(String nombreFichero,List<String> resultados) {


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero))) {

            for (Empleado e : listaEmpleados) {

                if (e instanceof Evaluable ev) {

                    bw.write(e.getNombre() + " " +
                            e.getApellido() +
                            " | ID: " + e.getId() +
                            " | Rendimiento: " + ev.evaluarRendimiento());

                    bw.newLine();
                }
            }

        } catch (Exception e) {
                System.out.println("error escribiendo ficheros");
            throw new RuntimeException(e);
        }



    }
    public void leerEmpleados(String nombreFichero,
                              List<Empleado> lista,
                              java.util.Map<Integer, Empleado> mapa) {

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                String tipo = datos[0];

                if (tipo.equalsIgnoreCase("Programador")) {

                    Empleado p = new Programador(
                            datos[1],
                            datos[2],
                            Double.parseDouble(datos[3]),
                            Integer.parseInt(datos[4]),
                            datos[5]
                    );

                    lista.add(p);
                    mapa.put(p.getId(), p);

                } else if (tipo.equalsIgnoreCase("Gerente")) {

                    Empleado g = new Gerente(
                            datos[1],
                            datos[2],
                            Double.parseDouble(datos[3]),
                            Integer.parseInt(datos[4]),
                            Integer.parseInt(datos[5])
                    );

                    lista.add(g);
                    mapa.put(g.getId(), g);
                }
            }

        } catch (FileNotFound e) {
            throw new RuntimeException("Archivo no encontrado", e);

        } catch (IOException e) {
            throw new RuntimeException("Error leyendo fichero", e);
        }
    }
}
