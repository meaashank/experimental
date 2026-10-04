package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzacm {
    private static final Comparator zza = zzacl.zza;
    private static final Comparator zzb = zzack.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzacj[] zzd = new zzacj[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzacm(int i10) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i10, float f10) {
        zzacj zzacjVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i11 = this.zzh;
        if (i11 > 0) {
            zzacj[] zzacjVarArr = this.zzd;
            int i12 = i11 - 1;
            this.zzh = i12;
            zzacjVar = zzacjVarArr[i12];
        } else {
            zzacjVar = new zzacj(null);
        }
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        zzacjVar.zza = i13;
        zzacjVar.zzb = i10;
        zzacjVar.zzc = f10;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzacjVar);
        this.zzg += i10;
        while (true) {
            int i14 = this.zzg;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            zzacj zzacjVar2 = (zzacj) arrayList.get(0);
            int i16 = zzacjVar2.zzb;
            if (i16 <= i15) {
                this.zzg -= i16;
                arrayList.remove(0);
                int i17 = this.zzh;
                if (i17 < 5) {
                    zzacj[] zzacjVarArr2 = this.zzd;
                    this.zzh = i17 + 1;
                    zzacjVarArr2[i17] = zzacjVar2;
                }
            } else {
                zzacjVar2.zzb = i16 - i15;
                this.zzg -= i15;
            }
        }
    }

    public final float zzc(float f10) {
        int i10 = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i10 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzacj) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f12 = 0.5f * f11;
            zzacj zzacjVar = (zzacj) arrayList.get(i10);
            i11 += zzacjVar.zzb;
            if (i11 >= f12) {
                return zzacjVar.zzc;
            }
            i10++;
        }
    }
}
