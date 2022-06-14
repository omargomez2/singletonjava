package net.osgg.singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//declaramos un identificador de tipo SingletonPattern
    	SingletonPattern sp;
    	sp = SingletonPattern.getInstance();
    	sp.setContenido("¡Hola Mundo!");
    	System.out.println( sp.getContenido() );
    	
    	//declaramos otro identificador de tipo SingletonPattern
    	SingletonPattern sp2;
    	sp2 = SingletonPattern.getInstance();
    	sp2.setContenido("¡Hola Universo!");
    	System.out.println( sp2.getContenido() );
    	//Si queremos imprimir de nuevo el contenido de sp, ¿Qué se obtiene?
        System.out.println( sp.getContenido() );

    }
}
