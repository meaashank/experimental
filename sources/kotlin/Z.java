package kotlin;

import ed.InterfaceC4376a;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1#2:151\n*E\n"})
public class Z extends Y {
    @Xc.f
    public static final void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Xc.f
    public static final void d(boolean z10, InterfaceC4376a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.G.p(lazyMessage, "lazyMessage");
        if (!z10) {
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }
    }

    @C
    @Xc.f
    public static final <T> T e(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @C
    @Xc.f
    public static final <T> T f(T t10, InterfaceC4376a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.G.p(lazyMessage, "lazyMessage");
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(lazyMessage.invoke().toString());
    }

    @Xc.f
    public static final Void g(Object message) {
        kotlin.jvm.internal.G.p(message, "message");
        throw new IllegalStateException(message.toString());
    }

    @Xc.f
    public static final void h(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Xc.f
    public static final void i(boolean z10, InterfaceC4376a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.G.p(lazyMessage, "lazyMessage");
        if (!z10) {
            throw new IllegalArgumentException(lazyMessage.invoke().toString());
        }
    }

    @C
    @Xc.f
    public static final <T> T j(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @C
    @Xc.f
    public static final <T> T k(T t10, InterfaceC4376a<? extends Object> lazyMessage) {
        kotlin.jvm.internal.G.p(lazyMessage, "lazyMessage");
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(lazyMessage.invoke().toString());
    }
}
