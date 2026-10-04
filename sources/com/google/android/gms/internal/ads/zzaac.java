package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzaac implements Comparator {
    static final /* synthetic */ zzaac zza = new zzaac();

    private /* synthetic */ zzaac() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzaab) Collections.max((List) obj)).compareTo((zzaab) Collections.max((List) obj2));
    }
}
