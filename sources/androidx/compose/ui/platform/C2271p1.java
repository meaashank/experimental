package androidx.compose.ui.platform;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2271p1 implements androidx.compose.ui.node.m0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f103911g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<C2271p1> f103913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Float f103914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Float f103915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.semantics.j f103916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.semantics.j f103917f;

    public C2271p1(int i10, @NotNull List<C2271p1> list, @Nullable Float f10, @Nullable Float f11, @Nullable androidx.compose.ui.semantics.j jVar, @Nullable androidx.compose.ui.semantics.j jVar2) {
        this.f103912a = i10;
        this.f103913b = list;
        this.f103914c = f10;
        this.f103915d = f11;
        this.f103916e = jVar;
        this.f103917f = jVar2;
    }

    @Override // androidx.compose.ui.node.m0
    public boolean R0() {
        return this.f103913b.contains(this);
    }

    @NotNull
    public final List<C2271p1> a() {
        return this.f103913b;
    }

    @Nullable
    public final androidx.compose.ui.semantics.j b() {
        return this.f103916e;
    }

    @Nullable
    public final Float c() {
        return this.f103914c;
    }

    @Nullable
    public final Float d() {
        return this.f103915d;
    }

    public final int e() {
        return this.f103912a;
    }

    @Nullable
    public final androidx.compose.ui.semantics.j f() {
        return this.f103917f;
    }

    public final void g(@Nullable androidx.compose.ui.semantics.j jVar) {
        this.f103916e = jVar;
    }

    public final void h(@Nullable Float f10) {
        this.f103914c = f10;
    }

    public final void i(@Nullable Float f10) {
        this.f103915d = f10;
    }

    public final void j(@Nullable androidx.compose.ui.semantics.j jVar) {
        this.f103917f = jVar;
    }
}
