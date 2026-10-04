package com.inmobi.media;

import ed.InterfaceC4376a;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class S3 extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S3 f152432a = new S3();

    public S3() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        return new ScheduledThreadPoolExecutor(T3.f152448a, new V4("ExecutorProvider.normal"));
    }
}
