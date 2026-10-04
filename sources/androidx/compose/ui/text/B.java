package androidx.compose.ui.text;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
public final class B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104214d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f104215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f104216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f104217c;

    public /* synthetic */ B(long j10, long j11, int i10, C4969v c4969v) {
        this(j10, j11, i10);
    }

    public static B b(B b10, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = b10.f104215a;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = b10.f104216b;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            i10 = b10.f104217c;
        }
        b10.getClass();
        return new B(j12, j13, i10);
    }

    @NotNull
    public final B a(long j10, long j11, int i10) {
        return new B(j10, j11, i10);
    }

    public final long c() {
        return this.f104216b;
    }

    public final int d() {
        return this.f104217c;
    }

    public final long e() {
        return this.f104215a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return k0.B.j(this.f104215a, b10.f104215a) && k0.B.j(this.f104216b, b10.f104216b) && this.f104217c == b10.f104217c;
    }

    public int hashCode() {
        return ((C1550p.a(this.f104216b) + (k0.B.o(this.f104215a) * 31)) * 31) + this.f104217c;
    }

    @NotNull
    public String toString() {
        return "Placeholder(width=" + ((Object) k0.B.u(this.f104215a)) + ", height=" + ((Object) k0.B.u(this.f104216b)) + ", placeholderVerticalAlign=" + ((Object) C.m(this.f104217c)) + ')';
    }

    public B(long j10, long j11, int i10) {
        this.f104215a = j10;
        this.f104216b = j11;
        this.f104217c = i10;
        if (k0.C.s(j10)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (k0.C.s(j11)) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }
}
