package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
final class zzakl {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzakv zzc = new zzakv();
    private zzakm zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzagi zzagiVar, int i10) throws IOException {
        byte[] bArr = this.zza;
        zzagiVar.zzc(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & 255));
        }
        return j10;
    }

    public final void zza(zzakm zzakmVar) {
        this.zzd = zzakmVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[LOOP:0: B:3:0x0005->B:38:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzagi r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakl.zzc(com.google.android.gms.internal.ads.zzagi):boolean");
    }
}
