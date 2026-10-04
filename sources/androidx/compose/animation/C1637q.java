package androidx.compose.animation;

import androidx.compose.ui.layout.InterfaceC2171i;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C1637q extends c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f88274d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f88275e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC2171i f88276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.c f88277c;

    /* JADX INFO: renamed from: androidx.compose.animation.q$a */
    public static final class a implements d0<C1637q> {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public C1637q(@NotNull InterfaceC2171i interfaceC2171i, @NotNull androidx.compose.ui.c cVar) {
        this.f88276b = interfaceC2171i;
        this.f88277c = cVar;
    }

    public static C1637q e(C1637q c1637q, InterfaceC2171i interfaceC2171i, androidx.compose.ui.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC2171i = c1637q.f88276b;
        }
        if ((i10 & 2) != 0) {
            cVar = c1637q.f88277c;
        }
        c1637q.getClass();
        return new C1637q(interfaceC2171i, cVar);
    }

    @Override // androidx.compose.animation.c0
    @NotNull
    public d0<?> a() {
        return f88274d;
    }

    @NotNull
    public final InterfaceC2171i b() {
        return this.f88276b;
    }

    @NotNull
    public final androidx.compose.ui.c c() {
        return this.f88277c;
    }

    @NotNull
    public final C1637q d(@NotNull InterfaceC2171i interfaceC2171i, @NotNull androidx.compose.ui.c cVar) {
        return new C1637q(interfaceC2171i, cVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1637q)) {
            return false;
        }
        C1637q c1637q = (C1637q) obj;
        return kotlin.jvm.internal.G.g(this.f88276b, c1637q.f88276b) && kotlin.jvm.internal.G.g(this.f88277c, c1637q.f88277c);
    }

    @NotNull
    public final androidx.compose.ui.c f() {
        return this.f88277c;
    }

    @NotNull
    public final InterfaceC2171i g() {
        return this.f88276b;
    }

    public int hashCode() {
        return this.f88277c.hashCode() + (this.f88276b.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ContentScaleTransitionEffect(contentScale=" + this.f88276b + ", alignment=" + this.f88277c + ')';
    }
}
