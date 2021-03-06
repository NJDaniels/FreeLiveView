package com.elfangor1989.FreeLiveView.receiver;

/**
 * Broadcast constants 
 * @author Renze Nicolai
 */

public final class LiveViewBrConstants
{
  //Received by OLV receiver
  public static final String ALERT_ADD = "com.elfangor1989.FreeLiveView.alert.add";
	
  //Received by OLV service
  public static final String ALERT_NOTIFY = "com.elfangor1989.FreeLiveView.alert.notify";
  public static final String PLUGIN_COMMAND = "com.elfangor1989.FreeLiveView.plugin.command";
  
  //Transmitted to other applications
  public static final String PLUGIN_RESULT = "com.elfangor1989.FreeLiveView.plugin.result";
  
  //Other constants
  public static final String OTHER_SMS_RECEIVED = "android.provider.Telephony.SMS_RECEIVED";
}
