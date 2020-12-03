package pattern.frontcontroller;

public class StudentVO {

	private int id;
	private String name;

	public StudentVO(int id, String studentName) {
		this.id = id;
		this.name = studentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
