package com.supinfo.projetmasterspringboot.repository;

import com.supinfo.projetmasterspringboot.model.Artiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtisteRepository extends JpaRepository<Artiste, Long> {
}
