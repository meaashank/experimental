package kotlin.sequences;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.sequences.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5001n<T> extends AbstractC5002o<T> implements Iterator<T>, kotlin.coroutines.e<L0>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f218202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public T f218203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Iterator<? extends T> f218204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public kotlin.coroutines.e<? super L0> f218205d;

    @Override // kotlin.sequences.AbstractC5002o
    @Nullable
    public Object b(T t10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        this.f218203b = t10;
        this.f218202a = 3;
        this.f218205d = eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Vc.f.c(eVar);
        return coroutineSingletons;
    }

    @Override // kotlin.sequences.AbstractC5002o
    @Nullable
    public Object e(@NotNull Iterator<? extends T> it, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        if (!it.hasNext()) {
            return L0.f217464a;
        }
        this.f218204c = it;
        this.f218202a = 2;
        this.f218205d = eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Vc.f.c(eVar);
        return coroutineSingletons;
    }

    @Override // kotlin.coroutines.e
    @NotNull
    public kotlin.coroutines.i getContext() {
        return EmptyCoroutineContext.f217673a;
    }

    public final Throwable h() {
        int i10 = this.f218202a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f218202a);
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f218202a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw h();
                }
                Iterator<? extends T> it = this.f218204c;
                kotlin.jvm.internal.G.m(it);
                if (it.hasNext()) {
                    this.f218202a = 2;
                    return true;
                }
                this.f218204c = null;
            }
            this.f218202a = 5;
            kotlin.coroutines.e<? super L0> eVar = this.f218205d;
            kotlin.jvm.internal.G.m(eVar);
            this.f218205d = null;
            eVar.resumeWith(L0.f217464a);
        }
    }

    @Nullable
    public final kotlin.coroutines.e<L0> i() {
        return this.f218205d;
    }

    public final T j() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final void m(@Nullable kotlin.coroutines.e<? super L0> eVar) {
        this.f218205d = eVar;
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i10 = this.f218202a;
        if (i10 == 0 || i10 == 1) {
            return j();
        }
        if (i10 == 2) {
            this.f218202a = 1;
            Iterator<? extends T> it = this.f218204c;
            kotlin.jvm.internal.G.m(it);
            return it.next();
        }
        if (i10 != 3) {
            throw h();
        }
        this.f218202a = 0;
        T t10 = this.f218203b;
        this.f218203b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@NotNull Object obj) throws Throwable {
        C4885d0.n(obj);
        this.f218202a = 4;
    }
}
