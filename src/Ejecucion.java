public class Ejecucion {
    private static String ruta = "/home/dam/Desktop/Arquivos/arquivosdir";
    private static String rutaSub = "/home/dam/Desktop/Arquivos/arquivosdir/subdir";
    public static void iniciarEjercicio(
    ){
        System.out.println("Para comprobar metodo a metodo la resolucion del ejecicio vaya pulsado enter");
        System.out.println("Metodo 1");
        esperarEnter();
        metodoUno();
        System.out.println("Metodo 2");
        esperarEnter();
        metodoDos();
        System.out.println("Metodo 3");
        esperarEnter();
        metodoTres();
        System.out.println("Metodo 4");
        esperarEnter();
        metodoCuatro();
        System.out.println("Metodo 5");
        esperarEnter();
        metodoCinco();
        System.out.println("Metodo 6");
        esperarEnter();
        metodoSeis();
        System.out.println("Metodo 7");
        esperarEnter();
        metodoSiete();
        System.out.println("Metodo 8");
        esperarEnter();
        metodoOcho();
        System.out.println("Metodo 9");
        esperarEnter();
        metodoNueve();
        System.out.println("Metodo 10");
        esperarEnter();
        metodoDiez();
    }
    public static void metodoUno(){
        Arquivos.crearDirectorio(ruta);
        Arquivos.eDirectorio(ruta);
    }
    public static void  metodoDos(){
        Arquivos.crearFicheiro(ruta, "Products1.txt");
        Arquivos.eFicheiro(ruta+"/Products1.txt");
    }
    public static void metodoTres(){
        Arquivos.crearDirectorio(rutaSub);
        Arquivos.crearFicheiro(rutaSub+"/", "Products2.txt");
    }
    public static void metodoCuatro(){
        Arquivos.mContido(ruta);
    }
    public static void metodoCinco(){
        Arquivos.modoAcceso(ruta, "Products1.txt");
    }
    public static void metodoSeis(){
        Arquivos.mLectura(ruta, "Products1.txt");
    }
    public static void metodoSiete(){
        Arquivos.mEscritura(ruta, "Products1.txt");
    }
    public static void metodoOcho(){
        Arquivos.borrarFicheiro(ruta, "Products1.txt");
    }
    public static void metodoNueve(){
        Arquivos.borrarDirectorio(ruta);
    }
    public static void metodoDiez(){
        Arquivos.borrarDirectorio(rutaSub);
    }
    //metodo que espera hasta qeu pulses enter
    public static void esperarEnter(){
        try{
            System.in.read();
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
