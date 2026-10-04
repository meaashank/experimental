package com.prism.lib.pfs.file;

import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((PrivateFile) obj).getName().compareTo(((PrivateFile) obj2).getName());
    }
}
