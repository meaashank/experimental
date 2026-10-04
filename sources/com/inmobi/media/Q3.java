package com.inmobi.media;

import ed.InterfaceC4376a;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Q3 extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q3 f152387a = new Q3();

    public Q3() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        int i10 = T3.f152448a;
        return new ScheduledThreadPoolExecutor(5, new V4("ExecutorProvider.high"));
    }
}
