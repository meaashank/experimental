package androidx.collection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class LruCacheKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f86729a = 2147483647L;

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    @kotlin.jvm.internal.V({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$4\n*L\n1#1,375:1\n*E\n"})
    public static final class a<K, V> extends C1535h0<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.p<K, V, Integer> f86730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.l<K, V> f86731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ed.r<Boolean, K, V, V, kotlin.L0> f86732c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, ed.p<? super K, ? super V, Integer> pVar, ed.l<? super K, ? extends V> lVar, ed.r<? super Boolean, ? super K, ? super V, ? super V, kotlin.L0> rVar) {
            super(i10);
            this.f86730a = pVar;
            this.f86731b = lVar;
            this.f86732c = rVar;
        }

        @Override // androidx.collection.C1535h0
        @Nullable
        public V create(@NotNull K key) {
            kotlin.jvm.internal.G.p(key, "key");
            return this.f86731b.invoke(key);
        }

        @Override // androidx.collection.C1535h0
        public void entryRemoved(boolean z10, @NotNull K key, @NotNull V oldValue, @Nullable V v10) {
            kotlin.jvm.internal.G.p(key, "key");
            kotlin.jvm.internal.G.p(oldValue, "oldValue");
            this.f86732c.x(Boolean.valueOf(z10), key, oldValue, v10);
        }

        @Override // androidx.collection.C1535h0
        public int sizeOf(@NotNull K key, @NotNull V value) {
            kotlin.jvm.internal.G.p(key, "key");
            kotlin.jvm.internal.G.p(value, "value");
            return this.f86730a.invoke(key, value).intValue();
        }
    }

    @NotNull
    public static final <K, V> C1535h0<K, V> a(int i10, @NotNull ed.p<? super K, ? super V, Integer> sizeOf, @NotNull ed.l<? super K, ? extends V> create, @NotNull ed.r<? super Boolean, ? super K, ? super V, ? super V, kotlin.L0> onEntryRemoved) {
        kotlin.jvm.internal.G.p(sizeOf, "sizeOf");
        kotlin.jvm.internal.G.p(create, "create");
        kotlin.jvm.internal.G.p(onEntryRemoved, "onEntryRemoved");
        return new a(i10, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ C1535h0 b(int i10, ed.p sizeOf, ed.l create, ed.r onEntryRemoved, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            sizeOf = new ed.p<Object, Object, Integer>() { // from class: androidx.collection.LruCacheKt$lruCache$1
                @NotNull
                public final Integer e(@NotNull Object obj2, @NotNull Object obj3) {
                    kotlin.jvm.internal.G.p(obj2, "<anonymous parameter 0>");
                    kotlin.jvm.internal.G.p(obj3, "<anonymous parameter 1>");
                    return 1;
                }

                @Override // ed.p
                public /* bridge */ /* synthetic */ Integer invoke(Object obj2, Object obj3) {
                    e(obj2, obj3);
                    return 1;
                }
            };
        }
        if ((i11 & 4) != 0) {
            create = new ed.l<Object, Object>() { // from class: androidx.collection.LruCacheKt$lruCache$2
                @Override // ed.l
                @Nullable
                public final Object invoke(@NotNull Object it) {
                    kotlin.jvm.internal.G.p(it, "it");
                    return null;
                }
            };
        }
        if ((i11 & 8) != 0) {
            onEntryRemoved = new ed.r<Boolean, Object, Object, Object, kotlin.L0>() { // from class: androidx.collection.LruCacheKt$lruCache$3
                public final void e(boolean z10, @NotNull Object obj2, @NotNull Object obj3, @Nullable Object obj4) {
                    kotlin.jvm.internal.G.p(obj2, "<anonymous parameter 1>");
                    kotlin.jvm.internal.G.p(obj3, "<anonymous parameter 2>");
                }

                @Override // ed.r
                public /* bridge */ /* synthetic */ kotlin.L0 x(Boolean bool, Object obj2, Object obj3, Object obj4) {
                    e(bool.booleanValue(), obj2, obj3, obj4);
                    return kotlin.L0.f217464a;
                }
            };
        }
        kotlin.jvm.internal.G.p(sizeOf, "sizeOf");
        kotlin.jvm.internal.G.p(create, "create");
        kotlin.jvm.internal.G.p(onEntryRemoved, "onEntryRemoved");
        return new a(i10, sizeOf, create, onEntryRemoved);
    }
}
