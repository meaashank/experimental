package kotlin;

import ed.InterfaceC4376a;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
public final class C4885d0 {
    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @NotNull
    public static final Object a(@NotNull Throwable exception) {
        kotlin.jvm.internal.G.p(exception, "exception");
        return new Result.Failure(exception);
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <R, T> R b(Object obj, ed.l<? super T, ? extends R> onSuccess, ed.l<? super Throwable, ? extends R> onFailure) {
        kotlin.jvm.internal.G.p(onSuccess, "onSuccess");
        kotlin.jvm.internal.G.p(onFailure, "onFailure");
        Throwable thE = Result.e(obj);
        return thE == null ? onSuccess.invoke(obj) : onFailure.invoke(thE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <R, T extends R> R c(Object obj, R r10) {
        return obj instanceof Result.Failure ? r10 : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <R, T extends R> R d(Object obj, ed.l<? super Throwable, ? extends R> onFailure) {
        kotlin.jvm.internal.G.p(onFailure, "onFailure");
        Throwable thE = Result.e(obj);
        return thE == null ? obj : onFailure.invoke(thE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <T> T e(Object obj) throws Throwable {
        n(obj);
        return obj;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <R, T> Object f(Object obj, ed.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(transform, "transform");
        return !(obj instanceof Result.Failure) ? transform.invoke(obj) : obj;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <R, T> Object g(Object obj, ed.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.G.p(transform, "transform");
        if (obj instanceof Result.Failure) {
            return obj;
        }
        try {
            return transform.invoke(obj);
        } catch (Throwable th) {
            return a(th);
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    public static final <T> Object h(Object obj, ed.l<? super Throwable, L0> action) {
        kotlin.jvm.internal.G.p(action, "action");
        Throwable thE = Result.e(obj);
        if (thE != null) {
            action.invoke(thE);
        }
        return obj;
    }

    @InterfaceC4887e0(version = "1.3")
    @C
    @Xc.f
    public static final <T> Object i(Object obj, ed.l<? super T, L0> action) {
        kotlin.jvm.internal.G.p(action, "action");
        if (!(obj instanceof Result.Failure)) {
            action.invoke(obj);
        }
        return obj;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <R, T extends R> Object j(Object obj, ed.l<? super Throwable, ? extends R> transform) {
        kotlin.jvm.internal.G.p(transform, "transform");
        Throwable thE = Result.e(obj);
        return thE == null ? obj : transform.invoke(thE);
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <R, T extends R> Object k(Object obj, ed.l<? super Throwable, ? extends R> transform) {
        kotlin.jvm.internal.G.p(transform, "transform");
        Throwable thE = Result.e(obj);
        if (thE == null) {
            return obj;
        }
        try {
            return transform.invoke(thE);
        } catch (Throwable th) {
            return a(th);
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <R> Object l(InterfaceC4376a<? extends R> block) {
        kotlin.jvm.internal.G.p(block, "block");
        try {
            return block.invoke();
        } catch (Throwable th) {
            return a(th);
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <T, R> Object m(T t10, ed.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.G.p(block, "block");
        try {
            return block.invoke(t10);
        } catch (Throwable th) {
            return a(th);
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    public static final void n(@NotNull Object obj) throws Throwable {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f217471a;
        }
    }
}
