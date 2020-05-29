import ayp3.tp.*;
public class Trabajador implements ITrabajador{
	private String nombre;

	public Trabajador(long dni, String nombre, String apellido, TipoCargo cargo, Fecha fechaIngreso) {
		
	}
	@Override
	public boolean esEmpleado() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean esDirectivo() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public TipoCargo getCargo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getMesesAntiguedad() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setTituloUniversitario(String titulo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getTituloUniversitario() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean tieneTituloUniversitario() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setTituloPostgrado(String titulo) throws ExcepcionOperacionNoPermitida {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getTituloPostgrado() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean tieneTituloPostgrado() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long getDni() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void agregarTrabajadorACargo(ITrabajador trabajador) throws ExcepcionOperacionNoPermitida {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setJefe(ITrabajador jefe) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSalario(double salario) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getPremio() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getMontoACobrar() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getCantidadEmpleadosACargoDirecto() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getCantidadEmpleadosACargoTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}