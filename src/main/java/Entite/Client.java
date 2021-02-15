package Entite;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {
	public Client() {}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
public Integer id;
	@Column
String nom;
	@Column
String prenom;
	@Column
int Tel;
	@Column
float solde;
	@Column
	String password;
	public Client(Integer id, String nom, String prenom, int tel, float solde) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		Tel = tel;
		this.solde = solde;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getTel() {
		return Tel;
	}
	public void setTel(int tel) {
		Tel = tel;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	

}