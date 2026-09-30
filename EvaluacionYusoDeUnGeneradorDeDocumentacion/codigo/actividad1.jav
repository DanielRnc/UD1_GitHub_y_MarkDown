/**
 * Clase Estudiante.
 * Ver sus datos personales y calcular su nota final.
 * 
 * @author Daniel
 * @version 1.0
 */
public class Estudiante {

    private String nombre;
    private double notaExamen;

    /**
     * Constructor para inicializar el objeto Estudiante.
     * 
     * @param nombre El nombre.
     * @param notaExamen La nota obtenida.
     */
    public Estudiante(String nombre, double notaExamen) {
        this.nombre = nombre;
        this.notaExamen = notaExamen;
    }

    /**
     * Calcula si el alumno ha aprobado.
     * 
     * @param notaCorte La nota mínima.
     * @return {@code true} si la nota es mayor o igual a la nota de corte; {@code false} en caso contrario.
     * @throws IllegalArgumentException Si la nota es menor entonces satla la excepción
     */
    public boolean estaAprobado(double notaCorte) throws IllegalArgumentException {
        if (notaCorte < 0 || notaCorte > 10) {
            throw new IllegalArgumentException("La nota de corte debe estar entre 0 y 10.");
        }
        return this.notaExamen >= notaCorte;
    }
}