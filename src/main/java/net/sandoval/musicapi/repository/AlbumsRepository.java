package net.sandoval.musicapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sandoval.musicapi.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
