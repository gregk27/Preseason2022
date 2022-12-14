// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TestMotorCommand extends CommandBase {

  // BAD PRACTICE!!! There should be a subsystem in the middle but I'm lazy for a systems check
  TalonSRX motor;

  /** Creates a new TestMotorCommand. */
  public TestMotorCommand(TalonSRX motor) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.motor = motor;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    motor.set(ControlMode.PercentOutput, 1);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    motor.set(ControlMode.PercentOutput, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
