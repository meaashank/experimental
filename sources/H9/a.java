package H9;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.support.v4.media.c;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.gaia.download.j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class a extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f50668b = "download_proxy";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f50669c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f50670d = "downloads";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f50671e = "asdf-".concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f50672f = "guest_package";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f50673g = "download_id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0045a f50674a;

    /* JADX INFO: renamed from: H9.a$a, reason: collision with other inner class name */
    public final class C0045a extends SQLiteOpenHelper {
        public C0045a(Context context) {
            super(context, a.f50668b, (SQLiteDatabase.CursorFactory) null, 1);
        }

        public final void a(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS downloads");
                sQLiteDatabase.execSQL("CREATE TABLE downloads(_id INTEGER PRIMARY KEY AUTOINCREMENT,download_id INTEGER, notificationclass TEXT);");
            } catch (SQLException e10) {
                Log.e(a.f50671e, "couldn't create table in downloads database");
                throw e10;
            }
        }

        public final void b(SQLiteDatabase sQLiteDatabase, int i10) {
            if (i10 != 1) {
                throw new IllegalStateException(c.a("Don't know how to upgrade to ", i10));
            }
            a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            onUpgrade(sQLiteDatabase, 0, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            while (true) {
                i10++;
                if (i10 > i11) {
                    return;
                } else {
                    b(sQLiteDatabase, i10);
                }
            }
        }
    }

    public final Uri b(Uri uri) {
        if (j.b.f164732b.equals(uri.getAuthority())) {
            return uri.buildUpon().authority("downloads").build();
        }
        throw new SecurityException("Uri:" + uri + " is not match authority:com.app.hider.master.promax.download.provider");
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return getContext().getContentResolver().delete(b(uri), str, strArr);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return getContext().getContentResolver().getType(b(uri));
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        Uri uriB = b(uri);
        contentValues.getAsInteger("otheruid");
        String asString = contentValues.getAsString("notificationclass");
        contentValues.remove("otheruid");
        contentValues.remove("notificationclass");
        Uri uriInsert = getContext().getContentResolver().insert(uriB, contentValues);
        if (asString != null) {
            long j10 = Long.parseLong(uriInsert.getLastPathSegment());
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notificationclass", asString);
            contentValues2.put("download_id", Long.valueOf(j10));
            this.f50674a.getWritableDatabase().insert("downloads", null, contentValues2);
        }
        return uriInsert;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f50674a = new C0045a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Matcher matcher;
        Uri uriB = b(uri);
        if (str != null && str.contains("notificationclass") && (matcher = Pattern.compile("(.*)notificationclass=\\s*\\?(.*)").matcher(str)) != null) {
            for (int i10 = 0; i10 < matcher.groupCount(); i10++) {
                matcher.group(i10);
            }
        }
        return getContext().getContentResolver().query(uriB, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return getContext().getContentResolver().update(b(uri), contentValues, str, strArr);
    }
}
