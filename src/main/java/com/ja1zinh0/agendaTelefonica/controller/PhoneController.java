package com.ja1zinh0.agendaTelefonica.controller;

import com.ja1zinh0.agendaTelefonica.domain.phones.Phone;
import com.ja1zinh0.agendaTelefonica.domain.phones.PhoneRequestDTO;
import com.ja1zinh0.agendaTelefonica.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/phones")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @PostMapping("/{userId}")
    public ResponseEntity<Phone> create(@PathVariable UUID userId, @RequestBody PhoneRequestDTO body){
        Phone newPhone = this.phoneService.addPhone(userId, body);
        return ResponseEntity.ok(newPhone);
    }
}
