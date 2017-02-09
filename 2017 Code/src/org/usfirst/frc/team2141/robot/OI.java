package org.usfirst.frc.team2141.robot;

import org.usfirst.frc.team2141.robot.commands.DriveStraight;
import org.usfirst.frc.team2141.robot.commands.FlipChassisDirection;
import org.usfirst.frc.team2141.robot.commands.IntakeCommand;
import org.usfirst.frc.team2141.robot.commands.ManualDriving;
import org.usfirst.frc.team2141.robot.commands.ShooterControl;
import org.usfirst.frc.team2141.robot.commands.WinchCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	private Joystick driveStick;
	private JoystickButton[] buttons;

	public OI() {

		driveStick = new Joystick(RobotMap.DRIVE_STICK_NUMBER);
		buttons = new JoystickButton[13];

		for (int i = 1; i <= 11; i++) {
			buttons[i] = new JoystickButton(driveStick, i);
		}

		this.getButton(RobotMap.SHIFT_DOWN_BUTTON).whileHeld(new ManualDriving());
		this.getButton(RobotMap.SHOOTER_CONTROL_BUTTON).whileHeld(new ShooterControl());
		this.getButton(RobotMap.WINCH_CONTROL_BUTTON).whenPressed(new WinchCommand());
		this.getButton(RobotMap.INTAKE_CONTROL_BUTTON).toggleWhenPressed(new IntakeCommand());
		this.getButton(RobotMap.REVERSE_DRIVE_BUTTON).whenPressed(new FlipChassisDirection());
		this.getButton(RobotMap.FORCED_AUTONMOUS).whenPressed(new DriveStraight(10));
	}
	
	public Joystick getDriveStick() {
		return driveStick;
	}

	public boolean getButtonValue(int buttonNum) {
		return this.buttons[buttonNum].get();
	}

	public JoystickButton getButton(int buttonNum) {
		return this.buttons[buttonNum];
	}
}