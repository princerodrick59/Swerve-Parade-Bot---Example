// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Siren extends SubsystemBase {

  private WPI_TalonSRX sirenMotor;//TODO:Change based on motor

  /** Creates a new Siren. */
  public Siren() {
    sirenMotor = new WPI_TalonSRX(6);//TODO:change to constants
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void sirenOn() {
    sirenMotor.configOpenloopRamp(3);//TODO:change to constants
    sirenMotor.setVoltage(9);//TODO:change to constants
  }

  public void sirenOff() {
    sirenMotor.configOpenloopRamp(3);
    sirenMotor.setVoltage(0);
  }
}
