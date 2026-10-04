package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhk implements zzhs {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;

    @Nullable
    private zzhw zzd;

    public zzhk(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zze(zziq zziqVar) {
        zziqVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zziqVar)) {
            return;
        }
        arrayList.add(zziqVar);
        this.zzc++;
    }

    public final void zzf(zzhw zzhwVar) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zziq) this.zzb.get(i10)).zza(this, zzhwVar, this.zza);
        }
    }

    public final void zzg(zzhw zzhwVar) {
        this.zzd = zzhwVar;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zziq) this.zzb.get(i10)).zzb(this, zzhwVar, this.zza);
        }
    }

    public final void zzh(int i10) {
        zzhw zzhwVar = this.zzd;
        String str = zzfm.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zziq) this.zzb.get(i11)).zzc(this, zzhwVar, this.zza, i10);
        }
    }

    public final void zzi() {
        zzhw zzhwVar = this.zzd;
        String str = zzfm.zza;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zziq) this.zzb.get(i10)).zzd(this, zzhwVar, this.zza);
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public /* synthetic */ Map zzj() {
        return C3279c1.a(this);
    }
}
