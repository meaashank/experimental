package kotlin.text;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.text.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5020l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f218360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final md.l f218361b;

    public C5020l(@NotNull String value, @NotNull md.l range) {
        kotlin.jvm.internal.G.p(value, "value");
        kotlin.jvm.internal.G.p(range, "range");
        this.f218360a = value;
        this.f218361b = range;
    }

    public static /* synthetic */ C5020l d(C5020l c5020l, String str, md.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c5020l.f218360a;
        }
        if ((i10 & 2) != 0) {
            lVar = c5020l.f218361b;
        }
        return c5020l.c(str, lVar);
    }

    @NotNull
    public final String a() {
        return this.f218360a;
    }

    @NotNull
    public final md.l b() {
        return this.f218361b;
    }

    @NotNull
    public final C5020l c(@NotNull String value, @NotNull md.l range) {
        kotlin.jvm.internal.G.p(value, "value");
        kotlin.jvm.internal.G.p(range, "range");
        return new C5020l(value, range);
    }

    @NotNull
    public final md.l e() {
        return this.f218361b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5020l)) {
            return false;
        }
        C5020l c5020l = (C5020l) obj;
        return kotlin.jvm.internal.G.g(this.f218360a, c5020l.f218360a) && kotlin.jvm.internal.G.g(this.f218361b, c5020l.f218361b);
    }

    @NotNull
    public final String f() {
        return this.f218360a;
    }

    public int hashCode() {
        return this.f218361b.hashCode() + (this.f218360a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MatchGroup(value=" + this.f218360a + ", range=" + this.f218361b + ')';
    }
}
