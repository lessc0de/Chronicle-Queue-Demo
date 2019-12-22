package town.lost.processor.events;

import net.openhft.chronicle.wire.BytesInBinaryMarshallable;
import net.openhft.chronicle.wire.LongConversion;
import net.openhft.chronicle.wire.MicroTimestampLongConverter;

public class AbstractEvent<E extends AbstractEvent<E>> extends BytesInBinaryMarshallable {
    private String eventSource;

    @LongConversion(MicroTimestampLongConverter.class)
    private long eventTimeStamp;

    public String eventSource() {
        return eventSource;
    }

    public E eventSource(String eventSource) {
        this.eventSource = eventSource;
        return (E) this;
    }

    public long eventTimeStamp() {
        return eventTimeStamp;
    }

    public E eventTimeStamp(long eventTimeStamp) {
        this.eventTimeStamp = eventTimeStamp;
        return (E) this;
    }
}
