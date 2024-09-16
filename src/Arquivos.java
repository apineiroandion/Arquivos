import java.io.File;
public class Arquivos {
    /*Metodo que compueba si la ruta especificada es un directorio
    * @param ruta String con la ruta a comprobar
    */
    public static void eDirectorio(String ruta){
        File archivo = new File(ruta);
        if(archivo.isDirectory()){
            System.out.println("e un directorio");
        }else{
            System.out.println("non e un directorio");
        }
    }
    /*Metodo que compueba si la ruta especificada es un fichero
    * @param ruta String con la ruta a comprobar
    */
    public static void eFicheiro(String ruta){
        File archivo = new File(ruta);
        if(archivo.isFile()){
            System.out.println("e un fichero");
        }else{
            System.out.println("non e un fichero");
        }
    }
    /*Metodo que crea un directorio en la ruta que se le pasa siemopre que este no exista
    * @param ruta String con la ruta a comprobar
    */
    public static void crearDirectorio(String ruta){
        File archivo = new File(ruta);
        if(archivo.mkdir()){
            System.out.println("Directorio creado");
        }else{
            System.out.println("Directorio no creado");
        }
    }
    /*Metodo que crea un Fichero en la ruta que se le pasa, con el nombre que se le pasa
    * @param ruta String con la ruta a comprobar
    * @param nome String con el nombre del fichero
    */
    public static void crearFicheiro(String ruta, String nome){
        File archivo = new File(ruta, nome);
        try{
            if(archivo.createNewFile()){
                System.out.println("Fichero creado");
            }else{
                System.out.println("Fichero no creado");
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    /*Metodo que comprueba el tipo de acceso al fichero e indica si se puede escribir o no en el
    *y si se puede o no leer a traves de la ruta absoluta que se le pasa
    * @param ruta String con la ruta a comprobar
    * @param nome String con el nombre del fichero
    */
    public static void modoAcceso(String ruta, String nome){
        File archivo = new File(ruta, nome);
        if(archivo.canRead()){
            System.out.println("Lectura si");
        }else{
            System.out.println("Lectura non");
        }
        if(archivo.canWrite()){
            System.out.println("Escritura si");
        }else{
            System.out.println("Escritura non");
        }
    }
    /*Metodo que calcula la longitud en bytes de un fichero a traves de la ruta absoluta
     *que se le pasa y el nombre del fichero
     * @param ruta String con la ruta a comprobar
     * @param nome String con el nombre del fichero
     */
    public static void lonxitudeFicheiro(String ruta, String nome) {
        File archivo = new File(ruta, nome);
        System.out.println("Lonxitude: " + archivo.length() + " bytes");
    }
    /*
    *Metodo que hace de solo lectura el fichero que se le pasa a traves de la ruta absoluta y el nombre del fichero
    * @param ruta String con la ruta a comprobar
    * @param nome String con el nombre del fichero
    */
    public static void mLectura(String ruta, String nome){
        File archivo = new File(ruta, nome);
        if(archivo.setReadOnly()){
            System.out.println("Ficheiro en modo solo lectura");
        }else{
            System.out.println("Ficheiro non en modo solo lectura");
        }
    }
    /*Metodo que hace de solo escritura el fichero que se le pasa a traves de la ruta absoluta y el nombre del fichero
    * @param ruta String con la ruta a comprobar
    * @param nome String con el nombre del fichero
    */

}
