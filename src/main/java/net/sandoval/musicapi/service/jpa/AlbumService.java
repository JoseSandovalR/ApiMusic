package net.sandoval.musicapi.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sandoval.musicapi.entity.Album;
import net.sandoval.musicapi.repository.AlbumsRepository;
import net.sandoval.musicapi.service.IAlbumsService;

@Service
public class AlbumService implements IAlbumsService {

	@Autowired
	AlbumsRepository repoAlbum;
	@Override
	public List<Album> buscarTodos() {
		
		return repoAlbum.findAll();
	}
	@Override
	public void guardar(Album album) {
		repoAlbum.save(album);
		
	}
	@Override
	public void eliminar1(int idAlbum) {
		repoAlbum.deleteById(idAlbum);
		
	}
	
	

}
