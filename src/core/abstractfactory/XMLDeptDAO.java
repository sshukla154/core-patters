package core.abstractfactory;

public class XMLDeptDAO implements DAO {

	@Override
	public void save() {
		System.out.println("XMLDeptDAO.save()...");
	}

}
