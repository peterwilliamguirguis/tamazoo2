package tamagotchi;

public class Tama {
	protected String nome;// attributo del nome
	protected double gradoSazieta;// attrubuto del grado di sazieta
	protected double gradoSoddisfazione;// attrubuto del grado di soddisfazione
	

	
	private final static int MAX_BISCOTTI  = 20;//il massimo numero di biscotti da aggiungere
	private final static int MAX_CAREZZE   = 20;//il massimo numero di carezze da aggiungere
	private final static double ABBASAMENTO=0.1;
	private final static int MIN_BISCOTTI  = 0;//il minimo numero di biscotti da aggiungere
	private final static int MIN_CAREZZE   = 0;//il minimo numero di carezze da aggiungere
	
	public String getNome() {
		return nome;
	}// il getter dell'attributo
	public void setNome(String nome) {
		this.nome = nome;
	}//il setter dell'attributo
	public double getGradoSazieta() {
		return gradoSazieta;
	}// il getter dell'attributo
	public void setGradoSazieta(double gradoSazieta) {
		this.gradoSazieta = gradoSazieta;
	}//il setter dell'attributo
	public double getGradoSoddisfazione() {
		return gradoSoddisfazione;
	}// il getter dell'attributo
	public void setGradoSoddisfazione(double gradoSoddisfazione) {
		this.gradoSoddisfazione = gradoSoddisfazione;
	}//il setter dell'attributo
	public Tama(String nome, double gradoSazieta, double gradoSoddisfazione) {
		this.nome = nome;
		this.gradoSazieta = gradoSazieta;
		this.gradoSoddisfazione = gradoSoddisfazione;
	}
	public void riceviBiscotti(double biscotti,Tama tama_) {
	do {
		gradoSoddisfazione=gradoSoddisfazione+biscotti;// la'aggiunta dei biscotti
		gradoSazieta=gradoSazieta-(gradoSazieta*ABBASAMENTO);// per aabbasre del 10% il valore di sazieta'
		if(gradoSazieta<0 )
			gradoSazieta=0;
	
	}while(biscotti > MAX_BISCOTTI&& biscotti<MIN_BISCOTTI);// controllo addizionale


}
	public void visualizzazione(Tama  tama_)
	{ 
		
		
	}
	public void riceviCarezze(double carezze,Tama tama_) {
		do {
			
			
			gradoSazieta=gradoSazieta+carezze;// per l'aggiunta delle carezze 
			gradoSoddisfazione=gradoSoddisfazione-(gradoSoddisfazione*ABBASAMENTO);	// per abbassare il grado di soddisfazione
			if(gradoSoddisfazione<0 )
				gradoSoddisfazione=0;
		}while(carezze > MAX_CAREZZE&& carezze< MIN_CAREZZE);// controllo addizionale


	}
	public boolean sonoMorto(Tama tama_) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean sonoTriste(Tama tama_)
	{ return true;



	}
	
}
