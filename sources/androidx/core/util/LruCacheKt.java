package androidx.core.util;

import android.util.LruCache;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LruCacheKt {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public static final class a<K, V> extends LruCache<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.p<K, V, Integer> f111396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.l<K, V> f111397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ed.r<Boolean, K, V, V, L0> f111398c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, ed.p<? super K, ? super V, Integer> pVar, ed.l<? super K, ? extends V> lVar, ed.r<? super Boolean, ? super K, ? super V, ? super V, L0> rVar) {
            super(i10);
            this.f111396a = pVar;
            this.f111397b = lVar;
            this.f111398c = rVar;
        }

        @Override // android.util.LruCache
        public V create(K k10) {
            return this.f111397b.invoke(k10);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z10, K k10, V v10, V v11) {
            this.f111398c.x(Boolean.valueOf(z10), k10, v10, v11);
        }

        @Override // android.util.LruCache
        public int sizeOf(K k10, V v10) {
            return this.f111396a.invoke(k10, v10).intValue();
        }
    }

    @NotNull
    public static final <K, V> LruCache<K, V> a(int i10, @NotNull ed.p<? super K, ? super V, Integer> pVar, @NotNull ed.l<? super K, ? extends V> lVar, @NotNull ed.r<? super Boolean, ? super K, ? super V, ? super V, L0> rVar) {
        return new a(i10, pVar, lVar, rVar);
    }

    public static /* synthetic */ LruCache b(int i10, ed.p pVar, ed.l lVar, ed.r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = new ed.p<Object, Object, Integer>() { // from class: androidx.core.util.LruCacheKt$lruCache$1
                public final Integer e(Object obj2, Object obj3) {
                    return 1;
                }

                @Override // ed.p
                public /* bridge */ /* synthetic */ Integer invoke(Object obj2, Object obj3) {
                    return 1;
                }
            };
        }
        if ((i11 & 4) != 0) {
            lVar = new ed.l<Object, Object>() { // from class: androidx.core.util.LruCacheKt$lruCache$2
                @Override // ed.l
                public final Object invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i11 & 8) != 0) {
            rVar = new ed.r<Boolean, Object, Object, Object, L0>() { // from class: androidx.core.util.LruCacheKt$lruCache$3
                public final void e(boolean z10, Object obj2, Object obj3, Object obj4) {
                }

                @Override // ed.r
                public /* bridge */ /* synthetic */ L0 x(Boolean bool, Object obj2, Object obj3, Object obj4) {
                    bool.booleanValue();
                    return L0.f217464a;
                }
            };
        }
        return new a(i10, pVar, lVar, rVar);
    }
}
