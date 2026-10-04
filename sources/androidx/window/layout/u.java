package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.core.util.InterfaceC2427d;
import androidx.window.core.Version;
import androidx.window.layout.o;
import androidx.window.layout.u;
import e.InterfaceC4326A;
import e.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f120174d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static volatile u f120175e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f120177g = "WindowServer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC4326A("globalLock")
    @f0
    @Nullable
    public o f120178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<c> f120179b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f120173c = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final ReentrantLock f120176f = new ReentrantLock();

    public static final class a {
        public a() {
        }

        @NotNull
        public final u a(@NotNull Context context) {
            kotlin.jvm.internal.G.p(context, "context");
            if (u.f120175e == null) {
                ReentrantLock reentrantLock = u.f120176f;
                reentrantLock.lock();
                try {
                    if (u.f120175e == null) {
                        u.f120175e = new u(u.f120173c.b(context));
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            u uVar = u.f120175e;
            kotlin.jvm.internal.G.m(uVar);
            return uVar;
        }

        @Nullable
        public final o b(@NotNull Context context) {
            kotlin.jvm.internal.G.p(context, "context");
            try {
                if (c(SidecarCompat.f120104f.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.b()) {
                        return sidecarCompat;
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        @f0
        public final boolean c(@Nullable Version version) {
            if (version == null) {
                return false;
            }
            Version.f120053f.getClass();
            return version.compareTo(Version.f120055h) >= 0;
        }

        @f0
        public final void d() {
            u.f120175e = null;
        }

        public a(C4969v c4969v) {
        }
    }

    @f0
    public final class b implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f120180a;

        public b(u this$0) {
            kotlin.jvm.internal.G.p(this$0, "this$0");
            this.f120180a = this$0;
        }

        @Override // androidx.window.layout.o.a
        @SuppressLint({"SyntheticAccessor"})
        public void a(@NotNull Activity activity, @NotNull B newLayout) {
            kotlin.jvm.internal.G.p(activity, "activity");
            kotlin.jvm.internal.G.p(newLayout, "newLayout");
            for (c cVar : this.f120180a.f120179b) {
                if (kotlin.jvm.internal.G.g(cVar.f120181a, activity)) {
                    cVar.b(newLayout);
                }
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Activity f120181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Executor f120182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final InterfaceC2427d<B> f120183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public B f120184d;

        public c(@NotNull Activity activity, @NotNull Executor executor, @NotNull InterfaceC2427d<B> callback) {
            kotlin.jvm.internal.G.p(activity, "activity");
            kotlin.jvm.internal.G.p(executor, "executor");
            kotlin.jvm.internal.G.p(callback, "callback");
            this.f120181a = activity;
            this.f120182b = executor;
            this.f120183c = callback;
        }

        public static final void c(c this$0, B newLayoutInfo) {
            kotlin.jvm.internal.G.p(this$0, "this$0");
            kotlin.jvm.internal.G.p(newLayoutInfo, "$newLayoutInfo");
            this$0.f120183c.accept(newLayoutInfo);
        }

        public final void b(@NotNull final B newLayoutInfo) {
            kotlin.jvm.internal.G.p(newLayoutInfo, "newLayoutInfo");
            this.f120184d = newLayoutInfo;
            this.f120182b.execute(new Runnable() { // from class: androidx.window.layout.v
                @Override // java.lang.Runnable
                public final void run() {
                    u.c.c(this.f120185a, newLayoutInfo);
                }
            });
        }

        @NotNull
        public final Activity d() {
            return this.f120181a;
        }

        @NotNull
        public final InterfaceC2427d<B> e() {
            return this.f120183c;
        }

        @Nullable
        public final B f() {
            return this.f120184d;
        }

        public final void g(@Nullable B b10) {
            this.f120184d = b10;
        }
    }

    @f0
    public u(@Nullable o oVar) {
        this.f120178a = oVar;
        o oVar2 = this.f120178a;
        if (oVar2 == null) {
            return;
        }
        oVar2.a(new b(this));
    }

    @f0
    public static /* synthetic */ void i() {
    }

    @Override // androidx.window.layout.w
    public void a(@NotNull Activity activity, @NotNull Executor executor, @NotNull InterfaceC2427d<B> callback) {
        B b10;
        Object next;
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(executor, "executor");
        kotlin.jvm.internal.G.p(callback, "callback");
        ReentrantLock reentrantLock = f120176f;
        reentrantLock.lock();
        try {
            o oVar = this.f120178a;
            if (oVar == null) {
                callback.accept(new B(EmptyList.f217510a));
                return;
            }
            boolean zJ = j(activity);
            c cVar = new c(activity, executor, callback);
            this.f120179b.add(cVar);
            if (zJ) {
                Iterator<T> it = this.f120179b.iterator();
                while (true) {
                    b10 = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (activity.equals(((c) next).f120181a)) {
                            break;
                        }
                    }
                }
                c cVar2 = (c) next;
                if (cVar2 != null) {
                    b10 = cVar2.f120184d;
                }
                if (b10 != null) {
                    cVar.b(b10);
                }
            } else {
                oVar.c(activity);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.w
    public void b(@NotNull InterfaceC2427d<B> callback) {
        kotlin.jvm.internal.G.p(callback, "callback");
        synchronized (f120176f) {
            try {
                if (this.f120178a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (c cVar : this.f120179b) {
                    if (cVar.f120183c == callback) {
                        arrayList.add(cVar);
                    }
                }
                this.f120179b.removeAll(arrayList);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f(((c) obj).f120181a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC4326A("sLock")
    public final void f(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f120179b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.G.g(((c) it.next()).f120181a, activity)) {
                    return;
                }
            }
        }
        o oVar = this.f120178a;
        if (oVar == null) {
            return;
        }
        oVar.d(activity);
    }

    @Nullable
    public final o g() {
        return this.f120178a;
    }

    @NotNull
    public final CopyOnWriteArrayList<c> h() {
        return this.f120179b;
    }

    public final boolean j(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f120179b;
        if (androidx.activity.D.a(copyOnWriteArrayList) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.G.g(((c) it.next()).f120181a, activity)) {
                return true;
            }
        }
        return false;
    }

    public final void k(@Nullable o oVar) {
        this.f120178a = oVar;
    }
}
