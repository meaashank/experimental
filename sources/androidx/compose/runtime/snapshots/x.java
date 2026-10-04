package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.T1;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import fd.InterfaceC4424g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n166#1:374\n133#1:375\n167#1,2:377\n137#1:379\n169#1,3:386\n174#1:392\n140#1,5:393\n145#1:399\n133#1:400\n146#1,7:402\n137#1:409\n153#1,6:415\n161#1,3:424\n140#1,5:427\n145#1:433\n133#1:434\n146#1,7:436\n137#1:443\n153#1,6:449\n161#1,3:458\n140#1,5:461\n145#1:467\n133#1:468\n146#1,7:470\n137#1:477\n153#1,6:483\n161#1,3:492\n140#1,5:498\n145#1:504\n133#1:505\n146#1,7:507\n137#1:514\n153#1,6:520\n161#1,3:529\n133#1:532\n133#1:545\n137#1:547\n133#1:558\n137#1:560\n2420#2:373\n2420#2:376\n2313#2,2:380\n1843#2:382\n2315#2,2:384\n2317#2,3:389\n2420#2:401\n2313#2,2:410\n1843#2:412\n2315#2,2:413\n2317#2,3:421\n2420#2:435\n2313#2,2:444\n1843#2:446\n2315#2,2:447\n2317#2,3:455\n2420#2:469\n2313#2,2:478\n1843#2:480\n2315#2,2:481\n2317#2,3:489\n2420#2:506\n2313#2,2:515\n1843#2:517\n2315#2,2:518\n2317#2,3:526\n2420#2:533\n2420#2:534\n2313#2,2:535\n1843#2:537\n2315#2,5:539\n2420#2:546\n2313#2,2:548\n1843#2:550\n2315#2,2:552\n2317#2,3:555\n2420#2:559\n2313#2,2:561\n1843#2:563\n2315#2,2:565\n2317#2,3:568\n89#3:383\n89#3:398\n89#3:432\n89#3:466\n89#3:503\n89#3:538\n89#3:544\n89#3:551\n89#3:554\n89#3:564\n89#3:567\n288#4,2:495\n1#5:497\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n81#1:374\n81#1:375\n81#1:377,2\n81#1:379\n81#1:386,3\n81#1:392\n82#1:393,5\n82#1:399\n82#1:400\n82#1:402,7\n82#1:409\n82#1:415,6\n82#1:424,3\n83#1:427,5\n83#1:433\n83#1:434\n83#1:436,7\n83#1:443\n83#1:449,6\n83#1:458,3\n84#1:461,5\n84#1:467\n84#1:468\n84#1:470,7\n84#1:477\n84#1:483,6\n84#1:492,3\n97#1:498,5\n97#1:504\n97#1:505\n97#1:507,7\n97#1:514\n97#1:520,6\n97#1:529,3\n129#1:532\n145#1:545\n152#1:547\n166#1:558\n168#1:560\n77#1:373\n81#1:376\n81#1:380,2\n81#1:382\n81#1:384,2\n81#1:389,3\n82#1:401\n82#1:410,2\n82#1:412\n82#1:413,2\n82#1:421,3\n83#1:435\n83#1:444,2\n83#1:446\n83#1:447,2\n83#1:455,3\n84#1:469\n84#1:478,2\n84#1:480\n84#1:481,2\n84#1:489,3\n97#1:506\n97#1:515,2\n97#1:517\n97#1:518,2\n97#1:526,3\n129#1:533\n133#1:534\n137#1:535,2\n137#1:537\n137#1:539,5\n145#1:546\n152#1:548,2\n152#1:550\n152#1:552,2\n152#1:555,3\n166#1:559\n168#1:561,2\n168#1:563\n168#1:565,2\n168#1:568,3\n81#1:383\n82#1:398\n83#1:432\n84#1:466\n97#1:503\n137#1:538\n144#1:544\n152#1:551\n153#1:554\n168#1:564\n169#1:567\n89#1:495,2\n*E\n"})
@T1
public final class x<K, V> implements J, Map<K, V>, InterfaceC4424g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100198e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public L f100199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Set<Map.Entry<K, V>> f100200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Set<K> f100201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Collection<V> f100202d;

    @V({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,372:1\n89#2:373\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n186#1:373\n*E\n"})
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class a<K, V> extends L {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f100203f = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public PersistentMap<K, ? extends V> f100204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f100205e;

        public a(@NotNull PersistentMap<K, ? extends V> persistentMap) {
            this.f100204d = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.L
        public void c(@NotNull L l10) {
            kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) l10;
            synchronized (y.f100206a) {
                this.f100204d = aVar.f100204d;
                this.f100205e = aVar.f100205e;
            }
        }

        @Override // androidx.compose.runtime.snapshots.L
        @NotNull
        public L d() {
            return new a(this.f100204d);
        }

        @NotNull
        public final PersistentMap<K, V> i() {
            return this.f100204d;
        }

        public final int j() {
            return this.f100205e;
        }

        public final void k(@NotNull PersistentMap<K, ? extends V> persistentMap) {
            this.f100204d = persistentMap;
        }

        public final void l(int i10) {
            this.f100205e = i10;
        }
    }

    public x() {
        J.d<K, V> dVarA = J.d.f53059f.a();
        a aVar = new a(dVarA);
        if (AbstractC1960k.f100175e.l()) {
            a aVar2 = new a(dVarA);
            aVar2.f100056a = 1;
            aVar.f100057b = aVar2;
        }
        this.f100199a = aVar;
        this.f100200b = new r(this);
        this.f100201c = new s(this);
        this.f100202d = new u(this);
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void o() {
    }

    private final <R> R q(ed.l<? super Map<K, V>, ? extends R> lVar) {
        PersistentMap<K, ? extends V> persistentMap;
        int i10;
        R rInvoke;
        AbstractC1960k abstractC1960kI;
        boolean z10;
        do {
            Object obj = y.f100206a;
            synchronized (obj) {
                L l10 = this.f100199a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) SnapshotKt.G((a) l10);
                persistentMap = aVar.f100204d;
                i10 = aVar.f100205e;
            }
            kotlin.jvm.internal.G.m(persistentMap);
            PersistentMap.Builder<K, ? extends V> builder = persistentMap.builder();
            rInvoke = lVar.invoke(builder);
            PersistentMap<K, ? extends V> persistentMapBuild = builder.build();
            if (kotlin.jvm.internal.G.g(persistentMapBuild, persistentMap)) {
                break;
            }
            L l11 = this.f100199a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i11 = aVar3.f100205e;
                    if (i11 == i10) {
                        aVar3.f100204d = persistentMapBuild;
                        aVar3.f100205e = i11 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return rInvoke;
    }

    private final void v(ed.l<? super PersistentMap<K, ? extends V>, ? extends PersistentMap<K, ? extends V>> lVar) {
        AbstractC1960k abstractC1960kI;
        L l10 = this.f100199a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) SnapshotKt.G((a) l10);
        PersistentMap<K, ? extends V> persistentMapInvoke = lVar.invoke(aVar.f100204d);
        if (persistentMapInvoke != aVar.f100204d) {
            L l11 = this.f100199a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (y.f100206a) {
                    aVar3.f100204d = persistentMapInvoke;
                    aVar3.f100205e++;
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        }
    }

    private final <R> R w(ed.l<? super a<K, V>, ? extends R> lVar) {
        L l10 = this.f100199a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return lVar.invoke(SnapshotKt.G((a) l10));
    }

    private final <R> R x(ed.l<? super a<K, V>, ? extends R> lVar) {
        AbstractC1960k abstractC1960kI;
        R rInvoke;
        L l10 = this.f100199a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) l10;
        SnapshotKt.M();
        synchronized (SnapshotKt.f100097d) {
            AbstractC1960k.f100175e.getClass();
            abstractC1960kI = SnapshotKt.I();
            rInvoke = lVar.invoke(SnapshotKt.r0(aVar, this, abstractC1960kI));
        }
        SnapshotKt.U(abstractC1960kI, this);
        return rInvoke;
    }

    public final boolean b(@NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Iterator<E> it = ((H.e) m().f100204d.entrySet()).iterator();
        while (it.hasNext()) {
            if (!lVar.invoke((Map.Entry) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public void clear() {
        AbstractC1960k abstractC1960kI;
        L l10 = this.f100199a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) SnapshotKt.G((a) l10);
        J.d<K, V> dVarA = J.d.f53059f.a();
        if (dVarA != aVar.f100204d) {
            L l11 = this.f100199a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (y.f100206a) {
                    aVar3.f100204d = dVarA;
                    aVar3.f100205e++;
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m().f100204d.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m().f100204d.containsValue(obj);
    }

    public final boolean d(@NotNull ed.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Iterator<E> it = ((H.e) m().f100204d.entrySet()).iterator();
        while (it.hasNext()) {
            if (lVar.invoke((Map.Entry) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dd.j(name = "getDebuggerDisplayValue")
    @NotNull
    public final Map<K, V> e() {
        L l10 = this.f100199a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((a) SnapshotKt.G((a) l10)).f100204d;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f100200b;
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return m().f100204d.get(obj);
    }

    @Override // androidx.compose.runtime.snapshots.J
    @NotNull
    public L getFirstStateRecord() {
        return this.f100199a;
    }

    public int getSize() {
        return m().f100204d.size();
    }

    @NotNull
    public Set<Map.Entry<K, V>> h() {
        return this.f100200b;
    }

    @NotNull
    public Set<K> i() {
        return this.f100201c;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return m().f100204d.isEmpty();
    }

    public final int j() {
        return m().f100205e;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f100201c;
    }

    @NotNull
    public final a<K, V> m() {
        L l10 = this.f100199a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) SnapshotKt.c0((a) l10, this);
    }

    @Override // androidx.compose.runtime.snapshots.J
    public /* synthetic */ L mergeRecords(L l10, L l11, L l12) {
        return null;
    }

    @NotNull
    public Collection<V> p() {
        return this.f100202d;
    }

    @Override // androidx.compose.runtime.snapshots.J
    public void prependStateRecord(@NotNull L l10) {
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f100199a = (a) l10;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k10, V v10) {
        PersistentMap<K, ? extends V> persistentMap;
        int i10;
        V vPut;
        AbstractC1960k abstractC1960kI;
        boolean z10;
        do {
            Object obj = y.f100206a;
            synchronized (obj) {
                L l10 = this.f100199a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) SnapshotKt.G((a) l10);
                persistentMap = aVar.f100204d;
                i10 = aVar.f100205e;
            }
            kotlin.jvm.internal.G.m(persistentMap);
            PersistentMap.Builder<K, ? extends V> builder = persistentMap.builder();
            vPut = builder.put(k10, v10);
            PersistentMap<K, ? extends V> persistentMapBuild = builder.build();
            if (kotlin.jvm.internal.G.g(persistentMapBuild, persistentMap)) {
                break;
            }
            L l11 = this.f100199a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i11 = aVar3.f100205e;
                    if (i11 == i10) {
                        aVar3.f100204d = persistentMapBuild;
                        aVar3.f100205e = i11 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return vPut;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        PersistentMap<K, ? extends V> persistentMap;
        int i10;
        AbstractC1960k abstractC1960kI;
        boolean z10;
        do {
            Object obj = y.f100206a;
            synchronized (obj) {
                L l10 = this.f100199a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) SnapshotKt.G((a) l10);
                persistentMap = aVar.f100204d;
                i10 = aVar.f100205e;
            }
            kotlin.jvm.internal.G.m(persistentMap);
            PersistentMap.Builder<K, ? extends V> builder = persistentMap.builder();
            builder.putAll(map);
            PersistentMap<K, ? extends V> persistentMapBuild = builder.build();
            if (kotlin.jvm.internal.G.g(persistentMapBuild, persistentMap)) {
                return;
            }
            L l11 = this.f100199a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i11 = aVar3.f100205e;
                    if (i11 == i10) {
                        aVar3.f100204d = persistentMapBuild;
                        aVar3.f100205e = i11 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
    }

    public final boolean r(@NotNull ed.l<? super Map.Entry<K, V>, Boolean> lVar) {
        PersistentMap<K, ? extends V> persistentMap;
        int i10;
        boolean z10;
        AbstractC1960k abstractC1960kI;
        boolean z11 = false;
        do {
            synchronized (y.f100206a) {
                L l10 = this.f100199a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) SnapshotKt.G((a) l10);
                persistentMap = aVar.f100204d;
                i10 = aVar.f100205e;
            }
            kotlin.jvm.internal.G.m(persistentMap);
            PersistentMap.Builder<K, ? extends V> builder = persistentMap.builder();
            Iterator<Map.Entry<K, V>> it = this.f100200b.iterator();
            while (true) {
                z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                if (lVar.invoke(next).booleanValue()) {
                    builder.remove(next.getKey());
                    z11 = true;
                }
            }
            PersistentMap<K, ? extends V> persistentMapBuild = builder.build();
            if (kotlin.jvm.internal.G.g(persistentMapBuild, persistentMap)) {
                break;
            }
            L l11 = this.f100199a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (y.f100206a) {
                    int i11 = aVar3.f100205e;
                    if (i11 == i10) {
                        aVar3.f100204d = persistentMapBuild;
                        aVar3.f100205e = i11 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return z11;
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        PersistentMap<K, ? extends V> persistentMap;
        int i10;
        V vRemove;
        AbstractC1960k abstractC1960kI;
        boolean z10;
        do {
            Object obj2 = y.f100206a;
            synchronized (obj2) {
                L l10 = this.f100199a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) SnapshotKt.G((a) l10);
                persistentMap = aVar.f100204d;
                i10 = aVar.f100205e;
            }
            kotlin.jvm.internal.G.m(persistentMap);
            PersistentMap.Builder<K, ? extends V> builder = persistentMap.builder();
            vRemove = builder.remove(obj);
            PersistentMap<K, ? extends V> persistentMapBuild = builder.build();
            if (kotlin.jvm.internal.G.g(persistentMapBuild, persistentMap)) {
                break;
            }
            L l11 = this.f100199a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj2) {
                    int i11 = aVar3.f100205e;
                    if (i11 == i10) {
                        aVar3.f100204d = persistentMapBuild;
                        aVar3.f100205e = i11 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return vRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final boolean t(V v10) {
        Object next;
        Iterator<T> it = this.f100200b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.G.g(((Map.Entry) next).getValue(), v10)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @NotNull
    public String toString() {
        L l10 = this.f100199a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((a) SnapshotKt.G((a) l10)).f100204d + ")@" + hashCode();
    }

    @NotNull
    public final Map<K, V> u() {
        return m().f100204d;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f100202d;
    }
}
