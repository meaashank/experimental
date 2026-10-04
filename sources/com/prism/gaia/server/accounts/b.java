package com.prism.gaia.server.accounts;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.Q;
import androidx.compose.ui.input.pointer.C2151s;
import java.io.Closeable;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import w.y;

/* JADX INFO: loaded from: classes6.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f166407A = "accounts_id";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f166408B = "auth_token_type";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f166409C = "uid";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f166410D = "extras";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f166411E = "_id";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f166412F = "accounts_id";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f166413G = "key";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f166414H = "value";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f166415I = "meta";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f166416J = "key";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f166417K = "value";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f166418L = "shared_accounts";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f166419M = "_id";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f166420N = "accounts_ce.db";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f166421O = "accounts_de.db";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f166422P = "ceDb.";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f166423Q = "ceDb.accounts";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f166424R = "ceDb.authtokens";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f166425S = "ceDb.extras";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f166427U = "SELECT COUNT(*) FROM grants, accounts WHERE accounts_id=_id AND uid=? AND auth_token_type=? AND name=? AND type=?";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f166428V = "SELECT COUNT(*) FROM grants, accounts WHERE accounts_id=_id AND uid=? AND name=? AND type=?";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String f166429W = "accounts_id=(select _id FROM accounts WHERE name=? AND type=?)";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f166432Z = "SELECT name, uid FROM accounts, grants WHERE accounts_id=_id";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f166433a0 = "auth_uid_for_type:";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f166434b0 = ":";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f166436c0 = "key LIKE ?";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f166437d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f166438e = "accounts.db";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f166439f = 9;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f166440g = 10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f166441h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f166442i = "accounts";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f166443j = "_id";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f166444k = "name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f166445l = "type";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f166447n = "password";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f166448o = "previous_name";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f166449p = "last_password_entry_time_millis_epoch";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f166450q = "authtokens";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f166451r = "_id";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f166452s = "accounts_id";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f166453t = "type";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f166455v = "visibility";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f166456w = "accounts_id";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f166457x = "_package";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f166458y = "value";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f166459z = "grants";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0675b f166460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f166461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f166435c = "asdf-".concat(b.class.getSimpleName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f166446m = "count(type)";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final String[] f166426T = {"type", f166446m};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f166454u = "authtoken";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String[] f166430X = {"type", f166454u};

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String[] f166431Y = {"key", "value"};

    public static class a extends SQLiteOpenHelper {
        public a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 10);
        }

        public static a a(Context context, File file) {
            a aVar = new a(context, file.getPath());
            aVar.getWritableDatabase();
            aVar.close();
            return aVar;
        }

        public final void b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(" CREATE TRIGGER accountsDelete DELETE ON accounts BEGIN   DELETE FROM authtokens     WHERE accounts_id=OLD._id ;   DELETE FROM extras     WHERE accounts_id=OLD._id ; END");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            String unused = b.f166435c;
            getDatabaseName();
            sQLiteDatabase.execSQL("CREATE TABLE accounts ( _id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, type TEXT NOT NULL, password TEXT, UNIQUE(name,type))");
            sQLiteDatabase.execSQL("CREATE TABLE authtokens (  _id INTEGER PRIMARY KEY AUTOINCREMENT,  accounts_id INTEGER NOT NULL, type TEXT NOT NULL,  authtoken TEXT,  UNIQUE (accounts_id,type))");
            sQLiteDatabase.execSQL("CREATE TABLE extras ( _id INTEGER PRIMARY KEY AUTOINCREMENT, accounts_id INTEGER, key TEXT NOT NULL, value TEXT, UNIQUE(accounts_id,key))");
            sQLiteDatabase.execSQL(" CREATE TRIGGER accountsDelete DELETE ON accounts BEGIN   DELETE FROM authtokens     WHERE accounts_id=OLD._id ;   DELETE FROM extras     WHERE accounts_id=OLD._id ; END");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            String unused = b.f166435c;
            if (i10 != i11) {
                String str = b.f166435c;
            }
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.server.accounts.b$b, reason: collision with other inner class name */
    public static class C0675b extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f166462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f166463b;

        public final void c(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(" CREATE TRIGGER accountsDelete DELETE ON accounts BEGIN   DELETE FROM grants     WHERE accounts_id=OLD._id ; END");
        }

        public final void d(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(" CREATE TRIGGER accountsDeleteVisibility DELETE ON accounts BEGIN   DELETE FROM visibility     WHERE accounts_id=OLD._id ; END");
        }

        public final void e(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE visibility ( accounts_id INTEGER NOT NULL, _package TEXT NOT NULL, value INTEGER, PRIMARY KEY(accounts_id,_package))");
        }

        public final void f(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE grants (  accounts_id INTEGER NOT NULL, auth_token_type STRING NOT NULL,  uid INTEGER NOT NULL,  UNIQUE (accounts_id,auth_token_type,uid))");
        }

        public final void g(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE shared_accounts ( _id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, type TEXT NOT NULL, UNIQUE(name,type))");
        }

        public SQLiteDatabase k() {
            if (!this.f166463b) {
                String unused = b.f166435c;
                new Throwable();
            }
            return super.getReadableDatabase();
        }

        public SQLiteDatabase l() {
            if (!this.f166463b) {
                String unused = b.f166435c;
                new Throwable();
            }
            return super.getWritableDatabase();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            String unused = b.f166435c;
            sQLiteDatabase.execSQL("CREATE TABLE accounts ( _id INTEGER PRIMARY KEY, name TEXT NOT NULL, type TEXT NOT NULL, previous_name TEXT, last_password_entry_time_millis_epoch INTEGER DEFAULT 0, UNIQUE(name,type))");
            sQLiteDatabase.execSQL("CREATE TABLE meta ( key TEXT PRIMARY KEY NOT NULL, value TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE grants (  accounts_id INTEGER NOT NULL, auth_token_type STRING NOT NULL,  uid INTEGER NOT NULL,  UNIQUE (accounts_id,auth_token_type,uid))");
            sQLiteDatabase.execSQL("CREATE TABLE shared_accounts ( _id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, type TEXT NOT NULL, UNIQUE(name,type))");
            sQLiteDatabase.execSQL(" CREATE TRIGGER accountsDelete DELETE ON accounts BEGIN   DELETE FROM grants     WHERE accounts_id=OLD._id ; END");
            sQLiteDatabase.execSQL("CREATE TABLE visibility ( accounts_id INTEGER NOT NULL, _package TEXT NOT NULL, value INTEGER, PRIMARY KEY(accounts_id,_package))");
            sQLiteDatabase.execSQL(" CREATE TRIGGER accountsDeleteVisibility DELETE ON accounts BEGIN   DELETE FROM visibility     WHERE accounts_id=OLD._id ; END");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            String unused = b.f166435c;
            if (i10 != i11) {
                String str = b.f166435c;
            }
        }

        public C0675b(Context context, int i10, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 3);
            this.f166462a = i10;
        }
    }

    public b(C0675b c0675b, Context context) {
        this.f166460a = c0675b;
        this.f166461b = context;
    }

    public static b f(Context context, int i10, File file) {
        file.exists();
        return new b(new C0675b(context, i10, file.getPath()), context);
    }

    public Account B1(long j10) {
        Cursor cursorQuery = this.f166460a.getReadableDatabase().query(f166442i, new String[]{"name", "type"}, "_id=? ", new String[]{String.valueOf(j10)}, null, null, null);
        try {
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return null;
            }
            Account account = new Account(cursorQuery.getString(0), cursorQuery.getString(1));
            cursorQuery.close();
            return account;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public List<Pair<String, Integer>> C0() {
        Cursor cursorRawQuery = this.f166460a.getReadableDatabase().rawQuery(f166432Z, null);
        if (cursorRawQuery != null) {
            try {
                if (cursorRawQuery.moveToFirst()) {
                    ArrayList arrayList = new ArrayList();
                    do {
                        arrayList.add(Pair.create(cursorRawQuery.getString(0), Integer.valueOf(cursorRawQuery.getInt(1))));
                    } while (cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        List<Pair<String, Integer>> list = Collections.EMPTY_LIST;
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return list;
    }

    public long C1(Account account) {
        Cursor cursorQuery = this.f166460a.getReadableDatabase().query(f166442i, new String[]{"_id"}, "name=? AND type=?", new String[]{account.name, account.type}, null, null, null);
        try {
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return -1L;
            }
            long j10 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j10;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public void D2() {
        this.f166460a.getWritableDatabase().setTransactionSuccessful();
    }

    public long F2(long j10, String str, int i10) {
        SQLiteDatabase writableDatabase = this.f166460a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("accounts_id", Long.valueOf(j10));
        contentValues.put(f166408B, str);
        contentValues.put("uid", Integer.valueOf(i10));
        return writableDatabase.insert(f166459z, "accounts_id", contentValues);
    }

    public String G1(Account account) {
        Cursor cursorQuery = this.f166460a.getReadableDatabase().query(f166442i, new String[]{f166448o}, "name=? AND type=?", new String[]{account.name, account.type}, null, null, null);
        try {
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return null;
            }
            String string = cursorQuery.getString(0);
            cursorQuery.close();
            return string;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public long H2(String str, int i10) {
        SQLiteDatabase writableDatabase = this.f166460a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", f166433a0 + str);
        contentValues.put("value", Integer.valueOf(i10));
        return writableDatabase.insertWithOnConflict(f166415I, null, contentValues, 5);
    }

    public long J2(Account account) {
        SQLiteDatabase writableDatabase = this.f166460a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", account.name);
        contentValues.put("type", account.type);
        return writableDatabase.insert(f166418L, "name", contentValues);
    }

    public Map<Long, Account> L0() {
        SQLiteDatabase readableDatabase = this.f166460a.getReadableDatabase();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor cursorQuery = readableDatabase.query(f166442i, new String[]{"_id", "type", "name"}, null, null, null, null, "_id");
        while (cursorQuery.moveToNext()) {
            try {
                long j10 = cursorQuery.getLong(0);
                linkedHashMap.put(Long.valueOf(j10), new Account(cursorQuery.getString(2), cursorQuery.getString(1)));
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        cursorQuery.close();
        return linkedHashMap;
    }

    public long M1(long j10, String str) {
        Cursor cursorQuery = this.f166460a.k().query(f166425S, new String[]{"_id"}, C2151s.a("accounts_id=", j10, " AND key=?"), new String[]{str}, null, null, null);
        try {
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return -1L;
            }
            long j11 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j11;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public List<Integer> N0() {
        SQLiteDatabase readableDatabase = this.f166460a.getReadableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = readableDatabase.query(f166459z, new String[]{"uid"}, null, null, "uid", null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(Integer.valueOf(cursorQuery.getInt(0)));
            } finally {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public long N1(int i10, String str, Account account) {
        return DatabaseUtils.longForQuery(this.f166460a.getReadableDatabase(), f166427U, new String[]{String.valueOf(i10), str, account.name, account.type});
    }

    public void N2() {
        this.f166460a.getWritableDatabase().endTransaction();
    }

    public Map<Account, Map<String, Integer>> O0() {
        SQLiteDatabase readableDatabase = this.f166460a.getReadableDatabase();
        HashMap map = new HashMap();
        Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT visibility._package, visibility.value, accounts.name, accounts.type FROM visibility JOIN accounts ON accounts._id = visibility.accounts_id", null);
        while (cursorRawQuery.moveToNext()) {
            try {
                String string = cursorRawQuery.getString(0);
                Integer numValueOf = Integer.valueOf(cursorRawQuery.getInt(1));
                Account account = new Account(cursorRawQuery.getString(2), cursorRawQuery.getString(3));
                Map map2 = (Map) map.get(account);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(account, map2);
                }
                map2.put(string, numValueOf);
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        cursorRawQuery.close();
        return map;
    }

    public String P(String str, String str2) {
        Cursor cursorQuery = this.f166460a.k().query(f166423Q, new String[]{"password"}, "name=? AND type=?", new String[]{str, str2}, null, null, null);
        try {
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return null;
            }
            String string = cursorQuery.getString(0);
            cursorQuery.close();
            return string;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public Map<String, Integer> Q0(Account account) {
        SQLiteDatabase readableDatabase = this.f166460a.getReadableDatabase();
        HashMap map = new HashMap();
        Cursor cursorQuery = readableDatabase.query("visibility", new String[]{f166457x, "value"}, f166429W, new String[]{account.name, account.type}, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                map.put(cursorQuery.getString(0), Integer.valueOf(cursorQuery.getInt(1)));
            } finally {
                cursorQuery.close();
            }
        }
        return map;
    }

    public boolean R2() {
        return this.f166460a.f166463b;
    }

    public Map<String, String> T0(Account account) {
        SQLiteDatabase sQLiteDatabaseK = this.f166460a.k();
        HashMap map = new HashMap();
        Cursor cursorQuery = sQLiteDatabaseK.query(f166424R, f166430X, f166429W, new String[]{account.name, account.type}, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                map.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } finally {
                cursorQuery.close();
            }
        }
        return map;
    }

    public Integer U(long j10, String str) {
        Cursor cursorQuery = this.f166460a.getReadableDatabase().query("visibility", new String[]{"value"}, "accounts_id=? AND _package=? ", new String[]{String.valueOf(j10), str}, null, null, null);
        try {
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return null;
            }
            Integer numValueOf = Integer.valueOf(cursorQuery.getInt(0));
            cursorQuery.close();
            return numValueOf;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public long V1(int i10, Account account) {
        return DatabaseUtils.longForQuery(this.f166460a.getReadableDatabase(), f166428V, new String[]{String.valueOf(i10), account.name, account.type});
    }

    public boolean V2(long j10, String str) {
        SQLiteDatabase sQLiteDatabaseL = this.f166460a.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        return sQLiteDatabaseL.update(f166423Q, contentValues, "_id=?", new String[]{String.valueOf(j10)}) > 0;
    }

    public Cursor X0(String str, String str2) {
        return this.f166460a.k().rawQuery("SELECT ceDb.authtokens._id, ceDb.accounts.name, ceDb.authtokens.type FROM ceDb.accounts JOIN ceDb.authtokens ON ceDb.accounts._id = ceDb.authtokens.accounts_id WHERE ceDb.authtokens.authtoken = ? AND ceDb.accounts.type = ?", new String[]{str2, str});
    }

    public Map<String, Integer> Y1() {
        Cursor cursorQuery = this.f166460a.getReadableDatabase().query(f166415I, new String[]{"key", "value"}, f166436c0, new String[]{"auth_uid_for_type:%"}, null, null, "key");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursorQuery.moveToNext()) {
            try {
                String str = TextUtils.split(cursorQuery.getString(0), f166434b0)[1];
                String string = cursorQuery.getString(1);
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(string)) {
                    TextUtils.isEmpty(str);
                    TextUtils.isEmpty(string);
                } else {
                    linkedHashMap.put(str, Integer.valueOf(Integer.parseInt(cursorQuery.getString(1))));
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return linkedHashMap;
    }

    public boolean Z2(long j10, String str, String str2) {
        SQLiteDatabase writableDatabase = this.f166460a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        contentValues.put(f166448o, str2);
        return writableDatabase.update(f166442i, contentValues, "_id=?", new String[]{String.valueOf(j10)}) > 0;
    }

    public long c2(Account account) {
        Cursor cursorQuery = this.f166460a.getReadableDatabase().query(f166418L, new String[]{"_id"}, "name=? AND type=?", new String[]{account.name, account.type}, null, null, null);
        try {
            if (cursorQuery.moveToNext()) {
                return cursorQuery.getLong(0);
            }
            cursorQuery.close();
            return -1L;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f166460a.close();
    }

    public int d3(Account account, String str) {
        SQLiteDatabase writableDatabase = this.f166460a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        return writableDatabase.update(f166418L, contentValues, "name=? AND type=?", new String[]{account.name, account.type});
    }

    public void e(File file) {
        a.a(this.f166461b, file);
        this.f166460a.getWritableDatabase().execSQL("ATTACH DATABASE '" + file.getPath() + "' AS ceDb");
        this.f166460a.f166463b = true;
    }

    public long f1(Account account) {
        Cursor cursorQuery = this.f166460a.k().query(f166423Q, new String[]{"_id"}, "name=? AND type=?", new String[]{account.name, account.type}, null, null, null);
        try {
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return -1L;
            }
            long j10 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j10;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public boolean g(String str) {
        return this.f166460a.getWritableDatabase().delete("visibility", "_package=? ", new String[]{str}) > 0;
    }

    public List<Account> h1() {
        Cursor cursorRawQuery = this.f166460a.k().rawQuery("SELECT name,type FROM ceDb.accounts WHERE NOT EXISTS  (SELECT _id FROM accounts WHERE _id=ceDb.accounts._id )", null);
        try {
            ArrayList arrayList = new ArrayList(cursorRawQuery.getCount());
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(new Account(cursorRawQuery.getString(0), cursorRawQuery.getString(1)));
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    public Map<String, String> h2(Account account) {
        SQLiteDatabase sQLiteDatabaseK = this.f166460a.k();
        HashMap map = new HashMap();
        Cursor cursorQuery = sQLiteDatabaseK.query(f166425S, f166431Y, f166429W, new String[]{account.name, account.type}, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                map.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        cursorQuery.close();
        return map;
    }

    public List<Account> j2() {
        SQLiteDatabase readableDatabase = this.f166460a.getReadableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = readableDatabase.query(f166418L, new String[]{"name", "type"}, null, null, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int columnIndex = cursorQuery.getColumnIndex("name");
                int columnIndex2 = cursorQuery.getColumnIndex("type");
                do {
                    arrayList.add(new Account(cursorQuery.getString(columnIndex), cursorQuery.getString(columnIndex2)));
                } while (cursorQuery.moveToNext());
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public boolean k(String str) {
        return this.f166460a.l().delete(f166424R, "_id= ?", new String[]{str}) > 0;
    }

    public boolean k3(long j10, String str, int i10) {
        SQLiteDatabase writableDatabase = this.f166460a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("accounts_id", String.valueOf(j10));
        contentValues.put(f166457x, str);
        contentValues.put("value", String.valueOf(i10));
        return writableDatabase.replace("visibility", "value", contentValues) != -1;
    }

    public boolean l(long j10) {
        return this.f166460a.l().delete(f166424R, "accounts_id=?", new String[]{String.valueOf(j10)}) > 0;
    }

    public boolean m(long j10, String str) {
        return this.f166460a.l().delete(f166424R, "accounts_id=? AND type=?", new String[]{String.valueOf(j10), str}) > 0;
    }

    public long m2(long j10, String str, String str2) {
        SQLiteDatabase sQLiteDatabaseL = this.f166460a.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("accounts_id", Long.valueOf(j10));
        contentValues.put("type", str);
        contentValues.put(f166454u, str2);
        return sQLiteDatabaseL.insert(f166424R, f166454u, contentValues);
    }

    public boolean m3(Account account) {
        SQLiteDatabase writableDatabase = this.f166460a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(f166449p, Long.valueOf(System.currentTimeMillis()));
        return writableDatabase.update(f166442i, contentValues, "name=? AND type=?", new String[]{account.name, account.type}) > 0;
    }

    public boolean n(long j10) {
        return this.f166460a.l().delete(f166423Q, Q.a("_id=", j10), null) > 0;
    }

    public long n2(Account account, String str) {
        SQLiteDatabase sQLiteDatabaseL = this.f166460a.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", account.name);
        contentValues.put("type", account.type);
        contentValues.put("password", str);
        return sQLiteDatabaseL.insert(f166423Q, "name", contentValues);
    }

    public boolean o(long j10) {
        return this.f166460a.getWritableDatabase().delete(f166442i, Q.a("_id=", j10), null) > 0;
    }

    public boolean p(long j10, String str, long j11) {
        return this.f166460a.getWritableDatabase().delete(f166459z, "accounts_id=? AND auth_token_type=? AND uid=?", new String[]{String.valueOf(j10), str, String.valueOf(j11)}) > 0;
    }

    public long p2(Account account, long j10) {
        SQLiteDatabase writableDatabase = this.f166460a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Long.valueOf(j10));
        contentValues.put("name", account.name);
        contentValues.put("type", account.type);
        contentValues.put(f166449p, Long.valueOf(System.currentTimeMillis()));
        return writableDatabase.insert(f166442i, "name", contentValues);
    }

    public boolean q(int i10) {
        return this.f166460a.getWritableDatabase().delete(f166459z, "uid=?", new String[]{Integer.toString(i10)}) > 0;
    }

    public int q3(long j10, String str) {
        SQLiteDatabase sQLiteDatabaseL = this.f166460a.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("password", str);
        return sQLiteDatabaseL.update(f166423Q, contentValues, "_id=?", new String[]{String.valueOf(j10)});
    }

    public boolean r(String str, int i10) {
        return this.f166460a.getWritableDatabase().delete(f166415I, "key=? AND value=?", new String[]{y.a(f166433a0, str), String.valueOf(i10)}) > 0;
    }

    public Integer r0(Account account, String str) {
        Cursor cursorQuery = this.f166460a.getReadableDatabase().query("visibility", new String[]{"value"}, "accounts_id=(select _id FROM accounts WHERE name=? AND type=?) AND _package=? ", new String[]{account.name, account.type, str}, null, null, null);
        try {
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return null;
            }
            Integer numValueOf = Integer.valueOf(cursorQuery.getInt(0));
            cursorQuery.close();
            return numValueOf;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public boolean s(Account account) {
        return this.f166460a.getWritableDatabase().delete(f166418L, "name=? AND type=?", new String[]{account.name, account.type}) > 0;
    }

    public void s0() {
        this.f166460a.getWritableDatabase().beginTransaction();
    }

    public void u(PrintWriter printWriter) {
        Cursor cursorQuery = this.f166460a.getReadableDatabase().query(f166442i, f166426T, null, null, "type", null, null);
        while (cursorQuery.moveToNext()) {
            try {
                printWriter.println(cursorQuery.getString(0) + "," + cursorQuery.getString(1));
            } finally {
            }
        }
        cursorQuery.close();
    }

    public boolean v3(long j10, String str) {
        SQLiteDatabase sQLiteDatabaseL = this.f166460a.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str);
        return sQLiteDatabaseL.update(f166425S, contentValues, "_id=?", new String[]{String.valueOf(j10)}) == 1;
    }

    public long y(Account account) {
        return DatabaseUtils.longForQuery(this.f166460a.getReadableDatabase(), "SELECT last_password_entry_time_millis_epoch FROM accounts WHERE name=? AND type=?", new String[]{account.name, account.type});
    }

    public long z2(long j10, String str, String str2) {
        SQLiteDatabase sQLiteDatabaseL = this.f166460a.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("accounts_id", Long.valueOf(j10));
        contentValues.put("value", str2);
        return sQLiteDatabaseL.insert(f166425S, "key", contentValues);
    }
}
