package onetoone.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import onetoone.dto.EmpleadoResponseDto;
import onetoone.repository.EmpleadoRepository;
import onetoone.service.IEmpleadoService;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    private final EmpleadoRepository userRepository;

    @Autowired
    public EmpleadoServiceImpl(EmpleadoRepository userRepository){
        this.userRepository = userRepository;
    }

    public EmpleadoResponseDto getUser(String uuid){
        return userRepository.getUser(uuid);
    }

}