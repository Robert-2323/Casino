public class JugadorPar extends Jugador {

    private int idJugador;

    public JugadorPar(int id){
        this.idJugador=id;
    }

    @Override
    public int apuesta() {
        if (saldo>0) {
            int numApuesta = (int) (Math.random() * 2);//0 es par 1 es impar
            saldo-=10;
            return numApuesta;
        }else {
            System.out.println("El jugador numero "+idJugador+" no tiene saldo suficiente y se va");
            return -1;
        }
    }
}
