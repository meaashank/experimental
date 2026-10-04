package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaap extends zzbk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzaap() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    public final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    public final zzaap zzx(zzbl zzblVar) {
        zza(zzblVar);
        return this;
    }

    public final zzaap zzy(int i10, boolean z10) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i10) == z10) {
            return this;
        }
        if (z10) {
            sparseBooleanArray.put(i10, true);
            return this;
        }
        sparseBooleanArray.delete(i10);
        return this;
    }

    public final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    public /* synthetic */ zzaap(zzaaq zzaaqVar, byte[] bArr) {
        super(zzaaqVar);
        this.zza = zzaaqVar.zzK;
        this.zzb = zzaaqVar.zzM;
        this.zzc = zzaaqVar.zzO;
        this.zzd = zzaaqVar.zzT;
        this.zze = zzaaqVar.zzU;
        this.zzf = zzaaqVar.zzV;
        this.zzg = zzaaqVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArrayZze = zzaaqVar.zze();
            if (i10 < sparseArrayZze.size()) {
                sparseArray.put(sparseArrayZze.keyAt(i10), new HashMap((Map) sparseArrayZze.valueAt(i10)));
                i10++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzaaqVar.zzf().clone();
                return;
            }
        }
    }
}
