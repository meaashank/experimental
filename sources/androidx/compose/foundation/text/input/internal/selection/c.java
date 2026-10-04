package androidx.compose.foundation.text.input.internal.selection;

import androidx.collection.C1550p;
import androidx.compose.animation.C1635o;
import androidx.compose.animation.C1636p;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f94326e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f94327f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final c f94328g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f94329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ResolvedTextDirection f94331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f94332d;

    public static final class a {
        public a() {
        }

        @NotNull
        public final c a() {
            return c.f94328g;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        P.g.f65503b.getClass();
        f94328g = new c(false, P.g.f65506e, ResolvedTextDirection.Ltr, false);
    }

    public /* synthetic */ c(boolean z10, long j10, ResolvedTextDirection resolvedTextDirection, boolean z11, C4969v c4969v) {
        this(z10, j10, resolvedTextDirection, z11);
    }

    public static c g(c cVar, boolean z10, long j10, ResolvedTextDirection resolvedTextDirection, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = cVar.f94329a;
        }
        if ((i10 & 2) != 0) {
            j10 = cVar.f94330b;
        }
        if ((i10 & 4) != 0) {
            resolvedTextDirection = cVar.f94331c;
        }
        if ((i10 & 8) != 0) {
            z11 = cVar.f94332d;
        }
        cVar.getClass();
        ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
        return new c(z10, j10, resolvedTextDirection2, z11);
    }

    public final boolean b() {
        return this.f94329a;
    }

    public final long c() {
        return this.f94330b;
    }

    @NotNull
    public final ResolvedTextDirection d() {
        return this.f94331c;
    }

    public final boolean e() {
        return this.f94332d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f94329a == cVar.f94329a && P.g.l(this.f94330b, cVar.f94330b) && this.f94331c == cVar.f94331c && this.f94332d == cVar.f94332d;
    }

    @NotNull
    public final c f(boolean z10, long j10, @NotNull ResolvedTextDirection resolvedTextDirection, boolean z11) {
        return new c(z10, j10, resolvedTextDirection, z11);
    }

    @NotNull
    public final ResolvedTextDirection h() {
        return this.f94331c;
    }

    public int hashCode() {
        return C1635o.a(this.f94332d) + ((this.f94331c.hashCode() + ((C1550p.a(this.f94330b) + (C1635o.a(this.f94329a) * 31)) * 31)) * 31);
    }

    public final boolean i() {
        return this.f94332d;
    }

    public final long j() {
        return this.f94330b;
    }

    public final boolean k() {
        return this.f94329a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TextFieldHandleState(visible=");
        sb2.append(this.f94329a);
        sb2.append(", position=");
        sb2.append((Object) P.g.y(this.f94330b));
        sb2.append(", direction=");
        sb2.append(this.f94331c);
        sb2.append(", handlesCrossed=");
        return C1636p.a(sb2, this.f94332d, ')');
    }

    public c(boolean z10, long j10, ResolvedTextDirection resolvedTextDirection, boolean z11) {
        this.f94329a = z10;
        this.f94330b = j10;
        this.f94331c = resolvedTextDirection;
        this.f94332d = z11;
    }
}
