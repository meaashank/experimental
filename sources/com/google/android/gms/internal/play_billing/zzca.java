package com.google.android.gms.internal.play_billing;

import com.android.billingclient.api.BillingClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzca extends zzbx implements List, RandomAccess {
    private static final zzct zza = new zzby(zzcj.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzca zzi(Object[] objArr, int i10) {
        return i10 == 0 ? zzcj.zza : new zzcj(objArr, i10);
    }

    public static zzca zzj(Collection collection) {
        if (!(collection instanceof zzbx)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzci.zzb(array, length);
            return zzi(array, length);
        }
        zzca zzcaVarZzd = ((zzbx) collection).zzd();
        if (!zzcaVarZzd.zzf()) {
            return zzcaVarZzd;
        }
        Object[] array2 = zzcaVarZzd.toArray();
        return zzi(array2, array2.length);
    }

    public static zzca zzk() {
        return zzcj.zza;
    }

    public static zzca zzl(Object obj) {
        Object[] objArr = {obj};
        zzci.zzb(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzca zzm(Object obj, Object obj2) {
        Object[] objArr = {BillingClient.f.f136321x0, BillingClient.f.f136320w0};
        zzci.zzb(objArr, 2);
        return zzi(objArr, 2);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!Objects.equals(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    @Deprecated
    public final zzca zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    /* JADX INFO: renamed from: zze */
    public final zzcs iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh */
    public zzca subList(int i10, int i11) {
        zzbl.zzd(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? zzcj.zza : new zzbz(this, i10, i12);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzct listIterator(int i10) {
        zzbl.zzb(i10, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zzby(this, i10);
    }
}
