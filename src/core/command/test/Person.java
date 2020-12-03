package core.command.test;

import core.command.OffCommand;
import core.command.OnCommand;
import core.command.RemoteControl;
import core.command.Television;

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
