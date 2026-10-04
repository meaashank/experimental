package androidx.compose.runtime.snapshots;

import ed.InterfaceC4376a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n317#1,4:373\n1#2:377\n1#2:378\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n*L\n298#1:373,4\n298#1:377\n*E\n"})
public abstract class F<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final x<K, V> f100045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Iterator<Map.Entry<K, V>> f100046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f100047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Map.Entry<? extends K, ? extends V> f100048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Map.Entry<? extends K, ? extends V> f100049e;

    /* JADX WARN: Multi-variable type inference failed */
    public F(@NotNull x<K, V> xVar, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.f100045a = xVar;
        this.f100046b = it;
        this.f100047c = xVar.m().f100205e;
        e();
    }

    public final void e() {
        this.f100048d = this.f100049e;
        this.f100049e = this.f100046b.hasNext() ? this.f100046b.next() : null;
    }

    @Nullable
    public final Map.Entry<K, V> f() {
        return this.f100048d;
    }

    @NotNull
    public final Iterator<Map.Entry<K, V>> g() {
        return this.f100046b;
    }

    @NotNull
    public final x<K, V> h() {
        return this.f100045a;
    }

    public final boolean hasNext() {
        return this.f100049e != null;
    }

    public final int i() {
        return this.f100047c;
    }

    @Nullable
    public final Map.Entry<K, V> j() {
        return this.f100049e;
    }

    public final <T> T m(@NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        if (this.f100045a.m().f100205e != this.f100047c) {
            throw new ConcurrentModificationException();
        }
        T tInvoke = interfaceC4376a.invoke();
        this.f100047c = this.f100045a.m().f100205e;
        return tInvoke;
    }

    public final void o(@Nullable Map.Entry<? extends K, ? extends V> entry) {
        this.f100048d = entry;
    }

    public final void p(int i10) {
        this.f100047c = i10;
    }

    public final void q(@Nullable Map.Entry<? extends K, ? extends V> entry) {
        this.f100049e = entry;
    }

    public final void remove() {
        if (this.f100045a.m().f100205e != this.f100047c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.f100048d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.f100045a.remove(entry.getKey());
        this.f100048d = null;
        this.f100047c = this.f100045a.m().f100205e;
    }
}
