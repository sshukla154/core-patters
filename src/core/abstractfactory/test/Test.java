package core.abstractfactory.test;

import core.abstractfactory.DAO;
import core.abstractfactory.DAOAbstractFactory;
import core.abstractfactory.DAOFactoryProducer;

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
