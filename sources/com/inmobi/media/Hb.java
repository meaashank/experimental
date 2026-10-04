package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Hb extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hb f152034a = new Hb();

    public Hb() {
        super(0);
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
