package com.muedsa.taffy;

import kcp.highway.ChannelConfig;

public class KcpChannelConfig {

    public static ChannelConfig newConfig(int conv) {
        ChannelConfig channelConfig = new ChannelConfig();
        channelConfig.nodelay(true, 20, 2, true);
        channelConfig.setMtu(1400);
        channelConfig.setSndwnd(256);
        channelConfig.setRcvwnd(256);
        channelConfig.setTimeoutMillis(30 * 1000);//30s
        channelConfig.setUseConvChannel(true);
        channelConfig.setAckNoDelay(false);
        return channelConfig;
    }
}
