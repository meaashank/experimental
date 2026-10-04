package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.T1;
import androidx.compose.runtime.U0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import fd.InterfaceC4422e;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C4968u;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,497:1\n171#1:498\n210#1,10:508\n220#1:519\n171#1:520\n221#1,9:522\n167#1:531\n230#1,7:537\n240#1,6:547\n203#1,17:553\n220#1:571\n171#1:572\n221#1,9:574\n167#1:583\n230#1,7:589\n240#1,6:599\n208#1:605\n210#1,10:606\n220#1:617\n171#1:618\n221#1,9:620\n167#1:629\n230#1,7:635\n240#1,6:645\n167#1:651\n210#1,10:662\n220#1:673\n171#1:674\n221#1,9:676\n167#1:685\n230#1,7:691\n240#1,6:701\n210#1,10:707\n220#1:718\n171#1:719\n221#1,9:721\n167#1:730\n230#1,7:736\n240#1,6:746\n203#1,17:753\n220#1:771\n171#1:772\n221#1,9:774\n167#1:783\n230#1,7:789\n240#1,6:799\n208#1:805\n207#1,13:806\n220#1:820\n171#1:821\n221#1,9:823\n167#1:832\n230#1,7:838\n240#1,6:848\n208#1:854\n176#1,5:855\n181#1:861\n171#1:862\n182#1,7:864\n167#1:871\n189#1,7:877\n198#1,3:887\n176#1,5:890\n181#1:896\n171#1:897\n182#1,7:899\n167#1:906\n189#1,7:912\n198#1,3:922\n171#1:925\n176#1,5:937\n181#1:943\n171#1:944\n182#1,7:946\n167#1:953\n189#1,7:959\n198#1,3:969\n171#1:973\n167#1:975\n214#1,6:986\n220#1:993\n171#1:994\n221#1,9:996\n167#1:1005\n230#1,7:1011\n240#1,6:1021\n214#1,7:1027\n171#1:1034\n221#1,9:1036\n167#1:1045\n230#1,7:1051\n240#1,6:1061\n171#1:1068\n167#1:1070\n171#1:1082\n167#1:1084\n2420#2:499\n2420#2:507\n2420#2:521\n2313#2,2:532\n1843#2:534\n2315#2,2:535\n2317#2,3:544\n2420#2:573\n2313#2,2:584\n1843#2:586\n2315#2,2:587\n2317#2,3:596\n2420#2:619\n2313#2,2:630\n1843#2:632\n2315#2,2:633\n2317#2,3:642\n2313#2,2:652\n1843#2:654\n2315#2,2:656\n2317#2,3:659\n2420#2:675\n2313#2,2:686\n1843#2:688\n2315#2,2:689\n2317#2,3:698\n2420#2:720\n2313#2,2:731\n1843#2:733\n2315#2,2:734\n2317#2,3:743\n2420#2:773\n2313#2,2:784\n1843#2:786\n2315#2,2:787\n2317#2,3:796\n2420#2:822\n2313#2,2:833\n1843#2:835\n2315#2,2:836\n2317#2,3:845\n2420#2:863\n2313#2,2:872\n1843#2:874\n2315#2,2:875\n2317#2,3:884\n2420#2:898\n2313#2,2:907\n1843#2:909\n2315#2,2:910\n2317#2,3:919\n2420#2:926\n2313#2,2:927\n1843#2:929\n2315#2,5:931\n2420#2:936\n2420#2:945\n2313#2,2:954\n1843#2:956\n2315#2,2:957\n2317#2,3:966\n2420#2:974\n2313#2,2:976\n1843#2:978\n2315#2,2:980\n2317#2,3:983\n2420#2:995\n2313#2,2:1006\n1843#2:1008\n2315#2,2:1009\n2317#2,3:1018\n2420#2:1035\n2313#2,2:1046\n1843#2:1048\n2315#2,2:1049\n2317#2,3:1058\n2420#2:1069\n2313#2,2:1071\n1843#2:1073\n2315#2,2:1075\n2317#2,3:1078\n2420#2:1083\n2313#2,2:1085\n1843#2:1087\n2315#2,2:1089\n2317#2,3:1092\n33#3,7:500\n89#4:518\n89#4:570\n89#4:616\n89#4:655\n89#4:658\n89#4:672\n89#4:717\n89#4:770\n89#4:819\n89#4:860\n89#4:895\n89#4:930\n89#4:942\n89#4:972\n89#4:979\n89#4:982\n89#4:992\n89#4:1067\n89#4:1074\n89#4:1077\n89#4:1081\n89#4:1088\n89#4:1091\n1#5:752\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n71#1:498\n118#1:508,10\n118#1:519\n118#1:520\n118#1:522,9\n118#1:531\n118#1:537,7\n118#1:547,6\n119#1:553,17\n119#1:571\n119#1:572\n119#1:574,9\n119#1:583\n119#1:589,7\n119#1:599,6\n119#1:605\n124#1:606,10\n124#1:617\n124#1:618\n124#1:620,9\n124#1:629\n124#1:635,7\n124#1:645,6\n126#1:651\n134#1:662,10\n134#1:673\n134#1:674\n134#1:676,9\n134#1:685\n134#1:691,7\n134#1:701,6\n135#1:707,10\n135#1:718\n135#1:719\n135#1:721,9\n135#1:730\n135#1:736,7\n135#1:746,6\n136#1:753,17\n136#1:771\n136#1:772\n136#1:774,9\n136#1:783\n136#1:789,7\n136#1:799,6\n136#1:805\n139#1:806,13\n139#1:820\n139#1:821\n139#1:823,9\n139#1:832\n139#1:838,7\n139#1:848,6\n139#1:854\n143#1:855,5\n143#1:861\n143#1:862\n143#1:864,7\n143#1:871\n143#1:877,7\n143#1:887,3\n150#1:890,5\n150#1:896\n150#1:897\n150#1:899,7\n150#1:906\n150#1:912,7\n150#1:922,3\n163#1:925\n173#1:937,5\n173#1:943\n173#1:944\n173#1:946,7\n173#1:953\n173#1:959,7\n173#1:969,3\n181#1:973\n188#1:975\n207#1:986,6\n207#1:993\n207#1:994\n207#1:996,9\n207#1:1005\n207#1:1011,7\n207#1:1021,6\n207#1:1027,7\n207#1:1034\n207#1:1036,9\n207#1:1045\n207#1:1051,7\n207#1:1061,6\n220#1:1068\n229#1:1070\n220#1:1082\n229#1:1084\n71#1:499\n114#1:507\n118#1:521\n118#1:532,2\n118#1:534\n118#1:535,2\n118#1:544,3\n119#1:573\n119#1:584,2\n119#1:586\n119#1:587,2\n119#1:596,3\n124#1:619\n124#1:630,2\n124#1:632\n124#1:633,2\n124#1:642,3\n126#1:652,2\n126#1:654\n126#1:656,2\n126#1:659,3\n134#1:675\n134#1:686,2\n134#1:688\n134#1:689,2\n134#1:698,3\n135#1:720\n135#1:731,2\n135#1:733\n135#1:734,2\n135#1:743,3\n136#1:773\n136#1:784,2\n136#1:786\n136#1:787,2\n136#1:796,3\n139#1:822\n139#1:833,2\n139#1:835\n139#1:836,2\n139#1:845,3\n143#1:863\n143#1:872,2\n143#1:874\n143#1:875,2\n143#1:884,3\n150#1:898\n150#1:907,2\n150#1:909\n150#1:910,2\n150#1:919,3\n163#1:926\n167#1:927,2\n167#1:929\n167#1:931,5\n171#1:936\n173#1:945\n173#1:954,2\n173#1:956\n173#1:957,2\n173#1:966,3\n181#1:974\n188#1:976,2\n188#1:978\n188#1:980,2\n188#1:983,3\n207#1:995\n207#1:1006,2\n207#1:1008\n207#1:1009,2\n207#1:1018,3\n207#1:1035\n207#1:1046,2\n207#1:1048\n207#1:1049,2\n207#1:1058,3\n220#1:1069\n229#1:1071,2\n229#1:1073\n229#1:1075,2\n229#1:1078,3\n220#1:1083\n229#1:1085,2\n229#1:1087\n229#1:1089,2\n229#1:1092,3\n108#1:500,7\n118#1:518\n119#1:570\n124#1:616\n126#1:655\n127#1:658\n134#1:672\n135#1:717\n136#1:770\n139#1:819\n143#1:860\n150#1:895\n167#1:930\n173#1:942\n180#1:972\n188#1:979\n189#1:982\n207#1:992\n219#1:1067\n229#1:1074\n230#1:1077\n219#1:1081\n229#1:1088\n230#1:1091\n*E\n"})
@T1
public final class SnapshotStateList<T> implements J, List<T>, RandomAccess, InterfaceC4422e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f100114b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public L f100115a;

    @V({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,497:1\n89#2:498\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n86#1:498\n*E\n"})
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class a<T> extends L {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f100116g = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public PersistentList<? extends T> f100117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f100118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f100119f;

        public a(@NotNull PersistentList<? extends T> persistentList) {
            this.f100117d = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.L
        public void c(@NotNull L l10) {
            synchronized (w.f100197a) {
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.f100117d = ((a) l10).f100117d;
                this.f100118e = ((a) l10).f100118e;
                this.f100119f = ((a) l10).f100119f;
            }
        }

        @Override // androidx.compose.runtime.snapshots.L
        @NotNull
        public L d() {
            return new a(this.f100117d);
        }

        @NotNull
        public final PersistentList<T> i() {
            return this.f100117d;
        }

        public final int j() {
            return this.f100118e;
        }

        public final int k() {
            return this.f100119f;
        }

        public final void l(@NotNull PersistentList<? extends T> persistentList) {
            this.f100117d = persistentList;
        }

        public final void m(int i10) {
            this.f100118e = i10;
        }

        public final void n(int i10) {
            this.f100119f = i10;
        }
    }

    public SnapshotStateList() {
        PersistentList persistentListB = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.j.b();
        a aVar = new a(persistentListB);
        if (AbstractC1960k.f100175e.l()) {
            a aVar2 = new a(persistentListB);
            aVar2.f100056a = 1;
            aVar.f100057b = aVar2;
        }
        this.f100115a = aVar;
    }

    public static void C(SnapshotStateList snapshotStateList, boolean z10, ed.l lVar, int i10, Object obj) {
        int i11;
        PersistentList<? extends T> persistentList;
        AbstractC1960k abstractC1960kI;
        boolean z11;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        do {
            Object obj2 = w.f100197a;
            synchronized (obj2) {
                L l10 = snapshotStateList.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i11 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList<? extends T> persistentList2 = (PersistentList) lVar.invoke(persistentList);
            if (kotlin.jvm.internal.G.g(persistentList2, persistentList)) {
                return;
            }
            L l11 = snapshotStateList.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, snapshotStateList, abstractC1960kI);
                synchronized (obj2) {
                    try {
                        int i12 = aVar3.f100118e;
                        if (i12 == i11) {
                            aVar3.f100117d = persistentList2;
                            if (z10) {
                                aVar3.f100119f++;
                            }
                            aVar3.f100118e = i12 + 1;
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } finally {
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, snapshotStateList);
        } while (!z11);
    }

    public static boolean g(SnapshotStateList snapshotStateList, boolean z10, ed.l lVar, int i10, Object obj) {
        int i11;
        PersistentList<? extends T> persistentList;
        boolean z11;
        AbstractC1960k abstractC1960kI;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        do {
            Object obj2 = w.f100197a;
            synchronized (obj2) {
                L l10 = snapshotStateList.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i11 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList<? extends T> persistentList2 = (PersistentList) lVar.invoke(persistentList);
            z11 = false;
            if (kotlin.jvm.internal.G.g(persistentList2, persistentList)) {
                return false;
            }
            L l11 = snapshotStateList.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, snapshotStateList, abstractC1960kI);
                synchronized (obj2) {
                    try {
                        int i12 = aVar3.f100118e;
                        if (i12 == i11) {
                            aVar3.f100117d = persistentList2;
                            if (z10) {
                                aVar3.f100119f++;
                            }
                            aVar3.f100118e = i12 + 1;
                            z11 = true;
                        }
                    } finally {
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, snapshotStateList);
        } while (!z11);
        return true;
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void o() {
    }

    @NotNull
    public final List<T> A() {
        return j().f100117d;
    }

    public final void B(boolean z10, ed.l<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> lVar) {
        int i10;
        PersistentList<? extends T> persistentList;
        AbstractC1960k abstractC1960kI;
        boolean z11;
        do {
            Object obj = w.f100197a;
            synchronized (obj) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i10 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList<? extends T> persistentListInvoke = lVar.invoke(persistentList);
            if (kotlin.jvm.internal.G.g(persistentListInvoke, persistentList)) {
                return;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    try {
                        int i11 = aVar3.f100118e;
                        if (i11 == i10) {
                            aVar3.f100117d = persistentListInvoke;
                            z11 = true;
                            if (z10) {
                                aVar3.f100119f++;
                            }
                            aVar3.f100118e = i11 + 1;
                        } else {
                            z11 = false;
                        }
                    } finally {
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z11);
    }

    public final <R> R D(ed.l<? super a<T>, ? extends R> lVar) {
        L l10 = this.f100115a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return lVar.invoke(SnapshotKt.G((a) l10));
    }

    public final <R> R E(ed.l<? super a<T>, ? extends R> lVar) {
        AbstractC1960k abstractC1960kI;
        R rInvoke;
        L l10 = this.f100115a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
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

    @Override // java.util.List
    public void add(int i10, T t10) {
        int i11;
        PersistentList<? extends T> persistentList;
        AbstractC1960k abstractC1960kI;
        boolean z10;
        do {
            Object obj = w.f100197a;
            synchronized (obj) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i11 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList<? extends T> persistentListAdd = persistentList.add(i10, t10);
            if (persistentListAdd.equals(persistentList)) {
                return;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i12 = aVar3.f100118e;
                    if (i12 == i11) {
                        aVar3.f100117d = persistentListAdd;
                        z10 = true;
                        aVar3.f100119f++;
                        aVar3.f100118e = i12 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> collection) {
        int i10;
        PersistentList<? extends T> persistentList;
        boolean z10;
        AbstractC1960k abstractC1960kI;
        do {
            Object obj = w.f100197a;
            synchronized (obj) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i10 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList<? extends T> persistentListAddAll = persistentList.addAll((Collection<? extends Object>) collection);
            z10 = false;
            if (kotlin.jvm.internal.G.g(persistentListAddAll, persistentList)) {
                return false;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i11 = aVar3.f100118e;
                    if (i11 == i10) {
                        aVar3.f100117d = persistentListAddAll;
                        aVar3.f100119f++;
                        aVar3.f100118e = i11 + 1;
                        z10 = true;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return true;
    }

    public final boolean b(boolean z10, ed.l<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> lVar) {
        int i10;
        PersistentList<? extends T> persistentList;
        boolean z11;
        AbstractC1960k abstractC1960kI;
        do {
            Object obj = w.f100197a;
            synchronized (obj) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i10 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList<? extends T> persistentListInvoke = lVar.invoke(persistentList);
            z11 = false;
            if (kotlin.jvm.internal.G.g(persistentListInvoke, persistentList)) {
                return false;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    try {
                        int i11 = aVar3.f100118e;
                        if (i11 == i10) {
                            aVar3.f100117d = persistentListInvoke;
                            if (z10) {
                                aVar3.f100119f++;
                            }
                            aVar3.f100118e = i11 + 1;
                            z11 = true;
                        }
                    } finally {
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z11);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        AbstractC1960k abstractC1960kI;
        L l10 = this.f100115a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) l10;
        SnapshotKt.M();
        synchronized (SnapshotKt.f100097d) {
            AbstractC1960k.f100175e.getClass();
            abstractC1960kI = SnapshotKt.I();
            a aVar2 = (a) SnapshotKt.r0(aVar, this, abstractC1960kI);
            synchronized (w.f100197a) {
                aVar2.f100117d = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.j.b();
                aVar2.f100118e++;
                aVar2.f100119f++;
            }
        }
        SnapshotKt.U(abstractC1960kI, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return j().f100117d.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        return j().f100117d.containsAll(collection);
    }

    @Override // java.util.List
    public T get(int i10) {
        return j().f100117d.get(i10);
    }

    @Override // androidx.compose.runtime.snapshots.J
    @NotNull
    public L getFirstStateRecord() {
        return this.f100115a;
    }

    public int getSize() {
        return j().f100117d.size();
    }

    @dd.j(name = "getDebuggerDisplayValue")
    @NotNull
    public final List<T> h() {
        L l10 = this.f100115a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) SnapshotKt.G((a) l10)).f100117d;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return j().f100117d.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return j().f100117d.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator();
    }

    @NotNull
    public final a<T> j() {
        L l10 = this.f100115a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) SnapshotKt.c0((a) l10, this);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return j().f100117d.lastIndexOf(obj);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return new D(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.J
    public /* synthetic */ L mergeRecords(L l10, L l11, L l12) {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.J
    public void prependStateRecord(@NotNull L l10) {
        l10.f100057b = this.f100115a;
        this.f100115a = (a) l10;
    }

    public final int q() {
        L l10 = this.f100115a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) SnapshotKt.G((a) l10)).f100119f;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int i10;
        PersistentList<? extends T> persistentList;
        boolean z10;
        AbstractC1960k abstractC1960kI;
        do {
            Object obj2 = w.f100197a;
            synchronized (obj2) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i10 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList<? extends T> persistentListRemove = persistentList.remove(obj);
            z10 = false;
            if (kotlin.jvm.internal.G.g(persistentListRemove, persistentList)) {
                return false;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj2) {
                    int i11 = aVar3.f100118e;
                    if (i11 == i10) {
                        aVar3.f100117d = persistentListRemove;
                        aVar3.f100119f++;
                        aVar3.f100118e = i11 + 1;
                        z10 = true;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        int i10;
        PersistentList<? extends T> persistentList;
        boolean z10;
        AbstractC1960k abstractC1960kI;
        do {
            Object obj = w.f100197a;
            synchronized (obj) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i10 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList<? extends T> persistentListRemoveAll = persistentList.removeAll((Collection<? extends Object>) collection);
            z10 = false;
            if (kotlin.jvm.internal.G.g(persistentListRemoveAll, persistentList)) {
                return false;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i11 = aVar3.f100118e;
                    if (i11 == i10) {
                        aVar3.f100117d = persistentListRemoveAll;
                        aVar3.f100119f++;
                        aVar3.f100118e = i11 + 1;
                        z10 = true;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull final Collection<? extends Object> collection) {
        return v(new ed.l<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull List<T> list) {
                return Boolean.valueOf(list.retainAll(collection));
            }
        });
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        int i11;
        PersistentList<? extends T> persistentList;
        AbstractC1960k abstractC1960kI;
        boolean z10;
        T t11 = get(i10);
        do {
            Object obj = w.f100197a;
            synchronized (obj) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i11 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList<? extends T> persistentList2 = persistentList.set(i10, t10);
            if (persistentList2.equals(persistentList)) {
                break;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i12 = aVar3.f100118e;
                    if (i12 == i11) {
                        aVar3.f100117d = persistentList2;
                        aVar3.f100118e = i12 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11 && i11 <= getSize()) {
            return new M(this, i10, i11);
        }
        U0.d("fromIndex or toIndex are out of bounds");
        throw null;
    }

    public final <R> R t(ed.l<? super List<T>, ? extends R> lVar) {
        int i10;
        PersistentList<? extends T> persistentList;
        R rInvoke;
        AbstractC1960k abstractC1960kI;
        boolean z10;
        do {
            Object obj = w.f100197a;
            synchronized (obj) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i10 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList.Builder<? extends T> builder = persistentList.builder();
            rInvoke = lVar.invoke(builder);
            PersistentList<? extends T> persistentListBuild = ((PersistentVectorBuilder) builder).build();
            if (kotlin.jvm.internal.G.g(persistentListBuild, persistentList)) {
                break;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i11 = aVar3.f100118e;
                    if (i11 == i10) {
                        aVar3.f100117d = persistentListBuild;
                        aVar3.f100118e = i11 + 1;
                        z10 = true;
                        aVar3.f100119f++;
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return rInvoke;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C4968u.a(this);
    }

    @NotNull
    public String toString() {
        L l10 = this.f100115a;
        kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((a) SnapshotKt.G((a) l10)).f100117d + ")@" + hashCode();
    }

    public final boolean v(ed.l<? super List<T>, Boolean> lVar) {
        int i10;
        PersistentList<? extends T> persistentList;
        Boolean boolInvoke;
        AbstractC1960k abstractC1960kI;
        boolean z10;
        do {
            Object obj = w.f100197a;
            synchronized (obj) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i10 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList.Builder<? extends T> builder = persistentList.builder();
            boolInvoke = lVar.invoke(builder);
            PersistentList<? extends T> persistentListBuild = ((PersistentVectorBuilder) builder).build();
            if (kotlin.jvm.internal.G.g(persistentListBuild, persistentList)) {
                break;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i11 = aVar3.f100118e;
                    if (i11 == i10) {
                        aVar3.f100117d = persistentListBuild;
                        aVar3.f100118e = i11 + 1;
                        z10 = true;
                        aVar3.f100119f++;
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return boolInvoke.booleanValue();
    }

    public T w(int i10) {
        int i11;
        PersistentList<? extends T> persistentList;
        AbstractC1960k abstractC1960kI;
        boolean z10;
        T t10 = get(i10);
        do {
            Object obj = w.f100197a;
            synchronized (obj) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i11 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList<? extends T> persistentListL = persistentList.l(i10);
            if (kotlin.jvm.internal.G.g(persistentListL, persistentList)) {
                break;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i12 = aVar3.f100118e;
                    if (i12 == i11) {
                        aVar3.f100117d = persistentListL;
                        z10 = true;
                        aVar3.f100119f++;
                        aVar3.f100118e = i12 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return t10;
    }

    public final void x(int i10, int i11) {
        int i12;
        PersistentList<? extends T> persistentList;
        AbstractC1960k abstractC1960kI;
        boolean z10;
        do {
            Object obj = w.f100197a;
            synchronized (obj) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i12 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList.Builder<? extends T> builder = persistentList.builder();
            ((AbstractList) builder).subList(i10, i11).clear();
            PersistentList<? extends T> persistentListBuild = ((PersistentVectorBuilder) builder).build();
            if (kotlin.jvm.internal.G.g(persistentListBuild, persistentList)) {
                return;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i13 = aVar3.f100118e;
                    if (i13 == i12) {
                        aVar3.f100117d = persistentListBuild;
                        aVar3.f100118e = i13 + 1;
                        z10 = true;
                        aVar3.f100119f++;
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
    }

    public final int z(@NotNull Collection<? extends T> collection, int i10, int i11) {
        int i12;
        PersistentList<? extends T> persistentList;
        AbstractC1960k abstractC1960kI;
        boolean z10;
        int size = getSize();
        do {
            Object obj = w.f100197a;
            synchronized (obj) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i12 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList.Builder<? extends T> builder = persistentList.builder();
            ((AbstractList) builder).subList(i10, i11).retainAll(collection);
            PersistentList<? extends T> persistentListBuild = ((PersistentVectorBuilder) builder).build();
            if (kotlin.jvm.internal.G.g(persistentListBuild, persistentList)) {
                break;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i13 = aVar3.f100118e;
                    if (i13 == i12) {
                        aVar3.f100117d = persistentListBuild;
                        aVar3.f100118e = i13 + 1;
                        z10 = true;
                        aVar3.f100119f++;
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return size - getSize();
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i10) {
        return new D(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C4968u.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        int i10;
        PersistentList<? extends T> persistentList;
        boolean z10;
        AbstractC1960k abstractC1960kI;
        do {
            Object obj = w.f100197a;
            synchronized (obj) {
                L l10 = this.f100115a;
                kotlin.jvm.internal.G.n(l10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) SnapshotKt.G((a) l10);
                i10 = aVar.f100118e;
                persistentList = aVar.f100117d;
            }
            kotlin.jvm.internal.G.m(persistentList);
            PersistentList<? extends T> persistentListAdd = persistentList.add(t10);
            z10 = false;
            if (persistentListAdd.equals(persistentList)) {
                return false;
            }
            L l11 = this.f100115a;
            kotlin.jvm.internal.G.n(l11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) l11;
            AbstractC1960k abstractC1960k = SnapshotKt.f100105l;
            synchronized (SnapshotKt.f100097d) {
                AbstractC1960k.f100175e.getClass();
                abstractC1960kI = SnapshotKt.I();
                a aVar3 = (a) SnapshotKt.r0(aVar2, this, abstractC1960kI);
                synchronized (obj) {
                    int i11 = aVar3.f100118e;
                    if (i11 == i10) {
                        aVar3.f100117d = persistentListAdd;
                        aVar3.f100119f++;
                        aVar3.f100118e = i11 + 1;
                        z10 = true;
                    }
                }
            }
            SnapshotKt.U(abstractC1960kI, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int i10, @NotNull final Collection<? extends T> collection) {
        return v(new ed.l<List<T>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.addAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull List<T> list) {
                return Boolean.valueOf(list.addAll(i10, collection));
            }
        });
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return w(i10);
    }
}
