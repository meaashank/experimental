package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.room.M;
import e.InterfaceC4326A;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.InterfaceC4982o;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.C4969v;
import o.C5287b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v2.C5673b;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,840:1\n215#2,2:841\n11335#3:843\n11670#3,3:844\n13579#3,2:847\n13579#3,2:849\n13674#3,3:855\n37#4,2:851\n1855#5,2:853\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n*L\n102#1:841,2\n250#1:843\n250#1:844,3\n271#1:847,2\n287#1:849,2\n491#1:855,3\n294#1:851,2\n467#1:853,2\n*E\n"})
public class G {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f117072q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String[] f117073r = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f117074s = "room_table_modification_log";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f117075t = "table_id";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f117076u = "invalidated";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f117077v = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f117078w = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final String f117079x = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f117080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f117081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, Set<String>> f117082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, Integer> f117083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String[] f117084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public C2656d f117085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final AtomicBoolean f117086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f117087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public volatile v2.h f117088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final b f117089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final D f117090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InterfaceC4326A("observerMap")
    @NotNull
    public final C5287b<c, d> f117091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public M f117092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Object f117093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Object f117094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dd.g
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final Runnable f117095p;

    public static final class a {
        public a() {
        }

        @e.f0
        public static /* synthetic */ void b() {
        }

        @e.f0
        public static /* synthetic */ void c() {
        }

        public final void a(@NotNull v2.d database) {
            kotlin.jvm.internal.G.p(database, "database");
            if (database.M3()) {
                database.P0();
            } else {
                database.s0();
            }
        }

