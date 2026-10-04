package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcjb {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzavg zzavgVar;
        zzavf zzavfVar;
        long j10 = this.zza;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzavb(new zzcja(byteBufferDuplicate), zzcjf.zzb).zzc().iterator();
            while (true) {
                zzavgVar = null;
                if (!it.hasNext()) {
                    zzavfVar = null;
                    break;
                }
                zzavd zzavdVar = (zzavd) it.next();
                if (zzavdVar instanceof zzavf) {
                    zzavfVar = (zzavf) zzavdVar;
                    break;
                }
            }
            Iterator it2 = zzavfVar.zzc().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzavd zzavdVar2 = (zzavd) it2.next();
                if (zzavdVar2 instanceof zzavg) {
                    zzavgVar = (zzavg) zzavdVar2;
                    break;
                }
            }
            long jZzd = (zzavgVar.zzd() * 1000) / zzavgVar.zzc();
            this.zza = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
