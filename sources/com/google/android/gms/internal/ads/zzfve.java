package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfve {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final zzfpm zzd;
    private final ClientApi zze = new ClientApi();
    private final zzfms zzf;
    private final Clock zzg;

    @Nullable
    private final zzftp zzh;
    private final zzfuf zzi;

    public zzfve(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, zzfpm zzfpmVar, zzfms zzfmsVar, Clock clock, @Nullable zzftp zzftpVar, zzfuf zzfufVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfpmVar;
        this.zzg = clock;
        this.zzf = zzfmsVar;
        this.zzh = zzftpVar;
        this.zzi = zzfufVar;
    }

    private final zzfty zzc() {
        return new zzfty(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzJ)).longValue(), 2.0d, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzK)).longValue(), 0.2d, this.zzg, this.zzi);
    }

    @Nullable
    public final zzfvd zza(com.google.android.gms.ads.internal.client.zzfp zzfpVar, @Nullable com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzfuc(clientApi, context, versionInfoParcel.clientJarVersion, this.zzf, zzfpVar, zzcbVar, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzfvi(clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zzf, zzfpVar, zzcbVar, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzftx(clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zzf, zzfpVar, zzcbVar, this.zzc, this.zzd, zzc(), this.zzg);
    }

    @Nullable
    public final zzfvd zzb(String str, com.google.android.gms.ads.internal.client.zzfp zzfpVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzfuc(str, clientApi, context, versionInfoParcel.clientJarVersion, this.zzf, zzfpVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzfvi(str, clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zzf, zzfpVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzftx(str, clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zzf, zzfpVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
    }
}
