package com.ja1zinh0.agendaTelefonica.service;

import com.ja1zinh0.agendaTelefonica.domain.phones.Phone;
import com.ja1zinh0.agendaTelefonica.domain.phones.PhoneRequestDTO;
import com.ja1zinh0.agendaTelefonica.domain.user.Users;
import com.ja1zinh0.agendaTelefonica.repositories.phoneRepository;
import com.ja1zinh0.agendaTelefonica.repositories.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PhoneService {
    @Autowired
    private phoneRepository phoneRepository;

    @Autowired
    private usersRepository usersRepository;

    public Phone addPhone(UUID userId, PhoneRequestDTO data){
        Users users = usersRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        Phone newPhone = new Phone();

        newPhone.setPhone(data.phone());
        newPhone.setUsers(users);

        return phoneRepository.save(newPhone);
    }

}
