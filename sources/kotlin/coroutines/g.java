package kotlin.coroutines;

import ed.p;
import kotlin.C4885d0;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @V({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n*L\n1#1,161:1\n*E\n"})
    public static final class a<T> implements e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f217681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.l<Result<? extends T>, L0> f217682b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(i iVar, ed.l<? super Result<? extends T>, L0> lVar) {
            this.f217681a = iVar;
            this.f217682b = lVar;
        }

        @Override // kotlin.coroutines.e
        public i getContext() {
            return this.f217681a;
        }

        @Override // kotlin.coroutines.e
        public void resumeWith(Object obj) {
            this.f217682b.invoke(new Result<>(obj));
        }
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <T> e<T> a(i context, ed.l<? super Result<? extends T>, L0> resumeWith) {
        G.p(context, "context");
        G.p(resumeWith, "resumeWith");
        return new a(context, resumeWith);
    }

    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static final <T> e<L0> b(@NotNull ed.l<? super e<? super T>, ? extends Object> lVar, @NotNull e<? super T> completion) {
        G.p(lVar, "<this>");
        G.p(completion, "completion");
        return new l(IntrinsicsKt__IntrinsicsJvmKt.e(IntrinsicsKt__IntrinsicsJvmKt.b(lVar, completion)), CoroutineSingletons.COROUTINE_SUSPENDED);
    }

    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static final <R, T> e<L0> c(@NotNull p<? super R, ? super e<? super T>, ? extends Object> pVar, R r10, @NotNull e<? super T> completion) {
        G.p(pVar, "<this>");
        G.p(completion, "completion");
        return new l(IntrinsicsKt__IntrinsicsJvmKt.e(IntrinsicsKt__IntrinsicsJvmKt.c(pVar, r10, completion)), CoroutineSingletons.COROUTINE_SUSPENDED);
    }

    public static final i d() {
        throw new NotImplementedError("Implemented as intrinsic");
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static /* synthetic */ void e() {
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <T> void f(e<? super T> eVar, T t10) {
        G.p(eVar, "<this>");
        eVar.resumeWith(t10);
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <T> void g(e<? super T> eVar, Throwable exception) {
        G.p(eVar, "<this>");
        G.p(exception, "exception");
        eVar.resumeWith(C4885d0.a(exception));
    }

    @InterfaceC4887e0(version = "1.3")
    public static final <T> void h(@NotNull ed.l<? super e<? super T>, ? extends Object> lVar, @NotNull e<? super T> completion) {
        G.p(lVar, "<this>");
        G.p(completion, "completion");
        IntrinsicsKt__IntrinsicsJvmKt.e(IntrinsicsKt__IntrinsicsJvmKt.b(lVar, completion)).resumeWith(L0.f217464a);
    }

    @InterfaceC4887e0(version = "1.3")
    public static final <R, T> void i(@NotNull p<? super R, ? super e<? super T>, ? extends Object> pVar, R r10, @NotNull e<? super T> completion) {
        G.p(pVar, "<this>");
        G.p(completion, "completion");
        IntrinsicsKt__IntrinsicsJvmKt.e(IntrinsicsKt__IntrinsicsJvmKt.c(pVar, r10, completion)).resumeWith(L0.f217464a);
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <T> Object j(ed.l<? super e<? super T>, L0> lVar, e<? super T> eVar) throws Throwable {
        l lVar2 = new l(IntrinsicsKt__IntrinsicsJvmKt.e(eVar));
        lVar.invoke(lVar2);
        Object objA = lVar2.a();
        if (objA == CoroutineSingletons.COROUTINE_SUSPENDED) {
            Vc.f.c(eVar);
        }
        return objA;
    }
}
