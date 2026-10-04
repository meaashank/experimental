package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.N;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@dd.h
public final class O<S extends N<S>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f220302a;

    public /* synthetic */ O(Object obj) {
        this.f220302a = obj;
    }

    public static final /* synthetic */ O a(Object obj) {
        return new O(obj);
    }

    @NotNull
    public static <S extends N<S>> Object b(@Nullable Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof O) && kotlin.jvm.internal.G.g(obj, ((O) obj2).f220302a);
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.G.g(obj, obj2);
    }

    public static /* synthetic */ void e() {
    }

    @NotNull
    public static final S f(Object obj) {
        if (obj == C5072f.f220339b) {
            throw new IllegalStateException("Does not contain segment");
        }
        kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj == C5072f.f220339b;
    }

    public static String i(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f220302a, obj);
    }

    public int hashCode() {
        return g(this.f220302a);
    }

    public final /* synthetic */ Object j() {
        return this.f220302a;
    }

    public String toString() {
        return i(this.f220302a);
    }
}
