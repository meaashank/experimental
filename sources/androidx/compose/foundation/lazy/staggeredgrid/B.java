package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f91916c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f91915b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final B f91917d = new B(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final B f91918e = new B(1);

    public static final class a {
        public a() {
        }

        @NotNull
        public final B a() {
            return B.f91917d;
        }

        @NotNull
        public final B b() {
            return B.f91918e;
        }

        public a(C4969v c4969v) {
        }
    }

    public B(int i10) {
        this.f91919a = i10;
    }

    public final int c() {
        return this.f91919a;
    }
}
