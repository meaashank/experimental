package com.google.android.gms.internal.play_billing;

import android.support.v4.media.i;

/* JADX INFO: loaded from: classes4.dex */
final class zzbt {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(i.a("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
