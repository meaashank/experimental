package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
@InterfaceC4850b0
public final class l<T> implements e<T>, Vc.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f217698b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<l<?>, Object> f217699c = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, R9.c.f67796d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e<T> f217700a;

    @Nullable
    private volatile Object result;

    public static final class a {
        public a() {
        }

        public static /* synthetic */ void a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull e<? super T> delegate, @Nullable Object obj) {
        G.p(delegate, "delegate");
        this.f217700a = delegate;
        this.result = obj;
    }

    @InterfaceC4850b0
    @Nullable
    public final Object a() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater<l<?>, Object> atomicReferenceFieldUpdater = f217699c;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, coroutineSingletons, coroutineSingletons2)) {
                return coroutineSingletons2;
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f217471a;
        }
        return obj;
    }

    @Override // Vc.c
    @Nullable
    public Vc.c getCallerFrame() {
        e<T> eVar = this.f217700a;
        if (eVar instanceof Vc.c) {
            return (Vc.c) eVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.e
    @NotNull
    public i getContext() {
        return this.f217700a.getContext();
    }

    @Override // Vc.c
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@NotNull Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 != coroutineSingletons) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 != coroutineSingletons2) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.c.a(f217699c, this, coroutineSingletons2, CoroutineSingletons.RESUMED)) {
                    this.f217700a.resumeWith(obj);
                    return;
                }
            } else if (androidx.concurrent.futures.c.a(f217699c, this, coroutineSingletons, obj)) {
                return;
            }
        }
    }

    @NotNull
    public String toString() {
        return "SafeContinuation for " + this.f217700a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC4850b0
    public l(@NotNull e<? super T> delegate) {
        this(delegate, CoroutineSingletons.UNDECIDED);
        G.p(delegate, "delegate");
    }
}
