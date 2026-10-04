package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcia implements Runnable {
    public zzcia(zzcic zzcicVar) {
        Objects.requireNonNull(zzcicVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
