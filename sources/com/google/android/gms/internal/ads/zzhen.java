package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhen {
    private final OutputStream zza;

    private zzhen(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzhen zzb(OutputStream outputStream) {
        return new zzhen(outputStream);
    }

    public final void zza(zzhuc zzhucVar) throws IOException {
        try {
            zzhucVar.zzaO(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
