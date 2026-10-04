package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzaad implements Comparator {
    static final /* synthetic */ zzaad zza = new zzaad();

    private /* synthetic */ zzaad() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzaan) ((List) obj).get(0)).compareTo((zzaan) ((List) obj2).get(0));
    }
}
