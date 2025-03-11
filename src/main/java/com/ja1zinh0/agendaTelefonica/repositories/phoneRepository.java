package com.ja1zinh0.agendaTelefonica.repositories;

import com.ja1zinh0.agendaTelefonica.domain.phones.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface phoneRepository extends JpaRepository<Phone, UUID> {
}
