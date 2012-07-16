import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {
	
	@Test
    public void alta() {
        articulos a= new articulos("Elotes",2).save();
        categorias ca= new categorias("Verduras","enlatados").save();
    }
    
    @Test
    public void buscar() {
        articulos a= articulos.find("byNombre","Elotes").first();
        categorias ca= categorias.find("byNombre", "Verduras").first();
        System.out.println("El articulo es: " + a.nombre);
        System.out.println("La categoria es: " +ca.nombre);
    }
    
    @Test
    public void cambio() 
    {
    	articulos a= articulos.find("byNombre","Elotes").first();
    	a.nombre="Manzana";
    	a.save();
    	
    	categorias ca= categorias.find("byNombre","Verduras").first();
    	ca.nombre="Frutas";
    	ca.save();
    	
    	System.out.println("El articulo es: "+ a.nombre);
    	System.out.println("La categoria es: "+ca.nombre);
    	
    }
    @Test
    public void eliminar() 
    {
    	articulos a= articulos.find("byNombre","Manzana").first();
    	a.delete();
    	categorias ca= categorias.find("byNombre","Frutas").first();
    	ca.delete();
        
    }
}
