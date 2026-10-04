package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import dd.g;
import dd.j;
import dd.k;
import e.f0;
import java.lang.reflect.InvocationTargetException;
import kotlin.C4885d0;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5052b0;
import kotlinx.coroutines.C5102o;
import kotlinx.coroutines.InterfaceC5100n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n318#2,11:213\n318#2,9:224\n327#2,2:234\n13#3:233\n1#4:236\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n184#1:213,11\n192#1:224,9\n192#1:234,2\n196#1:233\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f218824a = 4611686018427387903L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g
    @Nullable
    public static final d f218825b;

    @Nullable
    private static volatile Choreographer choreographer;

    @V({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n1#1,14:1\n197#2,2:15\n*E\n"})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5100n f218826a;

        public a(InterfaceC5100n interfaceC5100n) {
            this.f218826a = interfaceC5100n;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.n(this.f218826a);
        }
    }

    static {
        Object objA;
        try {
            objA = new HandlerContext(e(Looper.getMainLooper(), true), null, 2, null);
        } catch (Throwable th) {
            objA = C4885d0.a(th);
        }
        f218825b = (d) (objA instanceof Result.Failure ? null : objA);
    }

    @f0
    @NotNull
    public static final Handler e(@NotNull Looper looper, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        G.n(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    @Nullable
    public static final Object f(@NotNull kotlin.coroutines.e<? super Long> eVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return g(eVar);
        }
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        l(choreographer2, c5102o);
        Object objZ = c5102o.z();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objZ;
    }

    public static final Object g(kotlin.coroutines.e<? super Long> eVar) {
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n(c5102o);
        } else {
            C5052b0.e().F2(c5102o.f220423e, new a(c5102o));
        }
        Object objZ = c5102o.z();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objZ;
    }

    @k
    @j(name = x.h.f238400c)
    @NotNull
    public static final d h(@NotNull Handler handler) {
        return j(handler, null, 1, null);
    }

    @k
    @j(name = x.h.f238400c)
    @NotNull
    public static final d i(@NotNull Handler handler, @Nullable String str) {
        return new HandlerContext(handler, str, false);
    }

    public static /* synthetic */ d j(Handler handler, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return i(handler, str);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void k() {
    }

    public static final void l(Choreographer choreographer2, final InterfaceC5100n<? super Long> interfaceC5100n) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                f.m(interfaceC5100n, j10);
            }
        });
    }

    public static final void m(InterfaceC5100n interfaceC5100n, long j10) {
        interfaceC5100n.l0(C5052b0.e(), Long.valueOf(j10));
    }

    public static final void n(InterfaceC5100n<? super Long> interfaceC5100n) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            G.m(choreographer2);
            choreographer = choreographer2;
        }
        l(choreographer2, interfaceC5100n);
    }
}
