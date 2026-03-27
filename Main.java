public class Main {
 public static void main(String[] args) {
 System.out.println("===== Billetera Digital =====");
 System.out.println();
 // ── Integrante 1: Billetera ─────────────────────────────────
 // Crear una instancia de Billetera con datos reales.
 Billetera miBilletera = new Billetera("David Pérez", "EC123456789", 150.00);
 // Llamar a: mostrarInfo(), depositar() y retirar().
 miBilletera.mostrarInfo();
 miBilletera.depositar(50.00);
 miBilletera.retirar(100.00);
 // ── Integrante 2: Transaccion ───────────────────────────────
 // Crear una instancia de Transaccion con datos reales.
 
 // Llamar a: mostrarDetalle(), aplicarComision() y marcarFallida().
 // ── Integrante 3: Contacto ──────────────────────────────────
 // Crear una instancia de Contacto con datos reales.
 // Llamar a: mostrarContacto(), marcarFavorito() y enviarDinero().
 System.out.println();
 System.out.println("===== Fin del sistema =====");
 }
}
