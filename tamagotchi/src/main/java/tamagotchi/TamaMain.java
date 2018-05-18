package tamagotchi;
import java.util.ArrayList;

import it.unibs.fp.mylib.*;



public class TamaMain {
	
	private static String        nome; // l'attributo nome del nostro tama
	private static double        gradoSazieta; // l'attributo del grado di sazieta del nostro tama
	private static double        gradoSoddisfazione; // l'attributo del grado di soddisfazione del nostro tama
	private static int           select; // la scelta da menu' 
	private static boolean       uscita= false; //per uscire dal programma nei casi della morte o di uscitavolontaria
	private static int           value ; // una variabile di appoggio 
	private static int           numero_del_tama ;// il numero dei tama
	private static ArrayList<Tama> tamago = new ArrayList<Tama>();
	
	private final static String RICHIESTA_NUMERO        = "Inserisci il numero dei Tamagotchi";//Messaggio su schermo per inserimento numero Tamagotchi;
	private final static String RICHIESTA_NOME          = "Inserisci il nome del tuo Tamagotchi";//Messaggio su schermo per inserimento nome Tamagotchi;
	private final static String RICHIESTA_SAZIETA       = "Inserisci il valore iniziale di sazieta'";//Messaggio su schermo relativo all'inserimento del valore iniziale di sazieta';
	private final static String RICHIESTA_SODDISFAZIONE = "Inserisci il valore iniziale di soddisfazione";//Messaggio su schermo relativo all'inserimento del valore iniziale di affetto;
	private final static String SALUTO                  = "Benvenuti nel mondo dei Tamagotchi"; //Inizializzazione di un saluto;
	private final static String RICHIESTA_BISCOTTI      = "1: aggiungere biscotti"; //per la selezione dal menu'
	private final static String RICHIESTA_BISCOTTI_     = "Inserisci il numero di biscotti da dare al Tamagotchi"; //per aggiungere al valore inziale del grado di sazieta'
	private final static String RICHIESTA_CAREZZE       = "2:aggiungere carezze";//per la selezione dal menu'
	private final static String RICHIESTA_CAREZZE_      = "Inserisci il numero di carezze da dare al Tamagotchi"; //per aggiungere al valore inziale del grado di sazieta'
	private final static String ESCAPE                  = "3: uscire e cancellare tutto"; //per la selezione dal menu'
	private final static int    MIN_VALUE               = 0; // e' il minimo grado di soddisfazione
	private final static int    MAX_VALUE               = 100;//e' il massimo grado di soddisfazione
	private final static int    MIN_selection           = 1; //per il controllo del menu'
	private final static int    MAX_selection           = 3; //per il controllo del menu'
	private final static int    MAX_BISCOTTI            = 20; //il massimo numero di biscotti da aggiungere
	private final static int    MAX_CAREZZE             = 20;//il massimo numero di carezze da aggiungere
	private final static int    MIN_BISCOTTI            = 0;//il minimo numero di biscotti da aggiungere
	private final static int    MIN_CAREZZE             = 0;//il minimo numero di carezze da aggiungere
	public  static final String CORNICE_TRATTEGGIATA    = "----------------------------------------------------------------------";// un po' di stetica:)
	
	
	
	
	
	
	public static void main(String[] args) {
		numero_del_tama       = InputDati.leggiIntero(RICHIESTA_NUMERO);
		TamaZoo tama =new  TamaZoo();
		tamago= tama.creature(numero_del_tama);
		System.out.println(SALUTO); // saluto dell'inzio
		for(int i=0;i<numero_del_tama;i++)
		{
		
		tamago.get(i).visualizzazione(tamago.get(i));// la visualizzazione della situazione corrente del nostro tama
		tamago.get(i).sonoTriste(tamago.get(i));
		System.out.println(CORNICE_TRATTEGGIATA);// un po' di stetica:)
		}
		System.out.println(CORNICE_TRATTEGGIATA); // un po' di stetica:)
		do
		{
		System.out.println(RICHIESTA_BISCOTTI); // per dare  biscotti al tama
		System.out.println(CORNICE_TRATTEGGIATA);// un po' di stetica:)
		System.out.println(RICHIESTA_CAREZZE);  // per dare  carezze al tama
		System.out.println(CORNICE_TRATTEGGIATA);// un po' di stetica:)
		System.out.println(ESCAPE); // per uscire dal programma 
		System.out.println(CORNICE_TRATTEGGIATA);// un po' di stetica:)
		select=InputDati.leggiIntero(" ",MIN_selection, MAX_selection);// la variabile di appoggio
		
		
		
	
		
			switch(select)
			{
			
			case 1:
				System.out.println(RICHIESTA_BISCOTTI_);// per la richiesta di inserimento
				value=InputDati.leggiIntero(" ", MIN_BISCOTTI,MAX_BISCOTTI); // ricevere dalla tastiera attraverso la variabile di appoggio
				for(int j=0;j<numero_del_tama;j++)
				{tamago.get(j).riceviBiscotti(value,tamago.get(j)); // mandare la variabile al metodo
				tamago.get(j).visualizzazione(tamago.get(j));// la visualizzazione della situazione corrente del nostro tama
				System.out.println(CORNICE_TRATTEGGIATA);// un po' di stetica:)
				}
				

				break;
			case 2:
				System.out.println(RICHIESTA_CAREZZE_);// per la richiesta di inserimento
				value=InputDati.leggiIntero(" ", MIN_CAREZZE,  MAX_CAREZZE);// ricevere dalla tastiera attraverso la variabile di appoggio
				for(int j=0;j<numero_del_tama;j++) {
					tamago.get(j).riceviCarezze(value,tamago.get(j)); // mandare la variabile al metodo
					tamago.get(j).visualizzazione(tamago.get(j));// la visualizzazione della situazione corrente del nostro tama
					System.out.println(CORNICE_TRATTEGGIATA);// un po' di stetica:)
				}
				break;
			case 3:
				uscita=true; // uscire dal programma

			}

		}while (uscita==false);
		
		
		

	}


	

}
