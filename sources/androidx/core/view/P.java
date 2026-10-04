package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.lifecycle.InterfaceC2611y;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f111620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<U> f111621b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<U, a> f111622c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f111623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC2611y f111624b;

        public a(@NonNull Lifecycle lifecycle, @NonNull InterfaceC2611y interfaceC2611y) {
            this.f111623a = lifecycle;
            this.f111624b = interfaceC2611y;
            lifecycle.c(interfaceC2611y);
        }

        public void a() {
            this.f111623a.g(this.f111624b);
            this.f111624b = null;
        }
    }

    public P(@NonNull Runnable runnable) {
        this.f111620a = runnable;
    }

    public static /* synthetic */ void a(P p10, Lifecycle.State state, U u10, androidx.lifecycle.B b10, Lifecycle.Event event) {
        p10.getClass();
        if (event == Lifecycle.Event.upTo(state)) {
            p10.c(u10);
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            p10.j(u10);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            p10.f111621b.remove(u10);
            p10.f111620a.run();
        }
    }

    public static /* synthetic */ void b(P p10, U u10, androidx.lifecycle.B b10, Lifecycle.Event event) {
        p10.getClass();
        if (event == Lifecycle.Event.ON_DESTROY) {
            p10.j(u10);
        }
    }

    public void c(@NonNull U u10) {
        this.f111621b.add(u10);
        this.f111620a.run();
    }

    public void d(@NonNull final U u10, @NonNull androidx.lifecycle.B b10) {
        c(u10);
        Lifecycle lifecycle = b10.getLifecycle();
        a aVarRemove = this.f111622c.remove(u10);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f111622c.put(u10, new a(lifecycle, new InterfaceC2611y() { // from class: androidx.core.view.O
            @Override // androidx.lifecycle.InterfaceC2611y
            public final void onStateChanged(androidx.lifecycle.B b11, Lifecycle.Event event) {
                P.b(this.f111583a, u10, b11, event);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(@NonNull final U u10, @NonNull androidx.lifecycle.B b10, @NonNull final Lifecycle.State state) {
        Lifecycle lifecycle = b10.getLifecycle();
        a aVarRemove = this.f111622c.remove(u10);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f111622c.put(u10, new a(lifecycle, new InterfaceC2611y() { // from class: androidx.core.view.N
            @Override // androidx.lifecycle.InterfaceC2611y
            public final void onStateChanged(androidx.lifecycle.B b11, Lifecycle.Event event) {
                P.a(this.f111577a, state, u10, b11, event);
            }
        }));
    }

    public void f(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        Iterator<U> it = this.f111621b.iterator();
        while (it.hasNext()) {
            it.next().a(menu, menuInflater);
        }
    }

    public void g(@NonNull Menu menu) {
        Iterator<U> it = this.f111621b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean h(@NonNull MenuItem menuItem) {
        Iterator<U> it = this.f111621b.iterator();
        while (it.hasNext()) {
            if (it.next().d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(@NonNull Menu menu) {
        Iterator<U> it = this.f111621b.iterator();
        while (it.hasNext()) {
            it.next().c(menu);
        }
    }

    public void j(@NonNull U u10) {
        this.f111621b.remove(u10);
        a aVarRemove = this.f111622c.remove(u10);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f111620a.run();
    }
}
