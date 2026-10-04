package com.inmobi.media;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f152343a;

    static {
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        kotlin.jvm.internal.G.o(setNewSetFromMap, "newSetFromMap(...)");
        f152343a = setNewSetFromMap;
    }

    public static void a(Ma ma2, long j10) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        int iOrdinal = ma2.f152250f.ordinal();
        if (iOrdinal == 0) {
            scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) T3.f152450c.getValue();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) T3.f152449b.getValue();
        }
        scheduledThreadPoolExecutor.schedule(new Pa(ma2, Na.f152327a), j10, TimeUnit.MILLISECONDS);
    }
}
