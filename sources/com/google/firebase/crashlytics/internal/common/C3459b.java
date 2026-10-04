package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3459b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
    }
}
