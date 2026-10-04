package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdrb {
    public static final zzdrb zza = new zzdrb(new zzdra());

    @Nullable
    private final zzbnt zzb;

    @Nullable
    private final zzbnq zzc;

    @Nullable
    private final zzbog zzd;

    @Nullable
    private final zzbod zze;

    @Nullable
    private final zzbtc zzf;
    private final androidx.collection.U0 zzg;
    private final androidx.collection.U0 zzh;

    public /* synthetic */ zzdrb(zzdra zzdraVar, byte[] bArr) {
        this(zzdraVar);
    }

    @Nullable
    public final zzbnt zza() {
        return this.zzb;
    }

    @Nullable
    public final zzbnq zzb() {
        return this.zzc;
    }

    @Nullable
    public final zzbog zzc() {
        return this.zzd;
    }

    @Nullable
    public final zzbod zzd() {
        return this.zze;
    }

    @Nullable
    public final zzbtc zze() {
        return this.zzf;
    }

    @Nullable
    public final zzbnz zzf(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return (zzbnz) this.zzg.get(str);
    }

    @Nullable
    public final zzbnw zzg(String str) {
        return (zzbnw) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        androidx.collection.U0 u02 = this.zzg;
        ArrayList arrayList = new ArrayList(u02.size());
        for (int i10 = 0; i10 < u02.size(); i10++) {
            arrayList.add((String) u02.i(i10));
        }
        return arrayList;
    }

    private zzdrb(zzdra zzdraVar) {
        this.zzb = zzdraVar.zza;
        this.zzc = zzdraVar.zzb;
        this.zzd = zzdraVar.zzc;
        this.zzg = new androidx.collection.U0(zzdraVar.zzf);
        this.zzh = new androidx.collection.U0(zzdraVar.zzg);
        this.zze = zzdraVar.zzd;
        this.zzf = zzdraVar.zze;
    }
}
