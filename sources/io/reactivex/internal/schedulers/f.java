package io.reactivex.internal.schedulers;

import hc.H;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f207082c = "RxNewThreadScheduler";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f207085b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f207084e = "rx2.newthread-priority";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final RxThreadFactory f207083d = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger(f207084e, 5).intValue())), false);

    public f() {
        this(f207083d);
    }

    @Override // hc.H
    @lc.e
    public H.c c() {
        return new g(this.f207085b);
    }

    public f(ThreadFactory threadFactory) {
        this.f207085b = threadFactory;
    }
}
