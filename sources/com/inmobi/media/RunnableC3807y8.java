package com.inmobi.media;

import android.content.Context;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: com.inmobi.media.y8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC3807y8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f153562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f153563b;

    public RunnableC3807y8(Context context, ImageView imageView) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(imageView, "imageView");
        this.f153562a = new WeakReference(context);
        this.f153563b = new WeakReference(imageView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = (Context) this.f153562a.get();
        ImageView imageView = (ImageView) this.f153563b.get();
        if (context == null || imageView == null) {
            return;
        }
        HashMap map = N8.f152320c;
        C3793x8.a(context, imageView);
    }
}
