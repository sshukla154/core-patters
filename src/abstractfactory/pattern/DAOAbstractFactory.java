package abstractfactory.pattern;

public abstract class DAOAbstractFactory {

	public abstract DAO createDAO(String type);

}
