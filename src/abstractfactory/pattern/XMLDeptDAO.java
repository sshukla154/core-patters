package abstractfactory.pattern;

public class XMLDeptDAO implements DAO {

	@Override
	public void save() {
		System.out.println("XMLDeptDAO.save()...");
	}

}
