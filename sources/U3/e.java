package U3;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.compose.runtime.internal.r;
import hc.AbstractC4521a;
import hc.I;
import hc.InterfaceC4523c;
import hc.InterfaceC4525e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kd.InterfaceC4845e;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.V;
import kotlin.reflect.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nHostsDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostsDatabase.kt\ncom/cookiegames/smartcookie/database/adblock/HostsDatabase\n+ 2 CloseableExtensions.kt\ncom/cookiegames/smartcookie/extensions/CloseableExtensionsKt\n+ 3 CursorExtensions.kt\ncom/cookiegames/smartcookie/extensions/CursorExtensionsKt\n*L\n1#1,131:1\n10#2,5:132\n21#3,6:137\n*S KotlinDebug\n*F\n+ 1 HostsDatabase.kt\ncom/cookiegames/smartcookie/database/adblock/HostsDatabase\n*L\n79#1:132,5\n97#1:137,6\n*E\n"})
@r(parameters = 0)
@Singleton
public final class e extends SQLiteOpenHelper implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f68508e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f68509f = "hostsDatabase";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f68510g = "hosts";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f68511h = "id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f68512i = "url";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4845e f68513a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f68506c = {O.u(new PropertyReference1Impl(e.class, "database", "getDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f68505b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f68507d = 8;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public e(@NotNull Application application) {
        super(application, f68509f, (SQLiteDatabase.CursorFactory) null, 1);
        G.p(application, "application");
        this.f68513a = new T3.b();
    }

    public static final void g(e eVar, List list, InterfaceC4523c it) {
        G.p(it, "it");
        SQLiteDatabase sQLiteDatabaseO = eVar.o();
        sQLiteDatabaseO.beginTransaction();
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                sQLiteDatabaseO.setTransactionSuccessful();
                sQLiteDatabaseO.endTransaction();
                break;
            }
            String str = ((U3.a) it2.next()).f68500a;
            if (it.isDisposed()) {
                sQLiteDatabaseO.endTransaction();
                it.onComplete();
                break;
            }
            eVar.o().insert(f68510g, null, eVar.q(str));
        }
        it.onComplete();
    }

    public static final List m(e eVar) throws IOException {
        Cursor cursorQuery = eVar.o().query(f68510g, null, null, null, null, null, "id DESC");
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(new U3.a(eVar.n(cursorQuery)));
            }
            cursor.close();
            return arrayList;
        } finally {
        }
    }

    public static final L0 p(e eVar) {
        SQLiteDatabase sQLiteDatabaseO = eVar.o();
        sQLiteDatabaseO.delete(f68510g, null, null);
        sQLiteDatabaseO.close();
        return L0.f217464a;
    }

    @Override // U3.g
    @NotNull
    public AbstractC4521a a(@NotNull final List<U3.a> hosts) {
        G.p(hosts, "hosts");
        AbstractC4521a abstractC4521aZ = AbstractC4521a.z(new InterfaceC4525e() { // from class: U3.d
            @Override // hc.InterfaceC4525e
            public final void a(InterfaceC4523c interfaceC4523c) {
                e.g(this.f68503a, hosts, interfaceC4523c);
            }
        });
        G.o(abstractC4521aZ, "create(...)");
        return abstractC4521aZ;
    }

    @Override // U3.g
    public boolean b(@NotNull String host) {
        G.p(host, "host");
        Cursor cursorQuery = o().query(f68510g, null, "url=?", new String[]{host}, null, null, "1");
        try {
            try {
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                kotlin.io.b.a(cursorQuery, null);
                return zMoveToFirst;
            } finally {
            }
        } catch (Throwable th) {
            Log.e("Closeable", "Unable to parse results", th);
            return false;
        }
    }

    @Override // U3.g
    public boolean d() {
        return DatabaseUtils.queryNumEntries(o(), f68510g) > 0;
    }

    @Override // U3.g
    @NotNull
    public AbstractC4521a k() {
        AbstractC4521a abstractC4521aQ = AbstractC4521a.Q(new Callable() { // from class: U3.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.p(this.f68502a);
            }
        });
        G.o(abstractC4521aQ, "fromCallable(...)");
        return abstractC4521aQ;
    }

    @Override // U3.g
    @NotNull
    public I<List<U3.a>> l() {
        I<List<U3.a>> iF0 = I.f0(new Callable() { // from class: U3.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.m(this.f68501a);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    public final String n(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("url"));
        G.o(string, "getString(...)");
        return string;
    }

    public final SQLiteDatabase o() {
        return (SQLiteDatabase) this.f68513a.getValue(this, f68506c[0]);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db2) {
        G.p(db2, "db");
        String strSqlEscapeString = DatabaseUtils.sqlEscapeString(f68510g);
        String strSqlEscapeString2 = DatabaseUtils.sqlEscapeString("id");
        String strSqlEscapeString3 = DatabaseUtils.sqlEscapeString("url");
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("CREATE TABLE ", strSqlEscapeString, "(", strSqlEscapeString2, " INTEGER PRIMARY KEY,");
        sbA.append(strSqlEscapeString3);
        sbA.append(" TEXT)");
        db2.execSQL(sbA.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db2, int i10, int i11) {
        G.p(db2, "db");
        db2.execSQL("DROP TABLE IF EXISTS " + DatabaseUtils.sqlEscapeString(f68510g));
        onCreate(db2);
    }

    public final ContentValues q(String str) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("url", str);
        return contentValues;
    }
}
