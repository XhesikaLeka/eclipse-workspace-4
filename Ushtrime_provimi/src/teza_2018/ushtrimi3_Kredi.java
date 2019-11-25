package teza_2018;

import java.util.Date;

//pikë) Ndërtoni një klasë Kredi ku çdo instancë e kësaj klase ruan informacion mbi detajet e kredive
//që merren nga persona. Çdo objekt Kredi duhet të ketë atributet: kredimarrës, numrin e dokumentit (String)
//që do të merret, datën e kthimit, statusin e kthimit të kredisë që do të jetë i vërtetë ose i gabuar. Klasa duhet
//të ketë metodat: Konstruktor me parametra; Metodën merrKredimarrës() që kthen referencën e një objekti
//kredimarrës të kësaj kredije; merrNumër() që kthen numrin e kësaj kredie; merrDatëKthimi() që kthen
//referencën e objektit Date që paraqet datën e kthimit të kredisë; metodën boolean-e ështëKthyer() pa
//parametra që tregon nëse kredija është kthyer ose jo.
public class ushtrimi3_Kredi {
	private KrediMarrës kredimarrës;
	private String numrin_e_dokumentit;
	private Date date_kthimi;
	private Boolean status;
	public ushtrimi3_Kredi(KrediMarrës kredimarrës, String numrin_e_dokumentit, Date date_kthimi, Boolean status) {
		super();
		this.kredimarrës = kredimarrës;
		this.numrin_e_dokumentit = numrin_e_dokumentit;
		this.date_kthimi = date_kthimi;
		this.status = status;
	}
	public KrediMarrës getKredimarrës() {
		return kredimarrës;
	}
	public String getNumrin_e_dokumentit() {
		return numrin_e_dokumentit;
	}
	public Date getDate_kthimi() {
		return date_kthimi;
	}
	public Boolean getStatus() {
		return status;
	}
	
	

}
