package com.ja1zinh0.agendaTelefonica.controller;

import com.ja1zinh0.agendaTelefonica.domain.user.Users;
import com.ja1zinh0.agendaTelefonica.domain.user.UsersRequestDTO;
import com.ja1zinh0.agendaTelefonica.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UsersService usersService;

    @PostMapping
    public ResponseEntity<Users> create(@RequestBody UsersRequestDTO body){
        Users newUsers = this.usersService.createUser(body);
        return ResponseEntity.ok(newUsers);
    }
}
