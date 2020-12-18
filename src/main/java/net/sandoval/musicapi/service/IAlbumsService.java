package net.sandoval.musicapi.service;

import java.util.List;

import net.sandoval.musicapi.entity.Album;

public interface IAlbumsService {
	List<Album>buscarTodos();
	void guardar (Album album);
	void eliminar1(int idAlbum);
}
