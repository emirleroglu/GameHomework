package gameBackend.Manager;


public interface BaseService<T> {
	public void add(T object);
	public void update(long id, T object);
	public void delete(long id, T object);
}
