
package boletin15;


public class Pelicula extends Multimedia{
    private String actorP;
    private String actrizP;

    public String getActorP() {
        return actorP;
    }

    public String getActrizP() {
        return actrizP;
    }

    @Override
    public String toString() {
        return super.toString()+"actorP=" + actorP + ", actrizP=" + actrizP;
    }
    
    
}
