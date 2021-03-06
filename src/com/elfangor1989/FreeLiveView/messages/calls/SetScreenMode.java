package com.elfangor1989.FreeLiveView.messages.calls;
//Added by RN+
//Sets brightness of LiveView display

import com.elfangor1989.FreeLiveView.messages.LiveViewCall;
import com.elfangor1989.FreeLiveView.messages.MessageConstants;

public class SetScreenMode extends LiveViewCall {
	
	private final byte brightness;
	
    public SetScreenMode(byte brightness) {
        super(MessageConstants.MSG_SETSCREENMODE);
        this.brightness = brightness;
    }

    /*
     * (non-Javadoc)
     * @see net.sourcewalker.olv.messages.LiveViewRequest#getPayload()
     */
    @Override
    protected byte[] getPayload() {
        return new byte[] { brightness };
    }

}
