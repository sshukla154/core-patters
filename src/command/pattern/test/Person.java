package command.pattern.test;

import command.pattern.OffCommand;
import command.pattern.OnCommand;
import command.pattern.RemoteControl;
import command.pattern.Television;

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
