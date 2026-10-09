package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Firstedition (Blocks to Java)")
public class Firstedition extends LinearOpMode {

  private DcMotor frontleftdrive;
  private DcMotor frontrightdrive;
  private DcMotor backleftdrive;
  private DcMotor backrightdrive;

  /**
   * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
   * Comment Blocks show where to place Initialization code (runs once, after touching the
   * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
   * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
   * Stopped).
   */
  @Override
  public void runOpMode() {
    float X_axis;
    float y_axis;
    float Turn__5C;

    frontleftdrive = hardwareMap.get(DcMotor.class, "frontleftdrive");
    frontrightdrive = hardwareMap.get(DcMotor.class, "frontrightdrive");
    backleftdrive = hardwareMap.get(DcMotor.class, "backleftdrive");
    backrightdrive = hardwareMap.get(DcMotor.class, "backrightdrive");

    // Put initialization blocks here.
    frontleftdrive.setDirection(DcMotor.Direction.FORWARD);
    frontrightdrive.setDirection(DcMotor.Direction.FORWARD);
    backleftdrive.setDirection(DcMotor.Direction.REVERSE);
    backrightdrive.setDirection(DcMotor.Direction.FORWARD);
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // Put loop blocks here.
        telemetry.update();
        X_axis = gamepad1.left_stick_x;
        y_axis = gamepad1.left_stick_y;
        Turn__5C = gamepad1.right_stick_x;
        backleftdrive.setPower((y_axis + X_axis) * 0.75 - Turn__5C);
        backrightdrive.setPower((y_axis + X_axis) * 0.75 + Turn__5C);
        frontleftdrive.setPower((y_axis - X_axis) * 0.75 - Turn__5C);
        frontrightdrive.setPower((y_axis - X_axis) * 0.75 + Turn__5C);
      }
    }
  }
}
