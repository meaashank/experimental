package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.C2538n;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahe {
    public int zza;

    @Nullable
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzahe() {
    }

    public final boolean zza(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!zzahf.zzl(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i15 = i13 - 1;
        this.zza = i11;
        this.zzb = zzahf.zza[3 - i12];
        int i16 = zzahf.zzb[i14];
        this.zzd = i16;
        if (i11 == 2) {
            i16 /= 2;
            this.zzd = i16;
        } else if (i11 == 0) {
            i16 /= 4;
            this.zzd = i16;
        }
        int i17 = (i10 >>> 9) & 1;
        this.zzg = zzahf.zzm(i11, i12);
        if (i12 == 3) {
            int i18 = i11 == 3 ? zzahf.zzc[i15] : zzahf.zzd[i15];
            this.zzf = i18;
            this.zzc = (((i18 * 12) / i16) + i17) * 4;
        } else {
            int i19 = Opcodes.D2F;
            if (i11 == 3) {
                int i20 = i12 == 2 ? zzahf.zze[i15] : zzahf.zzf[i15];
                this.zzf = i20;
                this.zzc = C2538n.a(i20, Opcodes.D2F, i16, i17);
            } else {
                int i21 = zzahf.zzg[i15];
                this.zzf = i21;
                if (i12 == 1) {
                    i19 = 72;
                }
                this.zzc = C2538n.a(i19, i21, i16, i17);
            }
        }
        this.zze = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzahe(zzahe zzaheVar) {
        this.zza = zzaheVar.zza;
        this.zzb = zzaheVar.zzb;
        this.zzc = zzaheVar.zzc;
        this.zzd = zzaheVar.zzd;
        this.zze = zzaheVar.zze;
        this.zzf = zzaheVar.zzf;
        this.zzg = zzaheVar.zzg;
    }
}
