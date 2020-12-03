package abstractfactory.pattern.test;

import abstractfactory.pattern.DAO;
import abstractfactory.pattern.DAOAbstractFactory;
import abstractfactory.pattern.DAOFactoryProducer;

public class Test {

	public static void main(String[] args) {
		// Factory of Factories
		DAOAbstractFactory factoryXML = DAOFactoryProducer.produce("xml");
		// Factory
		DAO createEmpDAO = factoryXML.createDAO("emp");
		// Class
		createEmpDAO.save();

		System.out.println("----");

		// Factory of Factories
		DAOAbstractFactory factoryDB = DAOFactoryProducer.produce("db");
		// Factory
		DAO createDeptDAO = factoryDB.createDAO("dept");
		// Class
		createDeptDAO.save();
	}

}
