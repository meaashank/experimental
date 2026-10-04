package com.prism.gaia.client.stub;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.toLowerCase(Locale.ROOT).endsWith(".apk");
    }
}
