package gameBackend.Manager;

import gameBackend.Entity.User;

public interface UserCheckService {
	boolean checkIfRealPerson(User user); 
}
