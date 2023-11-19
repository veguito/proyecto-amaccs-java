package proyectospring.gestionusuario.model;


public class Auto {
    private int id;
    private String modelo;
    
    public Auto(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
        
    }
    // Otros atributos y getters/setters
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
}
