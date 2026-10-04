package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgcc {

    @NotNull
    private final zzgby zza;

    @InterfaceC4850b0
    public final /* synthetic */ zzgca zza() {
        zzifm zzifmVarZzbu = this.zza.zzbu();
        kotlin.jvm.internal.G.o(zzifmVarZzbu, "build(...)");
        return (zzgca) zzifmVarZzbu;
    }

    @dd.j(name = "getQueryIdToAdQualityDataMapMap")
    public final /* synthetic */ zziiq zzb() {
        Map mapZzb = this.zza.zzb();
        kotlin.jvm.internal.G.o(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziiq(mapZzb);
    }

    @dd.j(name = "putQueryIdToAdQualityDataMap")
    public final void zzc(@NotNull zziiq zziiqVar, @NotNull String key, @NotNull zzgbw value) {
        kotlin.jvm.internal.G.p(zziiqVar, "<this>");
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(value, "value");
        this.zza.zzc(key, value);
    }

    @dd.j(name = "removeQueryIdToAdQualityDataMap")
    public final /* synthetic */ void zzd(zziiq zziiqVar, String key) {
        kotlin.jvm.internal.G.p(zziiqVar, "<this>");
        kotlin.jvm.internal.G.p(key, "key");
        this.zza.zza(key);
    }
}
