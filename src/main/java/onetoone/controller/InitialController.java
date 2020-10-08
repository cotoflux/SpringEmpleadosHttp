package onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import onetoone.dto.EmpleadoResponseDto;
import onetoone.service.IEmpleadoService;
import onetoone.service.impl.EmpleadoServiceImpl;

@RestController
@RequestMapping("/v1")
public class InitialController {

    private final EmpleadoServiceImpl userService;

    @Autowired
    public InitialController(EmpleadoServiceImpl userService){
        this.userService = userService;
    }

    @GetMapping("/test")
    public String helloGradle() {
        return "Hello Gradle!";
    }

    //@PutMapping(value ="", consumes = {"application/json"})
    @GetMapping("/user/{uuid}")
    public ResponseEntity<EmpleadoResponseDto> updatePrescription(
            @PathVariable(name="uuid") String user) throws Exception {


        EmpleadoResponseDto userResponseDto = userService.getUser("pp");

        System.out.println(userResponseDto.getName());
        System.out.println(userResponseDto.getSurname());
        System.out.println(userResponseDto.getGender());

        return new ResponseEntity<>(userResponseDto, HttpStatus.OK);

    }


}
