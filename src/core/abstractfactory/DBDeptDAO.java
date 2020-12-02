package core.abstractfactory;

public class DBDeptDAO implements DAO {

	@Override
	public void save() {
		System.out.println("DBDeptDAO.save()...");
	}

}
