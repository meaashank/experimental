package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfd {
    private final zzbb zza;
    private final zzaz zzb;
    private final zzex zzc;
    private final zzbd zzd = new zzbd();
    private final zzea zze;
    private final zzey zzf;
    private final zzfa zzg;
    private final zzfb zzh;
    private final zzfc zzi;

    public zzfd(zzbb zzbbVar, zzex zzexVar, zzdp zzdpVar, int i10, int i11, int i12, int i13) {
        this.zza = zzbbVar;
        this.zzc = zzexVar;
        this.zze = zzdpVar.zzd(zzbbVar.zzd(), new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzez
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                return this.zza.zzb(message);
            }
        });
        this.zzf = new zzey(this, i10);
        this.zzg = new zzfa(this, i11);
        this.zzh = new zzfb(this, i12);
        this.zzi = new zzfc(this, i13);
        zzew zzewVar = new zzew(this);
        this.zzb = zzewVar;
        zzbbVar.zze(zzewVar);
    }

    public final void zza() {
        this.zze.zzl(null);
        this.zza.zzf(this.zzb);
    }

    public final /* synthetic */ boolean zzb(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            this.zzf.zza();
            return true;
        }
        if (i10 == 2) {
            this.zzg.zza();
            return true;
        }
        if (i10 == 3) {
            this.zzh.zza();
            return true;
        }
        if (i10 != 4) {
            return false;
        }
        this.zzi.zza();
        return true;
    }

    public final /* synthetic */ void zzc() {
        this.zzf.zza();
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
    }

    public final /* synthetic */ zzbb zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzex zze() {
        return this.zzc;
    }

    public final /* synthetic */ zzbd zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzea zzg() {
        return this.zze;
    }
}
