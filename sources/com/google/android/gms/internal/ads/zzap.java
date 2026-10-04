package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.C1550p;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzap {
    private final zzao[] zza;

    public zzap(long j10, zzao... zzaoVarArr) {
        this.zza = zzaoVarArr;
    }

    @Nullable
    private static final zzao zzh(zzao zzaoVar, Class cls, zzgul zzgulVar) {
        if (!cls.isAssignableFrom(zzaoVar.getClass())) {
            return null;
        }
        zzao zzaoVar2 = (zzao) cls.cast(zzaoVar);
        if (zzgulVar.zza(zzaoVar2)) {
            return zzaoVar2;
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzap.class == obj.getClass() && Arrays.equals(this.zza, ((zzap) obj).zza);
    }

    public final int hashCode() {
        return C1550p.a(-9223372036854775807L) + (Arrays.hashCode(this.zza) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.zza);
        return androidx.compose.animation.core.E0.a(new StringBuilder(String.valueOf(string).length() + 8), "entries=", string, "");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzao zzb(int i10) {
        return this.zza[i10];
    }

    @Nullable
    public final zzao zzc(Class cls, zzgul zzgulVar) {
        for (zzao zzaoVar : this.zza) {
            zzao zzaoVarZzh = zzh(zzaoVar, cls, zzgulVar);
            if (zzaoVarZzh != null) {
                return zzaoVarZzh;
            }
        }
        return null;
    }

    public final zzgxm zzd(Class cls) {
        int i10 = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        for (zzao zzaoVar : this.zza) {
            if (cls.isAssignableFrom(zzaoVar.getClass())) {
                zzgxjVar.zzf((zzao) cls.cast(zzaoVar));
            }
        }
        return zzgxjVar.zzi();
    }

    public final zzgxm zze(Class cls, zzgul zzgulVar) {
        int i10 = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        for (zzao zzaoVar : this.zza) {
            zzao zzaoVarZzh = zzh(zzaoVar, cls, zzgulVar);
            if (zzaoVarZzh != null) {
                zzgxjVar.zzf(zzaoVarZzh);
            }
        }
        return zzgxjVar.zzi();
    }

    public final zzap zzf(@Nullable zzap zzapVar) {
        return zzapVar == null ? this : zzg(zzapVar.zza);
    }

    public final zzap zzg(zzao... zzaoVarArr) {
        int length = zzaoVarArr.length;
        if (length == 0) {
            return this;
        }
        zzao[] zzaoVarArr2 = this.zza;
        String str = zzfm.zza;
        int length2 = zzaoVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzaoVarArr2, length2 + length);
        System.arraycopy(zzaoVarArr, 0, objArrCopyOf, length2, length);
        return new zzap(-9223372036854775807L, (zzao[]) objArrCopyOf);
    }

    public zzap(List list) {
        this.zza = (zzao[]) list.toArray(new zzao[0]);
    }
}
