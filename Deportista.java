public class Deportista extends Individuo{
	
	
	protected static String genero="";
	protected static String fechanacimiento="";
	protected static String deporte="";
	
	public Deportista(){
		super();
	}
	
	public Deportista(String nombre,String apellidopaterno, String apellidomaterno,
					  String telefonocasa,String telefonocelular,String email,String genero,String fechanacimiento, String deporte){
		super(nombre,apellidopaterno,apellidomaterno,telefonocasa,telefonocelular,email);					
		this.genero=genero;
		this.fechanac=fechanac;
		this.deporte=deporte;
	}
	
	public void setGenero(String genero){
		this.genero=genero;
	}
	
	public void setFechaNac(String fechanacimiento){
		this.fechanacimiento=fechanacimiento;
	}

	public void setDeporte(String deporte){
		this.deporte=deporte;
	}
	
	public String getDeporte(){
		return deporte;
	}
	
	public String getGenero(){
		return genero;
	}
	
	public String getFechaNac(){
		return fechanacimiento
	}
} 