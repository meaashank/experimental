package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzmq implements zzxz, zzuo {
    final /* synthetic */ zzmv zza;
    private final zzms zzb;

    public zzmq(zzmv zzmvVar, zzms zzmsVar) {
        Objects.requireNonNull(zzmvVar);
        this.zza = zzmvVar;
        this.zzb = zzmsVar;
    }

    @Nullable
    private final Pair zzf(int i10, @Nullable zzxo zzxoVar) {
        zzxo zzxoVarZza;
        zzxo zzxoVar2 = null;
        if (zzxoVar != null) {
            zzms zzmsVar = this.zzb;
            int i11 = 0;
            while (true) {
                List list = zzmsVar.zzc;
                if (i11 >= list.size()) {
                    zzxoVarZza = null;
                    break;
                }
                if (((zzxo) list.get(i11)).zzd == zzxoVar.zzd) {
                    Object obj = zzxoVar.zza;
                    Object obj2 = zzmsVar.zzb;
                    int i12 = zznc.zzb;
                    zzxoVarZza = zzxoVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (zzxoVarZza == null) {
                return null;
            }
            zzxoVar2 = zzxoVarZza;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzxoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzai(int i10, @Nullable zzxo zzxoVar, final zzxf zzxfVar, final zzxk zzxkVar, final int i11) {
        final Pair pairZzf = zzf(0, zzxoVar);
        if (pairZzf != null) {
            zzmv zzmvVar = this.zza;
            zzmvVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzai(((Integer) pair.first).intValue(), (zzxo) pair.second, zzxfVar, zzxkVar, i11);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzaj(int i10, @Nullable zzxo zzxoVar, final zzxf zzxfVar, final zzxk zzxkVar) {
        final Pair pairZzf = zzf(0, zzxoVar);
        if (pairZzf != null) {
            zzmv zzmvVar = this.zza;
            zzmvVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzml
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzaj(((Integer) pair.first).intValue(), (zzxo) pair.second, zzxfVar, zzxkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzak(int i10, @Nullable zzxo zzxoVar, final zzxf zzxfVar, final zzxk zzxkVar) {
        final Pair pairZzf = zzf(0, zzxoVar);
        if (pairZzf != null) {
            zzmv zzmvVar = this.zza;
            zzmvVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzak(((Integer) pair.first).intValue(), (zzxo) pair.second, zzxfVar, zzxkVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzal(int i10, @Nullable zzxo zzxoVar, final zzxf zzxfVar, final zzxk zzxkVar, final IOException iOException, final boolean z10) {
        final Pair pairZzf = zzf(0, zzxoVar);
        if (pairZzf != null) {
            zzmv zzmvVar = this.zza;
            zzmvVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzal(((Integer) pair.first).intValue(), (zzxo) pair.second, zzxfVar, zzxkVar, iOException, z10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzam(int i10, @Nullable zzxo zzxoVar, final zzxk zzxkVar) {
        final Pair pairZzf = zzf(0, zzxoVar);
        if (pairZzf != null) {
            zzmv zzmvVar = this.zza;
            zzmvVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzam(((Integer) pair.first).intValue(), (zzxo) pair.second, zzxkVar);
                }
            });
        }
    }
}
