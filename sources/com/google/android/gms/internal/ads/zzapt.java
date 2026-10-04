package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzapt implements Comparator {
    static final /* synthetic */ zzapt zza = new zzapt();

    private /* synthetic */ zzapt() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.compare(((zzapk) obj).zzb, ((zzapk) obj2).zzb);
    }
}
