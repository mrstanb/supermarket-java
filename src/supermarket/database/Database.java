package supermarket.database;

import java.util.Map;

import supermarket.entities.AbstractIdentifiableEntity;


public abstract class Database<T extends AbstractIdentifiableEntity> {

	private Map<String, T> db;
	
	public void add(T object) {
		db.put(object.getId(), object);
	}
	
	public void update(String id, T object) {
		T temp = db.get(id);
		temp = object;
		db.put(id, temp);
	}
	
	public T getOne(String id) {
		return db.get(id);
	}
	
	public void delete(String id) {
		db.remove(id);
	}
	
}
