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
}
