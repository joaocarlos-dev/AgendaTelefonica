package com.ja1zinh0.agendaTelefonica.domain.phones;


import com.ja1zinh0.agendaTelefonica.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="phone")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Phone {

    @Id
    @GeneratedValue
    private UUID id;

    private String phone;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
