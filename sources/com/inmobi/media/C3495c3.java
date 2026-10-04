package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3495c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SQLiteDatabase f152743b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3495c3 f152742a = new C3495c3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f152744c = new Object();

    static {
        try {
            f152743b = new C3481b3(C3657nb.d()).getWritableDatabase();
        } catch (Exception unused) {
        }
    }

    @dd.o
    public static final int a(@Nullable String str, @Nullable ContentValues contentValues, @Nullable String str2, @Nullable String[] strArr) {
        synchronized (f152744c) {
            long jA = a(str, contentValues);
            if (jA == -1) {
                return b(str, contentValues, str2, strArr);
            }
            return (int) jA;
        }
    }

    @dd.o
    public static final int b(@Nullable String str, @Nullable ContentValues contentValues, @Nullable String str2, @Nullable String[] strArr) {
        int iUpdateWithOnConflict;
        synchronized (f152744c) {
            SQLiteDatabase sQLiteDatabase = f152743b;
            iUpdateWithOnConflict = sQLiteDatabase != null ? sQLiteDatabase.updateWithOnConflict(str, contentValues, str2, strArr, 4) : -1;
        }
        return iUpdateWithOnConflict;
    }

    @dd.o
    @NotNull
    public static final List<ContentValues> b(@Nullable String str, @Nullable String[] strArr, @Nullable String str2, @Nullable String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Cursor cursorQuery;
        synchronized (f152744c) {
            SQLiteDatabase sQLiteDatabase = f152743b;
            cursorQuery = sQLiteDatabase != null ? sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6) : null;
        }
        if (cursorQuery != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorQuery, contentValues);
                        arrayList.add(contentValues);
                    } while (cursorQuery.moveToNext());
                }
                cursorQuery.close();
                return arrayList;
            } finally {
            }
        } else {
            return EmptyList.f217510a;
        }
    }

    @dd.o
    public static final long a(@Nullable String str, @Nullable ContentValues contentValues) {
        long jInsertWithOnConflict;
        synchronized (f152744c) {
            SQLiteDatabase sQLiteDatabase = f152743b;
            jInsertWithOnConflict = sQLiteDatabase != null ? sQLiteDatabase.insertWithOnConflict(str, null, contentValues, 4) : -1L;
        }
        return jInsertWithOnConflict;
    }

    @dd.o
    public static final int a(@Nullable String str, @Nullable String str2, @Nullable String[] strArr) {
        int iDelete;
        synchronized (f152744c) {
            SQLiteDatabase sQLiteDatabase = f152743b;
            iDelete = sQLiteDatabase != null ? sQLiteDatabase.delete(str, str2, strArr) : 0;
        }
        return iDelete;
    }

    @dd.o
    public static final void a(@NotNull String tableName) {
        kotlin.jvm.internal.G.p(tableName, "tableName");
        String str = "DROP TABLE IF EXISTS \"" + tableName + '\"';
        synchronized (f152744c) {
            SQLiteDatabase sQLiteDatabase = f152743b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(str);
            }
        }
    }

    public final void a(@NotNull String tableName, @NotNull String tableSchema) {
        kotlin.jvm.internal.G.p(tableName, "tableName");
        kotlin.jvm.internal.G.p(tableSchema, "tableSchema");
        String str = "CREATE TABLE IF NOT EXISTS " + tableName + tableSchema + ';';
        synchronized (f152744c) {
            SQLiteDatabase sQLiteDatabase = f152743b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(str);
            }
        }
    }

    @dd.o
    public static final int a(@Nullable String str, @Nullable String[] strArr, @Nullable String str2, @Nullable String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Cursor cursorQuery;
        synchronized (f152744c) {
            SQLiteDatabase sQLiteDatabase = f152743b;
            cursorQuery = sQLiteDatabase != null ? sQLiteDatabase.query(str, new String[]{"COUNT(*) AS count"}, str2, strArr2, str3, str4, str5, str6) : null;
        }
        int i10 = 0;
        if (cursorQuery != null) {
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("count"));
                    }
                    cursorQuery.close();
                    return i10;
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return i10;
    }
}
