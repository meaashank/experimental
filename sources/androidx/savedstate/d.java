package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC2611y;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.b;
import e.I;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import o.C5287b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
@SuppressLint({"RestrictedApi"})
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final b f117355g = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final String f117356h = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f117358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Bundle f117359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f117360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public b.C0329b f117361e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C5287b<String, c> f117357a = new C5287b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f117362f = true;

    public interface a {
        void a(@NotNull f fVar);
    }

    public static final class b {
        public b() {
        }

        public b(C4969v c4969v) {
        }
    }

    public interface c {
        @NotNull
        Bundle a();
    }

    public static final void f(d this$0, B b10, Lifecycle.Event event) {
        G.p(this$0, "this$0");
        G.p(b10, "<anonymous parameter 0>");
        G.p(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            this$0.f117362f = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            this$0.f117362f = false;
        }
    }

    @I
    @Nullable
    public final Bundle b(@NotNull String key) {
        G.p(key, "key");
        if (!this.f117360d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f117359c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f117359c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f117359c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f117359c = null;
        return bundle2;
    }

    @Nullable
    public final c c(@NotNull String key) {
        String str;
        c cVar;
        G.p(key, "key");
        Iterator<Map.Entry<String, c>> it = this.f117357a.iterator();
        do {
            C5287b.e eVar = (C5287b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) eVar.next();
            G.o(components, "components");
            str = (String) components.getKey();
            cVar = (c) components.getValue();
        } while (!G.g(str, key));
        return cVar;
    }

    public final boolean d() {
        return this.f117362f;
    }

    @I
    public final boolean e() {
        return this.f117360d;
    }

    @I
    public final void g(@NotNull Lifecycle lifecycle) {
        G.p(lifecycle, "lifecycle");
        if (this.f117358b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.c(new InterfaceC2611y() { // from class: androidx.savedstate.c
            @Override // androidx.lifecycle.InterfaceC2611y
            public final void onStateChanged(B b10, Lifecycle.Event event) {
                d.f(this.f117354a, b10, event);
            }
        });
        this.f117358b = true;
    }

    @I
    public final void h(@Nullable Bundle bundle) {
        if (!this.f117358b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f117360d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f117359c = bundle != null ? bundle.getBundle(f117356h) : null;
        this.f117360d = true;
    }

    @I
    public final void i(@NotNull Bundle outBundle) {
        G.p(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f117359c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C5287b<String, c>.d dVarG = this.f117357a.g();
        while (dVarG.hasNext()) {
            Map.Entry<String, c> next = dVarG.next();
            bundle.putBundle(next.getKey(), next.getValue().a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle(f117356h, bundle);
    }

    @I
    public final void j(@NotNull String key, @NotNull c provider) {
        G.p(key, "key");
        G.p(provider, "provider");
        if (this.f117357a.j(key, provider) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @I
    public final void k(@NotNull Class<? extends a> clazz) {
        G.p(clazz, "clazz");
        if (!this.f117362f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        b.C0329b c0329b = this.f117361e;
        if (c0329b == null) {
            c0329b = new b.C0329b(this);
        }
        this.f117361e = c0329b;
        try {
            clazz.getDeclaredConstructor(null);
            b.C0329b c0329b2 = this.f117361e;
            if (c0329b2 != null) {
                c0329b2.b(clazz.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public final void l(boolean z10) {
        this.f117362f = z10;
    }

    @I
    public final void m(@NotNull String key) {
        G.p(key, "key");
        this.f117357a.k(key);
    }
}
