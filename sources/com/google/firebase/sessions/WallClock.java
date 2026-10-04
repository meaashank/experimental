package com.google.firebase.sessions;

import android.os.SystemClock;
import kotlin.time.C5041h;
import kotlin.time.DurationUnit;
import kotlin.time.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WallClock implements TimeProvider {

    @NotNull
    public static final WallClock INSTANCE = new WallClock();
    private static final long US_PER_MILLIS = 1000;

    private WallClock() {
    }

    @Override // com.google.firebase.sessions.TimeProvider
    public long currentTimeUs() {
        return System.currentTimeMillis() * 1000;
    }

    @Override // com.google.firebase.sessions.TimeProvider
    /* JADX INFO: renamed from: elapsedRealtime-UwyO8pc */
    public long mo13elapsedRealtimeUwyO8pc() {
        C5041h.a aVar = C5041h.f218418b;
        return j.P(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
    }
}
