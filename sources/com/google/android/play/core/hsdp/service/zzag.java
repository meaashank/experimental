package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.util.Log;
import java.util.Objects;
import t1.C5596a;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzag extends com.google.android.play.core.hsdp.protocol.zzk {
    final /* synthetic */ zzai zzb;

    public /* synthetic */ zzag(zzai zzaiVar, zzah zzahVar) {
        Objects.requireNonNull(zzaiVar);
        this.zzb = zzaiVar;
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzl
    public final void zzb(Bundle bundle) {
        this.zzb.zza();
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzl
    public final void zzc(Bundle bundle) {
        int i10 = bundle.getInt("hsdpPrewarmStatusCode", 1);
        if (!bundle.containsKey("hsdpPrewarmStatusCode")) {
            Log.w("HsdpClientImpl", "HsdpServicePrewarmListener.onStateChange: cannot find status code");
        }
        if (Log.isLoggable("HsdpClientImpl", 3)) {
            C5596a.a("HsdpServicePrewarmListener.onStateChange: ", i10, "HsdpClientImpl");
        }
        String string = bundle.getString("errorMessage", "");
        if (i10 != 2) {
            if (i10 != 6) {
                zze(i10, string);
            } else {
                zzd();
            }
        }
    }

    public abstract void zzd();

    public abstract void zze(int i10, String str);
}
