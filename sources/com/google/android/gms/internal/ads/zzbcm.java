package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbcm extends BroadcastReceiver {
    final /* synthetic */ zzbcn zza;

    public zzbcm(zzbcn zzbcnVar) {
        Objects.requireNonNull(zzbcnVar);
        this.zza = zzbcnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzd();
    }
}
