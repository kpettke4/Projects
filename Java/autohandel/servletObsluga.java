import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/Obsluga")
public class servletObsluga extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        daoAutohandel dao=new daoAutohandel();
        HttpSession sesja=request.getSession();

        ArrayList<modelKlienci> lkl = dao.listaKlientów();
        sesja.setAttribute("lkl", lkl);

        ArrayList<modelCzesci> lcz = dao.listaCzesci();
        sesja.setAttribute("lcz", lcz);

        ArrayList<modelZamowienia> lza = dao.listaZamowien();
        sesja.setAttribute("lza",lza);
        
        ArrayList<modelModel> lmo = dao.listaModeli();
        sesja.setAttribute("lmo",lmo);
        
        ArrayList<modelStan> lst = dao.listaStanu();
        sesja.setAttribute("lst",lst);
        
   if(request.getParameterMap().containsKey("nazwa")) {
	   
       		String nazwa = request.getParameter("nazwa");
            String numer = request.getParameter("numer");
            String dostepnosc = request.getParameter("dostepnosc");
            String data_sprzedazy = request.getParameter("data_sprzedazy");
            String data_dostawy = request.getParameter("data_dostawy");
         
            
            dao.dopiszStan(nazwa, numer, dostepnosc, data_sprzedazy, data_dostawy);
            String wynik = "Pomyślnie dodano: "+ numer;
            sesja.setAttribute("wynik_stan", wynik);

        }else {
            String wynik = "Jeszcze nie dodałeś nowego stanu";
            sesja.setAttribute("wynik_stan", wynik);
        }
        
        

        if(request.getParameterMap().containsKey("id_klienta")) {
        	
            int id_klienta = Integer.parseInt(request.getParameter("id_klienta"));
            String imie = request.getParameter("imie");
            String nazwisko = request.getParameter("nazwisko");
            String telefon = request.getParameter("telefon");
            String adres = request.getParameter("adres");
         
            
            dao.dopiszKlienta(id_klienta, imie, nazwisko, telefon, adres);
            String wynik = "Pomyślnie dodano: "+ id_klienta;
            sesja.setAttribute("wynik_klient", wynik);

        }else {
            String wynik = "Jeszcze nie dodałeś nowego klienta";
            sesja.setAttribute("wynik_klient", wynik);
        }

        if(request.getParameterMap().containsKey("nowa_część")) {
        	
        	String numer = request.getParameter("numer");
            String nazwa = request.getParameter("nazwa");
            String model = request.getParameter("model");
            String opis = request.getParameter("opis");
            String typ_silnika = request.getParameter("typ_silnika");
            String stan = request.getParameter("stan");
            int cena = Integer.parseInt(request.getParameter("cena"));
            String czesc = request.getParameter("nowa_część");
            dao.dopiszCzesc(numer, nazwa, model, opis, typ_silnika, stan, cena);
        
            
            String wynik = "Pomyślnie dodano część: "+ czesc;
            sesja.setAttribute("wynik_część", wynik);

        }else {
            String wynik = "Jeszcze nie dodałeś nowej części";
            sesja.setAttribute("wynik_część", wynik);
        }
        //klient+część

        if(request.getParameterMap().containsKey("nowe_zamowienie")) {

            String zamowienie = request.getParameter("nowe_zamowienie");
            int nr_zamowienia = Integer.parseInt(request.getParameter("nr_zamowienia"));
            int id_klienta = Integer.parseInt(request.getParameter("id_klienta"));
            int ilosc = Integer.parseInt(request.getParameter("ilosc"));
            int kwota = Integer.parseInt(request.getParameter("kwota"));
            String numer = request.getParameter("numer");
            String sposob_odbioru = request.getParameter("sposob_odbioru");
            String czy_zaplacono = request.getParameter("czy_zaplacono");
            
            
            dao.dopiszZamowienie(nr_zamowienia, id_klienta, ilosc, kwota, numer, sposob_odbioru, czy_zaplacono);
            String wynik = "Pomyślnie dodano zamówienie: "+ zamowienie;
            sesja.setAttribute("wynik_zamowienia", wynik);

        }else {
            String wynik = "Jeszcze nie dodałeś nowego zamówienia";
            sesja.setAttribute("wynik_zamowienia", wynik);
        }
        //klient+część+zamowienie

        if(request.getParameterMap().containsKey("nowy_model")) {
        	
        	String marka = request.getParameter("marka");
        	
        	 int rocznik = Integer.parseInt(request.getParameter("rocznik"));
            String kolor = request.getParameter("kolor");
            String model = request.getParameter("nowy_model");
            String rodzaj_nadwozia = request.getParameter("rodzaj_nadwozia");
            String typ_silnika = request.getParameter("typ_silnika");
            String id_modelu = request.getParameter("id_modelu");
         
            
            dao.dopiszModel( rocznik, marka, kolor, rodzaj_nadwozia, typ_silnika, id_modelu );
            String wynik = "Pomyślnie dodano model: "+ model;
            sesja.setAttribute("wynik_model", wynik);

        }else {
            String wynik = "Jeszcze nie dodałeś nowego modelu";
            sesja.setAttribute("wynik_model", wynik);
        }
        
        //klient_część+zam++model
        
        if(request.getParameterMap().containsKey("stan_usun")) {

            String stan = request.getParameter("stan_usun");
            dao.usunStan(stan);
            String wynik = "Usunieto część: "+ stan;
            sesja.setAttribute("stan_usun", wynik);

        }else {
            String wynik = "";
            sesja.setAttribute("stan_usun", wynik);
        }
        
        if(request.getParameterMap().containsKey("czesc_usun")) {

            String czesc = request.getParameter("czesc_usun");
            dao.usunCzesc(czesc);
            String wynik = "Usunieto część: "+ czesc;
            sesja.setAttribute("usun_cz", wynik);

        }else {
            String wynik = "";
            sesja.setAttribute("usun_cz", wynik);
        }

        if(request.getParameterMap().containsKey("klient_usun")) {

            int klient = Integer.parseInt(request.getParameter("klient_usun"));
            dao.usunKlient(klient);
            String wynik = "Usunieto klienta: "+ klient;
            sesja.setAttribute("usun_kl", wynik);

        }else {
            String wynik = "";
            sesja.setAttribute("usun_kl", wynik);
        }
        
        if(request.getParameterMap().containsKey("model_usun")) {

            int model = Integer.parseInt(request.getParameter("model_usun"));
            dao.usunModel(model);
            String wynik = "Usunieto klienta: "+ model;
            sesja.setAttribute("usun_mo", wynik);

        }else {
            String wynik = "";
            sesja.setAttribute("usun_mo", wynik);
        }

        if(request.getParameterMap().containsKey("zamow_usun")) {

            int zamowienie = Integer.parseInt(request.getParameter("zamow_usun"));
            dao.usunZamowienie(zamowienie);
            String wynik = "Usunieto zamówienie: "+ zamowienie;
            sesja.setAttribute("usun_za", wynik);

        }else {
            String wynik = "";
            sesja.setAttribute("usun_za", wynik);
        }

        String nextURL="/index.jsp";
        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextURL);
        rd.forward(request,response);
    }
}
