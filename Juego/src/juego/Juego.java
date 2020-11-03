package juego;

import dvlib.*;

public class Juego {

    /*
        JUEGO DE PIEDRA PAPEL O TIJERAS
        -PIEDRA VENCE A TIJERA
        -PAPEL VENCE A PIEDRA  
        -TIJERA VENCE PAPEL  
    
         EL MEJOR DE 3 RONDAS
     */
    public static void main(String[] args) {

        int opcion, rondas;
        int puntosJugador1 = 0, puntosJugadorBot = 0;

        int[] bot = new int[3];
        bot[0] = 1; //"piedra";
        bot[1] = 2;//"papel";
        bot[2] = 3;//"tijeras";  

        String NombreDelJugador;
        NombreDelJugador = Dialogo.ingresarCadena("ingrese su nombre");
        rondas = Dialogo.ingresarEntero("Al mejor de?.. \nescriba la cantidad de round");

        for (int i = 0; i < rondas; i++) {
            int aleatorio = (int) (Math.random() * 3);
            int OpcionBot = bot[aleatorio];
            opcion = Dialogo.ingresarEntero("Round " + (i + 1) + "\ningrese: \n1) piedra\n2) papel\n3) tijeras");

            if (opcion == 1 && OpcionBot == 2) {
                Dialogo.mostrar(NombreDelJugador + ": piedra vs bot: papel \nla pc gana \npapel vence a piedra");
                puntosJugadorBot++;
            } else if (opcion == 1 && OpcionBot == 3) {
                Dialogo.mostrar(NombreDelJugador + ": piedra vs bot: tijeras \nganaste esta ronda! \npiedra vence a tijera");
                puntosJugador1++;
            } else if (opcion == 2 && OpcionBot == 1) {
                Dialogo.mostrar(NombreDelJugador + ": papel vs bot: piedra \nganaste esta ronda! \npapel vence a piedra");
                puntosJugador1++;
            } else if (opcion == 2 && OpcionBot == 3) {
                Dialogo.mostrar(NombreDelJugador + ": papel vs bot: tijera \nla pc gana \ntijeras vence a papel");
                puntosJugadorBot++;
            } else if (opcion == 3 && OpcionBot == 1) {
                Dialogo.mostrar(NombreDelJugador + ": tijera vs bot: piedra \nla pc gana \npiedra vence a tijera ");
                puntosJugadorBot++;
            } else if (opcion == 3 && OpcionBot == 2) {
                Dialogo.mostrar(NombreDelJugador + ": tijera vs bot: papel \nganaste esta ronda! \ntijeras vence a papel");
                puntosJugador1++;
            } else {
                Dialogo.mostrar("Fue un empate!!");
            }
        }
        Ganador(puntosJugador1, puntosJugadorBot, NombreDelJugador);
    }

    public static void Ganador(int puntosJugador1, int puntosJugadorBot, String nombre) {

        if (puntosJugador1 > puntosJugadorBot) {
            Dialogo.mostrar("felicidades " + nombre + " sos el ganador con " + puntosJugador1 + " puntos ganados");
        } else if (puntosJugador1 < puntosJugadorBot) {
            Dialogo.mostrar("segui participando, gano el boot con: " + puntosJugadorBot + " puntos ganados");
        } else {
            Dialogo.mostrar("No hay ganadores ,fue un empate");
        }

    }

}
