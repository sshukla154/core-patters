package core.command;

/*Command Implementation*/
public class OnCommand implements Command {

	Television television;

	public OnCommand() {
		super();
	}

	public OnCommand(Television television) {
		this.television = television;
	}

	@Override
	public void execute() {
		television.on();
	}

}
