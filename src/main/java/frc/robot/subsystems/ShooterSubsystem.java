// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConstants;

public class ShooterSubsystem extends SubsystemBase {
  
  private WPI_TalonSRX shooterSolenoid;

  /** Creates a new ShooterSolenoid. */
  public ShooterSubsystem() {
    shooterSolenoid = new WPI_TalonSRX(ShooterConstants.shooterSolenoidID);//TODO:CAN ID will change
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void solenoidOpen() {
    shooterSolenoid.setVoltage(ShooterConstants.shooterSolenoidOpenVoltage);
  }

  public void solenoidClose() {
    shooterSolenoid.setVoltage(ShooterConstants.shooterSolenoidClosedVoltage);
  }
}
