package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
    private final Forma forma;

	public Mano(final Forma forma) {
		 this.forma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */

	public Resultado jugarCon(final Mano otra) {

		int CERO=0,UNO=1,DOS=2,TRES=3,CUATRO=4,CINCO=5;
        Resultado[][] matriz = new Resultado[CINCO][CINCO] ;

        matriz[CERO][CERO] = matriz[UNO][UNO] = matriz[DOS][DOS] = matriz[TRES][TRES] = matriz[CUATRO][CUATRO] = Resultado.EMPATA;
		matriz[CERO][TRES] = matriz[CERO][CUATRO] = matriz[UNO][CERO] = matriz[UNO][CUATRO] = matriz[DOS][CERO] = matriz[DOS][UNO] = matriz[TRES][UNO] = matriz[TRES][DOS] = matriz[CUATRO][DOS] = matriz[CUATRO][TRES] = Resultado.GANA;
		matriz[CERO][UNO] = matriz[CERO][DOS] = matriz[UNO][DOS] = matriz[UNO][TRES] = matriz[DOS][TRES] = matriz[DOS][CUATRO] = matriz[TRES][CERO] = matriz[TRES][CUATRO] = matriz[CUATRO][CERO] = matriz[CUATRO][UNO] = Resultado.PIERDE;
		Resultado formaseleccionada=matriz[this.forma.getValor()][otra.forma.getValor()];

		return formaseleccionada;
	}

}
