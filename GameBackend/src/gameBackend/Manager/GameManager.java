package gameBackend.Manager;

import gameBackend.Entity.Game;

public class GameManager implements BaseService<Game> {

	@Override
	public void add(Game object) {
		System.out.println(object.getGameName()+" adlı oyun eklendi.");
		
	}

	@Override
	public void update(long id, Game object) {
		System.out.println(object.getGameName()+" adlı oyun güncellendi.");
		
		
	}

	@Override
	public void delete(long id, Game object) {
		System.out.println(object.getGameName()+" adlı oyun silindi.");
		
		
	}

}
