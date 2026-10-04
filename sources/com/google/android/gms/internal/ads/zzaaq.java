package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.core.view.C2462i0;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaaq extends zzbl {
    public static final zzaaq zzJ = new zzaaq(new zzaap());
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final boolean zzY;
    private final SparseArray zzZ;
    private final SparseBooleanArray zzaa;

    static {
        String str = zzfm.zza;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(C2462i0.f111917f, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(C2462i0.f111919h, 36);
        Integer.toString(C2462i0.f111920i, 36);
        Integer.toString(C2462i0.f111921j, 36);
        Integer.toString(C2462i0.f111922k, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(C2462i0.f111926o, 36);
        Integer.toString(C2462i0.f111927p, 36);
        Integer.toString(C2462i0.f111928q, 36);
        Integer.toString(C2462i0.f111929r, 36);
        Integer.toString(C2462i0.f111930s, 36);
        Integer.toString(C2462i0.f111931t, 36);
    }

    public /* synthetic */ zzaaq(zzaap zzaapVar, byte[] bArr) {
        this(zzaapVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaaq.class == obj.getClass()) {
            zzaaq zzaaqVar = (zzaaq) obj;
            if (super.equals(zzaaqVar) && this.zzK == zzaaqVar.zzK && this.zzM == zzaaqVar.zzM && this.zzO == zzaaqVar.zzO && this.zzT == zzaaqVar.zzT && this.zzU == zzaaqVar.zzU && this.zzV == zzaaqVar.zzV && this.zzX == zzaaqVar.zzX) {
                SparseBooleanArray sparseBooleanArray = this.zzaa;
                SparseBooleanArray sparseBooleanArray2 = zzaaqVar.zzaa;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = this.zzZ;
                            SparseArray sparseArray2 = zzaaqVar.zzZ;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzzr zzzrVar = (zzzr) entry.getKey();
                                                if (!map2.containsKey(zzzrVar) || !Objects.equals(entry.getValue(), map2.get(zzzrVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 961) + (this.zzO ? 1 : 0)) * 28629151) + (this.zzT ? 1 : 0)) * 31) + (this.zzU ? 1 : 0)) * 31) + (this.zzV ? 1 : 0)) * 961) + (this.zzX ? 1 : 0)) * 31;
    }

    public final boolean zza(int i10) {
        return this.zzaa.get(i10);
    }

    @Deprecated
    public final boolean zzb(int i10, zzzr zzzrVar) {
        Map map = (Map) this.zzZ.get(i10);
        return map != null && map.containsKey(zzzrVar);
    }

    @Nullable
    @Deprecated
    public final zzaar zzc(int i10, zzzr zzzrVar) {
        Map map = (Map) this.zzZ.get(i10);
        if (map != null) {
            return (zzaar) map.get(zzzrVar);
        }
        return null;
    }

    public final zzaap zzd() {
        return new zzaap(this, null);
    }

    public final /* synthetic */ SparseArray zze() {
        return this.zzZ;
    }

    public final /* synthetic */ SparseBooleanArray zzf() {
        return this.zzaa;
    }

    private zzaaq(zzaap zzaapVar) {
        super(zzaapVar);
        this.zzK = zzaapVar.zzz();
        this.zzL = false;
        this.zzM = zzaapVar.zzA();
        this.zzN = false;
        this.zzO = zzaapVar.zzB();
        this.zzP = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzT = zzaapVar.zzC();
        this.zzU = zzaapVar.zzD();
        this.zzV = zzaapVar.zzE();
        this.zzW = false;
        this.zzX = zzaapVar.zzF();
        this.zzY = false;
        this.zzZ = zzaapVar.zzG();
        this.zzaa = zzaapVar.zzH();
    }
}
