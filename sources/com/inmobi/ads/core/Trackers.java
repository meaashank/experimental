package com.inmobi.ads.core;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class Trackers {

    @NotNull
    private final List<String> imExts;

    @NotNull
    private final String type = "";

    @NotNull
    private final List<String> url;

    public Trackers() {
        EmptyList emptyList = EmptyList.f217510a;
        this.imExts = emptyList;
        this.url = emptyList;
    }

    @NotNull
    public final List<String> getImExts() {
        return this.imExts;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final List<String> getUrl() {
        return this.url;
    }
}
