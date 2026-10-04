package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzfh implements zzea {

    @InterfaceC4326A("messagePool")
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfh(Handler handler) {
        this.zzb = handler;
    }

    public static /* synthetic */ void zzo(zzfg zzfgVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzfgVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static zzfg zzp() {
        zzfg zzfgVar;
        List list = zza;
        synchronized (list) {
            try {
                zzfgVar = list.isEmpty() ? new zzfg(null) : (zzfg) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzb(int i10) {
        return this.zzb.hasMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdz zzc(int i10) {
        Handler handler = this.zzb;
        zzfg zzfgVarZzp = zzp();
        zzfgVarZzp.zzb(handler.obtainMessage(i10), this);
        return zzfgVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdz zzd(int i10, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzfg zzfgVarZzp = zzp();
        zzfgVarZzp.zzb(handler.obtainMessage(i10, obj), this);
        return zzfgVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdz zze(int i10, int i11, int i12) {
        Handler handler = this.zzb;
        zzfg zzfgVarZzp = zzp();
        zzfgVarZzp.zzb(handler.obtainMessage(i10, i11, i12), this);
        return zzfgVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdz zzf(int i10, int i11, int i12, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzfg zzfgVarZzp = zzp();
        zzfgVarZzp.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzfgVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzg(zzdz zzdzVar) {
        return ((zzfg) zzdzVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzh(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzi(int i10, int i11) {
        return this.zzb.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzj(int i10, long j10) {
        return this.zzb.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzk(int i10) {
        this.zzb.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzl(@Nullable Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzm(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzn(Runnable runnable, long j10) {
        return this.zzb.postDelayed(runnable, 1000L);
    }
}
