package onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import onetoone.dto.EmpleadoResponseDto;
import onetoone.dto.UserResponseDto;
import onetoone.service.IUserService;
import onetoone.service.impl.EmpleadoServiceImpl;
import onetoone.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

    private final EmpleadoServiceImpl empleadoService;

    @Autowired
    public EmpleadoController(EmpleadoServiceImpl empleadoService){
        this.empleadoService = empleadoService;
    }

    @GetMapping("/test")
    public String helloGradle() {
        return "Hola Empleados!!";
    }

    //@PutMapping(value ="", consumes = {"application/json"})
    @GetMapping("/empleado/{uuid}")
    public ResponseEntity<EmpleadoResponseDto> updatePrescription(
            @PathVariable(name="uuid") String user) throws Exception {


        EmpleadoResponseDto empleadoResponseDto = empleadoService.getUser("pp");

        System.out.println(empleadoResponseDto.getNombre());
        System.out.println(empleadoResponseDto.getCargo());
        System.out.println(empleadoResponseDto.getSalario());

        return new ResponseEntity<>(empleadoResponseDto, HttpStatus.OK);

    }


}
