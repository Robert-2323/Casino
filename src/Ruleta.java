public class Ruleta {
    private int numeroTirada;

    public Ruleta(){}

    public int tirada(){

        int numTirada=(int)(Math.random()*37);
        this.numeroTirada=numTirada;
        return numTirada;
    }

}
