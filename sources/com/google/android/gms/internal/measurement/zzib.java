package com.google.android.gms.internal.measurement;

import android.support.v4.media.i;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzid;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzib<MessageType extends zzib<MessageType, BuilderType>, BuilderType extends zzid<MessageType, BuilderType>> implements zzlc {
    protected int zza = 0;

    public int zza(zzlu zzluVar) {
        int iZzby = zzby();
        if (iZzby != -1) {
            return iZzby;
        }
        int iZza = zzluVar.zza(this);
        zzc(iZza);
        return iZza;
    }

    public int zzby() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final zzik zzbz() {
        try {
            zzit zzitVarZzc = zzik.zzc(zzcb());
            zza(zzitVarZzc.zzb());
            return zzitVarZzc.zza();
        } catch (IOException e10) {
            throw new RuntimeException(i.a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public void zzc(int i10) {
        throw new UnsupportedOperationException();
    }

    public final byte[] zzca() {
        try {
            byte[] bArr = new byte[zzcb()];
            zzjc zzjcVarZzb = zzjc.zzb(bArr);
            zza(zzjcVarZzb);
            zzjcVarZzb.zzb();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(i.a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzid.zza(iterable, list);
    }
}
