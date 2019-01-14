/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  // PORTS
  public static final int PRIMARY_STICK_PORT = 0;
  public static final int AUXILIARY_STICK_PORT = 1;
  public static final int XBOX_CONTROLLER_PORT = 2;

  // CAN BUS
  public static final int LEFT_MASTER_SPARK = 6;
  public static final int LEFT_SLAVE_SPARK = 1;
  public static final int RIGHT_MASTER_SPARK = 2;
  public static final int RIGHT_SLAVE_SPARK = 3;
  public static final int MASTER_ELEVATOR_TALON = 4;
  public static final int SLAVE_ELEVATOR_TALON_ONE = 5;
  public static final int SLAVE_ELEVATOR_TALON_TWO = 6;

  // Chassis PID Constants
  public static final int CHASSIS_KP_INT = 0;
  public static final int CHASSIS_KD_INT = 0;
  public static final int CHASSIS_KF_INT = 1;

  // Pneumatics
  public static final int INTAKE_CHANNEL_A = 4;
  public static final int INTAKE_CHANNEL_B = 5;

  public static final int LEFT_OUTTAKE_PISTON_CHANNEL_A = 0;
  public static final int LEFT_OUTTAKE_PISTON_CHANNEL_B = 1;
  public static final int RIGHT_OUTTAKE_PISTON_CHANNEL_A = 2;
  public static final int RIGHT_OUTTAKE_PISTON_CHANNEL_B = 3;

  public static final int COMPRESSOR = 0;

  public static final int WORKING_PRESSURE_SENSOR = 0;
  public static final int STORED_PRESSURE_SENSOR = 1;

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}