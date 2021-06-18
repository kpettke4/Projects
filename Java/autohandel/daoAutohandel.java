import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class daoAutohandel {
	private static Connection dbcon=null;
    private static Statement dbstat = null;
    
    private static void otworzCon()
    {
    	/*String login = "postgres"; //postgres dla lokalnego serwera
    	String haslo = ""; //puste dla lokalnego serwera
    	String url="jdbc:postgresql://localhost:5432/postgres?currentSchema=\"public\"";*/
    	String login = "s44355"; //postgres dla lokalnego serwera
        String haslo = "ZrEhiCwDH"; //puste dla lokalnego serwera
        String url="jdbc:postgresql://localhost:5432/s44355?currentSchema=\"public\"";
    	try
        {
            Class.forName("org.postgresql.Driver");
            dbcon = DriverManager.getConnection(url, login, haslo);
            dbstat=dbcon.createStatement();
            System.out.println("połączono");
        }
        catch (ClassNotFoundException ex)
        {System.err.println("ClassNotFoundException z init: "+
                ex.getMessage());}
        catch (SQLException ex)
        {System.err.println("SQLException z init: " + ex.getMessage());}
    }

    private void zamknijCon()
    {
        if(dbcon==null) return;
        try
        {dbcon.close();}
        catch(SQLException ex)
        {System.out.println("Problem z zamknięciem bazy");}
    }
    public ArrayList<modelCzesci> listaCzesci() {
    	
        ArrayList<modelCzesci> lcz = new ArrayList<modelCzesci>();
        String pyt="SELECT numer, nazwa, model, opis, typ_silnika, stan, cena FROM public.czesci";

        try
        {
            otworzCon();
            ResultSet wyniki=dbstat.executeQuery(pyt);
            while(wyniki.next())
            {
            	modelCzesci k=new modelCzesci();
                k.setnumer(wyniki.getString("numer"));
                k.setnazwa(wyniki.getString("nazwa"));
                k.setmodel(wyniki.getString("model"));
                k.setopis(wyniki.getString("opis"));
                k.settyp_silnika(wyniki.getString("typ_silnika"));
                k.setstan(wyniki.getString("stan"));
                k.setcena(wyniki.getInt("cena"));
                lcz.add(k);
            }
        }
        catch (Exception e) {System.out.println(e);}
        finally {zamknijCon();}

        return lcz;
    }
    public ArrayList<modelKlienci> listaKlientów() {
        ArrayList<modelKlienci> lkl = new ArrayList<modelKlienci>();
        String pyt="SELECT id_klienta, imie, nazwisko, telefon, adres FROM public.klienci";

        try
        {
            otworzCon();
            ResultSet wyniki=dbstat.executeQuery(pyt);
            while(wyniki.next())
            {
            	modelKlienci k=new modelKlienci();
                k.setid_klienta(wyniki.getInt("id_klienta"));
                k.setimie(wyniki.getString("imie"));
                k.setnazwisko(wyniki.getString("nazwisko"));
                k.settelefon(wyniki.getString("telefon"));
                k.setadres(wyniki.getString("adres"));

                lkl.add(k);
            }
        }
        catch (Exception e) {System.out.println(e);}
        finally {zamknijCon();}

        return lkl;
    }
    public ArrayList<modelZamowienia> listaZamowien() {
        ArrayList<modelZamowienia> lza = new ArrayList<modelZamowienia>();
        String pyt="SELECT nr_zamowienia, id_klienta, ilosc, kwota, numer, sposob_odbioru, czy_zaplacono FROM public.zamowienia";

        try
        {
            otworzCon();
            ResultSet wyniki=dbstat.executeQuery(pyt);
            while(wyniki.next())
            {
            	modelZamowienia k=new modelZamowienia();
                k.setnr_zamowienia(wyniki.getInt("nr_zamowienia"));
                k.setid_klienta(wyniki.getInt("id_klienta"));
                k.setilosc(wyniki.getInt("ilosc"));
                k.setkwota(wyniki.getString("kwota"));
                k.setnumer(wyniki.getString("numer"));
                k.setsposob_odbioru(wyniki.getString("sposob_odbioru"));
                k.setczy_zaplacono(wyniki.getString("czy_zaplacono"));
                lza.add(k);
            }
        }
        catch (Exception e) {System.out.println(e);}
        finally {zamknijCon();}

        return lza;
    }
    
    public ArrayList<modelModel> listaModeli() {
    	otworzCon();
        ArrayList<modelModel> lmo = new ArrayList<modelModel>();
        String pyt="SELECT id_modelu, marka, rocznik, kolor, rodzaj_nadwozia, typ_silnika  FROM public.model";

        try
        {
            otworzCon();
            ResultSet wyniki=dbstat.executeQuery(pyt);
            while(wyniki.next())
            {
            	modelModel k=new modelModel();
                k.setid_modelu(wyniki.getString("id_modelu"));
            	k.setmarka(wyniki.getString("marka"));
            	k.setrocznik(wyniki.getInt("rocznik"));
                k.setkolor(wyniki.getString("kolor"));
                k.setrodzaj_nadwozia(wyniki.getString("rodzaj_nadwozia"));
                k.settyp_silnika(wyniki.getString("typ_silnika"));
            
                lmo.add(k);
            }
        }
        catch (Exception e) {System.out.println(e);}
        finally {zamknijCon();}

        return lmo;
    }
    
    public ArrayList<modelStan> listaStanu() {
    	otworzCon();
        ArrayList<modelStan> lst = new ArrayList<modelStan>();
        String pyt="SELECT nazwa, numer, dostepnosc, data_sprzedazy, data_dostawy  FROM public.stan_magazynu";

        try
        {
            otworzCon();
            ResultSet wyniki=dbstat.executeQuery(pyt);
            while(wyniki.next())
            {
            	modelStan k=new modelStan();
                k.setnazwa(wyniki.getString("nazwa"));
            	k.setnumer(wyniki.getString("numer"));
            	k.setdostepnosc(wyniki.getString("dostepnosc"));
                k.setdata_sprzedazy(wyniki.getString("data_sprzedazy"));
                k.setdata_dostawy(wyniki.getString("data_dostawy"));
               
            
                lst.add(k);
            }
        }
        catch (Exception e) {System.out.println(e);}
        finally {zamknijCon();}

        return lst;
    }
    
    public void dopiszStan(String a, String b, String c, String d, String f) {

        //String pyt = "insert into public.klienci +(id_klienta, imie, nazwisko, telefon, adres) VALUES (?, ?, ?, ?, ?,)";
        String pyt = "INSERT INTO public.stan_magazynu (nazwa, numer, dostepnosc, data_sprzedazy, data_dostawy ) VALUES ('"+ a +"','"+ b +"','"+ c +"','"+ d +"','"+ f +"');";
        try {
            otworzCon();
            dbstat.executeQuery(pyt);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            zamknijCon();
        }
    }
    
    public void dopiszKlienta(int a, String b, String c, String d, String f) {

        //String pyt = "insert into public.klienci +(id_klienta, imie, nazwisko, telefon, adres) VALUES (?, ?, ?, ?, ?,)";
        String pyt = "INSERT INTO public.klienci (id_klienta, imie, nazwisko, telefon, adres) VALUES ('"+ a +"','"+ b +"','"+ c +"','"+ d +"','"+ f +"');";
        try {
            otworzCon();
            dbstat.executeQuery(pyt);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            zamknijCon();
        }
    }
    
    public void dopiszCzesc(String a, String b, String c, String d, String f, String g, int h) {

        //String pyt = "insert into public.klienci +(id_klienta, imie, nazwisko, telefon, adres) VALUES (?, ?, ?, ?, ?,)";
        String pyt = "INSERT INTO public.czesci (numer, nazwa, model, opis, typ_silnika, stan, cena) VALUES ('"+ a +"','"+ b +"','"+ c +"','"+ d +"','"+ f +"','"+ g +"','"+ h +"');";
        try {
            otworzCon();
            dbstat.executeQuery(pyt);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            zamknijCon();
        }
    }
    
    public void dopiszZamowienie(int a, int b, int c, int d, String f, String g, String h) {

        //String pyt = "insert into public.klienci +(id_klienta, imie, nazwisko, telefon, adres) VALUES (?, ?, ?, ?, ?,)";
        String pyt = "INSERT INTO public.zamowienia (nr_zamowienia, id_klienta, ilosc, kwota, numer, sposob_odbioru, czy_zaplacono ) VALUES ('"+ a +"','"+ b +"','"+ c +"','"+ d +"','"+ f +"','"+ g +"','"+ h +"');";
        try {
            otworzCon();
            dbstat.executeQuery(pyt);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            zamknijCon();
        }
    }
    
    public void dopiszModel(int a, String b, String c, String d, String f, String g) {

        //String pyt = "insert into public.klienci +(id_klienta, imie, nazwisko, telefon, adres) VALUES (?, ?, ?, ?, ?,)";
        String pyt = "INSERT INTO public.model (rocznik, marka, kolor, rodzaj_nadwozia, typ_silnika, id_modelu) VALUES ('"+ a +"','"+ b +"','"+ c +"','"+ d +"','"+ f +"','"+ g +"');";
        try {
            otworzCon();
            dbstat.executeQuery(pyt);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            zamknijCon();
        }
    }
    public void usunStan(String a) {

        String pyt = "DELETE FROM public.stan_magazynu WHERE nazwa='" + a + "';";
        try {
            otworzCon();
            dbstat.executeQuery(pyt);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            zamknijCon();
        }
    }
    
    public void usunCzesc(String a) {

        String pyt = "DELETE FROM public.czesci WHERE numer='" + a + "';";
        try {
            otworzCon();
            dbstat.executeQuery(pyt);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            zamknijCon();
        }
    }
    
    public void usunKlient(int a) {

        String pyt = "DELETE FROM public.klienci WHERE id_klienta='" + a + "';";
        try {
            otworzCon();
            dbstat.executeQuery(pyt);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            zamknijCon();
        }
    }
    
    public void usunModel(int a) {
    	 otworzCon();
        String pyt = "DELETE FROM public.model WHERE id_modelu='" + a + "';";
        try {
            otworzCon();
            dbstat.executeQuery(pyt);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            zamknijCon();
        }
    }
    
    public void usunZamowienie(int a) {

        String pyt = "DELETE FROM public.zamowienia"+ "	WHERE nr_zamowienia = '" + a + "';";
        try {
            otworzCon();
            dbstat.executeQuery(pyt);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            zamknijCon();
        }
    }
    


    //"insert into public.klienci +(id_klienta, imie, nazwisko, telefon, adres) VALUES (?, ?, ?, ?, ?,)";
    public static void main(String[] args) {
    	otworzCon();
        daoAutohandel obi=new daoAutohandel();
        ArrayList<modelCzesci> lista=obi.listaCzesci();
        String s="";
        for(int i=0; i<lista.size(); i++)
            s+=lista.get(i).getnumer()+", ";
        System.out.println(s);
     

        daoAutohandel obi2=new daoAutohandel();
        ArrayList<modelKlienci> lista2=obi2.listaKlientów();
        String s2="";
        for(int i=0; i<lista2.size(); i++)
            s2+=lista2.get(i).getid_klienta()+", ";
        System.out.println(s2);

        daoAutohandel obi3=new daoAutohandel();
        ArrayList<modelZamowienia> lista3=obi3.listaZamowien();
        String s3="";
        for(int i=0; i<lista3.size(); i++)
            s3+=lista3.get(i).getnr_zamowienia()+", ";
        System.out.println(s3);

        daoAutohandel obi4=new daoAutohandel();
        ArrayList<modelModel> lista4=obi4.listaModeli();
        String s4="";
        for(int i=0; i<lista4.size(); i++)
        s4+=lista4.get(i).getid_modelu()+", ";
        System.out.println(s4);
    }

}
