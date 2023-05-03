package service;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ConnexionBase;
import modeles.Utilisateur;

public class TraitementUtilisateur {
	
	public static void ajouterUtilisateur(Utilisateur util) {
		//connexion a la bdd
		ConnexionBase cb = new ConnexionBase();
		cb.connect();
		
		//ecrire la requete
		String req = "insert into utilisateur(prenom, nom, login, password) values('"+util.getPrenom()+"', '"+util.getNom()+"', '"+util.getLogin()+"', '"+util.getPassword()+"')";
		
		//executer la requete
		try {
			cb.st.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void modifierUtilisateur(Utilisateur util) {
		//connexion a la bdd
		ConnexionBase cb = new ConnexionBase();
		cb.connect();
				
		//ecrire la requete
		String req = "update utilisateur set prenom='"+util.getPrenom()+"', nom='"+util.getNom()+"', login='"+util.getLogin()+"', password='"+util.getPassword()+"' where id='"+util.getId()+"' ";
				
		//executer
		try {
			cb.st.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void supprimerUtilisateur(int id) {
		//connexion a la bdd
		ConnexionBase cb = new ConnexionBase();
		cb.connect();
		
		//ecrire la requete
		String req = "delete from utilisateur where id='"+id+"' ";
		
		// executer
		try {
			cb.st.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ResultSet chercherUtilisateur(int id) {
		ResultSet rs = null;
		
		//connexion a la bdd
		ConnexionBase cb = new ConnexionBase();
		cb.connect();
				
		//ecrire la requete
		String req = "select * from utilisateur where id='"+id+"' ";
				
		//executer
		try {
			rs = cb.st.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public static ResultSet listerUtilisateurs() {
		ResultSet rs = null;
		
		//connexion a la bdd
		ConnexionBase cb = new ConnexionBase();
		cb.connect();
				
		//ecrire la requete
		String req = "select * from utilisateur";
				
		//executer
		try {
			rs = cb.st.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public static Utilisateur testLogin(String login, String password) {
		ResultSet rs = null;
		Utilisateur u = null;
		
		ConnexionBase cb = new ConnexionBase();
		cb.connect();
		
		String req = "select * from utilisateur where login='"+login+"' and password='"+password+"' ";
		
		try {
			rs = cb.st.executeQuery(req);
			while(rs.next()) {
				u = new Utilisateur();
				u.setId(rs.getInt("id"));
				u.setPrenom(rs.getString("prenom"));
				u.setNom(rs.getString("nom"));
				u.setLogin(rs.getString("login"));
				u.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		return u;
	}
	
}
