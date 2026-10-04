package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgcd implements androidx.datastore.core.i {

    @NotNull
    public static final zzgcd zza = new zzgcd();

    @NotNull
    private static final zzgca zzb;

    static {
        zzgca zzgcaVarZzd = zzgca.zzd();
        kotlin.jvm.internal.G.o(zzgcaVarZzd, "getDefaultInstance(...)");
        zzb = zzgcaVarZzd;
    }

    private zzgcd() {
    }

    @Override // androidx.datastore.core.i
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.i
    @Nullable
    public final Object readFrom(@NotNull InputStream inputStream, @NotNull kotlin.coroutines.e eVar) {
        try {
            zzgca zzgcaVarZzc = zzgca.zzc(inputStream);
            kotlin.jvm.internal.G.m(zzgcaVarZzc);
            return zzgcaVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.i
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, kotlin.coroutines.e eVar) throws IOException {
        ((zzgca) obj).zzaO(outputStream);
        return kotlin.L0.f217464a;
    }
}
