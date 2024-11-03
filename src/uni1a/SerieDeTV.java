/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int numeroDeTemporadas; // Número total de temporadas
    private List<Temporada> listaTemporadas = new ArrayList<>(); // Lista de temporadas

    // implementar la relación Constructor
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int numeroDeTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    // Método para agregar una temporada
    public void agregarTemporada(Temporada temporada) {
        this.listaTemporadas.add(temporada);
    }

    // Obtener lista de temporadas
    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    // Obtener el número de temporadas
    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    // Establecer el número de temporadas
    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número de temporadas: " + this.numeroDeTemporadas);
        System.out.println();
    }
}
