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
    
		assertEquals("Tijera corta Papel",
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
	 
	  assertEquals("Piedra aplaste a Lagarto",
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
  
  @Test
  public void quePapelescortadoporTijera(){
	  
	  Mano jugadorUno=new Mano(Forma.PAPEL);
	  Mano jugadorDos=new Mano(Forma.TIJERA);
	 
	  assertEquals("Papel es cortado por Tijera",
			  Resultado.PIERDE,jugadorUno.jugarCon(jugadorDos));
   }	
 
  @Test
  public void queLargatoseadecapitadoporTijera(){
	  
	  Mano jugadorUno=new Mano(Forma.TIJERA);
	  Mano jugadorDos=new Mano(Forma.LAGARTO);
	 
	  assertEquals("Lagarto es decapitado por Tijera",
			  Resultado.PIERDE,jugadorDos.jugarCon(jugadorUno));
   }	
  
  @Test
  public void queSpockdestrozeTijera(){
	  
	  Mano jugadorUno=new Mano(Forma.SPOCK);
	  Mano jugadorDos=new Mano(Forma.TIJERA);
	 
	  assertEquals("Spock destroza tijera",
			  Resultado.GANA,jugadorUno.jugarCon(jugadorDos));
   }
  
  @Test
  public void quePapelrefuteSpock(){
	  
	  Mano jugadorUno=new Mano(Forma.SPOCK);
	  Mano jugadorDos=new Mano(Forma.PAPEL);
	 
	  assertEquals("Papel es refutado por Spock",
			  Resultado.GANA,jugadorDos.jugarCon(jugadorUno));
   }	
  
  
}
