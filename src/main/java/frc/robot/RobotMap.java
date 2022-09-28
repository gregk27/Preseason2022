package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

// Imports for optional hardware
// import edu.wpi.first.wpilibj.AnalogInput;
// import edu.wpi.first.wpilibj.DigitalInput;
// import edu.wpi.first.wpilibj.Encoder;

/**
 * Mapping and creation of hardware on the robot
 */
public class RobotMap {
    
    /**
     * Inner class to hold CAN ID constants.
     */
    private static class CAN {
        /** CAN ID of left talon 1. */
        private static final int LEFT_TALON_1 = 2;
        /** CAN ID of left talon 2. */
        private static final int LEFT_TALON_2 = 3;
        
        /** CAN ID of right talon 1. */
        private static final int RIGHT_TALON_1 = 4;
        /** CAN ID of right talon 2. */
        private static final int RIGHT_TALON_2 = 5;

        /** CAN ID of top talon 1. */
        private static final int TOP_TALON_1 = 6;
        /** CAN ID of top talon 2. */
        private static final int TOP_TALON_2 = 7;
        /** CAN ID of top talon 3. */
        private static final int TOP_TALON_3 = 8;
    }

    /**
     * Inner class to hold RoboRIO I/O connection constants
     */
    private static class RIO {
        /** Pin of DIO connection 1 */
        private static final int DIO_1 = 0;
        /** Pin of DIO connection 2 */
        private static final int DIO_2 = 1;

        /** Pin of Analog Input connection 1 */
        private static final int ANALOG_1 = 0;
    }

    // We use the WPILib wrappers to get simulation support

    /** Lead drive Talon on left side */
    public static final WPI_TalonSRX leftLeadTalon = new WPI_TalonSRX(CAN.LEFT_TALON_1);
    /** Lead drive Talon on left side */
    public static final WPI_TalonSRX leftFollowTalon = new WPI_TalonSRX(CAN.LEFT_TALON_2);

    /** Lead drive Talon on right side */
    public static final WPI_TalonSRX rightLeadTalon = new WPI_TalonSRX(CAN.RIGHT_TALON_1);
    /** Lead drive Talon on right side */
    public static final WPI_TalonSRX rightFollowTalon = new WPI_TalonSRX(CAN.RIGHT_TALON_2);

    /** Top Talon 1 */
    public static final WPI_TalonSRX topTalon1 = new WPI_TalonSRX(CAN.TOP_TALON_1);
    /** Top Talon 2 */
    public static final WPI_TalonSRX topTalon2 = new WPI_TalonSRX(CAN.TOP_TALON_2);
    /** Top Talon 3 */
    public static final WPI_TalonSRX topTalon3 = new WPI_TalonSRX(CAN.TOP_TALON_3);

    // TODO: Uncomment the initializations below depending on what sensors your team wants

    // Option 1: Limit Switch(es)
    /** Optional limit switch 1*/
    // public static final DigitalInput limitSwitch1 = new DigitalInput(RIO.DIO_1);
    /** Optional limit switch 2*/
    // public static final DigitalInput limitSwitch2 = new DigitalInput(RIO.DIO_2);
    
    // Option 2: Encoder
    /** Optional Quad encoder */
    // public static final Encoder encoder = new Encoder(RIO.DIO_1, RIO.DIO_2);

    /** Optional Potentiometer */
    // public static final AnalogInput potentiometer = new AnalogInput(RIO.ANALOG_1);


    // Static initializer will be run on first reference to RobotMap
    static {
        // Configure follower settings
        leftFollowTalon.follow(leftLeadTalon);
        rightFollowTalon.follow(rightLeadTalon);

        // It's a bit ambiguous what config belongs here vs elsewhere, but a good rule of thumb is that anything that 
        // isn't implicitly part of a motor's name (so PID constants, ramp settings, etc) belong in subsystems
    }
}
