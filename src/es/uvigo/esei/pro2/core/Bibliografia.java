/*  Definición de la clase Bibliografia
 *  Una bibliografia esta compuesta de referencias bibliograficas
*/

package es.uvigo.esei.pro2.core;

/**
 *
 * @author nrufino
 */
public class Bibliografia {
    private Referencia[] referencias;
    private int numReferencias;

    /** Nueva Coleccion con un num. max. de referencias.
     * @param maxReferencias el num. max. de referencias, como entero.
     */
    public Bibliografia(int maxReferencias)
    {
        numReferencias = 0;
        referencias = new Referencia[ maxReferencias  ];
    }

    /**
     * Devuelve la referencia en pos
     * @param pos el lugar de la referencia en el vector de referencias
     * @return el objeto Referencia correspondiente.
     */
    public Referencia get(int pos)
    {
        if ( pos >= getNumReferencias() ) {
            System.err.println( "get(): sobrepasa la pos: " + ( pos + 1 ) + " / " + getMaxReferencias() );
            System.exit( -1 );
        }

        return referencias[ pos ];
    }

    /** Devuelve el num. de referencias creadas.
     * @return el num. de referencias disponibles, como entero.
     */
    public int getNumReferencias()
    {
        return numReferencias;
    }

    /** Devuelve el max. de numReferenciass
     * @return el num. de referencias max,, como entero
     */
    public int getMaxReferencias()
    {
        return referencias.length;
    }

    /** Inserta una nueva referencia
     * @param r el nuevo objeto Referencia
     */
    public void inserta(Referencia r)
    {
        final int maxReferencias = getMaxReferencias();

        if ( getNumReferencias() >= maxReferencias ) {
            System.err.println( "inserta(): sobrepasa max.: " + maxReferencias );
            System.exit( -1 );
        }

        referencias[ numReferencias ] = r;
        ++numReferencias;
    }

    public void elimina(int pos)
    {
    }
}
