import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlumnoUAEMex implements Comparable<AlumnoUAEMex> {
    private int cuenta;
    private String nombre;
    private double promedio;

    public AlumnoUAEMex(int cuenta, String nombre, double promedio) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public int getCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    // Orden descendente: primero aparece el promedio más alto.
    @Override
    public int compareTo(AlumnoUAEMex otro) {
        return Double.compare(otro.promedio, this.promedio);
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " | Cuenta: " + cuenta
                + " | Promedio: " + promedio;
    }

    public static void main(String[] args) {
        List<AlumnoUAEMex> grupo = new ArrayList<>();
        grupo.add(new AlumnoUAEMex(182401, "Beatriz", 8.5));
        grupo.add(new AlumnoUAEMex(182402, "Alejandro", 9.2));
        grupo.add(new AlumnoUAEMex(182403, "Daniela", 9.8));

        Collections.sort(grupo);

        System.out.println("=== Alumnos ordenados por promedio (mayor a menor) ===");
        for (AlumnoUAEMex alumno : grupo) {
            System.out.println(alumno);
        }

        Almacen<Integer> almacenEntero = new Almacen<>();
        almacenEntero.setElemento(2026);
        System.out.println("\nEntero almacenado: " + almacenEntero.getElemento());

        Almacen<String> almacenTexto = new Almacen<>();
        almacenTexto.setElemento("UAEMex Computación");
        System.out.println("Texto almacenado: " + almacenTexto.getElemento());
    }
}
