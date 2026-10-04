package androidx.core.util;

import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    public interface a<T> {
        @Nullable
        T a();

        boolean b(@NotNull T t10);
    }

    @V({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static class b<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Object[] f111444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f111445b;

        public b(@e.D(from = 1) int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f111444a = new Object[i10];
        }

        @Override // androidx.core.util.s.a
        @Nullable
        public T a() {
            int i10 = this.f111445b;
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            T t10 = (T) this.f111444a[i11];
            kotlin.jvm.internal.G.n(t10, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.f111444a[i11] = null;
            this.f111445b--;
            return t10;
        }

        @Override // androidx.core.util.s.a
        public boolean b(@NotNull T instance) {
            kotlin.jvm.internal.G.p(instance, "instance");
            if (c(instance)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i10 = this.f111445b;
            Object[] objArr = this.f111444a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = instance;
            this.f111445b = i10 + 1;
            return true;
        }

        public final boolean c(T t10) {
            int i10 = this.f111445b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.f111444a[i11] == t10) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class c<T> extends b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Object f111446c;

        public c(int i10) {
            super(i10);
            this.f111446c = new Object();
        }

        @Override // androidx.core.util.s.b, androidx.core.util.s.a
        @Nullable
        public T a() {
            T t10;
            synchronized (this.f111446c) {
                t10 = (T) super.a();
            }
            return t10;
        }

        @Override // androidx.core.util.s.b, androidx.core.util.s.a
        public boolean b(@NotNull T instance) {
            boolean zB;
            kotlin.jvm.internal.G.p(instance, "instance");
            synchronized (this.f111446c) {
                zB = super.b(instance);
            }
            return zB;
        }
    }
}
