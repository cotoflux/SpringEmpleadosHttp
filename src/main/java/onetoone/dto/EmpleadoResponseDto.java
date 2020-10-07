package onetoone.dto;

import org.springframework.stereotype.Component;

@Component
public class EmpleadoResponseDto extends ResponseDto{

    private String nombre;
    private String cargo;
    private String salario;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}


}