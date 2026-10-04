package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.InterfaceC5120x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nAtomic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Atomic.kt\nkotlinx/coroutines/internal/AtomicOp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
@InterfaceC5120x0
public abstract class AbstractC5068b<T> extends I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220327a = AtomicReferenceFieldUpdater.newUpdater(AbstractC5068b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = C5067a.f220324a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.I
    @NotNull
    public AbstractC5068b<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.I
    @Nullable
    public final Object b(@Nullable Object obj) {
        Object objD = f220327a.get(this);
        if (objD == C5067a.f220324a) {
            objD = d(g(obj));
        }
        c(obj, objD);
        return objD;
    }

    public abstract void c(T t10, @Nullable Object obj);

    public final Object d(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220327a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = C5067a.f220324a;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public final /* synthetic */ Object e() {
        return this._consensus$volatile;
    }

    @Nullable
    public abstract Object g(T t10);

    public final /* synthetic */ void h(Object obj) {
        this._consensus$volatile = obj;
    }
}
