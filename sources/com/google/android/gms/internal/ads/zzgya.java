package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgya {
    public static boolean zza(Iterable iterable, zzgul zzgulVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzgulVar.getClass();
            return zzc((List) iterable, zzgulVar);
        }
        Iterator it = iterable.iterator();
        zzgulVar.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            if (zzgulVar.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzhaa it = ((zzgzr) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(List list, zzgul zzgulVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzgulVar.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzgulVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzgulVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static void zzd(List list, zzgul zzgulVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzgulVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            } else {
                list.remove(i11);
            }
        }
    }
}
