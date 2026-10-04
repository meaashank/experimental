package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.C5091z;

/* JADX INFO: loaded from: classes4.dex */
final class zzgwt extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzgwt() {
        zza(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final int[] zzl() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final Object[] zzm() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final Object[] zzn() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private final void zzv(int i10) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzw, reason: merged with bridge method [inline-methods] */
    public final int zzh() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzx(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objZza = zzgwu.zza(i11);
        if (i13 != 0) {
            zzgwu.zzc(objZza, i12 & i14, i13 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzl = zzl();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iZzb = zzgwu.zzb(obj, i15);
            while (iZzb != 0) {
                int i16 = iZzb - 1;
                int i17 = iArrZzl[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iZzb2 = zzgwu.zzb(objZza, i19);
                zzgwu.zzc(objZza, i19, iZzb);
                iArrZzl[i16] = ((~i14) & i18) | (iZzb2 & i14);
                iZzb = i17 & i10;
            }
        }
        this.zze = objZza;
        zzv(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public final int zzi(Object obj) {
        if (zzb()) {
            return -1;
        }
        int iZzb = zzgxf.zzb(obj);
        int iZzh = zzh();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzb2 = zzgwu.zzb(obj2, iZzb & iZzh);
        if (iZzb2 != 0) {
            int i10 = ~iZzh;
            int i11 = iZzb & i10;
            do {
                int i12 = iZzb2 - 1;
                int i13 = zzl()[i12];
                if ((i13 & i10) == i11 && Objects.equals(obj, zzm()[i12])) {
                    return i12;
                }
                iZzb2 = i13 & iZzh;
            } while (iZzb2 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final Object zzj(Object obj) {
        if (!zzb()) {
            int iZzh = zzh();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZze = zzgwu.zze(obj, null, iZzh, obj2, zzl(), zzm(), null);
            if (iZze != -1) {
                Object obj3 = zzn()[iZze];
                zze(iZze, iZzh);
                this.zzg--;
                zzd();
                return obj3;
            }
        }
        return zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzb()) {
            return;
        }
        zzd();
        Map mapZzc = zzc();
        if (mapZzc != null) {
            this.zzf = zzhbj.zzc(size(), 3, C5091z.f220373j);
            mapZzc.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzm(), 0, this.zzg, (Object) null);
        Arrays.fill(zzn(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzl(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzc = zzc();
        return mapZzc != null ? mapZzc.containsKey(obj) : zzi(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.zzg; i10++) {
            if (Objects.equals(obj, zzn()[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzgwo zzgwoVar = new zzgwo(this, null);
        this.zzi = zzgwoVar;
        return zzgwoVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.get(obj);
        }
        int iZzi = zzi(obj);
        if (iZzi == -1) {
            return null;
        }
        return zzn()[iZzi];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzgwq zzgwqVar = new zzgwq(this, null);
        this.zzh = zzgwqVar;
        return zzgwqVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        if (zzb()) {
            zzguk.zzj(zzb(), "Arrays already allocated");
            int i11 = this.zzf;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzgwu.zza(iMax2);
            zzv(iMax2 - 1);
            this.zza = new int[i11];
            this.zzb = new Object[i11];
            this.zzc = new Object[i11];
        }
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.put(obj, obj2);
        }
        int[] iArrZzl = zzl();
        Object[] objArrZzm = zzm();
        Object[] objArrZzn = zzn();
        int i12 = this.zzg;
        int i13 = i12 + 1;
        int iZzb = zzgxf.zzb(obj);
        int iZzh = zzh();
        int i14 = iZzb & iZzh;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzb2 = zzgwu.zzb(obj3, i14);
        if (iZzb2 == 0) {
            if (i13 > iZzh) {
                iZzh = zzx(iZzh, zzgwu.zzd(iZzh), iZzb, i12);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzgwu.zzc(obj4, i14, i13);
            }
            i10 = 1;
        } else {
            int i15 = ~iZzh;
            int i16 = iZzb & i15;
            int i17 = 0;
            while (true) {
                int i18 = iZzb2 - 1;
                int i19 = iArrZzl[i18];
                i10 = 1;
                int i20 = i19 & i15;
                if (i20 == i16 && Objects.equals(obj, objArrZzm[i18])) {
                    Object obj5 = objArrZzn[i18];
                    objArrZzn[i18] = obj2;
                    return obj5;
                }
                int i21 = i19 & iZzh;
                i17++;
                if (i21 != 0) {
                    iZzb2 = i21;
                } else {
                    if (i17 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzh() + 1, 1.0f);
                        int iZzf = zzf();
                        while (iZzf >= 0) {
                            linkedHashMap.put(zzm()[iZzf], zzn()[iZzf]);
                            iZzf = zzg(iZzf);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzd();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > iZzh) {
                        iZzh = zzx(iZzh, zzgwu.zzd(iZzh), iZzb, i12);
                    } else {
                        iArrZzl[i18] = (i13 & iZzh) | i20;
                    }
                }
            }
        }
        int length = zzl().length;
        if (i13 > length) {
            int i22 = i10;
            int iMin = Math.min(C5091z.f220373j, (Math.max(i22, length >>> 1) + length) | i22);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzl(), iMin);
                this.zzb = Arrays.copyOf(zzm(), iMin);
                this.zzc = Arrays.copyOf(zzn(), iMin);
            }
        }
        zzl()[i12] = (~iZzh) & iZzb;
        zzm()[i12] = obj;
        zzn()[i12] = obj2;
        this.zzg = i13;
        zzd();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.remove(obj);
        }
        Object objZzj = zzj(obj);
        if (objZzj == zzd) {
            return null;
        }
        return objZzj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzc = zzc();
        return mapZzc != null ? mapZzc.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzgws zzgwsVar = new zzgws(this, null);
        this.zzj = zzgwsVar;
        return zzgwsVar;
    }

    public final void zza(int i10) {
        this.zzf = zzhbj.zzc(i10, 1, C5091z.f220373j);
    }

    public final boolean zzb() {
        return this.zze == null;
    }

    public final Map zzc() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzd() {
        this.zzf += 32;
    }

    public final void zze(int i10, int i11) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzl = zzl();
        Object[] objArrZzm = zzm();
        Object[] objArrZzn = zzn();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrZzm[i10] = null;
            objArrZzn[i10] = null;
            iArrZzl[i10] = 0;
            return;
        }
        int i13 = i10 + 1;
        Object obj2 = objArrZzm[i12];
        objArrZzm[i10] = obj2;
        objArrZzn[i10] = objArrZzn[i12];
        objArrZzm[i12] = null;
        objArrZzn[i12] = null;
        iArrZzl[i10] = iArrZzl[i12];
        iArrZzl[i12] = 0;
        int iZzb = zzgxf.zzb(obj2) & i11;
        int iZzb2 = zzgwu.zzb(obj, iZzb);
        if (iZzb2 == size) {
            zzgwu.zzc(obj, iZzb, i13);
            return;
        }
        while (true) {
            int i14 = iZzb2 - 1;
            int i15 = iArrZzl[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                iArrZzl[i14] = (i15 & (~i11)) | (i11 & i13);
                return;
            }
            iZzb2 = i16;
        }
    }

    public final int zzf() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzg(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.zzg) {
            return i11;
        }
        return -1;
    }

    public final /* synthetic */ Object zzk() {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final /* synthetic */ Object zzo(int i10) {
        return zzm()[i10];
    }

    public final /* synthetic */ Object zzp(int i10) {
        return zzn()[i10];
    }

    public final /* synthetic */ void zzq(int i10, Object obj) {
        zzn()[i10] = obj;
    }

    public final /* synthetic */ int zzs() {
        return this.zzf;
    }

    public final /* synthetic */ int zzt() {
        return this.zzg;
    }

    public final /* synthetic */ void zzu(int i10) {
        this.zzg = i10;
    }

    public zzgwt(int i10) {
        zza(8);
    }
}
