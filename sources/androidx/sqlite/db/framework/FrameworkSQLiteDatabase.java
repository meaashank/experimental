package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.sqlite.db.a;
import e.InterfaceC4345t;
import e.T;
import ed.r;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v2.C5673b;
import v2.h;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nFrameworkSQLiteDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteDatabase.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n1#2:337\n*E\n"})
public final class FrameworkSQLiteDatabase implements v2.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f117443b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String[] f117444c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String[] f117445d = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SQLiteDatabase f117446a;

    @T(30)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f117447a = new a();

        @InterfaceC4345t
        public final void a(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @Nullable Object[] objArr) {
            G.p(sQLiteDatabase, "sQLiteDatabase");
            G.p(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, objArr);
        }
    }

    public static final class b {
        public b() {
        }

        public b(C4969v c4969v) {
        }
    }

    public FrameworkSQLiteDatabase(@NotNull SQLiteDatabase delegate) {
        G.p(delegate, "delegate");
        this.f117446a = delegate;
    }

    public static final Cursor d(r tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        G.p(tmp0, "$tmp0");
        return (Cursor) tmp0.x(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor e(v2.f query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        G.p(query, "$query");
        G.m(sQLiteQuery);
        query.l(new e(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // v2.d
    @NotNull
    public Cursor A3(@NotNull String query) {
        G.p(query, "query");
        return c3(new C5673b(query));
    }

    @Override // v2.d
    public boolean C2() {
        return this.f117446a.enableWriteAheadLogging();
    }

    @Override // v2.d
    @T(api = 16)
    public void D1(boolean z10) {
        a.C0331a.g(this.f117446a, z10);
    }

    @Override // v2.d
    public void D2() {
        this.f117446a.setTransactionSuccessful();
    }

    @Override // v2.d
    public void E2(@NotNull String sql, @NotNull Object[] bindArgs) throws SQLException {
        G.p(sql, "sql");
        G.p(bindArgs, "bindArgs");
        this.f117446a.execSQL(sql, bindArgs);
    }

    @Override // v2.d
    public long G2(long j10) {
        this.f117446a.setMaximumSize(j10);
        return this.f117446a.getMaximumSize();
    }

    @Override // v2.d
    public void G3(@NotNull SQLiteTransactionListener transactionListener) {
        G.p(transactionListener, "transactionListener");
        this.f117446a.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // v2.d
    public long H1() {
        return this.f117446a.getMaximumSize();
    }

    @Override // v2.d
    public boolean H3() {
        return this.f117446a.inTransaction();
    }

    @Override // v2.d
    @T(16)
    @NotNull
    public Cursor J0(@NotNull final v2.f query, @Nullable CancellationSignal cancellationSignal) {
        G.p(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f117446a;
        String strK = query.k();
        String[] strArr = f117445d;
        G.m(cancellationSignal);
        return a.C0331a.f(sQLiteDatabase, strK, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return FrameworkSQLiteDatabase.e(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // v2.d
    public void M2(@NotNull SQLiteTransactionListener transactionListener) {
        G.p(transactionListener, "transactionListener");
        this.f117446a.beginTransactionWithListener(transactionListener);
    }

    @Override // v2.d
    @T(api = 16)
    public boolean M3() {
        return a.C0331a.e(this.f117446a);
    }

    @Override // v2.d
    public void N2() {
        this.f117446a.endTransaction();
    }

    @Override // v2.d
    public void O3(int i10) {
        this.f117446a.setMaxSqlCacheSize(i10);
    }

    @Override // v2.d
    public void P0() {
        this.f117446a.beginTransactionNonExclusive();
    }

    @Override // v2.d
    public long Q1(@NotNull String table, int i10, @NotNull ContentValues values) throws SQLException {
        G.p(table, "table");
        G.p(values, "values");
        return this.f117446a.insertWithOnConflict(table, null, values, i10);
    }

    @Override // v2.d
    public void Q3(long j10) {
        this.f117446a.setPageSize(j10);
    }

    @Override // v2.d
    public boolean V0() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // v2.d
    public boolean W0() {
        return this.f117446a.isDbLockedByCurrentThread();
    }

    @Override // v2.d
    public boolean Z0(int i10) {
        return this.f117446a.needUpgrade(i10);
    }

    public final boolean c(@NotNull SQLiteDatabase sqLiteDatabase) {
        G.p(sqLiteDatabase, "sqLiteDatabase");
        return G.g(this.f117446a, sqLiteDatabase);
    }

    @Override // v2.d
    @NotNull
    public Cursor c3(@NotNull final v2.f query) {
        G.p(query, "query");
        final r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> rVar = new r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1
            {
                super(4);
            }

            @Override // ed.r
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final SQLiteCursor x(@Nullable SQLiteDatabase sQLiteDatabase, @Nullable SQLiteCursorDriver sQLiteCursorDriver, @Nullable String str, @Nullable SQLiteQuery sQLiteQuery) {
                v2.f fVar = query;
                G.m(sQLiteQuery);
                fVar.l(new e(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        Cursor cursorRawQueryWithFactory = this.f117446a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return FrameworkSQLiteDatabase.d(rVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.k(), f117445d, null);
        G.o(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f117446a.close();
    }

    public void f(long j10) {
        this.f117446a.setMaximumSize(j10);
    }

    @Override // v2.d
    public long getPageSize() {
        return this.f117446a.getPageSize();
    }

    @Override // v2.d
    @Nullable
    public String getPath() {
        return this.f117446a.getPath();
    }

    @Override // v2.d
    public int getVersion() {
        return this.f117446a.getVersion();
    }

    @Override // v2.d
    public void h3(@NotNull String sql, @Nullable Object[] objArr) {
        G.p(sql, "sql");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            throw new UnsupportedOperationException(android.support.v4.media.c.a("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: ", i10));
        }
        a.f117447a.a(this.f117446a, sql, objArr);
    }

    @Override // v2.d
    public boolean isOpen() {
        return this.f117446a.isOpen();
    }

    @Override // v2.d
    public boolean l3(long j10) {
        return this.f117446a.yieldIfContendedSafely(j10);
    }

    @Override // v2.d
    public void n3(int i10) {
        this.f117446a.setVersion(i10);
    }

    @Override // v2.d
    public void o2(@NotNull String sql) throws SQLException {
        G.p(sql, "sql");
        this.f117446a.execSQL(sql);
    }

    @Override // v2.d
    @NotNull
    public h p3(@NotNull String sql) {
        G.p(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f117446a.compileStatement(sql);
        G.o(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new f(sQLiteStatementCompileStatement);
    }

    @Override // v2.d
    @NotNull
    public Cursor q1(@NotNull String query, @NotNull Object[] bindArgs) {
        G.p(query, "query");
        G.p(bindArgs, "bindArgs");
        return c3(new C5673b(query, bindArgs));
    }

    @Override // v2.d
    public boolean r2() {
        return this.f117446a.isDatabaseIntegrityOk();
    }

    @Override // v2.d
    public void s0() {
        this.f117446a.beginTransaction();
    }

    @Override // v2.d
    public boolean s3() {
        return this.f117446a.isReadOnly();
    }

    @Override // v2.d
    public void setLocale(@NotNull Locale locale) {
        G.p(locale, "locale");
        this.f117446a.setLocale(locale);
    }

    @Override // v2.d
    @Nullable
    public List<Pair<String, String>> u0() {
        return this.f117446a.getAttachedDbs();
    }

    @Override // v2.d
    public int v(@NotNull String table, @Nullable String str, @Nullable Object[] objArr) {
        G.p(table, "table");
        StringBuilder sb2 = new StringBuilder("DELETE FROM ");
        sb2.append(table);
        if (str != null && str.length() != 0) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        String string = sb2.toString();
        G.o(string, "StringBuilder().apply(builderAction).toString()");
        h hVarP3 = p3(string);
        C5673b.f239762c.b(hVarP3, objArr);
        return ((f) hVarP3).f117476b.executeUpdateDelete();
    }

    @Override // v2.d
    @T(api = 16)
    public void w0() {
        a.C0331a.d(this.f117446a);
    }

    @Override // v2.d
    public int w3(@NotNull String table, int i10, @NotNull ContentValues values, @Nullable String str, @Nullable Object[] objArr) {
        G.p(table, "table");
        G.p(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f117444c[i10]);
        sb2.append(table);
        sb2.append(" SET ");
        int i11 = 0;
        for (String str2 : values.keySet()) {
            sb2.append(i11 > 0 ? "," : "");
            sb2.append(str2);
            objArr2[i11] = values.get(str2);
            sb2.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        String string = sb2.toString();
        G.o(string, "StringBuilder().apply(builderAction).toString()");
        h hVarP3 = p3(string);
        C5673b.f239762c.b(hVarP3, objArr2);
        return ((f) hVarP3).f117476b.executeUpdateDelete();
    }

    @Override // v2.d
    public boolean z3() {
        return this.f117446a.yieldIfContendedSafely();
    }
}
