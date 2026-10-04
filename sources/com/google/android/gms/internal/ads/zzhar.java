package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzhar {
    public static final FileOutputStream zza(File file, zzgxw zzgxwVar, zzhai zzhaiVar) throws IOException {
        return new FileOutputStream(file, zzgxwVar.contains(zzhaq.APPEND));
    }
}
