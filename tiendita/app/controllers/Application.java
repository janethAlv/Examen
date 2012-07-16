package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void alta(String nombre, int canti, String nombrec,String descrip) 
    {
    	articulos a=null;
    	categorias ca=null;
    	if(nombre!=null && nombrec!=null && descrip!=null)
    	{
    		a=new articulos(nombre,canti).save();
    		ca= new categorias(nombrec, descrip).save();
    	}
        render(a, ca);
    }

    public static void cambio(String nombre, String nombreN,String nombrec,String nombreNC) 
    {
    	articulos a=null;
    	categorias ca=null;
    	if(nombre!=null && !nombre.equals("") && nombrec!=null && !nombrec.equals(""))
    	{
    		a= articulos.find("byNombre", nombre).first();
    		if(a!=null)
    		{
    			a.nombre=nombreN;
    			a.save();
    		}
    		ca= categorias.find("byNombre", nombrec).first();
    		if(ca!=null)
    		{
    			ca.nombre=nombreNC;
    			ca.save();
    		}
    	}
        render(a, ca);
    }
    
    public static void eliminar(String nombre, String nombrec) 
    {
    	articulos a=null;
    	categorias ca=null;
    	if(nombre!=null && !nombre.equals(""))
    	{
    		a= articulos.find("byNombre", nombre).first();
    		if(a!=null)
    		{
    			
    			a.delete();
    		}
    		
    	}
    	if(nombrec!=null && !nombrec.equals(""))
    	{
    		ca= categorias.find("byNombre", nombrec).first();
    		if(ca!=null)
    		{
    			
    			ca.delete();
    		}
    		
    	}
        render(a, ca);
    }


}