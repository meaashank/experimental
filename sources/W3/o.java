package W3;

import T3.a;
import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.fragment.app.C2564b;
import com.cookiegames.smartcookie.p;
import com.google.firebase.sessions.settings.RemoteSettings;
import hc.AbstractC4521a;
import hc.I;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kd.InterfaceC4845e;
import kotlin.collections.J;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.V;
import kotlin.text.F;
import kotlin.text.M;
import nc.InterfaceC5265a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nBookmarkDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookmarkDatabase.kt\ncom/cookiegames/smartcookie/database/bookmark/BookmarkDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Cursor.kt\nandroidx/core/database/CursorKt\n+ 4 CursorExtensions.kt\ncom/cookiegames/smartcookie/extensions/CursorExtensionsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1#2:324\n112#3:325\n36#4,4:326\n21#4,6:330\n21#4,6:336\n21#4,6:342\n21#4,6:355\n766#5:348\n857#5,2:349\n1549#5:351\n1620#5,3:352\n766#5:361\n857#5,2:362\n*S KotlinDebug\n*F\n+ 1 BookmarkDatabase.kt\ncom/cookiegames/smartcookie/database/bookmark/BookmarkDatabase\n*L\n282#1:325\n124#1:326,4\n208#1:330,6\n221#1:336,6\n237#1:342,6\n253#1:355,6\n238#1:348\n238#1:349,2\n239#1:351\n239#1:352,3\n254#1:361\n254#1:362,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
@Singleton
public final class o extends SQLiteOpenHelper implements s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f76577f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f76578g = "bookmarkManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f76579h = "bookmark";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f76580i = "id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f76581j = "url";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f76582k = "title";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f76583l = "folder";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f76584m = "position";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f76585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4845e f76586b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f76575d = {O.u(new PropertyReference1Impl(o.class, "database", "getDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f76574c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f76576e = 8;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public o(@NotNull Application application) {
        super(application, f76578g, (SQLiteDatabase.CursorFactory) null, 1);
        G.p(application, "application");
        String string = application.getString(p.s.fi);
        G.o(string, "getString(...)");
        this.f76585a = string;
        this.f76586b = new T3.b();
    }

    public static final Boolean F2(o oVar, String str) throws IOException {
        Cursor cursorJ2 = oVar.J2(str);
        try {
            Boolean boolValueOf = Boolean.valueOf(cursorJ2.moveToFirst());
            cursorJ2.close();
            return boolValueOf;
        } finally {
        }
    }

    public static final void H2(o oVar, a.C0110a c0110a, int i10) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put(f76584m, Integer.valueOf(i10));
        oVar.n2().update(f76579h, contentValues, "url=?", new String[]{c0110a.f68304g});
    }

    public static final void M1(o oVar) {
        SQLiteDatabase sQLiteDatabaseN2 = oVar.n2();
        sQLiteDatabaseN2.delete(f76579h, null, null);
        sQLiteDatabaseN2.close();
    }

    public static final Boolean N1(o oVar, a.C0110a c0110a) {
        return Boolean.valueOf(oVar.Y1(c0110a.f68304g) > 0);
    }

