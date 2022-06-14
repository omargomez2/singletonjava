package net.osgg.singleton;

public class SingletonPattern {
	
	private static SingletonPattern INSTANCE = null;
	private String contenido = null;

	// El constructor privado no permite que se genere un constructor por defecto	
	private SingletonPattern() {}
	
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public static SingletonPattern getInstance() {
		if (INSTANCE == null)
			INSTANCE = new SingletonPattern();
		return INSTANCE;
	}
	
}


