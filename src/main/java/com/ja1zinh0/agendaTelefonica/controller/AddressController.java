package com.ja1zinh0.agendaTelefonica.controller;


import com.ja1zinh0.agendaTelefonica.domain.address.Address;
import com.ja1zinh0.agendaTelefonica.domain.address.AddressRequestDTO;
import com.ja1zinh0.agendaTelefonica.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/{userId}")
    public ResponseEntity<Address> create(@PathVariable UUID userId, @RequestBody AddressRequestDTO body){
        Address newAddress = this.addressService.addAddress(userId, body);
        return ResponseEntity.ok(newAddress);
    }
}
