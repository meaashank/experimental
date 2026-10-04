package com.prism.lib.pfs.file;

import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((PrivateFile) obj2).getName().compareTo(((PrivateFile) obj).getName());
    }
}
