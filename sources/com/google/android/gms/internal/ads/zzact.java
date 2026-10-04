package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzact {
    private final ByteBuffer zza = ByteBuffer.allocateDirect(500);

    @Nullable
    private zzgw zzb;

    private final void zzd(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((zzgv) list.get(i10)).zza == 1) {
                this.zzb = zzgw.zza((zzgv) list.get(i10));
            }
        }
    }

    private final void zze() {
        ByteBuffer byteBuffer = this.zza;
        byteBuffer.position(byteBuffer.limit());
    }

    public final int zza(ByteBuffer byteBuffer, boolean z10) {
        zzgw zzgwVar;
        zzgs zzgsVarZzb;
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.hasRemaining()) {
            zzd(zzgx.zza(byteBuffer2));
            zze();
        }
        List listZza = zzgx.zza(byteBuffer);
        zzd(listZza);
        int size = listZza.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            zzgv zzgvVar = (zzgv) listZza.get(size);
            int i11 = zzgvVar.zza;
            if (i11 != 2 && i11 != 15) {
                if (i11 == 3) {
                    if (!z10) {
                        break;
                    }
                    i11 = 3;
                }
                if ((i11 != 6 && i11 != 3) || (zzgwVar = this.zzb) == null || (zzgsVarZzb = zzgs.zzb(zzgwVar, zzgvVar)) == null || zzgsVarZzb.zza()) {
                    break;
                }
            }
            if (((zzgv) listZza.get(size)).zza == 6 || ((zzgv) listZza.get(size)).zza == 3) {
                i10++;
            }
            size--;
        }
        return (i10 > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? ((zzgv) listZza.get(size)).zzb.limit() : byteBuffer.position();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, iPosition + 500));
        ByteBuffer byteBuffer2 = this.zza;
        byteBuffer2.clear();
        byteBuffer2.put(byteBuffer);
        byteBuffer2.flip();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iLimit);
    }

    public final void zzc() {
        this.zzb = null;
        zze();
    }
}
