package androidx.compose.runtime;

import fd.InterfaceC4418a;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class R1 implements androidx.compose.runtime.tooling.d, Iterable<androidx.compose.runtime.tooling.d>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C1973v1 f99203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C1915h0 f99205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Q1 f99206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Object f99207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Iterable<androidx.compose.runtime.tooling.d> f99208f = this;

    public R1(@NotNull C1973v1 c1973v1, int i10, @NotNull C1915h0 c1915h0, @NotNull Q1 q12) {
        this.f99203a = c1973v1;
        this.f99204b = i10;
        this.f99205c = c1915h0;
        this.f99206d = q12;
        this.f99207e = Integer.valueOf(c1915h0.f99691a);
    }

    @Override // androidx.compose.runtime.tooling.b
    public /* synthetic */ androidx.compose.runtime.tooling.d b(Object obj) {
        return null;
    }

    @Override // androidx.compose.runtime.tooling.b
    @NotNull
    public Iterable<androidx.compose.runtime.tooling.d> g() {
        return this.f99208f;
    }

    @Override // androidx.compose.runtime.tooling.d
    @Nullable
    public Object g0() {
        return null;
    }

    @Override // androidx.compose.runtime.tooling.d
    @NotNull
    public Iterable<Object> getData() {
        return new O1(this.f99203a, this.f99204b, this.f99205c);
    }

    @Override // androidx.compose.runtime.tooling.d
    @NotNull
    public Object getKey() {
        return this.f99207e;
    }

    @NotNull
    public final Q1 h() {
        return this.f99206d;
    }

    @Override // androidx.compose.runtime.tooling.d
    @Nullable
    public String h0() {
        return this.f99205c.f99692b;
    }

    public final int i() {
        return this.f99204b;
    }

    @Override // androidx.compose.runtime.tooling.d
    public /* synthetic */ int i0() {
        return 0;
    }

    @Override // androidx.compose.runtime.tooling.b
    public boolean isEmpty() {
        ArrayList<Object> arrayList = this.f99205c.f99694d;
        boolean z10 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = true;
        }
        return !z10;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<androidx.compose.runtime.tooling.d> iterator() {
        return new P1(this.f99203a, this.f99204b, this.f99205c, this.f99206d);
    }

    @NotNull
    public final C1915h0 j() {
        return this.f99205c;
    }

    @Override // androidx.compose.runtime.tooling.d
    @NotNull
    public Object j0() {
        return this.f99206d.a(this.f99203a);
    }

    @Override // androidx.compose.runtime.tooling.d
    public /* synthetic */ int k0() {
        return 0;
    }

    @NotNull
    public final C1973v1 o() {
        return this.f99203a;
    }
}
