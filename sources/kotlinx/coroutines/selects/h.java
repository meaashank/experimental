package kotlinx.coroutines.selects;

import ed.q;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class h<P, Q> implements g<P, Q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f220731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final q<Object, j<?>, Object, L0> f220732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final q<Object, Object, Object, Object> f220733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final q<j<?>, Object, Object, ed.l<Throwable, L0>> f220734d;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull Object obj, @NotNull q<Object, ? super j<?>, Object, L0> qVar, @NotNull q<Object, Object, Object, ? extends Object> qVar2, @Nullable q<? super j<?>, Object, Object, ? extends ed.l<? super Throwable, L0>> qVar3) {
        this.f220731a = obj;
        this.f220732b = qVar;
        this.f220733c = qVar2;
        this.f220734d = qVar3;
    }

    @Override // kotlinx.coroutines.selects.i
    @Nullable
    public q<j<?>, Object, Object, ed.l<Throwable, L0>> a() {
        return this.f220734d;
    }

    @Override // kotlinx.coroutines.selects.i
    @NotNull
    public q<Object, Object, Object, Object> b() {
        return this.f220733c;
    }

    @Override // kotlinx.coroutines.selects.i
    @NotNull
    public q<Object, j<?>, Object, L0> c() {
        return this.f220732b;
    }

    @Override // kotlinx.coroutines.selects.i
    @NotNull
    public Object d() {
        return this.f220731a;
    }

    public /* synthetic */ h(Object obj, q qVar, q qVar2, q qVar3, int i10, C4969v c4969v) {
        this(obj, qVar, qVar2, (i10 & 8) != 0 ? null : qVar3);
    }
}
