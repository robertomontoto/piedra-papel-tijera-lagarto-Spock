package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA,jugadorUno.jugarCon(jugadorDos));

	}

   @Test 
   public void queTijeraCortaPapel(){
   
	   Mano jugadorUno=new Mano(Forma.TIJERA);
	   Mano jugadorDos=new Mano(Forma.PAPEL);
    
	   assertEquals("Tijera que corta Papel",
			   		Resultado.GANA,jugadorUno.jugarCon(jugadorDos));    
   }
   
   @Test 
   public void quePapelCubrePiedra(){
    
	  Mano jugadorUno=new Mano(Forma.PIEDRA);
	  Mano jugadorDos=new Mano(Forma.PAPEL);
    
	  assertEquals("Papel cubre Piedra",
			  		Resultado.GANA,jugadorDos.jugarCon(jugadorUno));    
  }
 
  @Test
  public void quePiedraAplasteLagarto(){
	 
	  Mano jugadorUno=new Mano(Forma.PIEDRA);
	  Mano jugadorDos=new Mano(Forma.LAGARTO);
	 
	  assertEquals("Piedra aplaste Lagarto",
			  		Resultado.GANA,jugadorUno.jugarCon(jugadorDos));
   }
  

  @Test
  public void quePiedraesVaporizadaporSpock(){
	  
	  Mano jugadorUno=new Mano(Forma.SPOCK);
	  Mano jugadorDos=new Mano(Forma.PIEDRA);
	 
	  assertEquals("Piedra es Vaporizada por Spock",
			  		Resultado.PIERDE,jugadorDos.jugarCon(jugadorUno));
   }	
  
  @Test
  public void queLagartoempataconLagarto(){
	  
	  Mano jugadorUno=new Mano(Forma.LAGARTO);
	  Mano jugadorDos=new Mano(Forma.LAGARTO);
	 
	  assertEquals("Lagarto empata con Lagarto",
			  		Resultado.EMPATA,jugadorDos.jugarCon(jugadorUno));
   }	
 
}
