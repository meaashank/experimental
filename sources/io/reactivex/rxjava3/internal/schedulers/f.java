package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f211832c = "RxNewThreadScheduler";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f211835b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f211834e = "rx3.newthread-priority";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final RxThreadFactory f211833d = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger(f211834e, 5).intValue())), false);

    public f() {
        this(f211833d);
    }

    @Override // zc.W
    @yc.e
    public W.c c() {
        return new g(this.f211835b);
    }

    public f(ThreadFactory threadFactory) {
        this.f211835b = threadFactory;
    }
}
