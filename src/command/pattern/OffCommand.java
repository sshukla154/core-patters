package command.pattern;

/*Command Implementation*/
public class OffCommand implements Command {

	Television television;

	public OffCommand() {
		super();
	}

	public OffCommand(Television television) {
		this.television = television;
	}

	@Override
	public void execute() {
		television.off();
	}

}
