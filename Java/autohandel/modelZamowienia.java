
public class modelZamowienia {
	private int nr_zamowienia;
    private int id_klienta;
	private int ilosc;
    private String kwota;
    private String numer;
    private String sposob_odbioru;
    private String czy_zaplacono;
    
    public int getnr_zamowienia()
    {
        return this.nr_zamowienia;
    }

    public void setnr_zamowienia(int nr_zamowienia)
    {
        this.nr_zamowienia= nr_zamowienia;
    }
    
    public int getid_klienta()
    {
        return this.id_klienta;
    }

    public void setid_klienta(int id_klienta)
    {
        this.id_klienta= id_klienta;
    }
    
    public int getilosc()
    {
        return this.ilosc;
    }

    public void setilosc(int ilosc)
    {
        this.ilosc= ilosc;
    }
    
    public String getkwota()
    {
        return this.kwota;
    }

    public void setkwota(String kwota)
    {
        this.kwota= kwota;
    }
    
    public String getnumer()
    {
        return this.numer;
    }

    public void setnumer(String numer)
    {
        this.numer= numer;
    }
    
    public String getsposob_odbioru()
    {
        return this.sposob_odbioru;
    }

    public void setsposob_odbioru(String sposob_odbioru)
    {
        this.sposob_odbioru= sposob_odbioru;
    }
    
    public String getczy_zaplacono()
    {
        return this.czy_zaplacono;
    }

    public void setczy_zaplacono(String czy_zaplacono)
    {
        this.czy_zaplacono= czy_zaplacono;
    }
    

}
