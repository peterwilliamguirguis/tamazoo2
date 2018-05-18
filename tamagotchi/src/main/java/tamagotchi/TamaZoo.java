package tamagotchi;
import java.util.ArrayList;

import it.unibs.fp.mylib.EstrazioniCasuali;
import it.unibs.fp.mylib.InputDati;

public class TamaZoo {
private  ArrayList<Tama> tama = new ArrayList<Tama>();
private  int  NumeroTama;
private static int caso;
private final static String RICHIESTA_NOME= "Inserisci il nome del tuo Tamagotchi";//Messaggio su schermo per inserimento nome Tamagotchi;

public TamaZoo() {
	
	
}
public int getNumeroTama() {
	return NumeroTama;
}


public ArrayList<Tama> creature(int num) {
	for(int i=0;i<num;i++)
	{  caso=EstrazioniCasuali.estraiIntero(1,3);
		switch(caso) {
		case 1:
			tama.add(new Tamagotchi(InputDati.leggiStringaNonVuota(RICHIESTA_NOME),EstrazioniCasuali.estraiIntero(10,90),EstrazioniCasuali.estraiIntero(10,90) ));
			break;
		case 2:
			tama.add(new TamaTriste(InputDati.leggiStringaNonVuota(RICHIESTA_NOME),EstrazioniCasuali.estraiIntero(10,90),EstrazioniCasuali.estraiIntero(10,90) ));
			break;
		case 3:
			tama.add(new TamaGrado(InputDati.leggiStringaNonVuota(RICHIESTA_NOME),EstrazioniCasuali.estraiIntero(10,90),EstrazioniCasuali.estraiIntero(10,90) ));
			break;
		}
		
		
	
		
		
		
	}
	
	return tama;
}

}
	 
	 



