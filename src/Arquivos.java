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
    public static void mEscritura(String ruta, String nome){
        File archivo = new File(ruta, nome);
        if(archivo.setWritable(true)){
            System.out.println("Ficheiro en modo solo escritura");
        }else{
            System.out.println("Ficheiro non en modo solo escritura");
        }
    }
    /*Metodo que borra un ficheiro dada a ruta e o nome dun archivo
    * @param ruta String con la ruta a comprobar
    * @param nome String con el nombre del fichero
     */
    public static void borrarFicheiro(String ruta, String nome) {
        File archivo = new File(ruta, nome);
        if (archivo.delete()) {
            System.out.println("Ficheiro borrado");
        } else {
            System.out.println("Ficheiro inexistente");
        }
    }
    /*Metodo que borra un directorio dada a ruta
    * @param ruta String con la ruta a comprobar
     */
    public static void borrarDirectorio(String ruta) {
        File archivo = new File(ruta);
        if (archivo.delete()) {
            System.out.println("Directorio borrado");
        } else {
            System.out.println("Ruta inexistente ou con descencencia");
        }
    }
    /*Metodo que enseñe archivos y directorios solo del primer nivel de una ruta absoluta
    *@param ruta String
     */
    public static void mContido(String ruta) {
        File arquivo = new File(ruta);
        File[] archivos = arquivo.listFiles();
        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                System.out.println("Directorio: " + archivo.getName());
            } else {
                System.out.println("Ficheiro: " + archivo.getName());
            }
        }
    }
    /*Metodo que amose os arquivos e subdirectorios de directorio que se lle pasa como obxetro file
    @param ruta String
     */
    public static void mContido(File arquivo) {
        File[] archivos = arquivo.listFiles();
        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                System.out.println("Directorio: " + archivo.getName());
            } else {
                System.out.println("Ficheiro: " + archivo.getName());
            }
        }
    }
}
