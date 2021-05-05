package gameBackend.Manager;


import gameBackend.Entity.User;

public class UserManager implements BaseService<User>{
	
	
	private UserCheckService myservice;
	
	public UserManager(UserCheckService myservice) {
		super();
		this.myservice = myservice;
	}


	@Override
	public void add(User object) {
		if (myservice.checkIfRealPerson(object)) {
			System.out.println(object.getFirstName()+" adlı kullanıcı eklendi.");
		} else {
			System.err.println("Not a valid Person");
		}
		
		
	}


	@Override
	public void update(long id, User object) {
		System.out.println(object.getFirstName()+" adlı kullanıcı güncellendi.");
		
	}

	@Override
	public void delete(long id, User object) {
		System.out.println(object.getId()+" id'li kullanıcı silindi.");
		
	}


	

	
	


}
