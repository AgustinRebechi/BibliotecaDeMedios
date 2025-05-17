public class Main {
    public static void main(String[] args) {

        Medio[] medios = new Medio[3];
        medios[0] = new Libro("El Gran Gatsby","F. Scott Fitzgerald");
        medios[1] = new Pelicula("La La Land", "Damien Chazelle");
        medios[2] = new Musica("Bohemian Rhapsody", "Queen");

        for (Medio medio : medios) {
            medio.reproducir();
        }


    }
}
