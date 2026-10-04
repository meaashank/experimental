package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafm {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;

    @Nullable
    public final String zzl;

    private zzafm(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, @Nullable String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = i17;
        this.zzj = i18;
        this.zzk = f10;
        this.zzl = str;
    }

    public static zzafm zza(zzeu zzeuVar) throws zzat {
        String strZzb;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            zzeuVar.zzk(4);
            int iZzs = (zzeuVar.zzs() & 3) + 1;
            if (iZzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzs2 = zzeuVar.zzs() & 31;
            for (int i18 = 0; i18 < iZzs2; i18++) {
                arrayList.add(zzb(zzeuVar));
            }
            int iZzs3 = zzeuVar.zzs();
            for (int i19 = 0; i19 < iZzs3; i19++) {
                arrayList.add(zzb(zzeuVar));
            }
            if (iZzs2 > 0) {
                zzgq zzgqVarZze = zzgr.zze((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i20 = zzgqVarZze.zze;
                int i21 = zzgqVarZze.zzf;
                int i22 = zzgqVarZze.zzh + 8;
                int i23 = zzgqVarZze.zzi + 8;
                int i24 = zzgqVarZze.zzj;
                int i25 = zzgqVarZze.zzk;
                int i26 = zzgqVarZze.zzl;
                int i27 = zzgqVarZze.zzm;
                float f11 = zzgqVarZze.zzg;
                strZzb = zzdr.zzb(zzgqVarZze.zza, zzgqVarZze.zzb, zzgqVarZze.zzc);
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                strZzb = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new zzafm(arrayList, iZzs, i10, i11, i12, i13, i16, i17, i14, i15, f10, strZzb);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzat.zzb("Error parsing AVC config", e10);
        }
    }

    private static byte[] zzb(zzeu zzeuVar) {
        int iZzt = zzeuVar.zzt();
        int iZzg = zzeuVar.zzg();
        zzeuVar.zzk(iZzt);
        return zzdr.zzh(zzeuVar.zzi(), iZzg, iZzt);
    }
}
