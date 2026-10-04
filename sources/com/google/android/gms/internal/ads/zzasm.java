package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzasm implements ServiceConnection {
    final /* synthetic */ zzasn zza;
    private final zzaso zzb;

    public /* synthetic */ zzasm(zzasn zzasnVar, zzaso zzasoVar, byte[] bArr) {
        Objects.requireNonNull(zzasnVar);
        this.zza = zzasnVar;
        this.zzb = zzasoVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzasq.zza("InstallReferrerClient", "Install Referrer service connected.");
        zzasn zzasnVar = this.zza;
        zzasnVar.zzf(zzbey.zza(iBinder));
        zzasnVar.zze(2);
        this.zzb.zza(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzasq.zzb("InstallReferrerClient", "Install Referrer service disconnected.");
        zzasn zzasnVar = this.zza;
        zzasnVar.zzf(null);
        zzasnVar.zze(0);
    }
}
