package com.inmobi.media;

import ed.InterfaceC4376a;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class O3 extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O3 f152334a = new O3();

    public O3() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        kotlin.G g10 = P3.f152370a;
        return Executors.newSingleThreadScheduledExecutor(new V4("P3"));
    }
}
