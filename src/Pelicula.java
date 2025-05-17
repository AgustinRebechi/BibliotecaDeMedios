public class Pelicula extends Medio{

    private String pelicula;
    private String director;

    public Pelicula(String pelicula, String director) {
        this.pelicula = pelicula;
        this.director = director;
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo pelicula: " + pelicula + "dirigida por " + director);
    }


}
