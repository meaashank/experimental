package androidx.room;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f117031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Set<androidx.lifecycle.K<?>> f117032b;

    public D(@NotNull RoomDatabase database) {
        kotlin.jvm.internal.G.p(database, "database");
        this.f117031a = database;
        Set<androidx.lifecycle.K<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        kotlin.jvm.internal.G.o(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f117032b = setNewSetFromMap;
    }

    @NotNull
    public final <T> androidx.lifecycle.K<T> a(@NotNull String[] tableNames, boolean z10, @NotNull Callable<T> computeFunction) {
        kotlin.jvm.internal.G.p(tableNames, "tableNames");
        kotlin.jvm.internal.G.p(computeFunction, "computeFunction");
        return new C0(this.f117031a, this, z10, computeFunction, tableNames);
    }

    @NotNull
    public final Set<androidx.lifecycle.K<?>> b() {
        return this.f117032b;
    }

    public final void c(@NotNull androidx.lifecycle.K<?> liveData) {
        kotlin.jvm.internal.G.p(liveData, "liveData");
        this.f117032b.add(liveData);
    }

    public final void d(@NotNull androidx.lifecycle.K<?> liveData) {
        kotlin.jvm.internal.G.p(liveData, "liveData");
        this.f117032b.remove(liveData);
    }
}
