package com.dls.behavioral.iterator.collection;

import com.dls.behavioral.iterator.channel.Channel;
import com.dls.behavioral.iterator.channel.ChannelTypeEnum;
import com.dls.behavioral.iterator.iterator.ChannelIterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollection {

    private List<Channel> channelsList;

    public ChannelCollection() {
        channelsList = new ArrayList<>();
    }

    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIterator(type, this.channelsList);
    }

}