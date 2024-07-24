package rs.raf.userservice.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import rs.raf.userservice.data.dtos.CreateRequestUserDto;
import rs.raf.userservice.data.dtos.ResponseUserDto;

import java.util.List;

@Service
public interface UserService extends UserDetailsService {
    List<ResponseUserDto> findAllUsers();

    ResponseUserDto findUserById(Long id);

    ResponseUserDto findUserByEmail(String email);

    ResponseUserDto findUserByUsername(String username);

    ResponseUserDto createUser(CreateRequestUserDto user);

    ResponseUserDto updateUser(ResponseUserDto user);

    boolean deleteUserById(Long id);

    boolean deleteUserByEmail(String email);
}
