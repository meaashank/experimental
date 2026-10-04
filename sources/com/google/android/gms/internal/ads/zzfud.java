package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfud extends com.google.android.gms.ads.internal.client.zzcg {
    private final zzfuj zza;
    private final zzftu zzb;

    public zzfud(zzfuj zzfujVar, zzftu zzftuVar) {
        this.zza = zzfujVar;
        this.zzb = zzftuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(List list, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        this.zza.zza(list, zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzf(String str) {
        return this.zza.zzb(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    @Nullable
    public final zzcda zzg(String str) {
        return this.zza.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzh(String str) {
        return this.zza.zzd(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    @Nullable
    public final zzbgz zzi(String str) {
        return this.zza.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzj(String str) {
        return this.zza.zzf(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzbu zzk(String str) {
        return this.zza.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzl(zzbvu zzbvuVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzm(String str, com.google.android.gms.ads.internal.client.zzfp zzfpVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar) {
        return this.zzb.zza(str, zzfpVar, zzceVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzn(int i10, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return false;
        }
        return this.zzb.zzb(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzbu zzo(String str) {
        return this.zzb.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    @Nullable
    public final zzbgz zzp(String str) {
        return this.zzb.zzd(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    @Nullable
    public final zzcda zzq(String str) {
        return this.zzb.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzfp zzr(int i10, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return null;
        }
        return this.zzb.zzf(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final Bundle zzs(int i10) {
        Map mapZzh = this.zzb.zzh(i10);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : mapZzh.entrySet()) {
            bundle.putByteArray((String) entry.getKey(), SafeParcelableSerializer.serializeToBytes((com.google.android.gms.ads.internal.client.zzfp) entry.getValue()));
        }
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final int zzt(int i10, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return 0;
        }
        return this.zzb.zzg(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzu(int i10, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return false;
        }
        return this.zzb.zzi(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzv(int i10) {
        this.zzb.zzj(i10);
    }
}
