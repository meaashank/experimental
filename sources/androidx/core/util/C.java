package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import e.T;
import md.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class C {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements md.g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Range<T> f111369a;

        public a(Range<T> range) {
            this.f111369a = range;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // md.g
        public Comparable b() {
            return this.f111369a.getLower();
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // md.g
        public boolean contains(Comparable comparable) {
            return g.a.a(this, comparable);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // md.g
        public Comparable h() {
            return this.f111369a.getUpper();
        }

        @Override // md.g
        public boolean isEmpty() {
            return g.a.b(this);
        }
    }

    @T(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> a(@NotNull Range<T> range, @NotNull Range<T> range2) {
        return range.intersect(range2);
    }

    @T(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> b(@NotNull Range<T> range, @NotNull Range<T> range2) {
        return range.extend(range2);
    }

    @T(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> c(@NotNull Range<T> range, @NotNull T t10) {
        return range.extend(t10);
    }

    @T(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> d(@NotNull T t10, @NotNull T t11) {
        return new Range<>(t10, t11);
    }

    @T(21)
    @NotNull
    public static final <T extends Comparable<? super T>> md.g<T> e(@NotNull Range<T> range) {
        return new a(range);
    }

    @T(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> f(@NotNull md.g<T> gVar) {
        return new Range<>(gVar.b(), gVar.h());
    }
}
