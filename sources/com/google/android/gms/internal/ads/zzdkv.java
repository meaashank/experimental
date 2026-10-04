package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdkv extends zzdjn implements zzdkx {
    public zzdkv(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zza(final String str) {
        zzs(new zzdjm() { // from class: com.google.android.gms.internal.ads.zzdku
            @Override // com.google.android.gms.internal.ads.zzdjm
            public final /* synthetic */ void zza(Object obj) {
                ((zzdkx) obj).zza(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzb(final String str) {
        zzs(new zzdjm() { // from class: com.google.android.gms.internal.ads.zzdkp
            @Override // com.google.android.gms.internal.ads.zzdjm
            public final /* synthetic */ void zza(Object obj) {
                ((zzdkx) obj).zzb(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzc(final String str, final String str2) {
        zzs(new zzdjm() { // from class: com.google.android.gms.internal.ads.zzdkq
            @Override // com.google.android.gms.internal.ads.zzdjm
            public final /* synthetic */ void zza(Object obj) {
                ((zzdkx) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzd(String str) {
        final String str2 = "MalformedJson";
        zzs(new zzdjm(str2) { // from class: com.google.android.gms.internal.ads.zzdkr
            @Override // com.google.android.gms.internal.ads.zzdjm
            public final /* synthetic */ void zza(Object obj) {
                ((zzdkx) obj).zzd("MalformedJson");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zze() {
        zzs(zzdks.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzf() {
        zzs(zzdkt.zza);
    }
}
