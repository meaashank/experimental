package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.a;
import e.InterfaceC4335i;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C4969v;
import n.C5232c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q2.AbstractC5421c;
import q2.InterfaceC5420b;
import v2.C5673b;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1548:1\n215#2,2:1549\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n*L\n261#1:1549,2\n*E\n"})
public abstract class RoomDatabase {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final b f117157o = new b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int f117158p = 999;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @Nullable
    public volatile v2.d f117159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f117160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f117161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SupportSQLiteOpenHelper f117162d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f117164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f117165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dd.g
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    public List<? extends a> f117166h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public C2656d f117169k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f117171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Map<Class<?>, Object> f117172n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final G f117163e = i();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public Map<Class<? extends InterfaceC5420b>, InterfaceC5420b> f117167i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ReentrantReadWriteLock f117168j = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ThreadLocal<Integer> f117170l = new ThreadLocal<>();

    @kotlin.jvm.internal.V({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1548:1\n1#2:1549\n*E\n"})
    public static class Builder<T extends RoomDatabase> {
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;

        @Nullable
        private TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;

        @NotNull
        private List<InterfaceC5420b> autoMigrationSpecs;

        @NotNull
        private final List<a> callbacks;

        @NotNull
        private final Context context;

        @Nullable
        private String copyFromAssetPath;

        @Nullable
        private File copyFromFile;

        @Nullable
        private Callable<InputStream> copyFromInputStream;

        @Nullable
        private SupportSQLiteOpenHelper.b factory;

        @NotNull
        private JournalMode journalMode;

        @NotNull
        private final Class<T> klass;

        @NotNull
        private final c migrationContainer;

        @Nullable
        private Set<Integer> migrationStartAndEndVersions;

        @NotNull
        private Set<Integer> migrationsNotRequiredFrom;

        @Nullable
        private Intent multiInstanceInvalidationIntent;

        @Nullable
        private final String name;

        @Nullable
        private d prepackagedDatabaseCallback;

        @Nullable
        private e queryCallback;

        @Nullable
        private Executor queryCallbackExecutor;

        @Nullable
        private Executor queryExecutor;
        private boolean requireMigration;

        @Nullable
        private Executor transactionExecutor;

        @NotNull
        private final List<Object> typeConverters;

        public Builder(@NotNull Context context, @NotNull Class<T> klass, @Nullable String str) {
            kotlin.jvm.internal.G.p(context, "context");
            kotlin.jvm.internal.G.p(klass, "klass");
            this.context = context;
            this.klass = klass;
            this.name = str;
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.autoMigrationSpecs = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.requireMigration = true;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new c();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
        }

        @NotNull
        public Builder<T> addAutoMigrationSpec(@NotNull InterfaceC5420b autoMigrationSpec) {
            kotlin.jvm.internal.G.p(autoMigrationSpec, "autoMigrationSpec");
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        @NotNull
        public Builder<T> addCallback(@NotNull a callback) {
            kotlin.jvm.internal.G.p(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        @NotNull
        public Builder<T> addMigrations(@NotNull AbstractC5421c... migrations) {
            kotlin.jvm.internal.G.p(migrations, "migrations");
            if (this.migrationStartAndEndVersions == null) {
                this.migrationStartAndEndVersions = new HashSet();
            }
            for (AbstractC5421c abstractC5421c : migrations) {
                Set<Integer> set = this.migrationStartAndEndVersions;
                kotlin.jvm.internal.G.m(set);
                set.add(Integer.valueOf(abstractC5421c.f226740a));
                Set<Integer> set2 = this.migrationStartAndEndVersions;
                kotlin.jvm.internal.G.m(set2);
                set2.add(Integer.valueOf(abstractC5421c.f226741b));
            }
            this.migrationContainer.c((AbstractC5421c[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        @NotNull
        public Builder<T> addTypeConverter(@NotNull Object typeConverter) {
            kotlin.jvm.internal.G.p(typeConverter, "typeConverter");
            this.typeConverters.add(typeConverter);
            return this;
        }

        @NotNull
        public Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        @NotNull
        public T build() {
            SupportSQLiteOpenHelper.b c2667i0;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor executor2 = C5232c.f221200e;
                this.transactionExecutor = executor2;
                this.queryExecutor = executor2;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            Set<Integer> set = this.migrationStartAndEndVersions;
            if (set != null) {
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    if (this.migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", iIntValue).toString());
                    }
                }
            }
            SupportSQLiteOpenHelper.b f02 = this.factory;
            if (f02 == null) {
                f02 = new androidx.sqlite.db.framework.d();
            }
            long j10 = this.autoCloseTimeout;
            if (j10 > 0) {
                if (this.name == null) {
                    throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                }
                TimeUnit timeUnit = this.autoCloseTimeUnit;
                if (timeUnit == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Executor executor3 = this.queryExecutor;
                if (executor3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                f02 = new C2658e(f02, new C2656d(j10, timeUnit, executor3));
            }
            String str = this.copyFromAssetPath;
            if (str != null || this.copyFromFile != null || this.copyFromInputStream != null) {
                if (this.name == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                int i10 = str == null ? 0 : 1;
                File file = this.copyFromFile;
                int i11 = file == null ? 0 : 1;
                Callable<InputStream> callable = this.copyFromInputStream;
                if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                    throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                }
                f02 = new F0(str, file, callable, f02);
            }
            e eVar = this.queryCallback;
            if (eVar != null) {
                Executor executor4 = this.queryCallbackExecutor;
                if (executor4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                c2667i0 = new C2667i0(f02, executor4, eVar);
            } else {
                c2667i0 = f02;
            }
            Context context = this.context;
            String str2 = this.name;
            c cVar = this.migrationContainer;
            List<a> list = this.callbacks;
            boolean z10 = this.allowMainThreadQueries;
            JournalMode journalModeResolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
            Executor executor5 = this.queryExecutor;
            if (executor5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor6 = this.transactionExecutor;
            if (executor6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C2668j c2668j = new C2668j(context, str2, c2667i0, cVar, list, z10, journalModeResolve$room_runtime_release, executor5, executor6, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, (List<? extends Object>) this.typeConverters, this.autoMigrationSpecs);
            T t10 = (T) w0.b(this.klass, "_Impl");
            t10.A(c2668j);
            return t10;
        }

        @NotNull
        public Builder<T> createFromAsset(@NotNull String databaseFilePath) {
            kotlin.jvm.internal.G.p(databaseFilePath, "databaseFilePath");
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @NotNull
        public Builder<T> createFromFile(@NotNull File databaseFile) {
            kotlin.jvm.internal.G.p(databaseFile, "databaseFile");
            this.copyFromFile = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public Builder<T> createFromInputStream(@NotNull Callable<InputStream> inputStreamCallable) {
            kotlin.jvm.internal.G.p(inputStreamCallable, "inputStreamCallable");
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        @NotNull
        public Builder<T> enableMultiInstanceInvalidation() {
            this.multiInstanceInvalidationIntent = this.name != null ? new Intent(this.context, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigrationFrom(@NotNull int... startVersions) {
            kotlin.jvm.internal.G.p(startVersions, "startVersions");
            for (int i10 : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i10));
            }
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @NotNull
        public Builder<T> openHelperFactory(@Nullable SupportSQLiteOpenHelper.b bVar) {
            this.factory = bVar;
            return this;
        }

        @InterfaceC2684v
        @NotNull
        public Builder<T> setAutoCloseTimeout(@e.D(from = 0) long j10, @NotNull TimeUnit autoCloseTimeUnit) {
            kotlin.jvm.internal.G.p(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (j10 < 0) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
            }
            this.autoCloseTimeout = j10;
            this.autoCloseTimeUnit = autoCloseTimeUnit;
            return this;
        }

        @NotNull
        public Builder<T> setJournalMode(@NotNull JournalMode journalMode) {
            kotlin.jvm.internal.G.p(journalMode, "journalMode");
            this.journalMode = journalMode;
            return this;
        }

        @InterfaceC2684v
        @NotNull
        public Builder<T> setMultiInstanceInvalidationServiceIntent(@NotNull Intent invalidationServiceIntent) {
            kotlin.jvm.internal.G.p(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.name == null) {
                invalidationServiceIntent = null;
            }
            this.multiInstanceInvalidationIntent = invalidationServiceIntent;
            return this;
        }

        @NotNull
        public Builder<T> setQueryCallback(@NotNull e queryCallback, @NotNull Executor executor) {
            kotlin.jvm.internal.G.p(queryCallback, "queryCallback");
            kotlin.jvm.internal.G.p(executor, "executor");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            return this;
        }

        @NotNull
        public Builder<T> setQueryExecutor(@NotNull Executor executor) {
            kotlin.jvm.internal.G.p(executor, "executor");
            this.queryExecutor = executor;
            return this;
        }

        @NotNull
        public Builder<T> setTransactionExecutor(@NotNull Executor executor) {
            kotlin.jvm.internal.G.p(executor, "executor");
            this.transactionExecutor = executor;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public Builder<T> createFromAsset(@NotNull String databaseFilePath, @NotNull d callback) {
            kotlin.jvm.internal.G.p(databaseFilePath, "databaseFilePath");
            kotlin.jvm.internal.G.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        @NotNull
        public Builder<T> createFromFile(@NotNull File databaseFile, @NotNull d callback) {
            kotlin.jvm.internal.G.p(databaseFile, "databaseFile");
            kotlin.jvm.internal.G.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromFile = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        @NotNull
        public Builder<T> createFromInputStream(@NotNull Callable<InputStream> inputStreamCallable, @NotNull d callback) {
            kotlin.jvm.internal.G.p(inputStreamCallable, "inputStreamCallable");
            kotlin.jvm.internal.G.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }
    }

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return a.b.b(activityManager);
        }

        @NotNull
        public final JournalMode resolve$room_runtime_release(@NotNull Context context) {
            kotlin.jvm.internal.G.p(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static abstract class a {
        public void a(@NotNull v2.d db2) {
            kotlin.jvm.internal.G.p(db2, "db");
        }

        public void b(@NotNull v2.d db2) {
            kotlin.jvm.internal.G.p(db2, "db");
        }

        public void c(@NotNull v2.d db2) {
            kotlin.jvm.internal.G.p(db2, "db");
        }
    }

    public static final class b {
        public b() {
        }

        public b(C4969v c4969v) {
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1548:1\n13579#2,2:1549\n1855#3,2:1551\n361#4,7:1553\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n*L\n1371#1:1549,2\n1381#1:1551,2\n1387#1:1553,7\n*E\n"})
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Map<Integer, TreeMap<Integer, AbstractC5421c>> f117174a = new LinkedHashMap();

        public final void a(AbstractC5421c abstractC5421c) {
            int i10 = abstractC5421c.f226740a;
            int i11 = abstractC5421c.f226741b;
            Map<Integer, TreeMap<Integer, AbstractC5421c>> map = this.f117174a;
            Integer numValueOf = Integer.valueOf(i10);
            TreeMap<Integer, AbstractC5421c> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, AbstractC5421c> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w(w0.f117306b, "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + abstractC5421c);
            }
            treeMap2.put(Integer.valueOf(i11), abstractC5421c);
        }

        public void b(@NotNull List<? extends AbstractC5421c> migrations) {
            kotlin.jvm.internal.G.p(migrations, "migrations");
            Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                a((AbstractC5421c) it.next());
            }
        }

        public void c(@NotNull AbstractC5421c... migrations) {
            kotlin.jvm.internal.G.p(migrations, "migrations");
            for (AbstractC5421c abstractC5421c : migrations) {
                a(abstractC5421c);
            }
        }

        public final boolean d(int i10, int i11) {
            Map<Integer, Map<Integer, AbstractC5421c>> mapG = g();
            if (!mapG.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map<Integer, AbstractC5421c> mapZ = mapG.get(Integer.valueOf(i10));
            if (mapZ == null) {
                mapZ = kotlin.collections.n0.z();
            }
            return mapZ.containsKey(Integer.valueOf(i11));
        }

        @Nullable
        public List<AbstractC5421c> e(int i10, int i11) {
            if (i10 == i11) {
                return EmptyList.f217510a;
            }
            return f(new ArrayList(), i11 > i10, i10, i11);
        }

        public final List<AbstractC5421c> f(List<AbstractC5421c> list, boolean z10, int i10, int i11) {
            boolean z11;
            do {
                if (z10) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap<Integer, AbstractC5421c> treeMap = this.f117174a.get(Integer.valueOf(i10));
                if (treeMap == null) {
                    return null;
                }
                for (Integer targetVersion : z10 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                    if (z10) {
                        int i12 = i10 + 1;
                        kotlin.jvm.internal.G.o(targetVersion, "targetVersion");
                        int iIntValue = targetVersion.intValue();
                        if (i12 <= iIntValue && iIntValue <= i11) {
                            AbstractC5421c abstractC5421c = treeMap.get(targetVersion);
                            kotlin.jvm.internal.G.m(abstractC5421c);
                            list.add(abstractC5421c);
                            i10 = targetVersion.intValue();
                            z11 = true;
                            break;
                        }
                    } else {
                        kotlin.jvm.internal.G.o(targetVersion, "targetVersion");
                        int iIntValue2 = targetVersion.intValue();
                        if (i11 <= iIntValue2 && iIntValue2 < i10) {
                            AbstractC5421c abstractC5421c2 = treeMap.get(targetVersion);
                            kotlin.jvm.internal.G.m(abstractC5421c2);
                            list.add(abstractC5421c2);
                            i10 = targetVersion.intValue();
                            z11 = true;
                            break;
                            break;
                        }
                    }
                }
                z11 = false;
            } while (z11);
            return null;
        }

        @NotNull
        public Map<Integer, Map<Integer, AbstractC5421c>> g() {
            return this.f117174a;
        }
    }

    public static abstract class d {
        public void a(@NotNull v2.d db2) {
            kotlin.jvm.internal.G.p(db2, "db");
        }
    }

    public interface e {
        void a(@NotNull String str, @NotNull List<? extends Object> list);
    }

    public RoomDatabase() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.G.o(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f117171m = mapSynchronizedMap;
        this.f117172n = new LinkedHashMap();
    }

    public static /* synthetic */ void G() {
    }

    public static /* synthetic */ void I() {
    }

    public static /* synthetic */ Cursor M(RoomDatabase roomDatabase, v2.f fVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.L(fVar, cancellationSignal);
    }

    @InterfaceC4982o(message = "Will be hidden in a future release.")
    public static /* synthetic */ void q() {
    }

    @InterfaceC4982o(message = "Will be hidden in the next release.")
    public static /* synthetic */ void r() {
    }

    @InterfaceC4335i
    public void A(@NotNull C2668j configuration) {
        kotlin.jvm.internal.G.p(configuration, "configuration");
        this.f117162d = j(configuration);
        Set<Class<? extends InterfaceC5420b>> setU = u();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends InterfaceC5420b>> it = setU.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class<? extends InterfaceC5420b> next = it.next();
                int size = configuration.f117275s.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (next.isAssignableFrom(configuration.f117275s.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.f117167i.put(next, configuration.f117275s.get(i10));
            } else {
                int size2 = configuration.f117275s.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                Iterator<AbstractC5421c> it2 = m(this.f117167i).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC5421c next2 = it2.next();
                    if (!configuration.f117260d.d(next2.f226740a, next2.f226741b)) {
                        configuration.f117260d.c(next2);
                    }
                }
                E0 e02 = (E0) R(E0.class, s());
                if (e02 != null) {
                    e02.f117060g = configuration;
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) R(AutoClosingRoomOpenHelper.class, s());
                if (autoClosingRoomOpenHelper != null) {
                    this.f117169k = autoClosingRoomOpenHelper.f116970b;
                    p().v(autoClosingRoomOpenHelper.f116970b);
                }
                boolean z10 = configuration.f117263g == JournalMode.WRITE_AHEAD_LOGGING;
                s().setWriteAheadLoggingEnabled(z10);
                this.f117166h = configuration.f117261e;
                this.f117160b = configuration.f117264h;
                this.f117161c = new J0(configuration.f117265i);
                this.f117164f = configuration.f117262f;
                this.f117165g = z10;
                if (configuration.f117266j != null) {
                    if (configuration.f117258b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    p().x(configuration.f117257a, configuration.f117258b, configuration.f117266j);
                }
                Map<Class<?>, List<Class<?>>> mapV = v();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : mapV.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.f117274r.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i13 = size3 - 1;
                                if (cls.isAssignableFrom(configuration.f117274r.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i13 < 0) {
                                    break;
                                } else {
                                    size3 = i13;
                                }
                            }
                            size3 = -1;
                        } else {
                            size3 = -1;
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.f117172n.put(cls, configuration.f117274r.get(size3));
                    }
                }
                int size4 = configuration.f117274r.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f117274r.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    public final void B() {
        c();
        v2.d writableDatabase = s().getWritableDatabase();
        p().C(writableDatabase);
        if (writableDatabase.M3()) {
            writableDatabase.P0();
        } else {
            writableDatabase.s0();
        }
    }

    public final void C() {
        s().getWritableDatabase().N2();
        if (z()) {
            return;
        }
        p().r();
    }

    public void D(@NotNull v2.d db2) {
        kotlin.jvm.internal.G.p(db2, "db");
        p().o(db2);
    }

    public final boolean E() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean F() {
        Boolean boolValueOf;
        boolean zIsOpen;
        C2656d c2656d = this.f117169k;
        if (c2656d != null) {
            zIsOpen = !c2656d.f117208j;
        } else {
            v2.d dVar = this.f117159a;
            if (dVar == null) {
                boolValueOf = null;
                return kotlin.jvm.internal.G.g(boolValueOf, Boolean.TRUE);
            }
            zIsOpen = dVar.isOpen();
        }
        boolValueOf = Boolean.valueOf(zIsOpen);
        return kotlin.jvm.internal.G.g(boolValueOf, Boolean.TRUE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean H() {
        v2.d dVar = this.f117159a;
        return dVar != null && dVar.isOpen();
    }

    @NotNull
    public Cursor J(@NotNull String query, @Nullable Object[] objArr) {
        kotlin.jvm.internal.G.p(query, "query");
        return s().getWritableDatabase().c3(new C5673b(query, objArr));
    }

    @dd.k
    @NotNull
    public final Cursor K(@NotNull v2.f query) {
        kotlin.jvm.internal.G.p(query, "query");
        return M(this, query, null, 2, null);
    }

    @dd.k
    @NotNull
    public Cursor L(@NotNull v2.f query, @Nullable CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.G.p(query, "query");
        c();
        d();
        return cancellationSignal != null ? s().getWritableDatabase().J0(query, cancellationSignal) : s().getWritableDatabase().c3(query);
    }

    public <V> V N(@NotNull Callable<V> body) {
        kotlin.jvm.internal.G.p(body, "body");
        e();
        try {
            V vCall = body.call();
            Q();
            return vCall;
        } finally {
            k();
        }
    }

    public void O(@NotNull Runnable body) {
        kotlin.jvm.internal.G.p(body, "body");
        e();
        try {
            body.run();
            Q();
        } finally {
            k();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void P(@NotNull Map<Class<? extends InterfaceC5420b>, InterfaceC5420b> map) {
        kotlin.jvm.internal.G.p(map, "<set-?>");
        this.f117167i = map;
    }

    @InterfaceC4982o(message = "setTransactionSuccessful() is deprecated", replaceWith = @InterfaceC4852c0(expression = "runInTransaction(Runnable)", imports = {}))
    public void Q() {
        s().getWritableDatabase().D2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T R(Class<T> cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof InterfaceC2672l) {
            return (T) R(cls, ((InterfaceC2672l) supportSQLiteOpenHelper).A());
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void c() {
        if (!this.f117164f && E()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void d() {
        if (!z() && this.f117170l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @InterfaceC4982o(message = "beginTransaction() is deprecated", replaceWith = @InterfaceC4852c0(expression = "runInTransaction(Runnable)", imports = {}))
    public void e() {
        c();
        C2656d c2656d = this.f117169k;
        if (c2656d == null) {
            B();
        } else {
            c2656d.g(new ed.l<v2.d, Object>() { // from class: androidx.room.RoomDatabase$beginTransaction$1
                {
                    super(1);
                }

                @Nullable
                public final Object e(@NotNull v2.d it) {
                    kotlin.jvm.internal.G.p(it, "it");
                    this.f117173d.B();
                    return null;
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ Object invoke(v2.d dVar) {
                    e(dVar);
                    return null;
                }
            });
        }
    }

    @e.g0
    public abstract void f();

    public void g() {
        if (F()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f117168j.writeLock();
            kotlin.jvm.internal.G.o(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                p().z();
                s().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @NotNull
    public v2.h h(@NotNull String sql) {
        kotlin.jvm.internal.G.p(sql, "sql");
        c();
        d();
        return s().getWritableDatabase().p3(sql);
    }

    @NotNull
    public abstract G i();

    @NotNull
    public abstract SupportSQLiteOpenHelper j(@NotNull C2668j c2668j);

    @InterfaceC4982o(message = "endTransaction() is deprecated", replaceWith = @InterfaceC4852c0(expression = "runInTransaction(Runnable)", imports = {}))
    public void k() {
        C2656d c2656d = this.f117169k;
        if (c2656d == null) {
            C();
        } else {
            c2656d.g(new ed.l<v2.d, Object>() { // from class: androidx.room.RoomDatabase$endTransaction$1
                {
                    super(1);
                }

                @Nullable
                public final Object e(@NotNull v2.d it) {
                    kotlin.jvm.internal.G.p(it, "it");
                    this.f117175d.C();
                    return null;
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ Object invoke(v2.d dVar) {
                    e(dVar);
                    return null;
                }
            });
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Map<Class<? extends InterfaceC5420b>, InterfaceC5420b> l() {
        return this.f117167i;
    }

    @dd.p
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public List<AbstractC5421c> m(@NotNull Map<Class<? extends InterfaceC5420b>, InterfaceC5420b> autoMigrationSpecs) {
        kotlin.jvm.internal.G.p(autoMigrationSpecs, "autoMigrationSpecs");
        return EmptyList.f217510a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Map<String, Object> n() {
        return this.f117171m;
    }

    @NotNull
    public final Lock o() {
        ReentrantReadWriteLock.ReadLock lock = this.f117168j.readLock();
        kotlin.jvm.internal.G.o(lock, "readWriteLock.readLock()");
        return lock;
    }

    @NotNull
    public G p() {
        return this.f117163e;
    }

    @NotNull
    public SupportSQLiteOpenHelper s() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f117162d;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        kotlin.jvm.internal.G.S("internalOpenHelper");
        throw null;
    }

    @NotNull
    public Executor t() {
        Executor executor = this.f117160b;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.G.S("internalQueryExecutor");
        throw null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public Set<Class<? extends InterfaceC5420b>> u() {
        return EmptySet.f217512a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public Map<Class<?>, List<Class<?>>> v() {
        return kotlin.collections.n0.z();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final ThreadLocal<Integer> w() {
        return this.f117170l;
    }

    @NotNull
    public Executor x() {
        Executor executor = this.f117161c;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.G.S("internalTransactionExecutor");
        throw null;
    }

    @Nullable
    public <T> T y(@NotNull Class<T> klass) {
        kotlin.jvm.internal.G.p(klass, "klass");
        return (T) this.f117172n.get(klass);
    }

    public boolean z() {
        return s().getWritableDatabase().H3();
    }
}
