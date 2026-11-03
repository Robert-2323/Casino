public class JugadorNum extends Jugador {
    int numResultado;
    int apuesta=10;

    public JugadorNum(int resultado){
        this.numResultado=resultado;
    }

    @Override
    public int apuesta(){
        int numApuesta=(int)(Math.random()*37);
        if (numApuesta==0){
            numApuesta=(int)(Math.random()*37);
        }

    }

}
