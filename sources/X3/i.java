package X3;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.compose.runtime.internal.r;
import androidx.room.F;
import hc.AbstractC4521a;
import hc.I;
import hc.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kd.InterfaceC4845e;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.V;
import kotlin.reflect.n;
import nc.InterfaceC5265a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nDownloadsDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadsDatabase.kt\ncom/cookiegames/smartcookie/database/downloads/DownloadsDatabase\n+ 2 CursorExtensions.kt\ncom/cookiegames/smartcookie/extensions/CursorExtensionsKt\n*L\n1#1,170:1\n36#2,4:171\n21#2,6:175\n*S KotlinDebug\n*F\n+ 1 DownloadsDatabase.kt\ncom/cookiegames/smartcookie/database/downloads/DownloadsDatabase\n*L\n56#1:171,4\n127#1:175,6\n*E\n"})
@r(parameters = 0)
@Singleton
public final class i extends SQLiteOpenHelper implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f76769e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f76770f = "downloadManager";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f76771g = "download";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f76772h = "id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f76773i = "url";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f76774j = "title";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f76775k = "size";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4845e f76776a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f76767c = {O.u(new PropertyReference1Impl(i.class, "database", "getDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f76766b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f76768d = 8;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public i(@NotNull Application application) {
        super(application, f76770f, (SQLiteDatabase.CursorFactory) null, 1);
        G.p(application, "application");
        this.f76776a = new T3.b();
    }

    public static final Boolean L0(i iVar, String str) {
        Cursor cursorQuery = iVar.C0().query("download", null, "url=?", new String[]{str}, null, null, null, "1");
        try {
            Boolean boolValueOf = Boolean.valueOf(cursorQuery.moveToFirst());
            kotlin.io.b.a(cursorQuery, null);
            return boolValueOf;
        } finally {
        }
    }

    public static final Boolean P(i iVar, String str) {
        return Boolean.valueOf(iVar.C0().delete("download", "url=?", new String[]{str}) > 0);
    }

    public static final X3.a U(i iVar, String str) {
        Cursor cursorQuery = iVar.C0().query("download", null, "url=?", new String[]{str}, null, null, "1");
        G.o(cursorQuery, "query(...)");
        if (cursorQuery.moveToFirst()) {
            return iVar.u(cursorQuery);
        }
        return null;
    }

    public static final Boolean r(i iVar, X3.a aVar) {
        Cursor cursorQuery = iVar.C0().query("download", null, "url=?", new String[]{aVar.f76751a}, null, null, "1");
        try {
            if (!cursorQuery.moveToFirst()) {
                kotlin.io.b.a(cursorQuery, null);
                return Boolean.valueOf(iVar.C0().insert("download", null, iVar.N0(aVar)) != -1);
            }
            Boolean bool = Boolean.FALSE;
            kotlin.io.b.a(cursorQuery, null);
            return bool;
        } finally {
        }
    }

    public static final List r0(i iVar) throws IOException {
        Cursor cursorQuery = iVar.C0().query("download", null, null, null, null, null, "id DESC");
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(iVar.u(cursorQuery));
            }
            cursor.close();
            return arrayList;
        } finally {
        }
    }

    public static final void s(i iVar, List list) {
        SQLiteDatabase sQLiteDatabaseC0 = iVar.C0();
        sQLiteDatabaseC0.beginTransaction();
        sQLiteDatabaseC0.setTransactionSuccessful();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iVar.e((X3.a) it.next()).U0();
        }
        sQLiteDatabaseC0.endTransaction();
    }

    public static final void y(i iVar) {
        SQLiteDatabase sQLiteDatabaseC0 = iVar.C0();
        sQLiteDatabaseC0.delete("download", null, null);
        sQLiteDatabaseC0.close();
    }

    public final SQLiteDatabase C0() {
        return (SQLiteDatabase) this.f76776a.getValue(this, f76767c[0]);
    }

    public final ContentValues N0(X3.a aVar) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("title", aVar.f76752b);
        contentValues.put("url", aVar.f76751a);
        contentValues.put(f76775k, aVar.f76753c);
        return contentValues;
    }

    @Override // X3.k
    @NotNull
    public q<X3.a> b(@NotNull final String url) {
        G.p(url, "url");
        q<X3.a> qVarK0 = q.k0(new Callable() { // from class: X3.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i.U(this.f76764a, url);
            }
        });
        G.o(qVarK0, "fromCallable(...)");
        return qVarK0;
    }

    @Override // X3.k
    public long count() {
        return DatabaseUtils.queryNumEntries(C0(), "download");
    }

    @Override // X3.k
    @NotNull
    public AbstractC4521a d() {
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: X3.e
            @Override // nc.InterfaceC5265a
            public final void run() {
                i.y(this.f76760a);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // X3.k
    @NotNull
    public I<Boolean> e(@NotNull final X3.a entry) {
        G.p(entry, "entry");
        I<Boolean> iF0 = I.f0(new Callable() { // from class: X3.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i.r(this.f76762a, entry);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // X3.k
    @NotNull
    public I<List<X3.a>> k() {
        I<List<X3.a>> iF0 = I.f0(new Callable() { // from class: X3.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i.r0(this.f76761a);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // X3.k
    @NotNull
    public I<Boolean> l(@NotNull final String url) {
        G.p(url, "url");
        I<Boolean> iF0 = I.f0(new Callable() { // from class: X3.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i.P(this.f76754a, url);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // X3.k
    @NotNull
    public I<Boolean> m(@NotNull final String url) {
        G.p(url, "url");
        I<Boolean> iF0 = I.f0(new Callable() { // from class: X3.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i.L0(this.f76758a, url);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // X3.k
    @NotNull
    public AbstractC4521a n(@NotNull final List<X3.a> downloadEntries) {
        G.p(downloadEntries, "downloadEntries");
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: X3.c
            @Override // nc.InterfaceC5265a
            public final void run() {
                i.s(this.f76756a, downloadEntries);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db2) {
        G.p(db2, "db");
        String strSqlEscapeString = DatabaseUtils.sqlEscapeString("download");
        String strSqlEscapeString2 = DatabaseUtils.sqlEscapeString("id");
        String strSqlEscapeString3 = DatabaseUtils.sqlEscapeString("url");
        String strSqlEscapeString4 = DatabaseUtils.sqlEscapeString("title");
        String strSqlEscapeString5 = DatabaseUtils.sqlEscapeString(f76775k);
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("CREATE TABLE ", strSqlEscapeString, "(", strSqlEscapeString2, " INTEGER PRIMARY KEY,");
        F.a(sbA, strSqlEscapeString3, " TEXT,", strSqlEscapeString4, " TEXT,");
        sbA.append(strSqlEscapeString5);
        sbA.append(" TEXT)");
        db2.execSQL(sbA.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db2, int i10, int i11) {
        G.p(db2, "db");
        db2.execSQL("DROP TABLE IF EXISTS " + DatabaseUtils.sqlEscapeString("download"));
        onCreate(db2);
    }

    public final X3.a u(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("url"));
        G.o(string, "getString(...)");
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("title"));
        G.o(string2, "getString(...)");
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(f76775k));
        G.o(string3, "getString(...)");
        return new X3.a(string, string2, string3);
    }
}
