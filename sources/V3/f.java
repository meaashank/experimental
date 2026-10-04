package V3;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.compose.runtime.internal.r;
import e.g0;
import hc.AbstractC4521a;
import hc.I;
import hc.q;
import java.io.IOException;
import java.util.ArrayList;
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
@V({"SMAP\nAdBlockAllowListDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdBlockAllowListDatabase.kt\ncom/cookiegames/smartcookie/database/allowlist/AdBlockAllowListDatabase\n+ 2 CursorExtensions.kt\ncom/cookiegames/smartcookie/extensions/CursorExtensionsKt\n*L\n1#1,114:1\n21#2,6:115\n36#2,4:121\n*S KotlinDebug\n*F\n+ 1 AdBlockAllowListDatabase.kt\ncom/cookiegames/smartcookie/database/allowlist/AdBlockAllowListDatabase\n*L\n62#1:115,6\n74#1:121,4\n*E\n"})
@g0
@r(parameters = 0)
@Singleton
public final class f extends SQLiteOpenHelper implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f74604e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f74605f = "allowListManager";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f74606g = "allowList";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f74607h = "id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f74608i = "url";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f74609j = "created";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4845e f74610a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f74602c = {O.u(new PropertyReference1Impl(f.class, "database", "getDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f74601b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f74603d = 8;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public f(@NotNull Application application) {
        super(application, f74605f, (SQLiteDatabase.CursorFactory) null, 1);
        G.p(application, "application");
        this.f74610a = new T3.b();
    }

    public static final void n(f fVar, i iVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", iVar.f74613a);
        contentValues.put("created", Long.valueOf(iVar.f74614b));
        fVar.s().insert(f74606g, null, contentValues);
    }

    public static final List o(f fVar) throws IOException {
        Cursor cursorQuery = fVar.s().query(f74606g, null, null, null, null, null, "created DESC");
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(fVar.q(cursorQuery));
            }
            cursor.close();
            return arrayList;
        } finally {
        }
    }

    public static final i p(f fVar, String str) {
        Cursor cursorQuery = fVar.s().query(f74606g, null, "url=?", new String[]{str}, null, null, "created DESC", "1");
        G.o(cursorQuery, "query(...)");
        if (cursorQuery.moveToFirst()) {
            return fVar.q(cursorQuery);
        }
        return null;
    }

    public static final void r(f fVar) {
        SQLiteDatabase sQLiteDatabaseS = fVar.s();
        sQLiteDatabaseS.delete(f74606g, null, null);
        sQLiteDatabaseS.close();
    }

    public static final void u(f fVar, i iVar) {
        fVar.s().delete(f74606g, "url = ?", new String[]{iVar.f74613a});
    }

    @Override // V3.h
    @NotNull
    public q<i> b(@NotNull final String url) {
        G.p(url, "url");
        q<i> qVarK0 = q.k0(new Callable() { // from class: V3.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.p(this.f74593a, url);
            }
        });
        G.o(qVarK0, "fromCallable(...)");
        return qVarK0;
    }

    @Override // V3.h
    @NotNull
    public I<List<i>> d() {
        I<List<i>> iF0 = I.f0(new Callable() { // from class: V3.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.o(this.f74600a);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // V3.h
    @NotNull
    public AbstractC4521a e(@NotNull final i whitelistItem) {
        G.p(whitelistItem, "whitelistItem");
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: V3.b
            @Override // nc.InterfaceC5265a
            public final void run() {
                f.n(this.f74595a, whitelistItem);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // V3.h
    @NotNull
    public AbstractC4521a f(@NotNull final i whitelistItem) {
        G.p(whitelistItem, "whitelistItem");
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: V3.d
            @Override // nc.InterfaceC5265a
            public final void run() {
                f.u(this.f74598a, whitelistItem);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // V3.h
    @NotNull
    public AbstractC4521a k() {
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: V3.c
            @Override // nc.InterfaceC5265a
            public final void run() {
                f.r(this.f74597a);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db2) {
        G.p(db2, "db");
        db2.execSQL("CREATE TABLE allowList( id INTEGER PRIMARY KEY, url TEXT, created INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db2, int i10, int i11) {
        G.p(db2, "db");
        db2.execSQL("DROP TABLE IF EXISTS allowList");
        onCreate(db2);
    }

    public final i q(Cursor cursor) {
        String string = cursor.getString(1);
        G.o(string, "getString(...)");
        return new i(string, cursor.getLong(2));
    }

    public final SQLiteDatabase s() {
        return (SQLiteDatabase) this.f74610a.getValue(this, f74602c[0]);
    }
}
