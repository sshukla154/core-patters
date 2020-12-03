package abstractfactory.pattern;

public class XMLDAOFactory extends DAOAbstractFactory {

	@Override
	public DAO createDAO(String type) {
		DAO dao;
		if (type.equals("emp")) {
			dao = new XMLEmpDAO();
		} else {
			dao = new XMLDeptDAO();
		}
		return dao;
	}

}
