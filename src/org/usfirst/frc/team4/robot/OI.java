package org.usfirst.frc.team4.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4.robot.commands.compressorStart;
import org.usfirst.frc.team4.robot.commands.compressorStop;
import org.usfirst.frc.team4.robot.commands.leftArmOpen;
import org.usfirst.frc.team4.robot.commands.leftArmClose;
import org.usfirst.frc.team4.robot.commands.rightArmOpen;
import org.usfirst.frc.team4.robot.commands.rightArmClose;
import org.usfirst.frc.team4.robot.commands.bothArmsNeutral;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	Joystick joy1 = new Joystick(1);
	
	Button button1 = new JoystickButton(joy1,1);
	Button button2 = new JoystickButton(joy1,2);
	Button button3 = new JoystickButton(joy1,3);
	Button button4 = new JoystickButton(joy1,4);
	Button button5 = new JoystickButton(joy1,5);
	Button button6 = new JoystickButton(joy1,6);
	Button button7 = new JoystickButton(joy1,7);
	
	public OI(){
		
		button1.whenActive(new compressorStart());
		button2.whenActive(new compressorStop());
		button3.whenPressed(new leftArmOpen());
		button4.whenPressed(new leftArmClose());
		button5.whenPressed(new rightArmOpen());
		button6.whenPressed(new rightArmClose());
		button7.whenPressed(new bothArmsNeutral());
	}
	
}
 