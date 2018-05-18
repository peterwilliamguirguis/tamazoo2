package tamagotchi;


public class TamaTriste extends Tama{
	

	private final static String LA_TRESTEZZA  =" sono triste "; // messaggio per  visualizzare che  e' triste 
	
	private String nome;// attributo del nome
	private double gradoSazieta;// attrubuto del grado di sazieta
	private double gradoSoddisfazione;// attrubuto del grado di soddisfazione
	private final static int MAX_BISCOTTI  = 20;//il massimo numero di biscotti da aggiungere
	private final static int MAX_CAREZZE   = 20;//il massimo numero di carezze da aggiungere
	private final static double ABBASAMENTO=0.1;
	private final static int MIN_BISCOTTI  = 0;//il minimo numero di biscotti da aggiungere
	private final static int MIN_CAREZZE   = 0;//il minimo numero di carezze da aggiungere
	
	
	
	
	public TamaTriste(String nome, double gradoSazieta, double gradoSoddisfazione) {
		super(nome, gradoSazieta, 100);
		// TODO Auto-generated constructor stub
	}
	public void riceviBiscotti(double biscotti,Tama tama_) {
		if(!(tama_.sonoMorto(tama_))){do {
			gradoSazieta=gradoSazieta-(gradoSazieta*ABBASAMENTO);// per aabbasre del 10% il valore di sazieta'
			if(gradoSazieta<0 )
				gradoSazieta=0;
		
		}while(biscotti > MAX_BISCOTTI&& biscotti<MIN_BISCOTTI);// controllo addizionale


	}}
		public void riceviCarezze(double carezze,Tama tama_) {
			if(!(tama_.sonoMorto(tama_))){do {
				
				
				gradoSazieta=gradoSazieta+carezze;// per l'aggiunta delle carezze 
				if(gradoSoddisfazione<0 )
					gradoSoddisfazione=0;
			}while(carezze > MAX_CAREZZE&& carezze< MIN_CAREZZE);// controllo addizionale


		}	}
	

	public boolean sonoTriste(Tama tama_)
	{
	System.out.println(LA_TRESTEZZA);;// messaggio per chiarire che e' triste
	return true;// rende il valore di ritorno vero



	}
	public void visualizzazione( Tama tama_)
	{
		if(tama_.sonoMorto(tama_))
		System.out.printf("\nil tipo e' tamatriste \nil tamagotchi %s \n\nil suo gardo di sazieta' e'%.0f \n\n"
			+ "il grado di soddisfazione e'%.0f\n\n",tama_.nome,tama_.gradoSazieta,tama_.gradoSoddisfazione);
	else
		System.out.println(" il tama"+ nome+ "e' morto :(" );
		
		
	}
	public boolean sonoMorto (Tama tama_)
	{
		if(tama_.gradoSazieta<=0|| tama_.gradoSazieta >=100 )// i controlli in coso della sua morte
			{return false;// rende il valore di ritorno vero
		
			}
		return true;//  rende il valore di controllo falso
		
		
		
	}
	
	
}
