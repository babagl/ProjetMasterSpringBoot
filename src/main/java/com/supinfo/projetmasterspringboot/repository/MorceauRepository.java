package com.supinfo.projetmasterspringboot.repository;

import com.supinfo.projetmasterspringboot.model.Morceau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MorceauRepository extends JpaRepository<Morceau, Long> {
}
