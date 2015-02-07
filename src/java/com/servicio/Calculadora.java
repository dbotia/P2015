/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicio;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author User
 */
@Stateless
//con la siguiente anotación se indica que este recurso se accesará vía web desde la ruta /factorial
@Path("/factorial")
public class Calculadora {
    //Se crea el método GET que recibe el parámetro numero.
    @GET
    public String factorial(@QueryParam("numero")long numero) {
        return Long.toString($factorial(numero));
    }
    
    @Path("/suma") 
    @GET
    public String suma(@QueryParam("numero1")long numero1,@QueryParam("numero2")long numero2) {
        return Long.toString(numero1+numero2);
    }
     
   @Path("/resta")
    @GET
    public String resta(@QueryParam("numero1")long numero1,@QueryParam("numero2")long numero2) {
        return Long.toString(numero1-numero2);
    }
      
   @Path("/multi")
   @GET
    public String multi(@QueryParam("numero1")long numero1,@QueryParam("numero2")long numero2) {
        return Long.toString(numero1*numero2);
    }

    @Path("/division")
    @GET
    public String division(@QueryParam("numero1")long numero1,@QueryParam("numero2")long numero2) {
                if(numero2!=0)
                return Long.toString(numero1/numero2);
                else return "Error en divisor Por favor corrija.";
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    long $factorial(long numero) {
        if(numero>=1){
        return $factorial(numero-1)*numero;
        }
        
        return 1;

    
    
    }
    
    
}
