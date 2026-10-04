package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3532ec;
import java.util.HashMap;

/* JADX INFO: renamed from: com.inmobi.media.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3532ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3504cc f152889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f152890b;

    public C3532ec(InterfaceC3504cc timeOutInformer) {
        kotlin.jvm.internal.G.p(timeOutInformer, "timeOutInformer");
        this.f152889a = timeOutInformer;
        this.f152890b = new HashMap();
    }

    public final void a(final byte b10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: F5.e1
            @Override // java.lang.Runnable
            public final void run() {
                C3532ec.a(this.f34470a, b10);
            }
        });
    }

    public static final void a(C3532ec this$0, byte b10) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f152889a.a(b10);
    }
}
