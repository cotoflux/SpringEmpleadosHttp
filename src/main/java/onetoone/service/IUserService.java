package onetoone.service;

import onetoone.dto.UserResponseDto;

public interface IUserService {

    UserResponseDto getUser(String uuid);
}