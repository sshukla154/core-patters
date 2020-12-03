package abstractfactory.pattern;

public class XMLEmpDAO implements DAO {

	@Override
	public void save() {
		System.out.println("XMLEmpDAO.save()...");
	}

}
