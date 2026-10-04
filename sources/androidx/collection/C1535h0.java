package androidx.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: androidx.collection.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 4 Lock.jvm.kt\nandroidx/collection/internal/Lock\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,375:1\n46#2,5:376\n46#2,5:381\n32#2,5:406\n32#2,5:415\n23#3,3:386\n23#3,3:390\n23#3,3:394\n23#3,3:398\n23#3,3:402\n23#3,3:411\n23#3,3:420\n23#3,3:424\n23#3,3:428\n23#3,3:432\n23#3,3:436\n23#3,3:440\n23#3,3:444\n23#3,3:448\n23#3,3:454\n26#4:389\n26#4:393\n26#4:397\n26#4:401\n26#4:405\n26#4:414\n26#4:423\n26#4:427\n26#4:431\n26#4:435\n26#4:439\n26#4:443\n26#4:447\n26#4:451\n26#4:457\n1855#5,2:452\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n*L\n62#1:376,5\n85#1:381,5\n174#1:406,5\n252#1:415,5\n87#1:386,3\n100#1:390,3\n117#1:394,3\n144#1:398,3\n173#1:402,3\n202#1:411,3\n277#1:420,3\n284#1:424,3\n290#1:428,3\n296#1:432,3\n301#1:436,3\n306#1:440,3\n311#1:444,3\n320#1:448,3\n328#1:454,3\n87#1:389\n100#1:393\n117#1:397\n144#1:401\n173#1:405\n202#1:414\n277#1:423\n284#1:427\n290#1:431\n296#1:435\n301#1:439\n306#1:443\n311#1:447\n320#1:451\n328#1:457\n322#1:452,2\n*E\n"})
public class C1535h0<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @NotNull
    private final A.b lock;

    @NotNull
    private final A.d<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public C1535h0(@e.D(from = 1, to = LruCacheKt.f86729a) int i10) {
        this.maxSize = i10;
        if (!(i10 > 0)) {
            A.f.c("maxSize <= 0");
            throw null;
        }
        this.map = new A.d<>(0, 0.75f);
        this.lock = new A.b();
    }

    public final int a(K k10, V v10) {
        int iSizeOf = sizeOf(k10, v10);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        A.f.d("Negative size: " + k10 + SignatureVisitor.INSTANCEOF + v10);
        throw null;
    }

    @Nullable
    public V create(@NotNull K key) {
        kotlin.jvm.internal.G.p(key, "key");
        return null;
    }

    public final int createCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.createCount;
        }
        return i10;
    }

    public void entryRemoved(boolean z10, @NotNull K key, @NotNull V oldValue, @Nullable V v10) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.evictionCount;
        }
        return i10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public final V get(@NotNull K key) {
        V v10;
        kotlin.jvm.internal.G.p(key, "key");
        synchronized (this.lock) {
            V vA = this.map.a(key);
            if (vA != null) {
                this.hitCount++;
                return vA;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v10 = (V) this.map.d(key, vCreate);
                    if (v10 != null) {
                        this.map.d(key, v10);
                    } else {
                        this.size += a(key, vCreate);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v10 != null) {
                entryRemoved(false, key, vCreate, v10);
                return v10;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.hitCount;
        }
        return i10;
    }

    public final int maxSize() {
        int i10;
        synchronized (this.lock) {
            i10 = this.maxSize;
        }
        return i10;
    }

    public final int missCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.missCount;
        }
        return i10;
    }

    @Nullable
    public final V put(@NotNull K key, @NotNull V value) {
        V vD;
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(key, value);
            vD = this.map.d(key, value);
            if (vD != null) {
                this.size -= a(key, vD);
            }
        }
        if (vD != null) {
            entryRemoved(false, key, vD, value);
        }
        trimToSize(this.maxSize);
        return vD;
    }

    public final int putCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.putCount;
        }
        return i10;
    }

    @Nullable
    public final V remove(@NotNull K key) {
        V vE;
        kotlin.jvm.internal.G.p(key, "key");
        synchronized (this.lock) {
            vE = this.map.e(key);
            if (vE != null) {
                this.size -= a(key, vE);
            }
        }
        if (vE != null) {
            entryRemoved(false, key, vE, null);
        }
        return vE;
    }

    public void resize(@e.D(from = 1, to = LruCacheKt.f86729a) int i10) {
        if (!(i10 > 0)) {
            A.f.c("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = i10;
        }
        trimToSize(i10);
    }

    public final int size() {
        int i10;
        synchronized (this.lock) {
            i10 = this.size;
        }
        return i10;
    }

    public int sizeOf(@NotNull K key, @NotNull V value) {
        kotlin.jvm.internal.G.p(key, "key");
        kotlin.jvm.internal.G.p(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.b().size());
            Iterator<T> it = this.map.b().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i10 = this.hitCount;
                int i11 = this.missCount + i10;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r8) {
        /*
            r7 = this;
        L0:
            A.b r0 = r7.lock
            monitor-enter(r0)
            int r1 = r7.size     // Catch: java.lang.Throwable -> L17
            r2 = 1
            if (r1 < 0) goto L1b
            A.d<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap<K, V> r1 = r1.f14a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            int r1 = r7.size     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L1b
            goto L19
        L17:
            r8 = move-exception
            goto L68
        L19:
            r1 = r2
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r3 = 0
            if (r1 == 0) goto L62
            int r1 = r7.size     // Catch: java.lang.Throwable -> L17
            if (r1 <= r8) goto L60
            A.d<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap<K, V> r1 = r1.f14a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L2e
            goto L60
        L2e:
            A.d<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L17
            java.util.Set r1 = r1.b()     // Catch: java.lang.Throwable -> L17
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = kotlin.collections.U.J2(r1)     // Catch: java.lang.Throwable -> L17
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L40
            monitor-exit(r0)
            return
        L40:
            java.lang.Object r4 = r1.getKey()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L17
            A.d<K, V> r5 = r7.map     // Catch: java.lang.Throwable -> L17
            r5.e(r4)     // Catch: java.lang.Throwable -> L17
            int r5 = r7.size     // Catch: java.lang.Throwable -> L17
            int r6 = r7.a(r4, r1)     // Catch: java.lang.Throwable -> L17
            int r5 = r5 - r6
            r7.size = r5     // Catch: java.lang.Throwable -> L17
            int r5 = r7.evictionCount     // Catch: java.lang.Throwable -> L17
            int r5 = r5 + r2
            r7.evictionCount = r5     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            r7.entryRemoved(r2, r4, r1, r3)
            goto L0
        L60:
            monitor-exit(r0)
            return
        L62:
            java.lang.String r8 = "LruCache.sizeOf() is reporting inconsistent results!"
            A.f.d(r8)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L68:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1535h0.trimToSize(int):void");
    }
}
