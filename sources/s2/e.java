package s2;

import androidx.annotation.RestrictTo;
import androidx.collection.C1520a;
import androidx.collection.C1531f0;
import ed.l;
import java.util.HashMap;
import kotlin.L0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@dd.j(name = "RelationUtil")
public final class e {
    public static final <K, V> void a(@NotNull C1520a<K, V> map, boolean z10, @NotNull l<? super C1520a<K, V>, L0> fetchBlock) {
        G.p(map, "map");
        G.p(fetchBlock, "fetchBlock");
        C1520a c1520a = new C1520a(999);
        int size = map.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                c1520a.put(map.i(i10), map.o(i10));
            } else {
                c1520a.put(map.i(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(c1520a);
                if (!z10) {
                    map.putAll(c1520a);
                }
                c1520a.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(c1520a);
            if (z10) {
                return;
            }
            map.putAll(c1520a);
        }
    }

    public static final <K, V> void b(@NotNull HashMap<K, V> map, boolean z10, @NotNull l<? super HashMap<K, V>, L0> fetchBlock) {
        int i10;
        G.p(map, "map");
        G.p(fetchBlock, "fetchBlock");
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i10 = 0;
            for (K key : map.keySet()) {
                if (z10) {
                    G.o(key, "key");
                    map2.put(key, map.get(key));
                } else {
                    G.o(key, "key");
                    map2.put(key, null);
                }
                i10++;
                if (i10 == 999) {
                    fetchBlock.invoke(map2);
                    if (!z10) {
                        map.putAll(map2);
                    }
                    map2.clear();
                }
            }
            break loop0;
        }
        if (i10 > 0) {
            fetchBlock.invoke(map2);
            if (z10) {
                return;
            }
            map.putAll(map2);
        }
    }

    public static final <V> void c(@NotNull C1531f0<V> map, boolean z10, @NotNull l<? super C1531f0<V>, L0> fetchBlock) {
        G.p(map, "map");
        G.p(fetchBlock, "fetchBlock");
        C1531f0<? extends V> c1531f0 = new C1531f0<>(999);
        int iW = map.w();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iW) {
            if (z10) {
                c1531f0.m(map.l(i10), map.x(i10));
            } else {
                c1531f0.m(map.l(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(c1531f0);
                if (!z10) {
                    map.n(c1531f0);
                }
                c1531f0.b();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(c1531f0);
            if (z10) {
                return;
            }
            map.n(c1531f0);
        }
    }
}
