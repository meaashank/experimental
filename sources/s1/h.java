package S1;

import e.I;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.N;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,136:1\n36#2,2:137\n36#2,2:140\n36#2,2:143\n36#2,2:146\n23#3:139\n23#3:142\n23#3:145\n23#3:148\n*S KotlinDebug\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n*L\n83#1:137,2\n106#1:140,2\n120#1:143,2\n126#1:146,2\n83#1:139\n106#1:142\n120#1:145\n126#1:148\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e f68113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, AutoCloseable> f68114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Set<AutoCloseable> f68115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f68116d;

    public h() {
        this.f68113a = new e();
        this.f68114b = new LinkedHashMap();
        this.f68115c = new LinkedHashSet();
    }

    public final void d(@NotNull AutoCloseable closeable) {
        G.p(closeable, "closeable");
        if (this.f68116d) {
            g(closeable);
            return;
        }
        synchronized (this.f68113a) {
            this.f68115c.add(closeable);
        }
    }

    public final void e(@NotNull String key, @NotNull AutoCloseable closeable) {
        AutoCloseable autoCloseablePut;
        G.p(key, "key");
        G.p(closeable, "closeable");
        if (this.f68116d) {
            g(closeable);
            return;
        }
        synchronized (this.f68113a) {
            autoCloseablePut = this.f68114b.put(key, closeable);
        }
        g(autoCloseablePut);
    }

    @I
    public final void f() {
        if (this.f68116d) {
            return;
        }
        this.f68116d = true;
        synchronized (this.f68113a) {
            try {
                Iterator<AutoCloseable> it = this.f68114b.values().iterator();
                while (it.hasNext()) {
                    g(it.next());
                }
                Iterator<AutoCloseable> it2 = this.f68115c.iterator();
                while (it2.hasNext()) {
                    g(it2.next());
                }
                this.f68115c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                Q0.g.a(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Nullable
    public final <T extends AutoCloseable> T h(@NotNull String key) {
        T t10;
        G.p(key, "key");
        synchronized (this.f68113a) {
            t10 = (T) this.f68114b.get(key);
        }
        return t10;
    }

    public h(@NotNull L viewModelScope) {
        G.p(viewModelScope, "viewModelScope");
        this.f68113a = new e();
        this.f68114b = new LinkedHashMap();
        this.f68115c = new LinkedHashSet();
        e(b.f68110a, b.a(viewModelScope));
    }

    public h(@NotNull AutoCloseable... closeables) {
        G.p(closeables, "closeables");
        this.f68113a = new e();
        this.f68114b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f68115c = linkedHashSet;
        N.u0(linkedHashSet, closeables);
    }

    public h(@NotNull L viewModelScope, @NotNull AutoCloseable... closeables) {
        G.p(viewModelScope, "viewModelScope");
        G.p(closeables, "closeables");
        this.f68113a = new e();
        this.f68114b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f68115c = linkedHashSet;
        e(b.f68110a, b.a(viewModelScope));
        N.u0(linkedHashSet, closeables);
    }
}
