package com.ja1zinh0.agendaTelefonica.service;

import com.ja1zinh0.agendaTelefonica.domain.user.Users;
import com.ja1zinh0.agendaTelefonica.domain.user.UsersRequestDTO;
import com.ja1zinh0.agendaTelefonica.repositories.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private usersRepository repository;

    public Users createUser(UsersRequestDTO data){
        Users newUsers = new Users();

            newUsers.setName(data.name());
            newUsers.setEmail(data.email());
            newUsers.setBirthDate(data.birthDate());

            repository.save(newUsers);

            return newUsers;

    }
}
