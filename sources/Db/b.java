package Db;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f27955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f27956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<Integer, e> f27957c;

    public b(@NotNull String namespace) {
        G.p(namespace, "namespace");
        this.f27955a = namespace;
        this.f27956b = new Object();
        this.f27957c = new LinkedHashMap();
    }

    public final void a(int i10, @Nullable e eVar) {
        synchronized (this.f27956b) {
            this.f27957c.put(Integer.valueOf(i10), eVar);
        }
    }

    public final void b() {
        synchronized (this.f27956b) {
            this.f27957c.clear();
        }
    }

    public final boolean c(int i10) {
        boolean zContainsKey;
        synchronized (this.f27956b) {
            zContainsKey = this.f27957c.containsKey(Integer.valueOf(i10));
        }
        return zContainsKey;
    }

    @NotNull
    public final List<e> d() {
        List<e> listA6;
        synchronized (this.f27956b) {
            listA6 = U.a6(this.f27957c.values());
        }
        return listA6;
    }

    @NotNull
    public final String e() {
        return this.f27955a;
    }

    public final void f(int i10) {
        synchronized (this.f27956b) {
            e eVar = this.f27957c.get(Integer.valueOf(i10));
            if (eVar != null) {
                eVar.y(true);
                this.f27957c.remove(Integer.valueOf(i10));
            }
        }
    }

    public final void g(int i10) {
        synchronized (this.f27956b) {
            this.f27957c.remove(Integer.valueOf(i10));
        }
    }
}
