/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LANDING_TARGET PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* The location of a landing area captured from a downward facing camera
*/
public class msg_landing_target extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_LANDING_TARGET = 149;
    public static final int MAVLINK_MSG_LENGTH = 30;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LANDING_TARGET;


      
    /**
    * Timestamp (micros since boot or Unix epoch)
    */
    public long time_usec;
      
    /**
    * X-axis angular offset (in radians) of the target from the center of the image
    */
    public float angle_x;
      
    /**
    * Y-axis angular offset (in radians) of the target from the center of the image
    */
    public float angle_y;
      
    /**
    * Distance to the target from the vehicle in meters
    */
    public float distance;
      
    /**
    * Size in radians of target along x-axis
    */
    public float size_x;
      
    /**
    * Size in radians of target along y-axis
    */
    public float size_y;
      
    /**
    * The ID of the target if multiple targets are present
    */
    public short target_num;
      
    /**
    * MAV_FRAME enum specifying the whether the following feilds are earth-frame, body-frame, etc.
    */
    public short frame;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_LANDING_TARGET;
              
        packet.payload.putUnsignedLong(time_usec);
              
        packet.payload.putFloat(angle_x);
              
        packet.payload.putFloat(angle_y);
              
        packet.payload.putFloat(distance);
              
        packet.payload.putFloat(size_x);
              
        packet.payload.putFloat(size_y);
              
        packet.payload.putUnsignedByte(target_num);
              
        packet.payload.putUnsignedByte(frame);
        
        return packet;
    }

    /**
    * Decode a landing_target message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.time_usec = payload.getUnsignedLong();
              
        this.angle_x = payload.getFloat();
              
        this.angle_y = payload.getFloat();
              
        this.distance = payload.getFloat();
              
        this.size_x = payload.getFloat();
              
        this.size_y = payload.getFloat();
              
        this.target_num = payload.getUnsignedByte();
              
        this.frame = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_landing_target(){
        msgid = MAVLINK_MSG_ID_LANDING_TARGET;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_landing_target(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_LANDING_TARGET;
        unpack(mavLinkPacket.payload);        
    }

                    
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_LANDING_TARGET -"+" time_usec:"+time_usec+" angle_x:"+angle_x+" angle_y:"+angle_y+" distance:"+distance+" size_x:"+size_x+" size_y:"+size_y+" target_num:"+target_num+" frame:"+frame+"";
    }
}
        