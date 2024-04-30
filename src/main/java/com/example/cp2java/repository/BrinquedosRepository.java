package com.example.cp2java.repository;

import com.example.cp2java.domain.Brinquedos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrinquedosRepository extends JpaRepository<Brinquedos, Integer> {
}
