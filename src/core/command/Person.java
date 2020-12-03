package core.command;

/*Client*/
public class Person {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(new OnCommand(new Television()));
		remoteControl.pressButton();
		
		remoteControl.setCommand(new OffCommand(new Television()));
		remoteControl.pressButton();

	}

}
