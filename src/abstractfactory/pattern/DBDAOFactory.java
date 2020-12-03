package abstractfactory.pattern;

public class DBDAOFactory extends DAOAbstractFactory {

	@Override
	public DAO createDAO(String type) {

		DAO dao;
		if (type.equals("emp")) {
			dao = new DBEmpDAO();
		} else {
			dao = new DBDeptDAO();
		}
		return dao;

	}

}
