package org.apache.http.util;

import androidx.compose.runtime.changelist.j;

/* JADX INFO: loaded from: classes6.dex */
public class Asserts {
    public static void check(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static void notBlank(CharSequence charSequence, String str) {
        if (TextUtils.isBlank(charSequence)) {
            throw new IllegalStateException(j.a(str, " is blank"));
        }
    }

    public static void notEmpty(CharSequence charSequence, String str) {
        if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalStateException(j.a(str, " is empty"));
        }
    }

    public static void notNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(j.a(str, " is null"));
        }
    }

    public static void check(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void check(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, obj));
        }
    }
}
