package onetoone.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import onetoone.dto.EmpleadoResponseDto;
import onetoone.service.IUserService;
import onetoone.service.impl.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadosController {

    private final EmpleadoServiceImpl empleadoService;

    @Autowired
    public EmpleadosController(EmpleadoServiceImpl empleadoService){
        this.empleadoService = empleadoService;
    }

    @GetMapping("/test")
    public String helloGradle() {
        return "Hello Gradle!";
    }

    //@PutMapping(value ="", consumes = {"application/json"})
    @GetMapping("/user/{uuid}")
    public ResponseEntity<EmpleadoResponseDto> updatePrescription(
            @PathVariable(name="uuid") String user) throws Exception {


        EmpleadoResponseDto empleadoResponseDto = empleadoService.getUser("pp");

        System.out.println(empleadoResponseDto.getName());
        System.out.println(empleadoResponseDto.getSurname());
        System.out.println(empleadoResponseDto.getCargo());
        System.out.println(empleadoResponseDto.getSueldo());

        return new ResponseEntity<>(empleadoResponseDto, HttpStatus.OK);

    }


}



