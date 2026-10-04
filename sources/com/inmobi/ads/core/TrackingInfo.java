package com.inmobi.ads.core;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class TrackingInfo {

    @NotNull
    private final String imBaseUrl = "";

    @NotNull
    private final List<Trackers> trackers = EmptyList.f217510a;

    @NotNull
    public final String getImBaseUrl() {
        return this.imBaseUrl;
    }

    @NotNull
    public final List<Trackers> getTrackers() {
        return this.trackers;
    }
}
