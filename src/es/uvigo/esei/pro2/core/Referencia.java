// Definicion de la clase Referencia

package es.uvigo.esei.pro2.core;

/**
 *
 * @author nrufino
 */
public class Referencia {
    
    private String autores; 
    private String titulo;  
    private int ano;

    private boolean libro;
    private boolean articuloRevista;
    private boolean documentoWeb;

    /** Crea una nueva referencia, con sus autores, título y año
     * @param autores los nombres de los autores de la referencia
     * @param titulo el título de la referencia
     * @param ano el ano de la referencia
     */
    public Referencia(String autores, String titulo, int ano)
    {
        setEtiquetaLibro( false );
        setEtiquetaArticuloRevista( false );
        setEtiquetaDocumentoWeb( false );

        this.setAutores( autores );
        this.setTitulo( titulo );
        this.setAno(ano);
    }

    /** Devuelve el titulo de la referencia
     * @return el titulo de la referencia, como String.
     */
    public String getTitulo()
    {
        return titulo;
    }

    /** Cambia el titulo de la referencia
     * @param t el titulo de la referencia
     */
    public void setTitulo(String t)
    {
        titulo = t.trim();
    }

    /** Devuelve los autores de la referencia
     *  @return El valor como cadena
     **/
    public String getAutores() {
        return autores;
    }

    /** Cambia los autores
     * @param autores El nuevo valor, como cadena
     */
    public void setAutores(String autores) {
        this.autores = autores.trim();
    }

    /** Devuelve el año de la referencia
     *  @return El valor como entero
     **/
    public int getAno() {
        return ano;
    }

    /** Cambia el año
     * @param ano El nuevo valor, como entero
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /** Devuelve el valor de la etiqueta libro
     * @return true si se encuentra activa, false en otro caso
     */
    public boolean estaEtiquetadoComoLibro() {
        return libro;
    }

    /** Cambia la etiqueta libro
     * @param libro El nuevo valor, como boolean
     */
    public void setEtiquetaLibro(boolean libro) {
        this.libro = libro;
    }

    /** Devuelve el valor de la etiqueta articuloRevista
     * @return true si se encuentra activa, false en otro caso
     */
    public boolean estaEtiquetadoComoArticuloRevista() {
        return articuloRevista;
    }

    /** Cambia la etiqueta articuloRevista
     * @param articuloRevista El nuevo valor, como boolean
     */
    public void setEtiquetaArticuloRevista(boolean articuloRevista) {
        this.articuloRevista = articuloRevista;
    }

    /** Devuelve el valor de la etiqueta documentoWeb
     * @return true si se encuentra activa, false en otro caso
     */
    public boolean estaEtiquetadoComoDocumentoWeb() {
        return documentoWeb;
    }

    /** Cambia la etiqueta documentoWeb
     * @param documentoWeb El nuevo valor, como boolean
     */
    public void setEtiquetaDocumentoWeb(boolean documentoWeb) {
        this.documentoWeb = documentoWeb;
    }

    public String toString()
    {
        String toret = getAutores() + " ; " + getTitulo() + " ; " + getAno() + " ; ";

        if ( estaEtiquetadoComoLibro() ) {
            toret += "libro ";
        } 
        else if ( estaEtiquetadoComoArticuloRevista() ) {
                toret += "articulo revista ";
             }
             else if ( estaEtiquetadoComoDocumentoWeb() ) {
                    toret += "documento web ";
                  }

        return toret;
    }
}

