package controleur;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ConnexionBase;
import modeles.Produit;
import modeles.Utilisateur;

public class TraitementProduit {
	public void ajouterProduit(Produit prod) {
		//connexion a la bdd
		ConnexionBase cb = new ConnexionBase();
		cb.connect();
		
		//ecrire la requete
		String req = "insert into produit(libelle, prixu, description, datefabm dateexp) values('"+prod.getLibelle()+"', '"+prod.getPrixU()+"', '"+prod.getDescription()+"', '"+prod.getDateFab()+"', '"+prod.getDateExp()+"') ";
		
		//executer la requete
		try {
			cb.st.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void modifierProduit(Produit prod) {
		//connexion a la bdd
		ConnexionBase cb = new ConnexionBase();
		cb.connect();
				
		//ecrire la requete
		String req = "update produit set libelle='"+prod.getLibelle()+"', prixu='"+prod.getPrixU()+"', description='"+prod.getDescription()+"', datefab='"+prod.getDateFab()+"', dateexp='"+prod.getDateExp()+"' where id='"+prod.getId()+"' ";
				
		//executer
		try {
			cb.st.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void supprimerProduit(int id) {
		//connexion a la bdd
		ConnexionBase cb = new ConnexionBase();
		cb.connect();
		
		//ecrire la requete
		String req = "delete from produit where id='"+id+"' ";
		
		// executer
		try {
			cb.st.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet chercherProduit(int id) {
		ResultSet rs = null;
		
		//connexion a la bdd
		ConnexionBase cb = new ConnexionBase();
		cb.connect();
				
		//ecrire la requete
		String req = "select * from produit where id='"+id+"' ";
				
		//executer
		try {
			rs = cb.st.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public ResultSet listerProduits() {
		ResultSet rs = null;
		
		//connexion a la bdd
		ConnexionBase cb = new ConnexionBase();
		cb.connect();
				
		//ecrire la requete
		String req = "select * from produit";
				
		//executer
		try {
			rs = cb.st.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
}
