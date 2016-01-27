/*
 * References.java
 * 
 * v1.0 (Dec 21, 2015)
 * 
 * Authors: Sean Bowers
 * 
 * A class to store variables and constants that will be used throughout the program.
 */
package org.usfirst.frc.team4068.robot.lib;

import org.usfirst.frc.team4068.robot.lib.Log.Level;
import org.usfirst.frc.team4068.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.Talon;

@SuppressWarnings("rawtypes")
public class References {
	
    public static final XboxController DRIVER = new XboxController(USB.DRIVER);
    
    public static final XboxController CODRIVER = new XboxController(USB.CODRIVER);
	
	public static Class CLASS_AUTONOMOUS;
	public static Class CLASS_TELEOP;
	public static Class CLASS_TEST;
	public static final String CLASSNAME_TELEOP;
	public static final String CLASSNAME_AUTONOMOUS;
	public static final String CLASSNAME_TEST;
	public static final String LOG_FILE = "/home/lvuser/log.txt";
	public static final Level LOGLEVEL_CONSOLE = Level.ALL;
	public static final Level LOGLEVEL_FILE = Level.INFO;
	
	
    public static final DriveTrain DRIVE = new DriveTrain(MOTOR.DRIVE_FL, 
            MOTOR.DRIVE_FR, 
            MOTOR.DRIVE_BL, 
            MOTOR.DRIVE_BR);
	
    public static class USB {
        public static final int DRIVER = 0;
        public static final int CODRIVER = 1;
    }
    
	static{
		//Creates constants with the classes and class names for teleop, autonomous, and test
		CLASSNAME_TELEOP = "org.usfirst.frc.team4068.robot.teamCode.Teleop";
		CLASSNAME_AUTONOMOUS = "org.usfirst.frc.team4068.robot.teamCode.Autonomous";
		CLASSNAME_TEST = "org.usfirst.frc.team4068.robot.teamCode.Test";
		try {
			CLASS_TELEOP = Class.forName(CLASSNAME_TELEOP);
			CLASS_AUTONOMOUS = Class.forName(CLASSNAME_AUTONOMOUS);
			CLASS_TEST = Class.forName(CLASSNAME_TEST);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
	
		}
		
	
	}
	
	public static class MOTOR{
		
        public static final Talon DRIVE_FL = new Talon(PWM.DRIVE_FL);
        public static final Talon DRIVE_FR = new Talon(PWM.DRIVE_FR);
        public static final Talon DRIVE_BL = new Talon(PWM.DRIVE_BL);
        public static final Talon DRIVE_BR = new Talon(PWM.DRIVE_BR );
		
	}
	
	public static class PWM{

		public static int DRIVE_BR = 0;
		public static int DRIVE_BL = 1;
		public static int DRIVE_FR = 2;
		public static int DRIVE_FL= 3;
		
		
	}
}
