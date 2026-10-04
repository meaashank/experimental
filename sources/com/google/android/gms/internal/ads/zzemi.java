package com.google.android.gms.internal.ads;

import com.google.firebase.ktx.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public enum zzemi {
    BEGIN_TO_RENDER("beginToRender"),
    DEFINED_BY_JAVASCRIPT("definedByJavascript"),
    ONE_PIXEL("onePixel"),
    UNSPECIFIED(BuildConfig.VERSION_NAME);

    private final String zze;

    zzemi(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
