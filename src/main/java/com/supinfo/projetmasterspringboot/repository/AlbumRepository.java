package com.supinfo.projetmasterspringboot.repository;

import com.supinfo.projetmasterspringboot.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
}
