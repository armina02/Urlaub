
public class Urlaub
{
    private String ort;
    private int preis;
    private boolean allInclusive;
    
    public Urlaub(String ort, int preis, boolean allInclusive)
    {
        setOrt(ort);
        setPreis(preis);
        setAllInclusive(allInclusive);
    }
    
    
    public void setOrt(String ort)
    {
        this.ort = ort;
    }
    
    public void setPreis(int preis)
    {
        this.preis = preis;
        
    }
    
    public void setAllInclusive(boolean allInclusive)
    {
        this.allInclusive = allInclusive;
    }
    
    public String getOrt()
    {
        return ort;

    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public boolean getAllInclusive()
    {
        return allInclusive;
    }
    
    public void printUrlaub()
    {
        System.out.println(ort + " - " + preis + " EUR - AllInclusive: " + allInclusive);
    }
    
    
    
}
