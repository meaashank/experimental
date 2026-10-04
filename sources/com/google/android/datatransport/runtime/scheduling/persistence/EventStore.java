package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import e.g0;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
@g0
public interface EventStore extends Closeable {
    int cleanUp();

    long getNextCallTime(TransportContext transportContext);

    boolean hasPendingEventsFor(TransportContext transportContext);

    Iterable<TransportContext> loadActiveContexts();

    Iterable<PersistedEvent> loadBatch(TransportContext transportContext);

    @Nullable
    PersistedEvent persist(TransportContext transportContext, EventInternal eventInternal);

    void recordFailure(Iterable<PersistedEvent> iterable);

    void recordNextCallTime(TransportContext transportContext, long j10);

    void recordSuccess(Iterable<PersistedEvent> iterable);
}
