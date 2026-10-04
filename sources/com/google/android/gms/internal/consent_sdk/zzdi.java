package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdi {
    public static final CharSequence zza(Object obj, String str) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
