package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgxm extends zzgxi implements List, RandomAccess {
    private static final zzhab zza = new zzgxk(zzgzh.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzgxm zzi() {
        return zzgzh.zza;
    }

    public static zzgxm zzj(Object obj) {
        Object[] objArr = {obj};
        zzgzf.zza(objArr, 1);
        return zzt(objArr, 1);
    }

    public static zzgxm zzk(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgzf.zza(objArr, 2);
        return zzt(objArr, 2);
    }

    public static zzgxm zzl(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgzf.zza(objArr, 3);
        return zzt(objArr, 3);
    }

    public static zzgxm zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgzf.zza(objArr, 5);
        return zzt(objArr, 5);
    }

    public static zzgxm zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        zzgzf.zza(objArr, 6);
        return zzt(objArr, 6);
    }

    @SafeVarargs
    public static zzgxm zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i10 = length + 12;
        Object[] objArr2 = new Object[i10];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzgzf.zza(objArr2, i10);
        return zzt(objArr2, i10);
    }

    public static zzgxm zzp(Iterable iterable) {
        iterable.getClass();
        return zzq((Collection) iterable);
    }

    public static zzgxm zzq(Collection collection) {
        if (!(collection instanceof zzgxi)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgzf.zza(array, length);
            return zzt(array, length);
        }
        zzgxm zzgxmVarZze = ((zzgxi) collection).zze();
        if (!zzgxmVarZze.zzf()) {
            return zzgxmVarZze;
        }
        Object[] array2 = zzgxmVarZze.toArray();
        return zzt(array2, array2.length);
    }

    public static zzgxm zzr(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgzh.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgzf.zza(objArr2, length);
        return zzt(objArr2, length);
    }

    public static zzgxm zzs(Comparator comparator, Iterable iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : zzgym.zza(((zzgxm) iterable).listIterator(0))).toArray();
        int length = array.length;
        zzgzf.zza(array, length);
        Arrays.sort(array, comparator);
        return zzt(array, length);
    }

    public static zzgxm zzt(Object[] objArr, int i10) {
        return i10 == 0 ? zzgzh.zza : new zzgzh(objArr, i10);
    }

    public static zzgxj zzv(int i10) {
        zzgwi.zzb(i10, "expectedSize");
        return new zzgxj(i10);
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

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection
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

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.ads.zzgxi
    /* JADX INFO: renamed from: zza */
    public final zzhaa iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    @Deprecated
    public final zzgxm zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public int zzg(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzgxm subList(int i10, int i11) {
        zzguk.zzo(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? zzgzh.zza : new zzgxl(this, i10, i12);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzhab listIterator(int i10) {
        zzguk.zzn(i10, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zzgxk(this, i10);
    }
}