    public static final void R2(o oVar, String str, String str2) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("folder", str2);
        oVar.n2().update(f76579h, contentValues, "folder=?", new String[]{str});
    }

    public static final void V1(o oVar, String str) {
        oVar.l(str, "").C0();
    }

    public static final void c2(o oVar, a.C0110a c0110a, a.C0110a c0110a2) {
        oVar.V2(c0110a2.f68304g, oVar.C1(c0110a));
    }

    public static final Boolean f1(o oVar, a.C0110a c0110a) throws IOException {
        Cursor cursorJ2 = oVar.J2(c0110a.f68304g);
        try {
            if (!cursorJ2.moveToFirst()) {
                cursorJ2.close();
                return Boolean.valueOf(oVar.n2().insert(f76579h, null, oVar.C1(c0110a)) != -1);
            }
            Boolean bool = Boolean.FALSE;
            cursorJ2.close();
            return bool;
        } finally {
        }
    }

    public static final void h1(o oVar, List list) {
        SQLiteDatabase sQLiteDatabaseN2 = oVar.n2();
        sQLiteDatabaseN2.beginTransaction();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oVar.m((a.C0110a) it.next()).U0();
        }
        sQLiteDatabaseN2.setTransactionSuccessful();
        sQLiteDatabaseN2.endTransaction();
    }

    public static final a.C0110a h2(o oVar, String str) {
        Cursor cursorJ2 = oVar.J2(str);
        if (cursorJ2.moveToFirst()) {
            return oVar.G1(cursorJ2);
        }
        return null;
    }

    public static final List j2(o oVar) throws IOException {
        Cursor cursorQuery = oVar.n2().query(f76579h, null, null, null, null, null, "id");
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(oVar.G1(cursorQuery));
            }
            cursor.close();
            return arrayList;
        } finally {
        }
    }

    public static final List m2(String str, o oVar) throws IOException {
        if (str == null) {
            str = "";
        }
        Cursor cursorQuery = oVar.n2().query(f76579h, null, "folder=?", new String[]{str}, null, null, "position ASC, title COLLATE NOCASE ASC, url ASC");
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(oVar.G1(cursorQuery));
            }
            cursor.close();
            return arrayList;
        } finally {
        }
    }

    public static final List p2(o oVar) throws IOException {
        Cursor cursorQuery = oVar.n2().query(true, f76579h, new String[]{"folder"}, null, null, null, null, "folder ASC", null);
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("folder")));
            }
            cursor.close();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                if (!(str == null || str.length() == 0)) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        } finally {
        }
    }

    public static final List z2(o oVar) throws IOException {
        Cursor cursorQuery = oVar.n2().query(true, f76579h, new String[]{"folder"}, null, null, null, null, "folder ASC", null);
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("folder")));
            }
            cursor.close();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                String str = (String) obj;
                if (!(str == null || str.length() == 0)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(J.d0(arrayList2, 10));
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                arrayList3.add(T3.h.a((String) obj2));
            }
            return arrayList3;
        } finally {
        }
    }

    public final String B1(String str) {
        if (!F.d2(str, RemoteSettings.FORWARD_SLASH_STRING, false, 2, null)) {
            return str.concat(RemoteSettings.FORWARD_SLASH_STRING);
        }
        String strSubstring = str.substring(0, str.length() - 1);
        G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final ContentValues C1(a.C0110a c0110a) {
        ContentValues contentValues = new ContentValues(4);
        String str = c0110a.f68305h;
        if (M.Q3(str)) {
            str = null;
        }
        if (str == null) {
            str = this.f76585a;
        }
        contentValues.put("title", str);
        contentValues.put("url", c0110a.f68304g);
        contentValues.put("folder", c0110a.f68307j.a());
        contentValues.put(f76584m, Integer.valueOf(c0110a.f68306i));
        return contentValues;
    }

    public final a.C0110a G1(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("url"));
        G.o(string, "getString(...)");
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("title"));
        G.o(string2, "getString(...)");
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("folder");
        return new a.C0110a(string, string2, cursor.getInt(cursor.getColumnIndexOrThrow(f76584m)), T3.h.a(cursor.isNull(columnIndexOrThrow) ? null : cursor.getString(columnIndexOrThrow)));
    }

    public final Cursor J2(String str) {
        Cursor cursorQuery = n2().query(f76579h, null, "url=? OR url=?", new String[]{str, B1(str)}, null, null, null, "1");
        G.o(cursorQuery, "query(...)");
        return cursorQuery;
    }

    public final int V2(String str, ContentValues contentValues) {
        int iUpdate = n2().update(f76579h, contentValues, "url=?", new String[]{str});
        if (iUpdate != 0) {
            return iUpdate;
        }
        return n2().update(f76579h, contentValues, "url=?", new String[]{B1(str)});
    }

    public final int Y1(String str) {
        return n2().delete(f76579h, "url=? OR url=?", new String[]{str, B1(str)});
    }

    @Override // W3.s
    @NotNull
    public I<Boolean> b(@NotNull final String url) {
        G.p(url, "url");
        I<Boolean> iF0 = I.f0(new Callable() { // from class: W3.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o.F2(this.f76572a, url);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // W3.s
    @NotNull
    public AbstractC4521a c(@NotNull final a.C0110a oldBookmark, @NotNull final a.C0110a newBookmark) {
        G.p(oldBookmark, "oldBookmark");
        G.p(newBookmark, "newBookmark");
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: W3.j
            @Override // nc.InterfaceC5265a
            public final void run() {
                o.c2(this.f76564a, newBookmark, oldBookmark);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // W3.s
    public long count() {
        return DatabaseUtils.queryNumEntries(n2(), f76579h);
    }

    @Override // W3.s
    @NotNull
    public I<List<a.C0110a>> d() {
        I<List<a.C0110a>> iF0 = I.f0(new Callable() { // from class: W3.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o.j2(this.f76571a);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // W3.s
    @NotNull
    public AbstractC4521a k() {
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: W3.e
            @Override // nc.InterfaceC5265a
            public final void run() {
                o.M1(this.f76555a);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // W3.s
    @NotNull
    public AbstractC4521a l(@NotNull final String oldName, @NotNull final String newName) {
        G.p(oldName, "oldName");
        G.p(newName, "newName");
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: W3.h
            @Override // nc.InterfaceC5265a
            public final void run() {
                o.R2(this.f76559a, oldName, newName);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // W3.s
    @NotNull
    public I<Boolean> m(@NotNull final a.C0110a entry) {
        G.p(entry, "entry");
        I<Boolean> iF0 = I.f0(new Callable() { // from class: W3.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o.f1(this.f76569a, entry);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // W3.s
    @NotNull
    public I<List<T3.a>> n(@Nullable final String str) {
        I<List<T3.a>> iF0 = I.f0(new Callable() { // from class: W3.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o.m2(str, this);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    public final SQLiteDatabase n2() {
        return (SQLiteDatabase) this.f76586b.getValue(this, f76575d[0]);
    }

    @Override // W3.s
    @NotNull
    public I<Boolean> o(@NotNull final a.C0110a entry) {
        G.p(entry, "entry");
        I<Boolean> iF0 = I.f0(new Callable() { // from class: W3.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o.N1(this.f76553a, entry);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db2) {
        G.p(db2, "db");
        String strSqlEscapeString = DatabaseUtils.sqlEscapeString(f76579h);
        String strSqlEscapeString2 = DatabaseUtils.sqlEscapeString("id");
        String strSqlEscapeString3 = DatabaseUtils.sqlEscapeString("url");
        String strSqlEscapeString4 = DatabaseUtils.sqlEscapeString("title");
        String strSqlEscapeString5 = DatabaseUtils.sqlEscapeString("folder");
        String strSqlEscapeString6 = DatabaseUtils.sqlEscapeString(f76584m);
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("CREATE TABLE ", strSqlEscapeString, "(", strSqlEscapeString2, " INTEGER PRIMARY KEY,");
        androidx.room.F.a(sbA, strSqlEscapeString3, " TEXT,", strSqlEscapeString4, " TEXT,");
        db2.execSQL(C2564b.a(sbA, strSqlEscapeString5, " TEXT,", strSqlEscapeString6, " INTEGER)"));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db2, int i10, int i11) {
        G.p(db2, "db");
        db2.execSQL("DROP TABLE IF EXISTS " + DatabaseUtils.sqlEscapeString(f76579h));
        onCreate(db2);
    }

    @Override // W3.s
    @NotNull
    public I<List<String>> p() {
        I<List<String>> iF0 = I.f0(new Callable() { // from class: W3.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o.p2(this.f76549a);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // W3.s
    @NotNull
    public AbstractC4521a q(@NotNull final String folderToDelete) {
        G.p(folderToDelete, "folderToDelete");
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: W3.k
            @Override // nc.InterfaceC5265a
            public final void run() {
                o.V1(this.f76567a, folderToDelete);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // W3.s
    @NotNull
    public AbstractC4521a r(@NotNull final List<a.C0110a> bookmarkItems) {
        G.p(bookmarkItems, "bookmarkItems");
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: W3.i
            @Override // nc.InterfaceC5265a
            public final void run() {
                o.h1(this.f76562a, bookmarkItems);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // W3.s
    @NotNull
    public I<List<a.b>> s() {
        I<List<a.b>> iF0 = I.f0(new Callable() { // from class: W3.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o.z2(this.f76556a);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // W3.s
    @NotNull
    public AbstractC4521a u(@NotNull final a.C0110a entry, final int i10) {
        G.p(entry, "entry");
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: W3.c
            @Override // nc.InterfaceC5265a
            public final void run() {
                o.H2(this.f76550a, entry, i10);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // W3.s
    @NotNull
    public hc.q<a.C0110a> y(@NotNull final String url) {
        G.p(url, "url");
        hc.q<a.C0110a> qVarK0 = hc.q.k0(new Callable() { // from class: W3.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o.h2(this.f76557a, url);
            }
        });
        G.o(qVarK0, "fromCallable(...)");
        return qVarK0;
    }
}
