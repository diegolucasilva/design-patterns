package com.dls.behavioral.iterator.iterator;

import com.dls.behavioral.iterator.channel.Channel;
import com.dls.behavioral.iterator.channel.ChannelTypeEnum;

import java.util.List;

public class ChannelIterator {

    private ChannelTypeEnum type;
    private List<Channel> channels;
    private int position;

    public ChannelIterator(ChannelTypeEnum ty,
                               List<Channel> channelsList) {
        this.type = ty;
        this.channels = channelsList;
    }

    public boolean hasNext() {
        while (position < channels.size()) {
            Channel c = channels.get(position);
            if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                return true;
            } else
                position++;
        }
        return false;
    }

    public Channel next() {
        Channel c = channels.get(position);
        position++;
        return c;
    }
}