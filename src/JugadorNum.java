public class JugadorNum extends Jugador {

    private int idJugador;

    public JugadorNum(int id){
        this.idJugador=id;
    }

    @Override
    public int apuesta(){
        if (saldo>0) {
            int numApuesta = (int) (Math.random() * 37);
            saldo -= 10;
            return numApuesta;
        }
        else {
            System.out.println("El jugador numero "+idJugador+" no tiene saldo");
            return -1;
        }
    }

}
