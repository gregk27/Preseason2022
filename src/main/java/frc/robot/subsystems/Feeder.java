// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Feeder extends SubsystemBase {
  /** Creates a new Feeder. */
  public Feeder() {}

  private TalonSRX feederMotor;

  /** Creates a new Shooter. */
  public Feeder(TalonSRX feederMotor) {
    this.feederMotor = feederMotor;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  /**
   * sets shooter speed in range of 0.0 to 1.0
   * @param speed
   */
  public void setFeederSpeed(double speed){
    this.feederMotor.set(ControlMode.PercentOutput, speed);
  }

  /**
   * stop shooter motor (set motor speed to 0)
   */
  public void stopFeeder(){
    this.feederMotor.set(ControlMode.PercentOutput, 0);
  }
}
