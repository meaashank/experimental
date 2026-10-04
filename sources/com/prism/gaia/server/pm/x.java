package com.prism.gaia.server.pm;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.toLowerCase().endsWith(".apk");
    }
}
