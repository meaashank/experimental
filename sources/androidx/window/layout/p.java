package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.core.util.C2428e;
import androidx.core.util.InterfaceC2427d;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e.InterfaceC4326A;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WindowLayoutComponent f120144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ReentrantLock f120145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InterfaceC4326A("lock")
    @NotNull
    public final Map<Activity, a> f120146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC4326A("lock")
    @NotNull
    public final Map<InterfaceC2427d<B>, Activity> f120147d;

    @SuppressLint({"NewApi"})
    public static final class a implements Consumer<WindowLayoutInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Activity f120148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ReentrantLock f120149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @InterfaceC4326A("lock")
        @Nullable
        public B f120150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @InterfaceC4326A("lock")
        @NotNull
        public final Set<InterfaceC2427d<B>> f120151d;

        public a(@NotNull Activity activity) {
            kotlin.jvm.internal.G.p(activity, "activity");
            this.f120148a = activity;
            this.f120149b = new ReentrantLock();
            this.f120151d = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@NotNull WindowLayoutInfo value) {
            kotlin.jvm.internal.G.p(value, "value");
            ReentrantLock reentrantLock = this.f120149b;
            reentrantLock.lock();
            try {
                this.f120150c = q.f120152a.b(this.f120148a, value);
                Iterator<T> it = this.f120151d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2427d) it.next()).accept(this.f120150c);
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(@NotNull InterfaceC2427d<B> listener) {
            kotlin.jvm.internal.G.p(listener, "listener");
            ReentrantLock reentrantLock = this.f120149b;
            reentrantLock.lock();
            try {
                B b10 = this.f120150c;
                if (b10 != null) {
                    listener.accept(b10);
                }
                this.f120151d.add(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean c() {
            return this.f120151d.isEmpty();
        }

        public final void d(@NotNull InterfaceC2427d<B> listener) {
            kotlin.jvm.internal.G.p(listener, "listener");
            ReentrantLock reentrantLock = this.f120149b;
            reentrantLock.lock();
            try {
                this.f120151d.remove(listener);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public p(@NotNull WindowLayoutComponent component) {
        kotlin.jvm.internal.G.p(component, "component");
        this.f120144a = component;
        this.f120145b = new ReentrantLock();
        this.f120146c = new LinkedHashMap();
        this.f120147d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.w
    public void a(@NotNull Activity activity, @NotNull Executor executor, @NotNull InterfaceC2427d<B> callback) {
        L0 l02;
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(executor, "executor");
        kotlin.jvm.internal.G.p(callback, "callback");
        ReentrantLock reentrantLock = this.f120145b;
        reentrantLock.lock();
        try {
            a aVar = this.f120146c.get(activity);
            if (aVar == null) {
                l02 = null;
            } else {
                aVar.b(callback);
                this.f120147d.put(callback, activity);
                l02 = L0.f217464a;
            }
            if (l02 == null) {
                a aVar2 = new a(activity);
                this.f120146c.put(activity, aVar2);
                this.f120147d.put(callback, activity);
                aVar2.b(callback);
                this.f120144a.addWindowLayoutInfoListener(activity, C2428e.a(aVar2));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.w
    public void b(@NotNull InterfaceC2427d<B> callback) {
        kotlin.jvm.internal.G.p(callback, "callback");
        ReentrantLock reentrantLock = this.f120145b;
        reentrantLock.lock();
        try {
            Activity activity = this.f120147d.get(callback);
            if (activity == null) {
                return;
            }
            a aVar = this.f120146c.get(activity);
            if (aVar == null) {
                return;
            }
            aVar.d(callback);
            if (aVar.f120151d.isEmpty()) {
                this.f120144a.removeWindowLayoutInfoListener(C2428e.a(aVar));
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
