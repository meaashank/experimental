package androidx.compose.foundation.text.modifiers;

import androidx.collection.C1550p;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nInlineDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,51:1\n63#2,3:52\n72#2:55\n86#2:57\n22#3:56\n22#3:58\n*S KotlinDebug\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n*L\n33#1:52,3\n38#1:55\n41#1:57\n38#1:56\n41#1:58\n*E\n"})
@dd.h
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0219a f94502b = new C0219a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f94503c = c(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94504a;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.a$a, reason: collision with other inner class name */
    public static final class C0219a {
        public C0219a() {
        }

        public final long a() {
            return a.f94503c;
        }

        public C0219a(C4969v c4969v) {
        }
    }

    public /* synthetic */ a(long j10) {
        this.f94504a = j10;
    }

    public static final /* synthetic */ a b(long j10) {
        return new a(j10);
    }

    public static long c(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static long d(long j10) {
        return j10;
    }

    public static long e(@NotNull InterfaceC4814e interfaceC4814e) {
        return c(interfaceC4814e.a(), interfaceC4814e.m0());
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).f94504a;
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float i(long j10) {
        return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
    }

    public static int j(long j10) {
        return C1550p.a(j10);
    }

    @NotNull
    public static String k(long j10) {
        return "InlineDensity(density=" + h(j10) + ", fontScale=" + i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f94504a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f94504a);
    }

    public final /* synthetic */ long l() {
        return this.f94504a;
    }

    @NotNull
    public String toString() {
        return k(this.f94504a);
    }
}
