package androidx.compose.runtime;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public abstract class A<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f98972b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i2<T> f98973a;

    public /* synthetic */ A(InterfaceC4376a interfaceC4376a, C4969v c4969v) {
        this(interfaceC4376a);
    }

    public static /* synthetic */ void b() {
    }

    @InterfaceC1903d1
    @InterfaceC1917i
    @dd.j(name = "getCurrent")
    public final T a(@Nullable InterfaceC1946s interfaceC1946s, int i10) {
        return (T) interfaceC1946s.Q(this);
    }

    @NotNull
    public i2<T> c() {
        return this.f98973a;
    }

    @NotNull
    public abstract i2<T> d(@NotNull C1888b1<T> c1888b1, @Nullable i2<T> i2Var);

    public A(InterfaceC4376a<? extends T> interfaceC4376a) {
        this.f98973a = new C1969u0(interfaceC4376a);
    }
}
