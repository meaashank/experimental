package com.google.android.gms.internal.play_billing;

import android.support.v4.media.i;
import androidx.collection.N0;
import com.google.android.gms.internal.play_billing.zzez;
import com.google.android.gms.internal.play_billing.zzfa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfa<MessageType extends zzfa<MessageType, BuilderType>, BuilderType extends zzez<MessageType, BuilderType>> implements zzhr {
    protected transient int zza = 0;

    public static void zzk(Iterable iterable, List list) {
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof zzhz) {
            ((zzhz) list).zzf(list.size() + size);
        }
        int size2 = list.size();
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj = list2.get(i10);
            if (obj == null) {
                String strA = N0.a("Element at index ", list.size() - size2, " is null.");
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(strA);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public final byte[] zzQ() {
        try {
            int iZzn = zzn();
            byte[] bArr = new byte[iZzn];
            zzfu zzfuVar = new zzfu(bArr, 0, iZzn);
            zzD(zzfuVar);
            zzfuVar.zzA();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(i.a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public int zzi(zzib zzibVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhr
    public final zzfp zzj() {
        try {
            int iZzn = zzn();
            zzfp zzfpVar = zzfp.zza;
            byte[] bArr = new byte[iZzn];
            zzfu zzfuVar = new zzfu(bArr, 0, iZzn);
            zzD(zzfuVar);
            return zzfl.zza(zzfuVar, bArr);
        } catch (IOException e10) {
            throw new RuntimeException(i.a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }
}
