package abstractfactory.pattern;

public class DBEmpDAO implements DAO {

	@Override
	public void save() {
		System.out.println("DBEmpDAO.save()...");
	}

}
