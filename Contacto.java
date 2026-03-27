public class Contacto{
    private String nombre;
    private String cuentaDestino;
    private String banco;
    private boolean favorito;

    public Contacto(String nombre, String cuentaDestino, String banco){
        this.nombre = nombre;
        this.cuentaDestino = cuentaDestino;
        this.banco = banco;
        this.favorito = false;
    }

    public void mostrarContacto(){
        String fav = "Sin Marcar";
        if(favorito){fav = "⭐ Favorito"}
        System.out.println("=== Contacto ===\nNombre: "+nombre+"\nCuenta: "+cuentaDestino+"\nBanco: "+banco+"Favorito: "+fav);
    }

    public void marcarFavorito(){
        favorito = true;
        System.out.println(nombre + "agregado a favoritos ⭐.");
    }

    public void enviarDinero(double monto){
        System.out.println("Transferencia enviada: \nDestinatario: "+nombre+"\nCuenta: "+cuentaDestino+"Monto: "monto);
    }
}
