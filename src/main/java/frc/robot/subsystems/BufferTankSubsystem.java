// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.BufferTankConstants;

public class BufferTankSubsystem extends SubsystemBase {

  public static Solenoid bufferTankSolenoid;
  public double psi; 
  public AnalogInput pressureSensor;
  
  /** Creates a new bufferTankSolenoid. */
  public BufferTankSubsystem() {
    bufferTankSolenoid = new Solenoid(PneumaticsModuleType.CTREPCM, BufferTankConstants.bufferTankSolenoidChannel);
    pressureSensor = new AnalogInput(BufferTankConstants.pressureSensorChannel);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  // Opens Solenoid to fill up buffer tank 
  public void fillBufferTank() {
    bufferTankSolenoid.set(true);
  }

  // Stops Solenoid to stop filling the buffer tank 
  public void stopFillBufferTank() {
    bufferTankSolenoid.set(false);
  }

  // Gets Psi from the analog Input
  public double getPsi() {
    psi = pressureSensor.getAccumulatorValue();
    return psi;
  }



}
