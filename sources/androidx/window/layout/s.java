package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.layout.r;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f120165d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.window.core.b f120166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f120167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final r.c f120168c;

    public static final class a {
        public a() {
        }

        public final void a(@NotNull androidx.window.core.b bounds) {
            kotlin.jvm.internal.G.p(bounds, "bounds");
            if (bounds.f() == 0 && bounds.b() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bounds.f120066a != 0 && bounds.f120067b != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f120169b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f120170c = new b("FOLD");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final b f120171d = new b("HINGE");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f120172a;

        public static final class a {
            public a() {
            }

            @NotNull
            public final b a() {
                return b.f120170c;
            }

            @NotNull
            public final b b() {
                return b.f120171d;
            }

            public a(C4969v c4969v) {
            }
        }

        public b(String str) {
            this.f120172a = str;
        }

        @NotNull
        public String toString() {
            return this.f120172a;
        }
    }

    public s(@NotNull androidx.window.core.b featureBounds, @NotNull b type, @NotNull r.c state) {
        kotlin.jvm.internal.G.p(featureBounds, "featureBounds");
        kotlin.jvm.internal.G.p(type, "type");
        kotlin.jvm.internal.G.p(state, "state");
        this.f120166a = featureBounds;
        this.f120167b = type;
        this.f120168c = state;
        f120165d.a(featureBounds);
    }

    @Override // androidx.window.layout.r
    @NotNull
    public r.b a() {
        return this.f120166a.f() > this.f120166a.b() ? r.b.f120159d : r.b.f120158c;
    }

    @Override // androidx.window.layout.r
    public boolean b() {
        b bVar = this.f120167b;
        b.a aVar = b.f120169b;
        aVar.getClass();
        if (kotlin.jvm.internal.G.g(bVar, b.f120171d)) {
            return true;
        }
        b bVar2 = this.f120167b;
        aVar.getClass();
        return kotlin.jvm.internal.G.g(bVar2, b.f120170c) && kotlin.jvm.internal.G.g(this.f120168c, r.c.f120163d);
    }

    @Override // androidx.window.layout.r
    @NotNull
    public r.a c() {
        return (this.f120166a.f() == 0 || this.f120166a.b() == 0) ? r.a.f120154c : r.a.f120155d;
    }

    @NotNull
    public final b d() {
        return this.f120167b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!s.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.G.g(this.f120166a, sVar.f120166a) && kotlin.jvm.internal.G.g(this.f120167b, sVar.f120167b) && kotlin.jvm.internal.G.g(this.f120168c, sVar.f120168c);
    }

    @Override // androidx.window.layout.m
    @NotNull
    public Rect getBounds() {
        return this.f120166a.i();
    }

    @Override // androidx.window.layout.r
    @NotNull
    public r.c getState() {
        return this.f120168c;
    }

    public int hashCode() {
        return this.f120168c.hashCode() + ((this.f120167b.hashCode() + (this.f120166a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return ((Object) s.class.getSimpleName()) + " { " + this.f120166a + ", type=" + this.f120167b + ", state=" + this.f120168c + " }";
    }
}