        @NotNull
        public final String d(@NotNull String tableName, @NotNull String triggerType) {
            kotlin.jvm.internal.G.p(tableName, "tableName");
            kotlin.jvm.internal.G.p(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + Ra.b.f67799c + triggerType + '`';
        }

        public a(C4969v c4969v) {
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13600#2,2:841\n13600#2,2:843\n13684#2,3:845\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n*L\n711#1:841,2\n729#1:843,2\n765#1:845,3\n*E\n"})
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f117096e = new a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f117097f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f117098g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f117099h = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final long[] f117100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final boolean[] f117101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final int[] f117102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f117103d;

        public static final class a {
            public a() {
            }

            public a(C4969v c4969v) {
            }
        }

        public b(int i10) {
            this.f117100a = new long[i10];
            this.f117101b = new boolean[i10];
            this.f117102c = new int[i10];
        }

        public final boolean a() {
            return this.f117103d;
        }

        @NotNull
        public final long[] b() {
            return this.f117100a;
        }

        @e.f0
        @dd.j(name = "getTablesToSync")
        @Nullable
        public final int[] c() {
            synchronized (this) {
                try {
                    if (!this.f117103d) {
                        return null;
                    }
                    long[] jArr = this.f117100a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f117101b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f117102c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f117102c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f117103d = false;
                    return (int[]) this.f117102c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean d(@NotNull int... tableIds) {
            boolean z10;
            kotlin.jvm.internal.G.p(tableIds, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i10 : tableIds) {
                    long[] jArr = this.f117100a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        z10 = true;
                        this.f117103d = true;
                    }
                }
            }
            return z10;
        }

        public final boolean e(@NotNull int... tableIds) {
            boolean z10;
            kotlin.jvm.internal.G.p(tableIds, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i10 : tableIds) {
                    long[] jArr = this.f117100a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        z10 = true;
                        this.f117103d = true;
                    }
                }
            }
            return z10;
        }

        public final void f() {
            synchronized (this) {
                Arrays.fill(this.f117101b, false);
                this.f117103d = true;
            }
        }

        public final void g(boolean z10) {
            this.f117103d = z10;
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,840:1\n37#2,2:841\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n*L\n670#1:841,2\n*E\n"})
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String[] f117104a;

        public c(@NotNull String[] tables) {
            kotlin.jvm.internal.G.p(tables, "tables");
            this.f117104a = tables;
        }

        @NotNull
        public final String[] a() {
            return this.f117104a;
        }

        public boolean b() {
            return this instanceof M.a;
        }

        public abstract void c(@NotNull Set<String> set);

        /* JADX WARN: Illegal instructions before constructor call */
        public c(@NotNull String firstTable, @NotNull String... rest) {
            kotlin.jvm.internal.G.p(firstTable, "firstTable");
            kotlin.jvm.internal.G.p(rest, "rest");
            List listJ = kotlin.collections.H.j();
            kotlin.collections.N.u0(listJ, rest);
            ((ListBuilder) listJ).add(firstTable);
            this((String[]) kotlin.collections.H.b(listJ).toArray(new String[0]));
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13674#2,3:841\n12744#2,2:844\n13579#2:846\n13579#2,2:847\n13580#2:849\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n*L\n612#1:841,3\n634#1:844,2\n640#1:846\n641#1:847,2\n640#1:849\n*E\n"})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final c f117105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final int[] f117106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String[] f117107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Set<String> f117108d;

        public d(@NotNull c observer, @NotNull int[] tableIds, @NotNull String[] tableNames) {
            kotlin.jvm.internal.G.p(observer, "observer");
            kotlin.jvm.internal.G.p(tableIds, "tableIds");
            kotlin.jvm.internal.G.p(tableNames, "tableNames");
            this.f117105a = observer;
            this.f117106b = tableIds;
            this.f117107c = tableNames;
            this.f117108d = !(tableNames.length == 0) ? kotlin.collections.x0.f(tableNames[0]) : EmptySet.f217512a;
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        @NotNull
        public final c a() {
            return this.f117105a;
        }

        @NotNull
        public final int[] b() {
            return this.f117106b;
        }

        public final void c(@NotNull Set<Integer> invalidatedTablesIds) {
            Set<String> setG;
            kotlin.jvm.internal.G.p(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f117106b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    SetBuilder setBuilder = new SetBuilder();
                    int[] iArr2 = this.f117106b;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                            setBuilder.add(this.f117107c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    setG = setBuilder.g();
                } else {
                    setG = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f117108d : EmptySet.f217512a;
                }
            } else {
                setG = EmptySet.f217512a;
            }
            if (setG.isEmpty()) {
                return;
            }
            this.f117105a.c(setG);
        }

        public final void d(@NotNull String[] tables) {
            Set<String> setG;
            kotlin.jvm.internal.G.p(tables, "tables");
            int length = this.f117107c.length;
            if (length == 0) {
                setG = EmptySet.f217512a;
            } else if (length == 1) {
                int length2 = tables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        setG = EmptySet.f217512a;
                        break;
                    } else {
                        if (kotlin.text.F.e2(tables[i10], this.f117107c[0], true)) {
                            setG = this.f117108d;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                SetBuilder setBuilder = new SetBuilder();
                for (String str : tables) {
                    for (String str2 : this.f117107c) {
                        if (kotlin.text.F.e2(str2, str, true)) {
                            setBuilder.add(str2);
                        }
                    }
                }
                setG = setBuilder.g();
            }
            if (setG.isEmpty()) {
                return;
            }
            this.f117105a.c(setG);
        }
    }

    public static final class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final G f117109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final WeakReference<c> f117110c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull G tracker, @NotNull c delegate) {
            super(delegate.f117104a);
            kotlin.jvm.internal.G.p(tracker, "tracker");
            kotlin.jvm.internal.G.p(delegate, "delegate");
            this.f117109b = tracker;
            this.f117110c = new WeakReference<>(delegate);
        }

        @Override // androidx.room.G.c
        public void c(@NotNull Set<String> tables) {
            kotlin.jvm.internal.G.p(tables, "tables");
            c cVar = this.f117110c.get();
            if (cVar == null) {
                this.f117109b.t(this);
            } else {
                cVar.c(tables);
            }
        }

        @NotNull
        public final WeakReference<c> d() {
            return this.f117110c;
        }

        @NotNull
        public final G e() {
            return this.f117109b;
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$refreshRunnable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,840:1\n1855#2,2:841\n145#3,7:843\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$refreshRunnable$1\n*L\n399#1:841,2\n408#1:843,7\n*E\n"})
    public static final class f implements Runnable {
        public f() {
        }

        public final Set<Integer> a() {
            G g10 = G.this;
            SetBuilder setBuilder = new SetBuilder();
            Cursor cursorM = RoomDatabase.M(g10.f117080a, new C5673b(G.f117079x), null, 2, null);
            try {
                Cursor cursor = cursorM;
                while (cursor.moveToNext()) {
                    setBuilder.add(Integer.valueOf(cursor.getInt(0)));
                }
                kotlin.io.b.a(cursorM, null);
                Set<Integer> setG = setBuilder.g();
                if (setG.isEmpty()) {
                    return setG;
                }
                if (G.this.f117088i == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                v2.h hVar = G.this.f117088i;
                if (hVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                hVar.y0();
                return setG;
            } finally {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Set<Integer> setA;
            C2656d c2656d;
            C2656d c2656d2;
            Lock lockO = G.this.f117080a.o();
            lockO.lock();
            try {
                try {
                } finally {
                    lockO.unlock();
                    c2656d2 = G.this.f117085f;
                    if (c2656d2 != null) {
                        c2656d2.e();
                    }
                }
            } catch (SQLiteException e10) {
                Log.e(w0.f117306b, "Cannot run invalidation tracker. Is the db closed?", e10);
                setA = EmptySet.f217512a;
                lockO.unlock();
                c2656d = G.this.f117085f;
                if (c2656d != null) {
                }
            } catch (IllegalStateException e11) {
                Log.e(w0.f117306b, "Cannot run invalidation tracker. Is the db closed?", e11);
                setA = EmptySet.f217512a;
                lockO.unlock();
                c2656d = G.this.f117085f;
                if (c2656d != null) {
                }
            }
            if (!G.this.g()) {
                if (c2656d2 != null) {
                    return;
                } else {
                    return;
                }
            }
            if (!G.this.f117086g.compareAndSet(true, false)) {
                lockO.unlock();
                C2656d c2656d3 = G.this.f117085f;
                if (c2656d3 != null) {
                    c2656d3.e();
                    return;
                }
                return;
            }
            if (G.this.f117080a.z()) {
                lockO.unlock();
                C2656d c2656d4 = G.this.f117085f;
                if (c2656d4 != null) {
                    c2656d4.e();
                    return;
                }
                return;
            }
            v2.d writableDatabase = G.this.f117080a.s().getWritableDatabase();
            writableDatabase.P0();
            try {
                setA = a();
                writableDatabase.D2();
                lockO.unlock();
                c2656d = G.this.f117085f;
                if (c2656d != null) {
                    c2656d.e();
                }
                if (setA.isEmpty()) {
                    return;
                }
                G g10 = G.this;
                synchronized (g10.f117091l) {
                    Iterator<Map.Entry<K, V>> it = g10.f117091l.iterator();
                    while (it.hasNext()) {
                        ((d) ((Map.Entry) it.next()).getValue()).c(setA);
                    }
                }
            } finally {
                writableDatabase.N2();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public G(@NotNull RoomDatabase database, @NotNull Map<String, String> shadowTablesMap, @NotNull Map<String, Set<String>> viewTables, @NotNull String... tableNames) {
        kotlin.jvm.internal.G.p(database, "database");
        kotlin.jvm.internal.G.p(shadowTablesMap, "shadowTablesMap");
        kotlin.jvm.internal.G.p(viewTables, "viewTables");
        kotlin.jvm.internal.G.p(tableNames, "tableNames");
        this.f117080a = database;
        this.f117081b = shadowTablesMap;
        this.f117082c = viewTables;
        this.f117086g = new AtomicBoolean(false);
        this.f117089j = new b(tableNames.length);
        this.f117090k = new D(database);
        this.f117091l = new C5287b<>();
        this.f117093n = new Object();
        this.f117094o = new Object();
        this.f117083d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale locale = Locale.US;
            String strA = C2650a.a(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            this.f117083d.put(strA, Integer.valueOf(i10));
            String str2 = this.f117081b.get(tableNames[i10]);
            String strA2 = str2 != null ? C2650a.a(locale, "US", str2, locale, "this as java.lang.String).toLowerCase(locale)") : null;
            if (strA2 != null) {
                strA = strA2;
            }
            strArr[i10] = strA;
        }
        this.f117084e = strArr;
        for (Map.Entry<String, String> entry : this.f117081b.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String strA3 = C2650a.a(locale2, "US", value, locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f117083d.containsKey(strA3)) {
                String strA4 = C2650a.a(locale2, "US", entry.getKey(), locale2, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.f117083d;
                map.put(strA4, (Integer) kotlin.collections.n0.K(map, strA3));
            }
        }
        this.f117095p = new f();
    }

    @e.f0
    public static /* synthetic */ void l() {
    }

    public final void A(v2.d dVar, int i10) {
        String str = this.f117084e[i10];
        for (String str2 : f117073r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f117072q.d(str, str2);
            kotlin.jvm.internal.G.o(str3, "StringBuilder().apply(builderAction).toString()");
            dVar.o2(str3);
        }
    }

    public final void B() {
        if (this.f117080a.H()) {
            C(this.f117080a.s().getWritableDatabase());
        }
    }

    public final void C(@NotNull v2.d database) {
        kotlin.jvm.internal.G.p(database, "database");
        if (database.H3()) {
            return;
        }
        try {
            Lock lockO = this.f117080a.o();
            lockO.lock();
            try {
                synchronized (this.f117093n) {
                    int[] iArrC = this.f117089j.c();
                    if (iArrC != null) {
                        f117072q.a(database);
                        try {
                            int length = iArrC.length;
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < length) {
                                int i12 = iArrC[i10];
                                int i13 = i11 + 1;
                                if (i12 == 1) {
                                    y(database, i11);
                                } else if (i12 == 2) {
                                    A(database, i11);
                                }
                                i10++;
                                i11 = i13;
                            }
                            database.D2();
                            database.N2();
                        } catch (Throwable th) {
                            database.N2();
                            throw th;
                        }
                    }
                }
            } finally {
                lockO.unlock();
            }
        } catch (SQLiteException e10) {
            Log.e(w0.f117306b, "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e(w0.f117306b, "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }

    public final String[] D(String[] strArr) {
        String[] strArrU = u(strArr);
        for (String str : strArrU) {
            Map<String, Integer> map = this.f117083d;
            Locale locale = Locale.US;
            if (!map.containsKey(C2650a.a(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"))) {
                throw new IllegalArgumentException("There is no table with name ".concat(str).toString());
            }
        }
        return strArrU;
    }

    @e.g0
    @SuppressLint({"RestrictedApi"})
    public void c(@NotNull c observer) {
        d dVarJ;
        kotlin.jvm.internal.G.p(observer, "observer");
        String[] strArrU = u(observer.f117104a);
        ArrayList arrayList = new ArrayList(strArrU.length);
        for (String str : strArrU) {
            Map<String, Integer> map = this.f117083d;
            Locale locale = Locale.US;
            Integer num = map.get(C2650a.a(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
            arrayList.add(num);
        }
        int[] iArrZ5 = kotlin.collections.U.Z5(arrayList);
        d dVar = new d(observer, iArrZ5, strArrU);
        synchronized (this.f117091l) {
            dVarJ = this.f117091l.j(observer, dVar);
        }
        if (dVarJ == null && this.f117089j.d(Arrays.copyOf(iArrZ5, iArrZ5.length))) {
            B();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void d(@NotNull c observer) {
        kotlin.jvm.internal.G.p(observer, "observer");
        c(new e(this, observer));
    }

    @InterfaceC4982o(message = "Use [createLiveData(String[], boolean, Callable)]")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public <T> androidx.lifecycle.K<T> e(@NotNull String[] tableNames, @NotNull Callable<T> computeFunction) {
        kotlin.jvm.internal.G.p(tableNames, "tableNames");
        kotlin.jvm.internal.G.p(computeFunction, "computeFunction");
        return f(tableNames, false, computeFunction);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public <T> androidx.lifecycle.K<T> f(@NotNull String[] tableNames, boolean z10, @NotNull Callable<T> computeFunction) {
        kotlin.jvm.internal.G.p(tableNames, "tableNames");
        kotlin.jvm.internal.G.p(computeFunction, "computeFunction");
        return this.f117090k.a(D(tableNames), z10, computeFunction);
    }

    public final boolean g() {
        if (!this.f117080a.H()) {
            return false;
        }
        if (!this.f117087h) {
            this.f117080a.s().getWritableDatabase();
        }
        if (this.f117087h) {
            return true;
        }
        Log.e(w0.f117306b, "database is not initialized even though it is open");
        return false;
    }

    @Nullable
    public final v2.h h() {
        return this.f117088i;
    }

    @NotNull
    public final RoomDatabase i() {
        return this.f117080a;
    }

    @NotNull
    public final C5287b<c, d> j() {
        return this.f117091l;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final AtomicBoolean k() {
        return this.f117086g;
    }

    @NotNull
    public final Map<String, Integer> m() {
        return this.f117083d;
    }

    @NotNull
    public final String[] n() {
        return this.f117084e;
    }

    public final void o(@NotNull v2.d database) {
        kotlin.jvm.internal.G.p(database, "database");
        synchronized (this.f117094o) {
            if (this.f117087h) {
                Log.e(w0.f117306b, "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.o2("PRAGMA temp_store = MEMORY;");
            database.o2("PRAGMA recursive_triggers='ON';");
            database.o2(f117077v);
            C(database);
            this.f117088i = database.p3(f117078w);
            this.f117087h = true;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void p(@NotNull String... tables) {
        kotlin.jvm.internal.G.p(tables, "tables");
        synchronized (this.f117091l) {
            Iterator<Map.Entry<K, V>> it = this.f117091l.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                kotlin.jvm.internal.G.o(entry, "(observer, wrapper)");
                c cVar = (c) entry.getKey();
                d dVar = (d) entry.getValue();
                if (!cVar.b()) {
                    dVar.d(tables);
                }
            }
        }
    }

    public final void q() {
        synchronized (this.f117094o) {
            this.f117087h = false;
            this.f117089j.f();
            v2.h hVar = this.f117088i;
            if (hVar != null) {
                hVar.close();
            }
        }
    }

    public void r() {
        if (this.f117086g.compareAndSet(false, true)) {
            C2656d c2656d = this.f117085f;
            if (c2656d != null) {
                c2656d.n();
            }
            this.f117080a.t().execute(this.f117095p);
        }
    }

    @e.g0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void s() {
        C2656d c2656d = this.f117085f;
        if (c2656d != null) {
            c2656d.n();
        }
        B();
        this.f117095p.run();
    }

    @e.g0
    @SuppressLint({"RestrictedApi"})
    public void t(@NotNull c observer) {
        d dVarK;
        kotlin.jvm.internal.G.p(observer, "observer");
        synchronized (this.f117091l) {
            dVarK = this.f117091l.k(observer);
        }
        if (dVarK != null) {
            b bVar = this.f117089j;
            int[] iArr = dVarK.f117106b;
            if (bVar.e(Arrays.copyOf(iArr, iArr.length))) {
                B();
            }
        }
    }

    public final String[] u(String[] strArr) {
        SetBuilder setBuilder = new SetBuilder();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f117082c;
            Locale locale = Locale.US;
            if (map.containsKey(C2650a.a(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"))) {
                Set<String> set = this.f117082c.get(C2650a.a(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"));
                kotlin.jvm.internal.G.m(set);
                setBuilder.addAll(set);
            } else {
                setBuilder.add(str);
            }
        }
        return (String[]) setBuilder.g().toArray(new String[0]);
    }

    public final void v(@NotNull C2656d autoCloser) {
        kotlin.jvm.internal.G.p(autoCloser, "autoCloser");
        this.f117085f = autoCloser;
        autoCloser.f117201c = new Runnable() { // from class: androidx.room.E
            @Override // java.lang.Runnable
            public final void run() {
                this.f117053a.q();
            }
        };
    }

    public final void w(@Nullable v2.h hVar) {
        this.f117088i = hVar;
    }

    public final void x(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(name, "name");
        kotlin.jvm.internal.G.p(serviceIntent, "serviceIntent");
        this.f117092m = new M(context, name, serviceIntent, this, this.f117080a.t());
    }

    public final void y(v2.d dVar, int i10) {
        dVar.o2("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f117084e[i10];
        for (String str2 : f117073r) {
            StringBuilder sb2 = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append(f117072q.d(str, str2));
            sb2.append(" AFTER ");
            F.a(sb2, str2, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb2.append(i10);
            sb2.append(" AND invalidated = 0; END");
            String string = sb2.toString();
            kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
            dVar.o2(string);
        }
    }

    public final void z() {
        M m10 = this.f117092m;
        if (m10 != null) {
            m10.s();
        }
        this.f117092m = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public G(@NotNull RoomDatabase database, @NotNull String... tableNames) {
        this(database, kotlin.collections.n0.z(), kotlin.collections.n0.z(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        kotlin.jvm.internal.G.p(database, "database");
        kotlin.jvm.internal.G.p(tableNames, "tableNames");
    }
}
