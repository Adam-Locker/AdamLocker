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
	
	Button Joystick1_Button1 = new JoystickButton(joy1,1);
	Button Joystick1_Button2 = new JoystickButton(joy1,2);
	Button Joystick1_Button3 = new JoystickButton(joy1,3);
	Button Joystick1_Button4 = new JoystickButton(joy1,4);
	Button Joystick1_Button5 = new JoystickButton(joy1,5);
	Button Joystick1_Button6 = new JoystickButton(joy1,6);
	Button Joystick1_Button7 = new JoystickButton(joy1,7);
	
	public OI(){
		
		Joystick1_Button1.whenActive(new compressorStart());
		Joystick1_Button2.whenActive(new compressorStop());
		Joystick1_Button3.whenPressed(new leftArmOpen());
		Joystick1_Button4.whenPressed(new leftArmClose());
		Joystick1_Button5.whenPressed(new rightArmOpen());
		Joystick1_Button6.whenPressed(new rightArmClose());
		Joystick1_Button7.whenPressed(new bothArmsNeutral());
	}
	
}
 