package com.google.android.gms.internal.ads;

import com.bumptech.glide.load.engine.GlideException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzicm {
    public static final zzicm zza = new zzicm("", "", false);
    private final String zzb;
    private final String zzc;
    private final boolean zzd;

    static {
        new zzicm("\n", GlideException.a.f139488d, true);
    }

    private zzicm(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.zzb = str;
        this.zzc = str2;
        this.zzd = z10;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
