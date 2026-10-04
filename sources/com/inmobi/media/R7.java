package com.inmobi.media;

import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class R7 extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private WeakReference<InMobiNative> f152411a;

    public R7(InMobiNative inMobiNative) {
        kotlin.jvm.internal.G.p(inMobiNative, "inMobiNative");
        this.f152411a = new WeakReference<>(inMobiNative);
    }

    @NotNull
    public final WeakReference<InMobiNative> getNativeRef() {
        return this.f152411a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(@NotNull String log) {
        AbstractC3513d7 mPubListener;
        kotlin.jvm.internal.G.p(log, "log");
        InMobiNative inMobiNative = this.f152411a.get();
        if (inMobiNative == null || (mPubListener = inMobiNative.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiNative, log);
    }

    public final void setNativeRef(@NotNull WeakReference<InMobiNative> weakReference) {
        kotlin.jvm.internal.G.p(weakReference, "<set-?>");
        this.f152411a = weakReference;
    }
}
