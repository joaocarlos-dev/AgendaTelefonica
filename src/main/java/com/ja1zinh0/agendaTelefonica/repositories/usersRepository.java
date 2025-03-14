package com.ja1zinh0.agendaTelefonica.repositories;

import com.ja1zinh0.agendaTelefonica.domain.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface usersRepository extends JpaRepository<Users, UUID> {
}
