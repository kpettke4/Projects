import java.io.Serializable;

public class modelCzesci {
	
    private static final long serialVersionUID= 1L;

    private String numer;
    private String nazwa;
    private String model;
    private String opis;
    private String typ_silnika;
    private String stan;
    private int cena;

    public String getnumer()
    {
        return this.numer;
    }

    public void setnumer(String numer)
    {
        this.numer= numer;
    }
    

    public String getnazwa()
    {
        return this.nazwa;
    }

    public void setnazwa(String nazwa)
    {
        this.nazwa= nazwa;
    }
    
    
    public String getmodel()
    {
        return this.model;
    }

    public void setmodel(String model)
    {
        this.model= model;
    }
    
    public String getopis()
    {
        return this.opis;
    }

    public void setopis(String opis)
    {
        this.opis= opis;
    }
    
    public String gettyp_silnika()
    {
        return this.typ_silnika;
    }

    public void settyp_silnika(String typ_silnika)
    {
        this.typ_silnika= typ_silnika;
    }
    
    public String getstan()
    {
        return this.stan;
    }

    public void setstan(String stan)
    {
        this.stan= stan;
    }
    
    public int getcena()
    {
        return this.cena;
    }

    public void setcena(int cena)
    {
        this.cena= cena;
    }
    
}
