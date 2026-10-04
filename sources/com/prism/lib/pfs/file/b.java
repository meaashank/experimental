package com.prism.lib.pfs.file;

import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((PrivateFile) obj).lastModified(), ((PrivateFile) obj2).lastModified());
    }
}
