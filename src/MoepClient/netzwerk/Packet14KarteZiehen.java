package MoepClient.netzwerk;

/**
 * Beschreibt das Packet, mit dem der Client dem Server mitteilt, dass eine Karte gezogen werden soll
 * @author Christian Diller

 */
public class Packet14KarteZiehen extends Packet{
    
    public Packet14KarteZiehen()
    {
        
    }
    
    @Override
    public String gibData()
    {
        return "14" + seperator;
    }
    
    @Override
    public void clientEventAufrufen(Netz netz)
    {
        //Kein ClientEvent
    }
}
