package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfz extends zzgb {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfz(int i10, long j10) {
        super(i10, null);
        this.zza = j10;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final String toString() {
        List list = this.zzb;
        String strZze = zzgb.zze(this.zzd);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.zzc.toArray());
        int length = strZze.length();
        StringBuilder sb2 = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        androidx.room.F.a(sb2, strZze, " leaves: ", string, " containers: ");
        sb2.append(string2);
        return sb2.toString();
    }

    public final void zza(zzga zzgaVar) {
        this.zzb.add(zzgaVar);
    }

    public final void zzb(zzfz zzfzVar) {
        this.zzc.add(zzfzVar);
    }

    @Nullable
    public final zzga zzc(int i10) {
        List list = this.zzb;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzga zzgaVar = (zzga) list.get(i11);
            if (zzgaVar.zzd == i10) {
                return zzgaVar;
            }
        }
        return null;
    }

    @Nullable
    public final zzfz zzd(int i10) {
        List list = this.zzc;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzfz zzfzVar = (zzfz) list.get(i11);
            if (zzfzVar.zzd == i10) {
                return zzfzVar;
            }
        }
        return null;
    }
}
