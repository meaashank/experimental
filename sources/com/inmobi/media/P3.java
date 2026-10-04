package com.inmobi.media;

import com.inmobi.media.P3;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public abstract class P3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlin.G f152370a = kotlin.I.a(O3.f152334a);

    public static final void a(W8 request, N3 listener, M3 eventPayload, int i10, String str, int i11, long j10, C3686pc c3686pc, boolean z10) {
        kotlin.jvm.internal.G.p(request, "$request");
        kotlin.jvm.internal.G.p(listener, "$listener");
        kotlin.jvm.internal.G.p(eventPayload, "$eventPayload");
        X8 x8B = request.b();
        if (x8B.b()) {
            boolean z11 = C3473a9.f152704a;
            T8 t82 = x8B.f152598c;
            J3 j32 = t82 != null ? t82.f152457a : null;
            if (z11 && (j32 == J3.f152111q || j32 == J3.f152110p || j32 == J3.f152109o || j32 == J3.f152108n || j32 == J3.f152112r)) {
                listener.a(eventPayload, false);
                return;
            } else if (i10 <= 1) {
                listener.a(eventPayload, true);
                return;
            } else {
                x8B.a();
                a(eventPayload, str, i11, i10 - 1, j10, c3686pc, listener, z10);
                return;
            }
        }
        String TAG = listener.f152281d;
        kotlin.jvm.internal.G.o(TAG, "TAG");
        listener.f152278a.a(eventPayload.f152219a);
        listener.f152278a.a(System.currentTimeMillis());
        if (listener.f152280c != null) {
            List eventIds = eventPayload.f152219a;
            kotlin.jvm.internal.G.p(eventIds, "eventIds");
            Integer num = Rb.f152416c;
            if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                Rb.f152415b = 0;
                K5 k52 = Rb.f152414a;
                if (k52 != null) {
                    k52.a("count", 0);
                }
                Rb.f152416c = null;
            }
        }
        listener.f152282e.set(false);
    }

    public static void a(final M3 m32, final String str, final int i10, final int i11, final long j10, final C3686pc c3686pc, final N3 n32, final boolean z10) {
        long j11;
        boolean z11 = C3473a9.f152704a;
        if (C3473a9.a(false) == null && C3657nb.m()) {
            final W8 w82 = new W8("POST", str, c3686pc, false, (N4) null, (String) null, 104);
            HashMap mapM = kotlin.collections.n0.M(new Pair("payload", m32.f152220b));
            HashMap map = w82.f152562k;
            if (map != null) {
                map.putAll(mapM);
            }
            int i12 = i10 - i11;
            if (i12 > 0) {
                w82.f152560i.putAll(kotlin.collections.n0.M(new Pair("X-im-retry-count", String.valueOf(i12))));
            }
            w82.f152575x = false;
            w82.f152571t = false;
            w82.f152572u = false;
            if (z10) {
                long jPow = i11 != i10 ? ((long) Math.pow(2.0d, i12)) * j10 : 0L;
                j11 = jPow;
                Object value = f152370a.getValue();
                kotlin.jvm.internal.G.o(value, "getValue(...)");
                ((ScheduledExecutorService) value).schedule(new Runnable() { // from class: F5.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        P3.a(w82, n32, m32, i11, str, i10, j10, c3686pc, z10);
                    }
                }, j11, TimeUnit.SECONDS);
                return;
            }
            if (i11 != i10) {
                j11 = j10;
                Object value2 = f152370a.getValue();
                kotlin.jvm.internal.G.o(value2, "getValue(...)");
                ((ScheduledExecutorService) value2).schedule(new Runnable() { // from class: F5.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        P3.a(w82, n32, m32, i11, str, i10, j10, c3686pc, z10);
                    }
                }, j11, TimeUnit.SECONDS);
                return;
            }
            j11 = jPow;
            Object value22 = f152370a.getValue();
            kotlin.jvm.internal.G.o(value22, "getValue(...)");
            ((ScheduledExecutorService) value22).schedule(new Runnable() { // from class: F5.t0
                @Override // java.lang.Runnable
                public final void run() {
                    P3.a(w82, n32, m32, i11, str, i10, j10, c3686pc, z10);
                }
            }, j11, TimeUnit.SECONDS);
            return;
        }
        n32.a(m32, false);
    }
}
