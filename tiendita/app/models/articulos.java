package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class articulos extends Model{
	
	public String nombre;
	public int cantidad;
	
	public articulos(String nom,int cant)
	{
		nombre=nom;
		cantidad=cant;
	}
}
