package com.ja1zinh0.agendaTelefonica.service;


import com.ja1zinh0.agendaTelefonica.domain.address.Address;
import com.ja1zinh0.agendaTelefonica.domain.address.AddressRequestDTO;
import com.ja1zinh0.agendaTelefonica.domain.user.Users;
import com.ja1zinh0.agendaTelefonica.repositories.AddressRepository;
import com.ja1zinh0.agendaTelefonica.repositories.usersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private usersRepository usersRepository;

    public Address addAddress(UUID userId, AddressRequestDTO data){
        Users users = usersRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        Address newAddress = new Address();

        newAddress.setCity(data.city());
        newAddress.setUf(data.uf());
        newAddress.setStreet(data.street());
        newAddress.setCountry(data.country());
        newAddress.setNumber(data.number());

        newAddress.setUsers(users);

        return addressRepository.save(newAddress);
    }
}
