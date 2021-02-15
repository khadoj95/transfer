package Entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
@Table(name="copmt")
public class Compte {

	@Id
	// @GeneratedValue, type string
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String idCompte;
	@Column
	private Date dateC;
	@Column
	private double solde;
	public String getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(String idCompte) {
		this.idCompte = idCompte;
	}
	public Compte(String idCompte, Date dateC, double solde, Client client) {
		super();
		this.idCompte = idCompte;
		this.dateC = dateC;
		this.solde = solde;
		this.client = client;
	}
	public Date getDateC() {
		return dateC;
	}
	public void setDateC(Date dateC) {
		this.dateC = dateC;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@ManyToOne // cle etranger
	@JoinColumn(name = "id")
	private Client client;
	
	
}
