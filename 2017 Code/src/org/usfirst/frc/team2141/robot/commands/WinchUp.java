package org.usfirst.frc.team2141.robot.commands;

import org.usfirst.frc.team2141.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class WinchUp extends Command {

	public WinchUp() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.winch);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.winch.putBrakeOff();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.winch.setWinchSpeed(1.0);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.winch.getCurrent() > 60;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.winch.setWinchSpeed(0.0);
		Robot.winch.putBrakeOn();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		Robot.winch.setWinchSpeed(0.0);
		Robot.winch.putBrakeOn();
	}
}
