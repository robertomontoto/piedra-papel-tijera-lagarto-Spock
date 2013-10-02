package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	/**
	 * Toda Mano debe crearse con una forma dada, que ser�
	 * la que determine su condici�n en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
    private final Forma forma;

	public Mano(final Forma forma) {
		 this.forma = forma;
	}

	/**
	 * Evaluar� el resultado de la partida seg�n las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */

	public Resultado jugarCon(final Mano otra) {

		Resultado[][]matriz = new Resultado[5][5] ;
		matriz[0][0] = matriz[1][1] = matriz[2][2] = matriz[3][3] = matriz[4][4] = Resultado.EMPATA;
		matriz[0][3] = matriz[0][4] = matriz[1][0] = matriz[1][4] = matriz[2][0] = matriz[2][1] = matriz[3][1] = matriz[3][2] = matriz[4][2] = matriz[4][3] = Resultado.GANA;
		matriz[0][1] = matriz[0][2] = matriz[1][2] = matriz[1][3] = matriz[2][3] = matriz[2][4] = matriz[3][0] = matriz[3][4] = matriz[4][0] = matriz[4][1] = Resultado.PIERDE;

	    Resultado formaseleccionada = matriz[this.forma.getValor()][otra.forma.getValor()];
	    return formaseleccionada;
	}

}
