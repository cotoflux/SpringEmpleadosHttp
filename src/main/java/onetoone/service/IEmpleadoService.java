package onetoone.service;

import onetoone.dto.EmpleadoResponseDto;

public interface IEmpleadoService {

   EmpleadoResponseDto getUser(String uuid);
}