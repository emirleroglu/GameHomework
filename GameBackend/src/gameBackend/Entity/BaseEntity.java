package gameBackend.Entity;

public class BaseEntity {
	private long ıd;
	

	public BaseEntity(long id) {
		super();
		ıd = id;
	}

	public long getId() {
		return ıd;
	}

	public void setId(long id) {
		this.ıd = id;
	}
}
