package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private int cantidadVistas;
    private int duracion; // Duración en segundos

    public VideoYouTube(String titulo, String canal, int cantidadVistas, int duracion) {
        super(titulo, duracion, canal); // Llama al constructor de ContenidoAudiovisual
        this.canal = canal;
        this.cantidadVistas = cantidadVistas;
        this.duracion = duracion;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarDetalles() {
        System.out.println("Video de YouTube: " + getTitulo() + " - Canal: " + canal + 
                           " - Vistas: " + cantidadVistas + " - Duración: " + duracion + " segundos");
    }
	}


	


