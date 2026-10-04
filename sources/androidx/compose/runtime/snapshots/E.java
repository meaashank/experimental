package androidx.compose.runtime.snapshots;

import fd.InterfaceC4421d;
import fd.InterfaceC4424g;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class E<K, V> extends F<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC4421d {

    @V({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n317#2,4:373\n1#3:377\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n334#1:373,4\n334#1:377\n*E\n"})
    public static final class a implements Map.Entry<K, V>, InterfaceC4424g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f100042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f100043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E<K, V> f100044c;

        public a(E<K, V> e10) {
            this.f100044c = e10;
            Map.Entry<? extends K, ? extends V> entry = e10.f100048d;
            kotlin.jvm.internal.G.m(entry);
            this.f100042a = entry.getKey();
            Map.Entry<? extends K, ? extends V> entry2 = e10.f100048d;
            kotlin.jvm.internal.G.m(entry2);
            this.f100043b = entry2.getValue();
        }

        public void b(V v10) {
            this.f100043b = v10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f100042a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f100043b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            E<K, V> e10 = this.f100044c;
            if (e10.f100045a.m().f100205e != e10.f100047c) {
                throw new ConcurrentModificationException();
            }
            V v11 = this.f100043b;
            e10.f100045a.put(this.f100042a, v10);
            this.f100043b = v10;
            return v11;
        }
    }

    public E(@NotNull x<K, V> xVar, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(xVar, it);
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        e();
        if (this.f100048d != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}
