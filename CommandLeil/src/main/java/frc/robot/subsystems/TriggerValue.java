/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.commands.ManipulationCommand;

/**
 * Add your docs here.
 */
public class TriggerValue extends Subsystem {
 double triggervalue;
 double lefttrigger;
 double righttrigger;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
 public double Trigger(){
   righttrigger = Robot.m_oi.controller.getRawAxis(3);
   lefttrigger = Robot.m_oi.controller.getRawAxis(2) * -1;
   triggervalue = righttrigger + lefttrigger;
   return triggervalue;

 }
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ManipulationCommand());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
