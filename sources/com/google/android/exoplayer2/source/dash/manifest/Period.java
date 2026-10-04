package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Period {
    public final List<AdaptationSet> adaptationSets;
    public final List<EventStream> eventStreams;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    public final String f150747id;
    public final long startMs;

    public Period(@Nullable String str, long j10, List<AdaptationSet> list) {
        this(str, j10, list, Collections.EMPTY_LIST);
    }

    public int getAdaptationSetIndex(int i10) {
        int size = this.adaptationSets.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.adaptationSets.get(i11).type == i10) {
                return i11;
            }
        }
        return -1;
    }

    public Period(@Nullable String str, long j10, List<AdaptationSet> list, List<EventStream> list2) {
        this.f150747id = str;
        this.startMs = j10;
        this.adaptationSets = Collections.unmodifiableList(list);
        this.eventStreams = Collections.unmodifiableList(list2);
    }
}
