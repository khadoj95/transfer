 package Entite;

//import javax.persistence.Entity;
//import javax.persistence.Table;

//@Entity
//@Table

public class Admin {
String nom;
String password;
public Admin(String nom, String password) {
	super();
	this.nom = nom;
	this.password = password;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
