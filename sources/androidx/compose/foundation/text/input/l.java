package androidx.compose.foundation.text.input;

import androidx.collection.C1550p;
import androidx.compose.foundation.text.input.internal.e1;
import androidx.compose.ui.text.Z;
import androidx.compose.ui.text.a0;
import kotlin.Pair;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class l implements CharSequence {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f94357e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CharSequence f94358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Z f94360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Pair<q, Z> f94361d;

    public /* synthetic */ l(CharSequence charSequence, long j10, Z z10, Pair pair, C4969v c4969v) {
        this(charSequence, j10, z10, pair);
    }

    public final boolean a(@NotNull CharSequence charSequence) {
        return F.Q1(this.f94358a, charSequence);
    }

    public char b(int i10) {
        return this.f94358a.charAt(i10);
    }

    @Nullable
    public final Z c() {
        return this.f94360c;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f94358a.charAt(i10);
    }

    @Nullable
    public final Pair<q, Z> d() {
        return this.f94361d;
    }

    public int e() {
        return this.f94358a.length();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (Z.g(this.f94359b, lVar.f94359b) && G.g(this.f94360c, lVar.f94360c) && G.g(this.f94361d, lVar.f94361d)) {
            return F.Q1(this.f94358a, lVar.f94358a);
        }
        return false;
    }

    public final long f() {
        return this.f94359b;
    }

    @NotNull
    public final CharSequence g() {
        return this.f94358a;
    }

    public final boolean h() {
        return this.f94361d == null;
    }

    public int hashCode() {
        int iO = (Z.o(this.f94359b) + (this.f94358a.hashCode() * 31)) * 31;
        Z z10 = this.f94360c;
        int iA = (iO + (z10 != null ? C1550p.a(z10.f104408a) : 0)) * 31;
        Pair<q, Z> pair = this.f94361d;
        return iA + (pair != null ? pair.hashCode() : 0);
    }

    public final void i(@NotNull char[] cArr, int i10, int i11, int i12) {
        e1.a(this.f94358a, cArr, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f94358a.length();
    }

    @Override // java.lang.CharSequence
    @NotNull
    public CharSequence subSequence(int i10, int i11) {
        return this.f94358a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return this.f94358a.toString();
    }

    public l(CharSequence charSequence, long j10, Z z10, Pair<q, Z> pair) {
        this.f94358a = charSequence instanceof l ? ((l) charSequence).f94358a : charSequence;
        this.f94359b = a0.c(j10, 0, charSequence.length());
        this.f94360c = z10 != null ? new Z(a0.c(z10.f104408a, 0, charSequence.length())) : null;
        this.f94361d = pair != null ? Pair.i(pair, null, new Z(a0.c(pair.f217468b.f104408a, 0, charSequence.length())), 1, null) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(CharSequence charSequence, long j10, Z z10, Pair pair, int i10, C4969v c4969v) {
        charSequence = (i10 & 1) != 0 ? "" : charSequence;
        if ((i10 & 2) != 0) {
            Z.f104406b.getClass();
            j10 = Z.f104407c;
        }
        this(charSequence, j10, (i10 & 4) != 0 ? null : z10, (i10 & 8) != 0 ? null : pair);
    }
}
