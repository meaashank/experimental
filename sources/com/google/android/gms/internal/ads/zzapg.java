package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class zzapg implements zzanz {
    public static final zzanr zza = new zzanr(zzgxm.zzi(), -9223372036854775807L, -9223372036854775807L);
    private final zzeu zzb = new zzeu();
    private final zzeu zzc = new zzeu();
    private final zzapf zzd;

    @Nullable
    private Inflater zze;

    public zzapg(List list) {
        zzapf zzapfVar = new zzapf();
        this.zzd = zzapfVar;
        zzapfVar.zza(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    @Override // com.google.android.gms.internal.ads.zzanz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(byte[] r9, int r10, int r11, com.google.android.gms.internal.ads.zzany r12, com.google.android.gms.internal.ads.zzdu r13) {
        /*
            r8 = this;
            int r11 = r11 + r10
            com.google.android.gms.internal.ads.zzeu r12 = r8.zzb
            r12.zzb(r9, r11)
            r12.zzh(r10)
            java.util.zip.Inflater r9 = r8.zze
            if (r9 != 0) goto L14
            java.util.zip.Inflater r9 = new java.util.zip.Inflater
            r9.<init>()
            r8.zze = r9
        L14:
            com.google.android.gms.internal.ads.zzeu r9 = r8.zzc
            java.util.zip.Inflater r10 = r8.zze
            boolean r10 = com.google.android.gms.internal.ads.zzfm.zzQ(r12, r9, r10)
            if (r10 == 0) goto L29
            byte[] r10 = r9.zzi()
            int r9 = r9.zze()
            r12.zzb(r10, r9)
        L29:
            com.google.android.gms.internal.ads.zzapf r9 = r8.zzd
            r9.zzc()
            int r10 = r12.zzd()
            r11 = 2
            if (r10 < r11) goto L8b
            int r11 = r12.zzt()
            if (r11 == r10) goto L3c
            goto L8b
        L3c:
            r9.zzd(r12)
            long r10 = r9.zzf()
            com.google.android.gms.internal.ads.zzcy r12 = r9.zzb(r12)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 == 0) goto L6d
            long r10 = r9.zze()
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 == 0) goto L6f
            long r10 = r9.zze()
            long r0 = r9.zzf()
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 <= 0) goto L6f
            long r10 = r9.zze()
            long r0 = r9.zzf()
            long r0 = r0 - r10
        L6d:
            r6 = r0
            goto L74
        L6f:
            long r0 = r9.zzf()
            goto L6d
        L74:
            com.google.android.gms.internal.ads.zzanr r2 = new com.google.android.gms.internal.ads.zzanr
            if (r12 == 0) goto L7e
            com.google.android.gms.internal.ads.zzgxm r10 = com.google.android.gms.internal.ads.zzgxm.zzj(r12)
        L7c:
            r3 = r10
            goto L83
        L7e:
            com.google.android.gms.internal.ads.zzgxm r10 = com.google.android.gms.internal.ads.zzgxm.zzi()
            goto L7c
        L83:
            long r4 = r9.zze()
            r2.<init>(r3, r4, r6)
            goto L8d
        L8b:
            com.google.android.gms.internal.ads.zzanr r2 = com.google.android.gms.internal.ads.zzapg.zza
        L8d:
            r13.zza(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapg.zza(byte[], int, int, com.google.android.gms.internal.ads.zzany, com.google.android.gms.internal.ads.zzdu):void");
    }
}
