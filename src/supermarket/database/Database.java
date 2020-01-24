package supermarket.database;

import supermarket.entities.AbstractIdentifiableEntity;

public abstract class Database<T extends AbstractIdentifiableEntity> {

	public abstract T add(T object);
	public abstract void update(String id);
	public abstract T getOne(String id);
	public abstract void delete(String id);
	
}
