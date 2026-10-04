package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxy {
    public final int zza;

    @Nullable
    public final zzxo zzb;
    private final CopyOnWriteArrayList zzc;

    private zzxy(CopyOnWriteArrayList copyOnWriteArrayList, int i10, @Nullable zzxo zzxoVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzxoVar;
    }

    @CheckResult
    public final zzxy zza(int i10, @Nullable zzxo zzxoVar) {
        return new zzxy(this.zzc, 0, zzxoVar);
    }

    public final void zzb(Handler handler, zzxz zzxzVar) {
        this.zzc.add(new zzxr(handler, zzxzVar));
    }

    public final void zzc(zzxz zzxzVar) {
        CopyOnWriteArrayList<zzxr> copyOnWriteArrayList = this.zzc;
        for (zzxr zzxrVar : copyOnWriteArrayList) {
            if (zzxrVar.zzb == zzxzVar) {
                copyOnWriteArrayList.remove(zzxrVar);
            }
        }
    }

    public final void zzd(final zzxf zzxfVar, final zzxk zzxkVar, final int i10) {
        zzi(new zzdu() { // from class: com.google.android.gms.internal.ads.zzxx
            @Override // com.google.android.gms.internal.ads.zzdu
            public final /* synthetic */ void zza(Object obj) {
                ((zzxz) obj).zzai(0, this.zza.zzb, zzxfVar, zzxkVar, i10);
            }
        });
    }

    public final void zze(final zzxf zzxfVar, final zzxk zzxkVar) {
        zzi(new zzdu() { // from class: com.google.android.gms.internal.ads.zzxs
            @Override // com.google.android.gms.internal.ads.zzdu
            public final /* synthetic */ void zza(Object obj) {
                ((zzxz) obj).zzaj(0, this.zza.zzb, zzxfVar, zzxkVar);
            }
        });
    }

    public final void zzf(final zzxf zzxfVar, final zzxk zzxkVar) {
        zzi(new zzdu() { // from class: com.google.android.gms.internal.ads.zzxt
            @Override // com.google.android.gms.internal.ads.zzdu
            public final /* synthetic */ void zza(Object obj) {
                ((zzxz) obj).zzak(0, this.zza.zzb, zzxfVar, zzxkVar);
            }
        });
    }

    public final void zzg(final zzxf zzxfVar, final zzxk zzxkVar, final IOException iOException, final boolean z10) {
        zzi(new zzdu() { // from class: com.google.android.gms.internal.ads.zzxu
            @Override // com.google.android.gms.internal.ads.zzdu
            public final /* synthetic */ void zza(Object obj) {
                ((zzxz) obj).zzal(0, this.zza.zzb, zzxfVar, zzxkVar, iOException, z10);
            }
        });
    }

    public final void zzh(final zzxk zzxkVar) {
        zzi(new zzdu() { // from class: com.google.android.gms.internal.ads.zzxv
            @Override // com.google.android.gms.internal.ads.zzdu
            public final /* synthetic */ void zza(Object obj) {
                ((zzxz) obj).zzam(0, this.zza.zzb, zzxkVar);
            }
        });
    }

    public final void zzi(final zzdu zzduVar) {
        for (zzxr zzxrVar : this.zzc) {
            final zzxz zzxzVar = zzxrVar.zzb;
            zzfm.zze(zzxrVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzxw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzduVar.zza(zzxzVar);
                }
            });
        }
    }

    public zzxy() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
