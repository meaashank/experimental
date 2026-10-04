package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class zzhas extends zzhaj {
    private final File zza;

    public final String toString() {
        String string = this.zza.toString();
        return androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 20), "Files.asByteSource(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final /* bridge */ /* synthetic */ InputStream zza() throws IOException {
        return new FileInputStream(this.zza);
    }
}
