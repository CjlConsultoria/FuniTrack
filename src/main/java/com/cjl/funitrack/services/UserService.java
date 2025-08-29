package com.cjl.funitrack.services;

import com.cjl.funitrack.dtos.request.RequestUserDTO;
import com.cjl.funitrack.dtos.response.ResponseUserDTO;
import com.cjl.funitrack.entities.User;
import com.cjl.funitrack.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public User salvarUser(RequestUserDTO requestUserDTO) {
        requestUserDTO.setSenha(passwordEncoder.encode(requestUserDTO.getSenha()));

        User userSave = new User();
        userSave.setNome(requestUserDTO.getNome());
        userSave.setCpf(requestUserDTO.getCpf());
        userSave.setEmail(requestUserDTO.getEmail());
        userSave.setSenha(requestUserDTO.getSenha());
        userSave.setTelefone(requestUserDTO.getTelefone());
        userSave.setCep(requestUserDTO.getCep());
        userSave.setLogradouro(requestUserDTO.getLogradouro());
        userSave.setCidade(requestUserDTO.getCidade());
        userSave.setEstado(requestUserDTO.getEstado());
        userSave.setBairro(requestUserDTO.getBairro());
        userSave.setNumero(requestUserDTO.getNumero());
        userSave.setComplemento(requestUserDTO.getComplemento());
        userSave.setMatricula(requestUserDTO.getMatricula());
        userSave.setRole(requestUserDTO.getRole());
        userSave.setTipo(requestUserDTO.getTipo());

        return userRepository.save(userSave);
    }

    public List<ResponseUserDTO> listarUser() {
        List<User> user = userRepository.findAll();
        return user.stream().map(responseUserDTO -> {
            ResponseUserDTO responseUser = new ResponseUserDTO();
            responseUser.setNome(responseUserDTO.getNome());
            responseUser.setCpf(responseUserDTO.getCpf());
            responseUser.setEmail(responseUserDTO.getEmail());
            responseUser.setTelefone(responseUserDTO.getTelefone());
            responseUser.setCep(responseUserDTO.getCep());
            responseUser.setLogradouro(responseUserDTO.getLogradouro());
            responseUser.setCidade(responseUserDTO.getCidade());
            responseUser.setEstado(responseUserDTO.getEstado());
            responseUser.setBairro(responseUserDTO.getBairro());
            responseUser.setNumero(responseUserDTO.getNumero());
            responseUser.setComplemento(responseUserDTO.getComplemento());
            responseUser.setMatricula(responseUserDTO.getMatricula());
            responseUser.setRole(responseUserDTO.getRole());
            responseUser.setTipo(responseUserDTO.getTipo());
            return responseUser;
        })
                .collect(Collectors.toList());
    }
}
