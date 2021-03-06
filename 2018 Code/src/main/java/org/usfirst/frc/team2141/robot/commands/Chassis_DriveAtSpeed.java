package org.usfirst.frc.team2141.robot.commands;

import org.usfirst.frc.team2141.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Chassis_DriveAtSpeed extends Command {

    public Chassis_DriveAtSpeed() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.chassis.setLeftMotorSpeed(.25, true);
    	Robot.chassis.setRightMotorSpeed(-.25, true);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.setLeftMotorSpeed(0, true);
    	Robot.chassis.setRightMotorSpeed(0, true);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.chassis.setLeftMotorSpeed(0, true);
    	Robot.chassis.setRightMotorSpeed(0, true);
    }
}
