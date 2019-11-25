package teza_2018;

import java.util.ArrayList;
import java.util.Date;

//Ndërtoni klasën KrediMarrës ku çdo instancë e kësaj klase paraqet një marrës dokumentesh të
//autorizuar për të marrë dokumenta. Çdo kredimarrës do të ketë emrin dhe një listë të gjithë kredive. Kjo
//klasë do të ketë: një konstruktor që merr si parametër një String dhe inicializon kredimarrësin ndërsa lista e
//kredive që ka marrë është bosh; metodën merrEmër që kthen emrin e kredimarrësit; metodën gjejKredi() e
//cila merr si parametër numrin e kredisë dhe kthen një tip Kredije duke kërkuar në listën e kredive të
//kredimarrësve për të gjetur numrin. Nëse kjo kredi ekziston metoda do ta kthejë atë; metodën shto kredi e
//cila merr si parametër elementët e kredisë dhe nëse ajo kredi nuk ekziston e shton atë.
public class KrediMarrës {
private String emer;
private ArrayList<ushtrimi3_Kredi> kredite;

public KrediMarrës(String emer) {
	super();
	this.emer = emer;
	this.kredite = null;
}

public String getEmer() {
	return emer;
}
public ArrayList<ushtrimi3_Kredi> getKredite() {
	return kredite;
}
public ushtrimi3_Kredi getKredine(String numri) {
	for(int i=0;i<this.getKredite().size();i++){
		if(this.getKredite().get(i).getNumrin_e_dokumentit()==numri) 
			return this.getKredite().get(i);
	}
	return null;
	
}
public void shto_kredi(String numrin_e_dokumentit, Date date_kthimi, Boolean status) {
	ushtrimi3_Kredi k= new ushtrimi3_Kredi( this, numrin_e_dokumentit,  date_kthimi,  status);
	if(!this.getKredite().contains(k));
	this.getKredite().add(k);
	
}





	
}
