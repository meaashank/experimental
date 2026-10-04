package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;

/* JADX INFO: loaded from: classes5.dex */
public final class B1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiBanner f151762a;

    /* JADX WARN: Illegal instructions before constructor call */
    public B1(InMobiBanner mInmobiBanner) {
        kotlin.jvm.internal.G.p(mInmobiBanner, "mInmobiBanner");
        Looper mainLooper = Looper.getMainLooper();
        kotlin.jvm.internal.G.o(mainLooper, "getMainLooper(...)");
        super(mainLooper);
        this.f151762a = mInmobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.G.p(msg, "msg");
        if (msg.what == 1) {
            this.f151762a.refreshBanner$media_release();
        }
    }
}
