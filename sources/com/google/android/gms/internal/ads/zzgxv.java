package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgxv extends zzgxg {
    Object[] zzd;
    private int zze;

    public zzgxv() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgxg, com.google.android.gms.internal.ads.zzgxh
    public final /* bridge */ /* synthetic */ zzgxh zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgxv zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzo = zzgxw.zzo(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzo <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzgxf.zza(iHashCode);
                while (true) {
                    int i10 = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i10];
                    if (obj2 == null) {
                        objArr2[i10] = obj;
                        this.zze += iHashCode;
                        zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iZza = i10 + 1;
                }
            }
        }
        this.zzd = null;
        zza(obj);
        return this;
    }

    public final zzgxv zzg(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzgxw zzh() {
        zzgxw zzgxwVarZzw;
        int i10 = this.zzb;
        if (i10 == 0) {
            return zzgzn.zza;
        }
        if (i10 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgzx(obj);
        }
        if (this.zzd == null || zzgxw.zzo(i10) != this.zzd.length) {
            zzgxwVarZzw = zzgxw.zzw(this.zzb, this.zza);
            this.zzb = zzgxwVarZzw.size();
        } else {
            int i11 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzgxw.zzx(i11, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            zzgxwVarZzw = new zzgzn(objArrCopyOf, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgxwVarZzw;
    }

    public zzgxv(int i10, boolean z10) {
        super(i10);
        this.zzd = new Object[zzgxw.zzo(i10)];
    }
}
