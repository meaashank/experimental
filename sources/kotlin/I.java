package kotlin;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class I {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f217459a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f217459a = iArr;
        }
    }

    @NotNull
    public static <T> G<T> a(@NotNull InterfaceC4376a<? extends T> initializer) {
        kotlin.jvm.internal.G.p(initializer, "initializer");
        C4969v c4969v = null;
        return new SynchronizedLazyImpl(initializer, c4969v, 2, c4969v);
    }

    @NotNull
    public static final <T> G<T> b(@Nullable Object obj, @NotNull InterfaceC4376a<? extends T> initializer) {
        kotlin.jvm.internal.G.p(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer, obj);
    }

    @NotNull
    public static <T> G<T> c(@NotNull LazyThreadSafetyMode mode, @NotNull InterfaceC4376a<? extends T> initializer) {
        kotlin.jvm.internal.G.p(mode, "mode");
        kotlin.jvm.internal.G.p(initializer, "initializer");
        int i10 = a.f217459a[mode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            C4969v c4969v = null;
            return new SynchronizedLazyImpl(initializer, c4969v, i11, c4969v);
        }
        if (i10 == 2) {
            return new SafePublicationLazyImpl(initializer);
        }
        if (i10 == 3) {
            return new UnsafeLazyImpl(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }
}
