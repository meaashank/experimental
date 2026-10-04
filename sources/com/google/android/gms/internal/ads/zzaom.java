package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzaom {
    private final zzeu zza = new zzeu();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    @Nullable
    public final zzcy zza() {
        int i10;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzeu zzeuVar = this.zza;
        if (zzeuVar.zze() == 0 || zzeuVar.zzg() != zzeuVar.zze() || !this.zzc) {
            return null;
        }
        zzeuVar.zzh(0);
        int i11 = this.zzh * this.zzi;
        int[] iArr = new int[i11];
        int i12 = 0;
        while (i12 < i11) {
            int iZzs = zzeuVar.zzs();
            if (iZzs != 0) {
                i10 = i12 + 1;
                iArr[i12] = this.zzb[iZzs];
            } else {
                int iZzs2 = zzeuVar.zzs();
                if (iZzs2 != 0) {
                    int iZzs3 = iZzs2 & 63;
                    if ((iZzs2 & 64) != 0) {
                        iZzs3 = (iZzs3 << 8) | zzeuVar.zzs();
                    }
                    i10 = iZzs3 + i12;
                    Arrays.fill(iArr, i12, i10, (iZzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzeuVar.zzs()]);
                }
            }
            i12 = i10;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcx zzcxVar = new zzcx();
        zzcxVar.zzc(bitmapCreateBitmap);
        zzcxVar.zzi(this.zzf / this.zzd);
        zzcxVar.zzj(0);
        zzcxVar.zzf(this.zzg / this.zze, 0);
        zzcxVar.zzg(0);
        zzcxVar.zzm(this.zzh / this.zzd);
        zzcxVar.zzn(this.zzi / this.zze);
        return zzcxVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    public final /* synthetic */ void zzc(zzeu zzeuVar, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        zzeuVar.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i11 = 0;
        for (int i12 = i10 / 5; i11 < i12; i12 = i12) {
            int iZzs = zzeuVar.zzs();
            int iZzs2 = zzeuVar.zzs();
            int iZzs3 = zzeuVar.zzs();
            int iZzs4 = zzeuVar.zzs();
            double d10 = iZzs2;
            int iZzs5 = zzeuVar.zzs() << 24;
            String str = zzfm.zza;
            double d11 = iZzs3 - 128;
            double d12 = iZzs4 - 128;
            iArr[iZzs] = (Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)) << 16) | iZzs5 | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255));
            i11++;
        }
        this.zzc = true;
    }

    public final /* synthetic */ void zzd(zzeu zzeuVar, int i10) {
        int iZzx;
        if (i10 < 4) {
            return;
        }
        zzeuVar.zzk(3);
        int i11 = i10 - 4;
        if ((zzeuVar.zzs() & 128) != 0) {
            if (i11 < 7 || (iZzx = zzeuVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzeuVar.zzt();
            this.zzi = zzeuVar.zzt();
            this.zza.zza(iZzx - 4);
            i11 = i10 - 11;
        }
        zzeu zzeuVar2 = this.zza;
        int iZzg = zzeuVar2.zzg();
        int iZze = zzeuVar2.zze();
        if (iZzg >= iZze || i11 <= 0) {
            return;
        }
        int iMin = Math.min(i11, iZze - iZzg);
        zzeuVar.zzm(zzeuVar2.zzi(), iZzg, iMin);
        zzeuVar2.zzh(iZzg + iMin);
    }

    public final /* synthetic */ void zze(zzeu zzeuVar, int i10) {
        if (i10 < 19) {
            return;
        }
        this.zzd = zzeuVar.zzt();
        this.zze = zzeuVar.zzt();
        zzeuVar.zzk(11);
        this.zzf = zzeuVar.zzt();
        this.zzg = zzeuVar.zzt();
    }
}
