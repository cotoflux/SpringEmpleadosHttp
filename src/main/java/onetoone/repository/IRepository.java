package onetoone.repository;


import onetoone.dto.ResponseDto;

public interface IRepository {

    public ResponseDto getUser(String uuid);
}
