package Y3;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.media.i;
import androidx.compose.runtime.internal.r;
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
@V({"SMAP\nHistoryDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryDatabase.kt\ncom/cookiegames/smartcookie/database/history/HistoryDatabase\n+ 2 CursorExtensions.kt\ncom/cookiegames/smartcookie/extensions/CursorExtensionsKt\n*L\n1#1,183:1\n36#2,4:184\n21#2,6:188\n21#2,6:194\n21#2,6:200\n*S KotlinDebug\n*F\n+ 1 HistoryDatabase.kt\ncom/cookiegames/smartcookie/database/history/HistoryDatabase\n*L\n135#1:184,4\n147#1:188,6\n102#1:194,6\n116#1:200,6\n*E\n"})
@g0
@r(parameters = 0)
@Singleton
public final class f extends SQLiteOpenHelper implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f79132e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f79133f = "historyManager";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f79134g = "history";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f79135h = "id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f79136i = "url";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f79137j = "title";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f79138k = "time";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4845e f79139a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f79130c = {O.u(new PropertyReference1Impl(f.class, "database", "getDatabase()Landroid/database/sqlite/SQLiteDatabase;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f79129b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f79131d = 8;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public f(@NotNull Application application) {
        super(application, f79133f, (SQLiteDatabase.CursorFactory) null, 2);
        G.p(application, "application");
        this.f79139a = new T3.b();
    }

    public static final void C0(f fVar, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", str2 == null ? "" : str2);
        contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
        Cursor cursorQuery = fVar.u().query(false, f79134g, new String[]{"url"}, "url = ?", new String[]{str}, null, null, null, "1");
        try {
            if (cursorQuery.getCount() > 0) {
                fVar.u().update(f79134g, contentValues, "url = ?", new String[]{str});
            } else {
                fVar.n(new T3.d(str, str2 == null ? "" : str2, 0L, 4, null));
            }
            kotlin.io.b.a(cursorQuery, null);
        } finally {
        }
    }

    public static final List U(f fVar) throws IOException {
        Cursor cursorQuery = fVar.u().query(f79134g, null, null, null, null, null, "time DESC", StatisticData.ERROR_CODE_NOT_FOUND);
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(fVar.o(cursorQuery));
            }
            cursor.close();
            return arrayList;
        } finally {
        }
    }

    public static final void p(f fVar) {
        SQLiteDatabase sQLiteDatabaseU = fVar.u();
        sQLiteDatabaseU.delete(f79134g, null, null);
        sQLiteDatabaseU.close();
    }

    public static final void q(f fVar, String str) {
        fVar.u().delete(f79134g, "url = ?", new String[]{str});
    }

    public static final List r(String str, f fVar) throws IOException {
        String strA = i.a("%", str, "%");
        Cursor cursorQuery = fVar.u().query(f79134g, null, "title LIKE ? OR url LIKE ?", new String[]{strA, strA}, null, null, "time DESC", CampaignEx.CLICKMODE_ON);
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(fVar.o(cursorQuery));
            }
            cursor.close();
            return arrayList;
        } finally {
        }
    }

    @g0
    @Nullable
    public final String P(@NotNull String url) {
        G.p(url, "url");
        Cursor cursorQuery = u().query(f79134g, new String[]{"id", "url", "title"}, "url = ?", new String[]{url}, null, null, null, "1");
        G.o(cursorQuery, "query(...)");
        if (cursorQuery.moveToFirst()) {
            return cursorQuery.getString(0);
        }
        return null;
    }

    @Override // Y3.h
    @NotNull
    public AbstractC4521a d() {
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: Y3.c
            @Override // nc.InterfaceC5265a
            public final void run() {
                f.p(this.f79125a);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // Y3.h
    @NotNull
    public I<List<T3.d>> e(@NotNull final String query) {
        G.p(query, "query");
        I<List<T3.d>> iF0 = I.f0(new Callable() { // from class: Y3.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.r(query, this);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // Y3.h
    @NotNull
    public AbstractC4521a f(@NotNull final String url, @Nullable final String str) {
        G.p(url, "url");
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: Y3.b
            @Override // nc.InterfaceC5265a
            public final void run() {
                f.C0(this.f79122a, url, str);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @Override // Y3.h
    @NotNull
    public I<List<T3.d>> k() {
        I<List<T3.d>> iF0 = I.f0(new Callable() { // from class: Y3.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.U(this.f79126a);
            }
        });
        G.o(iF0, "fromCallable(...)");
        return iF0;
    }

    @Override // Y3.h
    @NotNull
    public AbstractC4521a l(@NotNull final String url) {
        G.p(url, "url");
        AbstractC4521a abstractC4521aP = AbstractC4521a.P(new InterfaceC5265a() { // from class: Y3.a
            @Override // nc.InterfaceC5265a
            public final void run() {
                f.q(this.f79120a, url);
            }
        });
        G.o(abstractC4521aP, "fromAction(...)");
        return abstractC4521aP;
    }

    @g0
    public final void n(T3.d dVar) {
        u().insert(f79134g, null, r0(dVar));
    }

    public final T3.d o(Cursor cursor) {
        String string = cursor.getString(1);
        G.o(string, "getString(...)");
        String string2 = cursor.getString(2);
        G.o(string2, "getString(...)");
        return new T3.d(string, string2, cursor.getLong(3));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db2) {
        G.p(db2, "db");
        db2.execSQL("CREATE TABLE history( id INTEGER PRIMARY KEY, url TEXT, title TEXT, time INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db2, int i10, int i11) {
        G.p(db2, "db");
        db2.execSQL("DROP TABLE IF EXISTS history");
        onCreate(db2);
    }

    public final ContentValues r0(T3.d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", dVar.f68318d);
        contentValues.put("title", dVar.f68319e);
        contentValues.put("time", Long.valueOf(dVar.f68320f));
        return contentValues;
    }

    @NotNull
    public final List<T3.d> s() throws IOException {
        Cursor cursorQuery = u().query(f79134g, null, null, null, null, null, "time DESC");
        G.o(cursorQuery, "query(...)");
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(o(cursorQuery));
            }
            cursor.close();
            return arrayList;
        } finally {
        }
    }

    public final SQLiteDatabase u() {
        return (SQLiteDatabase) this.f79139a.getValue(this, f79130c[0]);
    }

    public final long y() {
        return DatabaseUtils.queryNumEntries(u(), f79134g);
    }
}
