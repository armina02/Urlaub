
public class Urlaub
{
    private String ort = "Wien";
    private int preis = 1999;
    private boolean allInclusive = false;

    public Urlaub(String ort, int preis, boolean allInclusive)
    {
        setOrt(ort);
        setPreis(preis);
        setAllInclusive(allInclusive);
    }

    public Urlaub(String ort, int preis)
    {
        setOrt(ort);
        setPreis(preis);
        setAllInclusive(false);

    }

    public Urlaub(String ort)
    {
        setOrt(ort);
        setPreis(1999);
        setAllInclusive(false);
    }

    public Urlaub()
    {
       setOrt("Wien");
       setPreis(1999);
       setAllInclusive(false);
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
