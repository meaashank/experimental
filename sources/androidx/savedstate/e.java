package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import dd.o;
import e.I;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f117363d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f117364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d f117365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f117366c;

    public static final class a {
        public a() {
        }

        @o
        @NotNull
        public final e a(@NotNull f owner) {
            G.p(owner, "owner");
            return new e(owner);
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ e(f fVar, C4969v c4969v) {
        this(fVar);
    }

    @o
    @NotNull
    public static final e a(@NotNull f fVar) {
        return f117363d.a(fVar);
    }

    @NotNull
    public final d b() {
        return this.f117365b;
    }

    @I
    public final void c() {
        Lifecycle lifecycle = this.f117364a.getLifecycle();
        if (lifecycle.d() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.c(new b(this.f117364a));
        this.f117365b.g(lifecycle);
        this.f117366c = true;
    }

    @I
    public final void d(@Nullable Bundle bundle) {
        if (!this.f117366c) {
            c();
        }
        Lifecycle lifecycle = this.f117364a.getLifecycle();
        if (!lifecycle.d().isAtLeast(Lifecycle.State.STARTED)) {
            this.f117365b.h(bundle);
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.d()).toString());
        }
    }

    @I
    public final void e(@NotNull Bundle outBundle) {
        G.p(outBundle, "outBundle");
        this.f117365b.i(outBundle);
    }

    public e(f fVar) {
        this.f117364a = fVar;
        this.f117365b = new d();
    }
}
