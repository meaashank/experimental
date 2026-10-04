package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzfuz implements Comparator {
    static final /* synthetic */ zzfuz zza = new zzfuz();

    private /* synthetic */ zzfuz() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzfuo zzfuoVar = (zzfuo) obj2;
        zzfuo zzfuoVar2 = (zzfuo) obj;
        int iCompare = Double.compare(zzfuoVar.zze(), zzfuoVar2.zze());
        return iCompare == 0 ? Long.compare(zzfuoVar2.zzd(), zzfuoVar.zzd()) : iCompare;
    }
}
