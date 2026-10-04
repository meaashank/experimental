package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ProvidedValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4584:1\n1#2:4585\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1888b1<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f99415i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final A<T> f99416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f99417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final H1<T> f99418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final L0<T> f99419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final ed.l<B, T> f99420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f99421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final T f99422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f99423h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C1888b1(@NotNull A<T> a10, @Nullable T t10, boolean z10, @Nullable H1<T> h12, @Nullable L0<T> l02, @Nullable ed.l<? super B, ? extends T> lVar, boolean z11) {
        this.f99416a = a10;
        this.f99417b = z10;
        this.f99418c = h12;
        this.f99419d = l02;
        this.f99420e = lVar;
        this.f99421f = z11;
        this.f99422g = t10;
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void i() {
    }

    @dd.j(name = "getCanOverride")
    public final boolean a() {
        return this.f99423h;
    }

    @NotNull
    public final A<T> b() {
        return this.f99416a;
    }

    @Nullable
    public final ed.l<B, T> c() {
        return this.f99420e;
    }

    public final T d() {
        if (this.f99417b) {
            return null;
        }
        L0<T> l02 = this.f99419d;
        if (l02 != null) {
            return l02.getValue();
        }
        T t10 = this.f99422g;
        if (t10 != null) {
            return t10;
        }
        C1968u.w("Unexpected form of a provided value");
        throw null;
    }

    @Nullable
    public final H1<T> f() {
        return this.f99418c;
    }

    @Nullable
    public final L0<T> g() {
        return this.f99419d;
    }

    public final T h() {
        return this.f99422g;
    }

    @NotNull
    public final C1888b1<T> j() {
        this.f99423h = false;
        return this;
    }

    public final boolean k() {
        return this.f99421f;
    }

    public final boolean l() {
        return (this.f99417b || this.f99422g != null) && !this.f99421f;
    }
}
