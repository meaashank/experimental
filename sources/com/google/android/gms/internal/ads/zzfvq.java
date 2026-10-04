package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfvq extends zzfvm {
    private final zzfvo zza;
    private zzfyb zzc;
    private zzfxa zzd;
    private final String zzg;
    private final zzfwo zzb = new zzfwo();
    private boolean zze = false;
    private boolean zzf = false;

    public zzfvq(zzfvn zzfvnVar, zzfvo zzfvoVar, String str) {
        this.zza = zzfvoVar;
        this.zzg = str;
        zzk(null);
        if (zzfvoVar.zzi() == zzfvp.HTML || zzfvoVar.zzi() == zzfvp.JAVASCRIPT) {
            this.zzd = new zzfxb(str, zzfvoVar.zzf());
        } else {
            this.zzd = new zzfxe(str, zzfvoVar.zze(), null);
        }
        this.zzd.zza();
        zzfwk.zza().zzb(this);
        this.zzd.zzj(zzfvnVar);
    }

    private final void zzk(@Nullable View view) {
        this.zzc = new zzfyb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    public final void zza() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        zzfwk.zza().zzc(this);
        this.zzd.zzo(zzfws.zza().zzg());
        this.zzd.zzn(zzfwi.zza().zzb());
        this.zzd.zzk(this, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    public final void zzb(@Nullable View view) {
        if (this.zzf || zzi() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzp();
        Collection<zzfvq> collectionZze = zzfwk.zza().zze();
        if (collectionZze == null || collectionZze.isEmpty()) {
            return;
        }
        for (zzfvq zzfvqVar : collectionZze) {
            if (zzfvqVar != this && zzfvqVar.zzi() == view) {
                zzfvqVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zzm();
        zzfwk.zza().zzd(this);
        this.zzd.zzb();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    public final void zzd(View view, zzfvt zzfvtVar, @Nullable String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfvtVar, "Ad overlay");
    }

    public final List zzf() {
        return this.zzb.zza();
    }

    public final zzfxa zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzi() {
        return (View) this.zzc.get();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
