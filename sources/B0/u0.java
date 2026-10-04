package b0;

import androidx.collection.C1550p;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n+ 2 InlineClassUtils.android.kt\nandroidx/compose/ui/text/android/InlineClassUtils_androidKt\n*L\n1#1,1155:1\n32#2:1156\n39#2:1157\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n*L\n992#1:1156\n995#1:1157\n*E\n"})
@dd.h
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f120707a;

    public /* synthetic */ u0(long j10) {
        this.f120707a = j10;
    }

    public static final /* synthetic */ u0 a(long j10) {
        return new u0(j10);
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof u0) && j10 == ((u0) obj).f120707a;
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static final int e(long j10) {
        return (int) (j10 & ZipKt.f225990j);
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static int g(long j10) {
        return C1550p.a(j10);
    }

    public static String h(long j10) {
        return "VerticalPaddings(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f120707a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f120707a);
    }

    public final /* synthetic */ long i() {
        return this.f120707a;
    }

    public String toString() {
        return h(this.f120707a);
    }

    public static long b(long j10) {
        return j10;
    }
}
