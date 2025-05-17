public class Musica extends Medio {

    private String cancion;
    private String artista;

    public Musica(String cancion, String artista) {
        this.cancion = cancion;
        this.artista = artista;
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo música: " + cancion + "por " + artista);
    }
}
