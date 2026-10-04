package com.google.android.gms.internal.ads;

import androidx.compose.material.C1846b;
import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
public final class zzawo {
    public final ArrayDeque zza = new ArrayDeque();

    public zzawo(int i10) {
    }

    public final void zza(long j10, long j11, long j12) throws zzawm {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        zzawl zzawlVar = new zzawl(j10, j11, j12);
        ArrayDeque arrayDeque = this.zza;
        if (arrayDeque.size() >= (C1846b.a((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16) ^ (i17 % 452867621))) {
            throw new zzawm();
        }
        arrayDeque.push(zzawlVar);
    }

    public final zzawl zzb() throws zzawn {
        return (zzawl) Optional.ofNullable((zzawl) this.zza.peek()).orElseThrow(zzawk.zza);
    }
}
