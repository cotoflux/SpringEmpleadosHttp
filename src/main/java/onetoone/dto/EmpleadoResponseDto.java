package onetoone.dto;


import org.springframework.stereotype.Component;

@Component
public class EmpleadoResponseDto extends ResponseDto{
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public long getSueldo() {
		return sueldo;
	}
	public void setSueldo(long sueldo) {
		this.sueldo = sueldo;
	}
	private String name;
    private String surname;
    private String cargo;
    private long sueldo;



}