package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.a;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import dd.k;
import e.T;
import ed.InterfaceC4376a;
import java.io.File;
import java.util.UUID;
import kotlin.G;
import kotlin.I;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.C5739a;

/* JADX INFO: loaded from: classes2.dex */
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f117449h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f117450i = "SupportSQLite";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f117451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f117452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SupportSQLiteOpenHelper.a f117453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f117454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f117455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final G<OpenHelper> f117456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f117457g;

    public static final class OpenHelper extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final a f117458h = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f117459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final b f117460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final SupportSQLiteOpenHelper.a f117461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f117462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f117463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final C5739a f117464f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f117465g;

        public static final class CallbackException extends RuntimeException {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final CallbackName f117466a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Throwable f117467b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(@NotNull CallbackName callbackName, @NotNull Throwable cause) {
                super(cause);
                kotlin.jvm.internal.G.p(callbackName, "callbackName");
                kotlin.jvm.internal.G.p(cause, "cause");
                this.f117466a = callbackName;
                this.f117467b = cause;
            }

            @NotNull
            public final CallbackName d() {
                return this.f117466a;
            }

            @Override // java.lang.Throwable
            @NotNull
            public Throwable getCause() {
                return this.f117467b;
            }
        }

        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        @V({"SMAP\nFrameworkSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteOpenHelper.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
        public static final class a {
            public a() {
            }

            @NotNull
            public final FrameworkSQLiteDatabase a(@NotNull b refHolder, @NotNull SQLiteDatabase sqLiteDatabase) {
                kotlin.jvm.internal.G.p(refHolder, "refHolder");
                kotlin.jvm.internal.G.p(sqLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = refHolder.f117469a;
                if (frameworkSQLiteDatabase != null && frameworkSQLiteDatabase.c(sqLiteDatabase)) {
                    return frameworkSQLiteDatabase;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = new FrameworkSQLiteDatabase(sqLiteDatabase);
                refHolder.f117469a = frameworkSQLiteDatabase2;
                return frameworkSQLiteDatabase2;
            }

            public a(C4969v c4969v) {
            }
        }

        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f117468a;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f117468a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(@NotNull Context context, @Nullable String str, @NotNull final b dbRef, @NotNull final SupportSQLiteOpenHelper.a callback, boolean z10) {
            String string;
            super(context, str, null, callback.f117437a, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.c
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    FrameworkSQLiteOpenHelper.OpenHelper.b(callback, dbRef, sQLiteDatabase);
                }
            });
            kotlin.jvm.internal.G.p(context, "context");
            kotlin.jvm.internal.G.p(dbRef, "dbRef");
            kotlin.jvm.internal.G.p(callback, "callback");
            this.f117459a = context;
            this.f117460b = dbRef;
            this.f117461c = callback;
            this.f117462d = z10;
            if (str == null) {
                string = UUID.randomUUID().toString();
                kotlin.jvm.internal.G.o(string, "randomUUID().toString()");
            } else {
                string = str;
            }
            this.f117464f = new C5739a(string, context.getCacheDir(), false);
        }

        public static final void b(SupportSQLiteOpenHelper.a callback, b dbRef, SQLiteDatabase dbObj) {
            kotlin.jvm.internal.G.p(callback, "$callback");
            kotlin.jvm.internal.G.p(dbRef, "$dbRef");
            a aVar = f117458h;
            kotlin.jvm.internal.G.o(dbObj, "dbObj");
            callback.c(aVar.a(dbRef, dbObj));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C5739a.c(this.f117464f, false, 1, null);
                super.close();
                this.f117460b.f117469a = null;
                this.f117465g = false;
            } finally {
                this.f117464f.d();
            }
        }

        public final boolean d() {
            return this.f117462d;
        }

        @NotNull
        public final SupportSQLiteOpenHelper.a k() {
            return this.f117461c;
        }

        @NotNull
        public final Context l() {
            return this.f117459a;
        }

        @NotNull
        public final b m() {
            return this.f117460b;
        }

        @NotNull
        public final v2.d n(boolean z10) {
            v2.d dVarO;
            try {
                this.f117464f.b((this.f117465g || getDatabaseName() == null) ? false : true);
                this.f117463e = false;
                SQLiteDatabase sQLiteDatabaseQ = q(z10);
                if (this.f117463e) {
                    close();
                    dVarO = n(z10);
                } else {
                    dVarO = o(sQLiteDatabaseQ);
                }
                this.f117464f.d();
                return dVarO;
            } catch (Throwable th) {
                this.f117464f.d();
                throw th;
            }
        }

        @NotNull
        public final FrameworkSQLiteDatabase o(@NotNull SQLiteDatabase sqLiteDatabase) {
            kotlin.jvm.internal.G.p(sqLiteDatabase, "sqLiteDatabase");
            return f117458h.a(this.f117460b, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@NotNull SQLiteDatabase db2) {
            kotlin.jvm.internal.G.p(db2, "db");
            if (!this.f117463e && this.f117461c.f117437a != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.f117461c.b(o(db2));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
            kotlin.jvm.internal.G.p(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f117461c.d(o(sqLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(@NotNull SQLiteDatabase db2, int i10, int i11) {
            kotlin.jvm.internal.G.p(db2, "db");
            this.f117463e = true;
            try {
                this.f117461c.e(o(db2), i10, i11);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@NotNull SQLiteDatabase db2) {
            kotlin.jvm.internal.G.p(db2, "db");
            if (!this.f117463e) {
                try {
                    this.f117461c.f(o(db2));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.ON_OPEN, th);
                }
            }
            this.f117465g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            kotlin.jvm.internal.G.p(sqLiteDatabase, "sqLiteDatabase");
            this.f117463e = true;
            try {
                this.f117461c.g(o(sqLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th);
            }
        }

        public final SQLiteDatabase p(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                kotlin.jvm.internal.G.o(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            kotlin.jvm.internal.G.o(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final SQLiteDatabase q(boolean z10) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f117465g;
            if (databaseName != null && !z11 && (parentFile = this.f117459a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return p(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return p(z10);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        Throwable th2 = callbackException.f117467b;
                        int i10 = b.f117468a[callbackException.f117466a.ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || !(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f117462d) {
                        throw th;
                    }
                    this.f117459a.deleteDatabase(databaseName);
                    try {
                        return p(z10);
                    } catch (CallbackException e10) {
                        throw e10.f117467b;
                    }
                }
            }
        }
    }

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public FrameworkSQLiteDatabase f117469a;

        public b(@Nullable FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.f117469a = frameworkSQLiteDatabase;
        }

        @Nullable
        public final FrameworkSQLiteDatabase a() {
            return this.f117469a;
        }

        public final void b(@Nullable FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.f117469a = frameworkSQLiteDatabase;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public FrameworkSQLiteOpenHelper(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.a callback) {
        this(context, str, callback, false, false, 24, null);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(callback, "callback");
    }

    public static Object l(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        return frameworkSQLiteOpenHelper.f117456f;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f117456f.isInitialized()) {
            k().close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    public String getDatabaseName() {
        return this.f117452b;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public v2.d getReadableDatabase() {
        return k().n(false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public v2.d getWritableDatabase() {
        return k().n(true);
    }

    public final OpenHelper k() {
        return this.f117456f.getValue();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @T(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f117456f.isInitialized()) {
            a.C0331a.h(k(), z10);
        }
        this.f117457g = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public FrameworkSQLiteOpenHelper(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.a callback, boolean z10) {
        this(context, str, callback, z10, false, 16, null);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(callback, "callback");
    }

    @k
    public FrameworkSQLiteOpenHelper(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.a callback, boolean z10, boolean z11) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(callback, "callback");
        this.f117451a = context;
        this.f117452b = str;
        this.f117453c = callback;
        this.f117454d = z10;
        this.f117455e = z11;
        this.f117456f = I.a(new InterfaceC4376a<OpenHelper>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
                FrameworkSQLiteOpenHelper.OpenHelper openHelper;
                FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = this.f117470d;
                if (frameworkSQLiteOpenHelper.f117452b == null || !frameworkSQLiteOpenHelper.f117454d) {
                    FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper2 = this.f117470d;
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper2.f117451a, frameworkSQLiteOpenHelper2.f117452b, new FrameworkSQLiteOpenHelper.b(null), frameworkSQLiteOpenHelper2.f117453c, frameworkSQLiteOpenHelper2.f117455e);
                } else {
                    File file = new File(a.c.a(this.f117470d.f117451a), this.f117470d.f117452b);
                    Context context2 = this.f117470d.f117451a;
                    String absolutePath = file.getAbsolutePath();
                    FrameworkSQLiteOpenHelper.b bVar = new FrameworkSQLiteOpenHelper.b(null);
                    FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper3 = this.f117470d;
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context2, absolutePath, bVar, frameworkSQLiteOpenHelper3.f117453c, frameworkSQLiteOpenHelper3.f117455e);
                }
                openHelper.setWriteAheadLoggingEnabled(this.f117470d.f117457g);
                return openHelper;
            }
        });
    }

    public /* synthetic */ FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.a aVar, boolean z10, boolean z11, int i10, C4969v c4969v) {
        this(context, str, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }
}
