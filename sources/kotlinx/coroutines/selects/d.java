package kotlinx.coroutines.selects;

import ed.q;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f220723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final q<Object, j<?>, Object, L0> f220724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final q<j<?>, Object, Object, ed.l<Throwable, L0>> f220725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final q<Object, Object, Object, Object> f220726d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull Object obj, @NotNull q<Object, ? super j<?>, Object, L0> qVar, @Nullable q<? super j<?>, Object, Object, ? extends ed.l<? super Throwable, L0>> qVar2) {
        this.f220723a = obj;
        this.f220724b = qVar;
        this.f220725c = qVar2;
        this.f220726d = SelectKt.f220706a;
    }

    @Override // kotlinx.coroutines.selects.i
    @Nullable
    public q<j<?>, Object, Object, ed.l<Throwable, L0>> a() {
        return this.f220725c;
    }

    @Override // kotlinx.coroutines.selects.i
    @NotNull
    public q<Object, Object, Object, Object> b() {
        return this.f220726d;
    }

    @Override // kotlinx.coroutines.selects.i
    @NotNull
    public q<Object, j<?>, Object, L0> c() {
        return this.f220724b;
    }

    @Override // kotlinx.coroutines.selects.i
    @NotNull
    public Object d() {
        return this.f220723a;
    }

    public /* synthetic */ d(Object obj, q qVar, q qVar2, int i10, C4969v c4969v) {
        this(obj, qVar, (i10 & 4) != 0 ? null : qVar2);
    }
}
