package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdge extends zzdjn implements zzdej, zzdfo {
    private final zzfld zzb;
    private final AtomicBoolean zzc;
    private final zzflo zzd;

    public zzdge(Set set, zzfld zzfldVar, zzflo zzfloVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfldVar;
        this.zzd = zzfloVar;
    }

    private final void zzb() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjd)).booleanValue() && (zztVar = this.zzb.zzae) != null && zztVar.zza == 3 && this.zzc.compareAndSet(false, true)) {
            zzs(new zzdjm() { // from class: com.google.android.gms.internal.ads.zzdgd
                @Override // com.google.android.gms.internal.ads.zzdjm
                public final /* synthetic */ void zza(Object obj) {
                    ((zzdgg) obj).zzm(zztVar);
                }
            });
        }
    }

    public final void zza(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        if (com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(this.zzd) && this.zzb.zzaB && this.zzc.compareAndSet(false, true)) {
            zzs(new zzdjm() { // from class: com.google.android.gms.internal.ads.zzdgc
                @Override // com.google.android.gms.internal.ads.zzdjm
                public final /* synthetic */ void zza(Object obj) {
                    ((zzdgg) obj).zzm(zztVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        int i10 = this.zzb.zzb;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }
}
