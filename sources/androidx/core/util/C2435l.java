package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import e.T;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.core.util.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n1#1,57:1\n42#1:58\n*S KotlinDebug\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n49#1:58\n*E\n"})
@SuppressLint({"ClassVerificationFailure"})
public final class C2435l {
    @T(26)
    @NotNull
    public static final Half a(double d10) {
        return Half.valueOf((float) d10);
    }

    @T(26)
    @NotNull
    public static final Half b(float f10) {
        return Half.valueOf(f10);
    }

    @T(26)
    @NotNull
    public static final Half c(@NotNull String str) {
        return Half.valueOf(str);
    }

    @T(26)
    @NotNull
    public static final Half d(short s10) {
        return Half.valueOf(s10);
    }
}
