package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzer extends BroadcastReceiver {
    final /* synthetic */ zzes zza;

    public /* synthetic */ zzer(zzes zzesVar, byte[] bArr) {
        Objects.requireNonNull(zzesVar);
        this.zza = zzesVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.zza.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzd(context);
            }
        });
    }
}
