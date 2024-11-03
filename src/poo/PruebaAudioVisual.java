package poo;
import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hola aqui la información de algunos Contenidos Audio Visuales.");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }

        // Crear una película y agregar actores
        Pelicula pelicula = new Pelicula("Deadpool", 148, "Sci-Fi", "Disney-Marvel");
        Actor actor1 = new Actor("Ryan Reynolds", "Canadá.");
        pelicula.agregarActor(actor1);

        // Crear una serie y agregar temporadas
        SerieDeTV serie = new SerieDeTV("The Mentalist", 50, "Sci-Fi", 4);
        Temporada temporada7 = new Temporada(7, 8);
        serie.agregarTemporada(temporada7);

        // Crear un documental y agregar investigadores
        Documental documental = new Documental("El Universo", 60, "Science", "Astrofísica");
        Investigador investigador1 = new Investigador("Neil deGrasse Tyson", "Astrofísica");
        documental.agregarInvestigador(investigador1);

     
                // Crear un objeto de VideoYouTube
                VideoYouTube video = new VideoYouTube("Aprende Java", "CodeAcademy", 1500000, 600);
                video.mostrarDetalles();

                // Crear un objeto de Cortometraje
                Cortometraje corto = new Cortometraje("La Casa de los Ecos", "Pedro Almodóvar", 15, 2022);
                corto.mostrarDetalles();
            
        
        // Mostrar la información de cada contenido específico
        System.out.println("Película: " + pelicula.getTitulo() + ", Actor principal: " + pelicula.getActores().get(0).getNombre());
        System.out.println("Serie: " + serie.getTitulo() + ", Número de temporadas: " + serie.getListaTemporadas().size());
        System.out.println("Documental: " + documental.getTitulo() + ", Investigador principal: " + documental.getInvestigadores().get(0).getNombre());
    }
}

        
