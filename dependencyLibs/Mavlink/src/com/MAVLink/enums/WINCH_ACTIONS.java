/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/** 
 * Winch actions.
 */
public class WINCH_ACTIONS {
   public static final int WINCH_RELAXED = 0; /* Allow motor to freewheel. | */
   public static final int WINCH_RELATIVE_LENGTH_CONTROL = 1; /* Wind or unwind specified length of line, optionally using specified rate. | */
   public static final int WINCH_RATE_CONTROL = 2; /* Wind or unwind line at specified rate. | */
   public static final int WINCH_LOCK = 3; /* Perform the locking sequence to relieve motor while in the fully retracted position. Only action and instance command parameters are used, others are ignored. | */
   public static final int WINCH_DELIVER = 4; /* Sequence of drop, slow down, touch down, reel up, lock. Only action and instance command parameters are used, others are ignored. | */
   public static final int WINCH_HOLD = 5; /* Engage motor and hold current position. Only action and instance command parameters are used, others are ignored. | */
   public static final int WINCH_RETRACT = 6; /* Return the reel to the fully retracted position. Only action and instance command parameters are used, others are ignored. | */
   public static final int WINCH_LOAD_LINE = 7; /* Load the reel with line. The winch will calculate the total loaded length and stop when the tension exceeds a threshold. Only action and instance command parameters are used, others are ignored. | */
   public static final int WINCH_ABANDON_LINE = 8; /* Spool out the entire length of the line. Only action and instance command parameters are used, others are ignored. | */
   public static final int WINCH_ACTIONS_ENUM_END = 9; /*  | */
}
            