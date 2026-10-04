package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC5058e0;
import kotlinx.coroutines.L;
import kotlinx.coroutines.M;
import org.jetbrains.annotations.NotNull;
import zc.W;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nRxScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxScheduler.kt\nkotlinx/coroutines/rx3/RxSchedulerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
public final class RxSchedulerKt {
    @NotNull
    public static final CoroutineDispatcher d(@NotNull W w10) {
        return w10 instanceof DispatcherScheduler ? ((DispatcherScheduler) w10).f220523b : new r(w10);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.4.2, binary compatibility with earlier versions")
    @dd.j(name = "asCoroutineDispatcher")
    public static final /* synthetic */ r e(W w10) {
        return new r(w10);
    }

    @NotNull
    public static final W f(@NotNull CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher instanceof r ? ((r) coroutineDispatcher).f220638c : new DispatcherScheduler(coroutineDispatcher);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, kotlinx.coroutines.e0] */
    public static final io.reactivex.rxjava3.disposables.d g(L l10, Runnable runnable, long j10, ed.l<? super ed.l<? super kotlin.coroutines.e<? super L0>, ? extends Object>, ? extends Runnable> lVar) {
        kotlin.coroutines.i iVarM = l10.m();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        io.reactivex.rxjava3.disposables.d dVarG = io.reactivex.rxjava3.disposables.c.g(new Runnable() { // from class: kotlinx.coroutines.rx3.l
            @Override // java.lang.Runnable
            public final void run() {
                RxSchedulerKt.h(objectRef);
            }
        });
        Runnable runnableInvoke = lVar.invoke(new RxSchedulerKt$scheduleTask$toSchedule$1(dVarG, iVarM, Ic.a.b0(runnable)));
        if (!M.k(l10)) {
            return EmptyDisposable.INSTANCE;
        }
        if (j10 <= 0) {
            runnableInvoke.run();
            return dVarG;
        }
        objectRef.f217904a = DelayKt.d(iVarM).h1(j10, runnableInvoke, iVarM);
        return dVarG;
    }

    public static final void h(Ref.ObjectRef objectRef) {
        InterfaceC5058e0 interfaceC5058e0 = (InterfaceC5058e0) objectRef.f217904a;
        if (interfaceC5058e0 != null) {
            interfaceC5058e0.dispose();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(io.reactivex.rxjava3.disposables.d r4, kotlin.coroutines.i r5, final java.lang.Runnable r6, kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.rx3.RxSchedulerKt$scheduleTask$task$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.rx3.RxSchedulerKt$scheduleTask$task$1 r0 = (kotlinx.coroutines.rx3.RxSchedulerKt$scheduleTask$task$1) r0
            int r1 = r0.f220608c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220608c = r1
            goto L18
        L13:
            kotlinx.coroutines.rx3.RxSchedulerKt$scheduleTask$task$1 r0 = new kotlinx.coroutines.rx3.RxSchedulerKt$scheduleTask$task$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f220607b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220608c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f220606a
            r5 = r4
            kotlin.coroutines.i r5 = (kotlin.coroutines.i) r5
            kotlin.C4885d0.n(r7)     // Catch: java.lang.Throwable -> L2c
            goto L56
        L2c:
            r4 = move-exception
            goto L53
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.C4885d0.n(r7)
            boolean r4 = r4.isDisposed()
            if (r4 == 0) goto L42
            kotlin.L0 r4 = kotlin.L0.f217464a
            return r4
        L42:
            kotlinx.coroutines.rx3.RxSchedulerKt$scheduleTask$task$2 r4 = new kotlinx.coroutines.rx3.RxSchedulerKt$scheduleTask$task$2     // Catch: java.lang.Throwable -> L2c
            r4.<init>()     // Catch: java.lang.Throwable -> L2c
            r0.f220606a = r5     // Catch: java.lang.Throwable -> L2c
            r0.f220608c = r3     // Catch: java.lang.Throwable -> L2c
            r6 = 0
            java.lang.Object r4 = kotlinx.coroutines.InterruptibleKt.c(r6, r4, r0, r3, r6)     // Catch: java.lang.Throwable -> L2c
            if (r4 != r1) goto L56
            return r1
        L53:
            kotlinx.coroutines.rx3.b.a(r4, r5)
        L56:
            kotlin.L0 r4 = kotlin.L0.f217464a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.RxSchedulerKt.i(io.reactivex.rxjava3.disposables.d, kotlin.coroutines.i, java.lang.Runnable, kotlin.coroutines.e):java.lang.Object");
    }
}
