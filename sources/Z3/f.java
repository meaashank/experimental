package Z3;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.media.i;
import androidx.compose.foundation.text.modifiers.l;
import androidx.compose.runtime.internal.r;
import androidx.fragment.app.C2564b;
import androidx.room.F;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e.g0;
import hc.AbstractC4521a;
import hc.I;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nJavaScriptDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaScriptDatabase.kt\ncom/cookiegames/smartcookie/database/javascript/JavaScriptDatabase\n+ 2 CursorExtensions.kt\ncom/cookiegames/smartcookie/extensions/CursorExtensionsKt\n*L\n1#1,218:1\n36#2,4:219\n21#2,6:223\n21#2,6:229\n21#2,6:235\n*S KotlinDebug\n*F\n+ 1 JavaScriptDatabase.kt\ncom/cookiegames/smartcookie/database/javascript/JavaScriptDatabase\n*L\n149#1:219,4\n161#1:223,6\n96#1:229,6\n110#1:235,6\n*E\n"})
@g0
@r(parameters = 0)
@Singleton
public final class f extends SQLiteOpenHelper implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f79409f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f79410g = "javascriptManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f79411h = "javascript";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f79412i = "id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f79413j = "name";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f79414k = "namespace";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f79415l = "author";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f79416m = "version";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f79417n = "include";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f79418o = "exclude";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f79419p = "time";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final String f79420q = "permissions";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String f79421r = "requirements";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f79422s = "code";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4845e f79423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f79424b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f79407d = {O.u(new PropertyReference1Impl(f.class, "database", "getDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f79406c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f79408e = 8;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @r(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f79425k = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f79426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f79427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f79428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f79429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f79430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f79431f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f79432g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final String f79433h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final String f79434i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final String f79435j;

        public b(@NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String code, @Nullable String str8) {
            G.p(name, "name");
            G.p(code, "code");
            this.f79426a = name;
            this.f79427b = str;
            this.f79428c = str2;
            this.f79429d = str3;
            this.f79430e = str4;
            this.f79431f = str5;
            this.f79432g = str6;
            this.f79433h = str7;
            this.f79434i = code;
            this.f79435j = str8;
        }

        public static /* synthetic */ b l(b bVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f79426a;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.f79427b;
            }
            if ((i10 & 4) != 0) {
                str3 = bVar.f79428c;
            }
            if ((i10 & 8) != 0) {
                str4 = bVar.f79429d;
            }
            if ((i10 & 16) != 0) {
                str5 = bVar.f79430e;
            }
            if ((i10 & 32) != 0) {
                str6 = bVar.f79431f;
            }
            if ((i10 & 64) != 0) {
                str7 = bVar.f79432g;
            }
            if ((i10 & 128) != 0) {
                str8 = bVar.f79433h;
            }
            if ((i10 & 256) != 0) {
                str9 = bVar.f79434i;
            }
            if ((i10 & 512) != 0) {
                str10 = bVar.f79435j;
            }
            String str11 = str9;
            String str12 = str10;
            String str13 = str7;
            String str14 = str8;
            String str15 = str5;
            String str16 = str6;
            return bVar.k(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
        }

        @NotNull
        public final String a() {
            return this.f79426a;
        }

        @Nullable
        public final String b() {
            return this.f79435j;
        }

        @Nullable
        public final String c() {
            return this.f79427b;
        }

        @Nullable
        public final String d() {
            return this.f79428c;
        }

        @Nullable
        public final String e() {
            return this.f79429d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return G.g(this.f79426a, bVar.f79426a) && G.g(this.f79427b, bVar.f79427b) && G.g(this.f79428c, bVar.f79428c) && G.g(this.f79429d, bVar.f79429d) && G.g(this.f79430e, bVar.f79430e) && G.g(this.f79431f, bVar.f79431f) && G.g(this.f79432g, bVar.f79432g) && G.g(this.f79433h, bVar.f79433h) && G.g(this.f79434i, bVar.f79434i) && G.g(this.f79435j, bVar.f79435j);
        }

        @Nullable
        public final String f() {
            return this.f79430e;
        }

        @Nullable
        public final String g() {
            return this.f79431f;
        }

        @Nullable
        public final String h() {
            return this.f79432g;
        }

        public int hashCode() {
            int iHashCode = this.f79426a.hashCode() * 31;
            String str = this.f79427b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f79428c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f79429d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f79430e;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f79431f;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f79432g;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f79433h;
            int iA = l.a(this.f79434i, (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
            String str8 = this.f79435j;
            return iA + (str8 != null ? str8.hashCode() : 0);
        }

        @Nullable
        public final String i() {
            return this.f79433h;
        }

        @NotNull
        public final String j() {
            return this.f79434i;
        }

        @NotNull
        public final b k(@NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String code, @Nullable String str8) {
            G.p(name, "name");
            G.p(code, "code");
            return new b(name, str, str2, str3, str4, str5, str6, str7, code, str8);
        }

        @Nullable
        public final String m() {
            return this.f79429d;
        }

        @NotNull
        public final String n() {
            return this.f79434i;
        }

        @Nullable
        public final String o() {
            return this.f79431f;
        }

        @Nullable
        public final String p() {
            return this.f79430e;
        }

        @NotNull
        public final String q() {
            return this.f79426a;
        }

        @Nullable
        public final String r() {
            return this.f79427b;
        }

        @Nullable
        public final String s() {
            return this.f79433h;
        }

        @Nullable
        public final String t() {
            return this.f79435j;
        }

        @NotNull
        public String toString() {
            String str = this.f79426a;
            String str2 = this.f79427b;
            String str3 = this.f79428c;
            String str4 = this.f79429d;
            String str5 = this.f79430e;
            String str6 = this.f79431f;
            String str7 = this.f79432g;
            String str8 = this.f79433h;
            String str9 = this.f79434i;
            String str10 = this.f79435j;
            StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("JavaScriptEntry(name=", str, ", namespace=", str2, ", version=");
            F.a(sbA, str3, ", author=", str4, ", include=");
            F.a(sbA, str5, ", exclude=", str6, ", time=");
            F.a(sbA, str7, ", permissions=", str8, ", code=");
            return C2564b.a(sbA, str9, ", requirements=", str10, ")");
        }

        @Nullable
        public final String u() {
            return this.f79432g;
        }

        @Nullable
        public final String v() {
            return this.f79428c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public f(@NotNull Application application) {
        super(application, f79410g, (SQLiteDatabase.CursorFactory) null, 3);
        G.p(application, "application");
        this.f79423a = new T3.b();
        this.f79424b = "ALTER TABLE javascript ADD COLUMN requirements string;";
    }

    public static final Boolean o(f fVar, b bVar) {
        Cursor cursorQuery = fVar.y().query(f79411h, null, "name=?", new String[]{bVar.f79426a}, null, null, "1");
        try {
            if (!cursorQuery.moveToFirst()) {
                kotlin.io.b.a(cursorQuery, null);
                return Boolean.valueOf(fVar.y().insert(f79411h, null, fVar.C0(bVar)) != -1);
            }
            Boolean bool = Boolean.FALSE;
            kotlin.io.b.a(cursorQuery, null);
            return bool;
        } finally {
        }
    }

    public static final void q(f fVar) {
        SQLiteDatabase sQLiteDatabaseY = fVar.y();
        sQLiteDatabaseY.delete(f79411h, null, null);
        sQLiteDatabaseY.close();
    }

    public static final void r(f fVar, String str) {
        fVar.y().delete(f79411h, "name = ?", new String[]{str});
    }

    public static final List r0(f fVar) throws IOException {
        Cursor cursorQuery = fVar.y().query(f79411h, null, null, null, null, null, "id DESC", StatisticData.ERROR_CODE_NOT_FOUND);
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(fVar.p(cursorQuery));
            }
            cursor.close();
            return arrayList;
        } finally {
        }
    }

    public static final List s(String str, f fVar) throws IOException {
        String strA = i.a("%", str, "%");
        Cursor cursorQuery = fVar.y().query(f79411h, null, "name LIKE ?", new String[]{strA, strA}, null, null, "id DESC", CampaignEx.CLICKMODE_ON);
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(fVar.p(cursorQuery));
            }
            cursor.close();
            return arrayList;
        } finally {
        }
    }

    public final ContentValues C0(b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", bVar.f79426a);
        contentValues.put(f79414k, bVar.f79427b);
        contentValues.put("author", bVar.f79429d);
        contentValues.put("version", bVar.f79428c);
        contentValues.put("include", bVar.f79430e);
        contentValues.put(f79418o, bVar.f79431f);
        contentValues.put("time", bVar.f79432g);
        contentValues.put(f79420q, bVar.f79433h);
        contentValues.put(f79422s, bVar.f79434i);
        contentValues.put(f79421r, bVar.f79435j);
        return contentValues;
    }

    public final long P() {
        return DatabaseUtils.queryNumEntries(y(), f79411h);
    }

    @g0
    @Nullable
    public final String U(@NotNull String url) {
        G.p(url, "url");
        Cursor cursorQuery = y().query(f79411h, new String[]{"id", "include", f79422s, "name"}, "name = ?", new String[]{url}, null, null, null, "1");
        G.o(cursorQuery, "query(...)");
        if (cursorQuery.moveToFirst()) {
            return cursorQuery.getString(0);
        }
        return null;
    }

    @Override // Z3.h
    @NotNull
    public AbstractC4521a b(@NotNull final String url) {
        G.p(url, "url");
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: Z3.c
            @Override // nc.InterfaceC5265a
            public final void run() {
                f.r(this.f79400a, url);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // Z3.h
    @NotNull
    public I<List<b>> c(@NotNull final String query) {
        G.p(query, "query");
        I<List<b>> iF0 = I.f0(new Callable() { // from class: Z3.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.s(query, this);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // Z3.h
    @NotNull
    public I<Boolean> d(@NotNull final b entry) {
        G.p(entry, "entry");
        I<Boolean> iF0 = I.f0(new Callable() { // from class: Z3.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.o(this.f79404a, entry);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // Z3.h
    @NotNull
    public I<List<b>> k() {
        I<List<b>> iF0 = I.f0(new Callable() { // from class: Z3.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.r0(this.f79398a);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // Z3.h
    @NotNull
    public AbstractC4521a l() {
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: Z3.b
            @Override // nc.InterfaceC5265a
            public final void run() {
                f.q(this.f79399a);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @g0
    public final void n(b bVar) {
        y().insert(f79411h, null, C0(bVar));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db2) {
        G.p(db2, "db");
        db2.execSQL("CREATE TABLE javascript( id INTEGER PRIMARY KEY, name TEXT, namespace TEXT, author TEXT, version TEXT, include TEXT, exclude TEXT, time TEXT, permissions TEXT, code TEXT, requirements TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db2, int i10, int i11) {
        G.p(db2, "db");
        if (i10 < 3) {
            db2.execSQL(this.f79424b);
        }
    }

    public final b p(Cursor cursor) {
        String string = cursor.getString(1);
        G.o(string, "getString(...)");
        String string2 = cursor.getString(2);
        String string3 = cursor.getString(3);
        String string4 = cursor.getString(4);
        String string5 = cursor.getString(5);
        String string6 = cursor.getString(6);
        String string7 = cursor.getString(7);
        String string8 = cursor.getString(8);
        String string9 = cursor.getString(9);
        G.o(string9, "getString(...)");
        return new b(string, string2, string4, string3, string5, string6, string7, string8, string9, cursor.getString(10));
    }

    @NotNull
    public final List<b> u() throws IOException {
        Cursor cursorQuery = y().query(f79411h, null, null, null, null, null, "id DESC");
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(p(cursorQuery));
            }
            cursor.close();
            return arrayList;
        } finally {
        }
    }

    public final SQLiteDatabase y() {
        return (SQLiteDatabase) this.f79423a.getValue(this, f79407d[0]);
    }
}
