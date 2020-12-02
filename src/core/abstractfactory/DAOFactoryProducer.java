package core.abstractfactory;

public class DAOFactoryProducer {

	public static DAOAbstractFactory produce(String factoryType) {
		DAOAbstractFactory daoAbstractFactory = null;

		if (factoryType.equals("xml")) {
			daoAbstractFactory = new XMLDAOFactory();
		} else {
			daoAbstractFactory = new DBDAOFactory();
		}
		return daoAbstractFactory;
	}

}
