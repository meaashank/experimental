package androidx.activity.contextaware;

import android.content.Context;
import b.InterfaceC2722a;
import b.c;
import ed.l;
import kotlin.C4885d0;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5102o;
import kotlinx.coroutines.InterfaceC5100n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:95,11\n*E\n"})
public final class ContextAwareKt {

    @V({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5100n<R> f85000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Context, R> f85001b;

        public a(InterfaceC5100n<R> interfaceC5100n, l<Context, R> lVar) {
            this.f85000a = interfaceC5100n;
            this.f85001b = lVar;
        }

        @Override // b.c
        public void a(@NotNull Context context) {
            Object objA;
            G.p(context, "context");
            e eVar = this.f85000a;
            try {
                objA = this.f85001b.invoke(context);
            } catch (Throwable th) {
                objA = C4885d0.a(th);
            }
            eVar.resumeWith(objA);
        }
    }

    @Nullable
    public static final <R> Object a(@NotNull InterfaceC2722a interfaceC2722a, @NotNull l<Context, R> lVar, @NotNull e<R> eVar) {
        Context contextPeekAvailableContext = interfaceC2722a.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return lVar.invoke(contextPeekAvailableContext);
        }
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        a aVar = new a(c5102o, lVar);
        interfaceC2722a.addOnContextAvailableListener(aVar);
        c5102o.k0(new ContextAwareKt$withContextAvailable$2$1(interfaceC2722a, aVar));
        Object objZ = c5102o.z();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objZ;
    }

    public static final <R> Object b(InterfaceC2722a interfaceC2722a, l<Context, R> lVar, e<R> eVar) {
        Context contextPeekAvailableContext = interfaceC2722a.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return lVar.invoke(contextPeekAvailableContext);
        }
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        a aVar = new a(c5102o, lVar);
        interfaceC2722a.addOnContextAvailableListener(aVar);
        c5102o.k0(new ContextAwareKt$withContextAvailable$2$1(interfaceC2722a, aVar));
        Object objZ = c5102o.z();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objZ;
    }
}
