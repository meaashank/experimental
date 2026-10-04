package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import s0.x;

/* JADX INFO: loaded from: classes4.dex */
public final class zzagd implements zzagn {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzagc zzc = new zzagc(zzaga.zza);
    private static final zzagc zzd = new zzagc(zzafz.zza);

    @Nullable
    private zzgxm zze;
    private final zzanx zzf = new zzans();

    private final void zzc(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new zzapw());
                break;
            case 1:
                list.add(new zzapz());
                break;
            case 2:
                list.add(new zzaqc(0));
                break;
            case 3:
                list.add(new zzahy(0));
                break;
            case 4:
                zzagh zzaghVarZza = zzc.zza(0);
                if (zzaghVarZza == null) {
                    list.add(new zzaip(0));
                } else {
                    list.add(zzaghVarZza);
                }
                break;
            case 5:
                list.add(new zzais());
                break;
            case 6:
                list.add(new zzakt(this.zzf, 0));
                break;
            case 7:
                list.add(new zzalb(0));
                break;
            case 8:
                zzanx zzanxVar = this.zzf;
                list.add(new zzamd(zzanxVar, x.h.f238411n, null, null, zzgxm.zzi(), null));
                list.add(new zzamp(zzanxVar, 160));
                break;
            case 9:
                list.add(new zzang());
                break;
            case 10:
                list.add(new zzarg());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgxm.zzi();
                }
                list.add(new zzarr(1, 0, this.zzf, new zzfj(0L), new zzaqe(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzase());
                break;
            case 14:
                list.add(new zzaja(0));
                break;
            case 15:
                zzagh zzaghVarZza2 = zzd.zza(new Object[0]);
                if (zzaghVarZza2 != null) {
                    list.add(zzaghVarZza2);
                }
                break;
            case 16:
                list.add(new zzaic(0, this.zzf));
                break;
            case 17:
                list.add(new zzanq());
                break;
            case 18:
                list.add(new zzasj());
                break;
            case 19:
                list.add(new zzaik());
                break;
            case 20:
                list.add(new zzaiy(0));
                break;
            case 21:
                list.add(new zzaij());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    public final synchronized zzagh[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0204  */
    @Override // com.google.android.gms.internal.ads.zzagn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzagh[] zzb(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagd.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzagh[]");
    }
}
