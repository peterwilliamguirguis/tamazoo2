/**
 * 
 */
package tamagotchi;

/**
 * @author peter
 *
 */
public class TamaGrado extends Tama {
	public TamaGrado(String nome, double gradoSazieta, double gradoSoddisfazione) {
		super(nome, 100, gradoSoddisfazione);
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	private final static int MAX_BISCOTTI  = 20;//il massimo numero di biscotti da aggiungere
	private final static int MAX_CAREZZE   = 20;//il massimo numero di carezze da aggiungere
	private final static double ABBASAMENTO=0.1;
	private final static int MIN_BISCOTTI  = 0;//il minimo numero di biscotti da aggiungere
	private final static String LA_TRESTEZZA  =" sono triste "; // messaggio per  visualizzare che  e' triste 
	private final static int MIN_CAREZZE   = 0;//il minimo numero di carezze da aggiungere
	public void riceviBiscotti(double biscotti,Tama tama_) {
		if(!(tama_.sonoMorto(tama_))){do {
			gradoSoddisfazione=gradoSoddisfazione+biscotti;// la'aggiunta dei biscotti
		
		
		}while(biscotti > MAX_BISCOTTI&& biscotti<MIN_BISCOTTI);// controllo addizionale


	}	}
	
	public void riceviCarezze(double carezze,Tama tama_) {
		if(!(tama_.sonoMorto(tama_))){do {
				gradoSoddisfazione=gradoSoddisfazione-(2*(gradoSoddisfazione*ABBASAMENTO));	// per abbassare il grado di soddisfazione
				if(gradoSoddisfazione<0 )
					gradoSoddisfazione=0;
			}while(carezze > MAX_CAREZZE&& carezze< MIN_CAREZZE);// controllo addizionale


		}}	
	public boolean sonoMorto (Tama tama_)
	{
		if(tama_.gradoSoddisfazione <=0||  tama_.gradoSoddisfazione >=100  )// i controlli in coso della sua morte
			{
			return false;// rende il valore di ritorno vero
		
			}
		return true;//  rende il valore di controllo falso
		
		
		
	}
	
	public void visualizzazione(Tama tama_)
	{ if(tama_.sonoMorto(tama_))
		System.out.printf("\nil tipo e' tamagordo\nil tamagotchi %s \n\nil suo gardo di sazieta' e'%.0f \n\n"
			+ "il grado di soddisfazione e'%.0f\n\n",tama_.nome,tama_.gradoSazieta,tama_.gradoSoddisfazione );
	else
		System.out.println(" il tama"+ nome+ "e' morto :(" );
		
		
	}
	
	public boolean sonoTriste(Tama tama_)
	{ if (tama_.gradoSoddisfazione >=80 || tama_.gradoSoddisfazione <=20)// i controlli in situazione di trestezza
	{System.out.println(LA_TRESTEZZA);;// messaggio per chiarire che e' triste
	return true;// rende il valore di ritorno vero

	}
	return false;//  rende il valore di controllo falso



	}
	
	
	
}
