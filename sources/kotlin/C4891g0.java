package kotlin;

import ed.InterfaceC4376a;

/* JADX INFO: renamed from: kotlin.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C4891g0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Xc.f
    public static final Void a() {
        throw new NotImplementedError(null, 1, 0 == true ? 1 : 0);
    }

    @Xc.f
    public static final Void b(String reason) {
        kotlin.jvm.internal.G.p(reason, "reason");
        throw new NotImplementedError("An operation is not implemented: ".concat(reason));
    }

    @InterfaceC4887e0(version = "1.1")
    @C
    @Xc.f
    public static final <T> T c(T t10, ed.l<? super T, L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        block.invoke(t10);
        return t10;
    }

    @C
    @Xc.f
    public static final <T> T d(T t10, ed.l<? super T, L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        block.invoke(t10);
        return t10;
    }

    @C
    @Xc.f
    public static final <T, R> R e(T t10, ed.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.G.p(block, "block");
        return block.invoke(t10);
    }

    @Xc.f
    public static final void f(int i10, ed.l<? super Integer, L0> action) {
        kotlin.jvm.internal.G.p(action, "action");
        for (int i11 = 0; i11 < i10; i11++) {
            action.invoke(Integer.valueOf(i11));
        }
    }

    @C
    @Xc.f
    public static final <R> R g(InterfaceC4376a<? extends R> block) {
        kotlin.jvm.internal.G.p(block, "block");
        return block.invoke();
    }

    @C
    @Xc.f
    public static final <T, R> R h(T t10, ed.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.G.p(block, "block");
        return block.invoke(t10);
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <T> T i(T t10, ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        if (predicate.invoke(t10).booleanValue()) {
            return t10;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final <T> T j(T t10, ed.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        if (predicate.invoke(t10).booleanValue()) {
            return null;
        }
        return t10;
    }

    @C
    @Xc.f
    public static final <T, R> R k(T t10, ed.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.G.p(block, "block");
        return block.invoke(t10);
    }
}
