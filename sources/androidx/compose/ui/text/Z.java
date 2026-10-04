package androidx.compose.ui.text;

import androidx.activity.C1477d;
import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n107#2:130\n114#2:131\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n48#1:130\n50#1:131\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104406b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f104407c = a0.b(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f104408a;

    public static final class a {
        public a() {
        }

        public final long a() {
            return Z.f104407c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ Z(long j10) {
        this.f104408a = j10;
    }

    public static final /* synthetic */ Z b(long j10) {
        return new Z(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static final boolean d(long j10, long j11) {
        return l(j10) <= l(j11) && k(j11) <= k(j10);
    }

    public static final boolean e(long j10, int i10) {
        return i10 < k(j10) && l(j10) <= i10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof Z) && j10 == ((Z) obj).f104408a;
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean h(long j10) {
        return ((int) (j10 >> 32)) == ((int) (j10 & ZipKt.f225990j));
    }

    public static final int i(long j10) {
        return (int) (j10 & ZipKt.f225990j);
    }

    public static final int j(long j10) {
        return k(j10) - l(j10);
    }

    public static final int k(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & ZipKt.f225990j);
        return i10 > i11 ? i10 : i11;
    }

    public static final int l(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & ZipKt.f225990j);
        return i10 > i11 ? i11 : i10;
    }

    public static final boolean m(long j10) {
        return ((int) (j10 >> 32)) > ((int) (j10 & ZipKt.f225990j));
    }

    public static final int n(long j10) {
        return (int) (j10 >> 32);
    }

    public static int o(long j10) {
        return C1550p.a(j10);
    }

    public static final boolean p(long j10, long j11) {
        return l(j10) < k(j11) && l(j11) < k(j10);
    }

    @NotNull
    public static String q(long j10) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j10 >> 32));
        sb2.append(U6.j.f68738d);
        return C1477d.a(sb2, (int) (j10 & ZipKt.f225990j), ')');
    }

    public boolean equals(Object obj) {
        return f(this.f104408a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f104408a);
    }

    public final /* synthetic */ long r() {
        return this.f104408a;
    }

    @NotNull
    public String toString() {
        return q(this.f104408a);
    }
}
