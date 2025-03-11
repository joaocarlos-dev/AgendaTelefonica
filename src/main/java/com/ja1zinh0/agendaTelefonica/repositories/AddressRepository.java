package com.ja1zinh0.agendaTelefonica.repositories;

import com.ja1zinh0.agendaTelefonica.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
