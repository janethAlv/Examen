package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class categorias extends Model {
	
	public String nombre;
	public String descripcion;
	
	public categorias(String nomb,String desc)
	{
		nombre=nomb;
		descripcion=desc;
	}
}
