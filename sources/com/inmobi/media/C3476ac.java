package com.inmobi.media;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.inmobi.media.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3476ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ob f152707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3545fb f152708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3490bc f152709c;

    public C3476ac(Ob telemetryConfigMetaData, List samplingEvents) {
        kotlin.jvm.internal.G.p(telemetryConfigMetaData, "telemetryConfigMetaData");
        kotlin.jvm.internal.G.p(samplingEvents, "samplingEvents");
        this.f152707a = telemetryConfigMetaData;
        double dRandom = Math.random();
        this.f152708b = new C3545fb(telemetryConfigMetaData, dRandom, samplingEvents);
        this.f152709c = new C3490bc(telemetryConfigMetaData, dRandom);
    }

    public final int a(Qb telemetryEventType, String eventType) {
        kotlin.jvm.internal.G.p(telemetryEventType, "telemetryEventType");
        kotlin.jvm.internal.G.p(eventType, "eventType");
        int iOrdinal = telemetryEventType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            C3490bc c3490bc = this.f152709c;
            c3490bc.getClass();
            if (c3490bc.f152733b >= c3490bc.f152732a.f152350g) {
                return 0;
            }
            Lb lb2 = Lb.f152196a;
            return 2;
        }
        C3545fb c3545fb = this.f152708b;
        c3545fb.getClass();
        if (!c3545fb.f152933c.contains(eventType)) {
            return 1;
        }
        if (c3545fb.f152932b >= c3545fb.f152931a.f152350g) {
            return 0;
        }
        Lb lb3 = Lb.f152196a;
        return 2;
    }
}
