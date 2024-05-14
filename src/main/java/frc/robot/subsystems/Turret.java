// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Turret extends SubsystemBase {

  private TalonFX turretMotor;

  /** Creates a new Turret. */
  public Turret() {
    turretMotor = new TalonFX(9);//TODO:change to constants
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  
  public void turretLeft() {
    turretMotor.set(0.25);//TODO:change to constants
  }

  public void turretRight() {
    turretMotor.set(-0.25);//TODO:change to constants make it negative in subsystem not constants
  }

  public void turretStop() {
    turretMotor.set(0);//TODO:change to constants
  }

  public void turretSpeed(double speed) {
    turretMotor.set(speed);
  }
}
