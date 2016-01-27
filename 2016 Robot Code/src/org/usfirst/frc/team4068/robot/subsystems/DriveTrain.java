package org.usfirst.frc.team4068.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;

public class DriveTrain extends RobotDrive {

	    private Talon FL;
	    private Talon FR;
	    private Talon BL;
	    private Talon BR;
	    
	    
	    Timer time = new Timer();
	    
	    public DriveTrain(Talon fl, Talon fr, Talon bl,Talon br){
	    	super(fl, fr, bl, br);
	    	
	        FL = fl;
	        FR = fr;
	        BL = bl;
	        BR = br;
	        time.start();
	    }
	    
	    public void drive(double left, double right){
	    		this.tankDrive(left, right);
	    	
	    }
	    
	    

	    }
	


