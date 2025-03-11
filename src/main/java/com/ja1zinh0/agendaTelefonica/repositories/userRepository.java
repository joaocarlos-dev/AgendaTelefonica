package com.ja1zinh0.agendaTelefonica.repositories;

import com.ja1zinh0.agendaTelefonica.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface userRepository extends JpaRepository<User, UUID> {
}
