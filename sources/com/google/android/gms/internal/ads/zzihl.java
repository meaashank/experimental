package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzihl {
    public static final /* synthetic */ zziei zza(zziei zzieiVar, zziei zzieiVar2, ArrayDeque arrayDeque) {
        zzb(zzieiVar, arrayDeque);
        zzb(zzieiVar2, arrayDeque);
        zziei zzihnVar = (zziei) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzihnVar = new zzihn((zziei) arrayDeque.pop(), zzihnVar, null);
        }
        return zzihnVar;
    }

    private static final void zzb(zziei zzieiVar, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!zzieiVar.zzq()) {
            if (!(zzieiVar instanceof zzihn)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzieiVar.getClass())));
            }
            zzihn zzihnVar = (zzihn) zzieiVar;
            zzb(zzihnVar.zzo(), arrayDeque);
            zzb(zzihnVar.zzF(), arrayDeque);
            return;
        }
        int iZzc = zzc(zzieiVar.zzb(), arrayDeque);
        int iZzn = zzihn.zzn(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zziei) arrayDeque.peek()).zzb() >= iZzn) {
            arrayDeque.push(zzieiVar);
            return;
        }
        int iZzn2 = zzihn.zzn(iZzc);
        zziei zzihnVar2 = (zziei) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((zziei) arrayDeque.peek()).zzb() >= iZzn2) {
                break;
            } else {
                zzihnVar2 = new zzihn((zziei) arrayDeque.pop(), zzihnVar2, bArr);
            }
        }
        zzihn zzihnVar3 = new zzihn(zzihnVar2, zzieiVar, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((zziei) arrayDeque.peek()).zzb() >= zzihn.zzn(zzc(zzihnVar3.zzb(), arrayDeque) + 1)) {
                break;
            } else {
                zzihnVar3 = new zzihn((zziei) arrayDeque.pop(), zzihnVar3, bArr);
            }
        }
        arrayDeque.push(zzihnVar3);
    }

    private static final int zzc(int i10, ArrayDeque arrayDeque) {
        int iBinarySearch = Arrays.binarySearch(zzihn.zzb, i10);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
