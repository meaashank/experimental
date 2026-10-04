package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @Nullable
    public final Object f218702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public final ed.l<Throwable, kotlin.L0> f218703b;

    /* JADX WARN: Multi-variable type inference failed */
    public C(@Nullable Object obj, @NotNull ed.l<? super Throwable, kotlin.L0> lVar) {
        this.f218702a = obj;
        this.f218703b = lVar;
    }

    public static C d(C c10, Object obj, ed.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = c10.f218702a;
        }
        if ((i10 & 2) != 0) {
            lVar = c10.f218703b;
        }
        c10.getClass();
        return new C(obj, lVar);
    }

    @Nullable
    public final Object a() {
        return this.f218702a;
    }

    @NotNull
    public final ed.l<Throwable, kotlin.L0> b() {
        return this.f218703b;
    }

    @NotNull
    public final C c(@Nullable Object obj, @NotNull ed.l<? super Throwable, kotlin.L0> lVar) {
        return new C(obj, lVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return kotlin.jvm.internal.G.g(this.f218702a, c10.f218702a) && kotlin.jvm.internal.G.g(this.f218703b, c10.f218703b);
    }

    public int hashCode() {
        Object obj = this.f218702a;
        return this.f218703b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f218702a + ", onCancellation=" + this.f218703b + ')';
    }
}
