package com.inmobi.media;

import android.util.Log;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3666o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static byte f153227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f153228b;

    @dd.o
    public static final void a(byte b10, @NotNull String tag, @Nullable String str) {
        kotlin.jvm.internal.G.p(tag, "tag");
        if (f153228b) {
            System.out.println((Object) str);
        }
        if (b10 == 1) {
            byte b11 = f153227a;
            if (2 == b11 || 1 == b11 || 3 == b11) {
                kotlin.jvm.internal.G.m(str);
                Log.e("[InMobi]", str);
                return;
            }
            return;
        }
        if (b10 == 2) {
            byte b12 = f153227a;
            if (2 == b12 || 3 == b12) {
                kotlin.jvm.internal.G.m(str);
                Log.d("[InMobi]", str);
                return;
            }
            return;
        }
        if (b10 == 3) {
            kotlin.jvm.internal.G.m(str);
            if (str.length() > 4000) {
                b(tag, str);
            } else {
                Log.d(tag, str);
            }
        }
    }

    public static void b(String str, String str2) {
        if (str2.length() <= 4000) {
            Log.d(str, str2);
            return;
        }
        String strSubstring = str2.substring(0, 4000);
        kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        Log.d(str, strSubstring);
        String strSubstring2 = str2.substring(4000);
        kotlin.jvm.internal.G.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
        b(str, strSubstring2);
    }

    @dd.o
    public static final void a(@NotNull String tag, @Nullable String str) {
        kotlin.jvm.internal.G.p(tag, "tag");
        a((byte) 3, tag, str);
    }

    @dd.o
    public static final void a(@Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        a((byte) 3, str, str2, th);
    }

    @dd.o
    public static final void a(byte b10, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        if (f153228b) {
            System.out.println((Object) str2);
        }
        if (b10 == 1) {
            byte b11 = f153227a;
            if (2 == b11 || 1 == b11 || 3 == b11) {
                Log.e("[InMobi]", str2, th);
                return;
            }
            return;
        }
        if (b10 != 2) {
            if (b10 == 3) {
                Log.d(str, str2, th);
            }
        } else {
            byte b12 = f153227a;
            if (2 == b12 || 3 == b12) {
                Log.d("[InMobi]", str2, th);
            }
        }
    }

    @dd.o
    public static final void a(byte b10) {
        f153227a = b10;
    }

    @dd.o
    @e.f0(otherwise = 5)
    public static final void a(boolean z10) {
        f153228b = z10;
    }
}
