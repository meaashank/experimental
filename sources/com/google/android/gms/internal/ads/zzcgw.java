package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcgw {
    public static final void zza(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new zzcgx(view, onGlobalLayoutListener).zzc();
    }

    public static final void zzb(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new zzcgy(view, onScrollChangedListener).zzc();
    }
}
