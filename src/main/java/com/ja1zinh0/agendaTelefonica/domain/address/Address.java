package com.ja1zinh0.agendaTelefonica.domain.address;

import com.ja1zinh0.agendaTelefonica.domain.user.Users;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue
    private UUID id;

    private String country;
    private String uf;
    private String city;
    private String street;
    private String number;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
}
