package androidx.compose.foundation.lazy.layout;

import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.L
public interface InterfaceC1730d<T> {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d$a */
    @V({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f91814d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f91816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f91817c;

        public a(int i10, int i11, T t10) {
            this.f91815a = i10;
            this.f91816b = i11;
            this.f91817c = t10;
            if (i10 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.c.a("startIndex should be >= 0, but was ", i10).toString());
            }
            if (i11 <= 0) {
                throw new IllegalArgumentException(android.support.v4.media.c.a("size should be >0, but was ", i11).toString());
            }
        }

        public final int a() {
            return this.f91816b;
        }

        public final int b() {
            return this.f91815a;
        }

        public final T c() {
            return this.f91817c;
        }
    }

    void a(int i10, int i11, @NotNull ed.l<? super a<? extends T>, L0> lVar);

    @NotNull
    a<T> get(int i10);

    int getSize();
}
