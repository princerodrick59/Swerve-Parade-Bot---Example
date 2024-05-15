// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SirenConstants;

public class SirenSubsystem extends SubsystemBase {

  private WPI_TalonSRX sirenMotor;//TODO:Change based on motor

  /** Creates a new Siren. */
  public SirenSubsystem() {
    sirenMotor = new WPI_TalonSRX(SirenConstants.sirenMotorID);//TODO:CAN ID will change
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void sirenOn() {
    sirenMotor.configOpenloopRamp(SirenConstants.sirenRampRate);
    sirenMotor.setVoltage(SirenConstants.sirenOnVoltage);
  }

  public void sirenOff() {
    sirenMotor.configOpenloopRamp(SirenConstants.sirenRampRate);
    sirenMotor.setVoltage(SirenConstants.sirenOffVoltage);
  }
}
