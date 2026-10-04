package androidx.collection;

import kotlin.InterfaceC4850b0;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.collection.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloatFloatPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,85:1\n48#1:93\n54#1:95\n24#2,3:86\n22#3:89\n22#3:90\n22#3:91\n22#3:92\n22#3:94\n*S KotlinDebug\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n*L\n83#1:93\n83#1:95\n42#1:86,3\n48#1:89\n54#1:90\n67#1:91\n81#1:92\n83#1:94\n*E\n"})
@dd.h
public final class C1552q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    public final long f86986a;

    public /* synthetic */ C1552q(long j10) {
        this.f86986a = j10;
    }

    public static final /* synthetic */ C1552q a(long j10) {
        return new C1552q(j10);
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
    }

    public static long d(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof C1552q) && j10 == ((C1552q) obj).f86986a;
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @InterfaceC4850b0
    public static /* synthetic */ void i() {
    }

    public static final float j(long j10) {
        return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
    }

    public static int k(long j10) {
        return C1550p.a(j10);
    }

    @NotNull
    public static String l(long j10) {
        return "(" + Float.intBitsToFloat((int) (j10 >> 32)) + U6.j.f68738d + Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f86986a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f86986a);
    }

    public final /* synthetic */ long m() {
        return this.f86986a;
    }

    @NotNull
    public String toString() {
        return l(this.f86986a);
    }
}
