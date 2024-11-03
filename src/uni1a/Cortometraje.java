package uni1a;

	public class Cortometraje extends ContenidoAudiovisual {
	    private String director;
	    private int duracion; // Duración en minutos
	    private int año;

	    public Cortometraje(String titulo, String director, int duracion, int año) {
	        super(titulo, año, director); // Llama al constructor de ContenidoAudiovisual
	        this.director = director;
	        this.duracion = duracion;
	        this.año = año;
	    }

	    // Getters y Setters
	    public String getDirector() {
	        return director;
	    }

	    public void setDirector(String director) {
	        this.director = director;
	    }

	    public int getDuracion() {
	        return duracion;
	    }

	    public void setDuracion(int duracion) {
	        this.duracion = duracion;
	    }

	    public int getAño() {
	        return año;
	    }

	    public void setAño(int año) {
	        this.año = año;
	    }

	    // Método específico de la clase
	    public void mostrarDetalles() {
	        System.out.println("Cortometraje: " + getTitulo() + " - Director: " + director + 
	                           " - Duración: " + duracion + " minutos - Año: " + año);
	    }
	}


