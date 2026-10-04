package com.github.appintro.internal;

import android.util.Log;
import dd.k;
import dd.o;
import kotlin.jvm.internal.G;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class LogHelper {

    @NotNull
    public static final LogHelper INSTANCE = new LogHelper();

    private LogHelper() {
    }

    private final String cutTagLength(String str, int i10) {
        if (str.length() <= i10) {
            return str;
        }
        String strSubstring = str.substring(0, i10 - 1);
        G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @o
    public static final int d(@NotNull String tag, @NotNull String message) {
        G.p(tag, "tag");
        G.p(message, "message");
        return Log.d(tag, message);
    }

    @k
    @o
    public static final void e(@NotNull String tag, @NotNull String message) {
        G.p(tag, "tag");
        G.p(message, "message");
        e$default(tag, message, null, 4, null);
    }

    public static /* synthetic */ void e$default(String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        e(str, str2, th);
    }

    @o
    public static final int i(@NotNull String tag, @NotNull String message) {
        G.p(tag, "tag");
        G.p(message, "message");
        return Log.i(tag, message);
    }

    @o
    @NotNull
    public static final String makeLogTag(@NotNull Class<?> cls) {
        G.p(cls, "cls");
        return G.C("Log: ", INSTANCE.cutTagLength(cls.getSimpleName(), 18));
    }

    @o
    public static final int v(@NotNull String tag, @NotNull String message) {
        G.p(tag, "tag");
        G.p(message, "message");
        return Log.v(tag, message);
    }

    @k
    @o
    public static final void w(@NotNull String tag, @NotNull String message) {
        G.p(tag, "tag");
        G.p(message, "message");
        w$default(tag, message, null, 4, null);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        w(str, str2, th);
    }

    @k
    @o
    public static final void wtf(@NotNull String tag, @NotNull String message) {
        G.p(tag, "tag");
        G.p(message, "message");
        wtf$default(tag, message, null, 4, null);
    }

    public static /* synthetic */ void wtf$default(String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        wtf(str, str2, th);
    }

    @k
    @o
    public static final void e(@NotNull String tag, @NotNull String message, @Nullable Throwable th) {
        G.p(tag, "tag");
        G.p(message, "message");
        Log.e(tag, message, th);
    }

    @k
    @o
    public static final void w(@NotNull String tag, @NotNull String message, @Nullable Throwable th) {
        G.p(tag, "tag");
        G.p(message, "message");
        Log.w(tag, message, th);
    }

    @k
    @o
    public static final void wtf(@NotNull String tag, @NotNull String message, @Nullable Throwable th) {
        G.p(tag, "tag");
        G.p(message, "message");
        Log.wtf(tag, message, th);
    }

    @NotNull
    public final String makeLogTag(@NotNull d<?> cls) {
        G.p(cls, "cls");
        String strQ = cls.Q();
        if (strQ == null) {
            strQ = "";
        }
        return G.C("Log: ", cutTagLength(strQ, 18));
    }
}
