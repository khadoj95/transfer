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
@Table(name="copmte")
public class Compte {
public Compte() {
	
}
	@Id
	// @GeneratedValue, type string
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer codeCompte;
	
	@Column
	public long solde;
	@ManyToOne // cle etranger
	@JoinColumn(name = "client")
	public Client client;
	public Integer getIdCompte() {
		return codeCompte;
	}
	public void setIdCompte(Integer idCompte) {
		this.codeCompte = idCompte;
	}
	public Compte(Integer idCompte, long solde, Client client) {
		super();
		this.codeCompte = idCompte;
		
		this.solde = solde;
		this.client = client;
	}
	public Compte(Integer idCompte) {
		super();
		this.codeCompte = idCompte;
		
	}
	
	public long getSolde() {
		return solde;
	}
	public void setSolde(long solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}


