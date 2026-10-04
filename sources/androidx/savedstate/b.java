package androidx.savedstate;

import android.os.Bundle;
import android.support.v4.media.i;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC2611y;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import w.y;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements InterfaceC2611y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f117349b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f117350c = "classes_to_restore";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f117351d = "androidx.savedstate.Restarter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f117352a;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX INFO: renamed from: androidx.savedstate.b$b, reason: collision with other inner class name */
    public static final class C0329b implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Set<String> f117353a;

        public C0329b(@NotNull d registry) {
            G.p(registry, "registry");
            this.f117353a = new LinkedHashSet();
            registry.j(b.f117351d, this);
        }

        @Override // androidx.savedstate.d.c
        @NotNull
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(b.f117350c, new ArrayList<>(this.f117353a));
            return bundle;
        }

        public final void b(@NotNull String className) {
            G.p(className, "className");
            this.f117353a.add(className);
        }
    }

    public b(@NotNull f owner) {
        G.p(owner, "owner");
        this.f117352a = owner;
    }

    public final void a(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(d.a.class);
            G.o(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    G.o(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((d.a) objNewInstance).a(this.f117352a);
                } catch (Exception e10) {
                    throw new RuntimeException(y.a("Failed to instantiate ", str), e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException(i.a("Class ", str, " wasn't found"), e12);
        }
    }

    @Override // androidx.lifecycle.InterfaceC2611y
    public void onStateChanged(@NotNull B source, @NotNull Lifecycle.Event event) {
        G.p(source, "source");
        G.p(event, "event");
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().g(this);
        Bundle bundleB = this.f117352a.getSavedStateRegistry().b(f117351d);
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList(f117350c);
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = stringArrayList.get(i10);
            i10++;
            a(str);
        }
    }
}
