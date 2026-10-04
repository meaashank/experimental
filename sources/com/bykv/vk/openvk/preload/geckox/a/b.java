package com.bykv.vk.openvk.preload.geckox.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class b extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f140463a;

    private b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static b a(Context context) {
        if (f140463a == null) {
            synchronized (b.class) {
                try {
                    if (f140463a == null) {
                        f140463a = new b(context.getApplicationContext(), "geckox_clean_statistic" + com.bykv.vk.openvk.preload.geckox.utils.a.c(context) + ".db");
                    }
                } finally {
                }
            }
        }
        return f140463a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists geckox_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    public final void a(int i10, int i11, String str, long j10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("access_key", (String) null);
        contentValues.put("channel", (String) null);
        contentValues.put("clean_type", (Integer) 0);
        contentValues.put("status", Integer.valueOf(i10));
        contentValues.put("pkg_id", (Long) 0L);
        contentValues.put("err_code", Integer.valueOf(i11));
        contentValues.put("err_msg", str);
        contentValues.put("clean_duration", Long.valueOf(j10));
        contentValues.put("clean_strategy", (Integer) 1);
        try {
            getWritableDatabase().insert("geckox_clean_statistic", null, contentValues);
        } catch (Exception e10) {
            GeckoLogger.w("clean-channel", "insert failed", e10);
        }
    }

    public final List<StatisticModel.PackageStatisticModel> a() {
        Cursor cursorQuery;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursorQuery = getWritableDatabase().query("geckox_clean_statistic", null, null, null, null, null, null);
        } catch (Exception e10) {
            e = e10;
        }
        if (cursorQuery == null) {
            return arrayList;
        }
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("access_key"));
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("channel"));
                int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("clean_type"));
                int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                long j10 = cursorQuery.getInt(cursorQuery.getColumnIndex("pkg_id"));
                int i12 = cursorQuery.getInt(cursorQuery.getColumnIndex("err_code"));
                String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("err_msg"));
                int i13 = cursorQuery.getInt(cursorQuery.getColumnIndex("clean_strategy"));
                long j11 = cursorQuery.getLong(cursorQuery.getColumnIndex("clean_duration"));
                StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                packageStatisticModel.accessKey = string;
                packageStatisticModel.channel = string2;
                packageStatisticModel.statsType = Integer.valueOf(i11);
                packageStatisticModel.f140589id = Long.valueOf(j10);
                packageStatisticModel.errCode = i12 == 0 ? null : String.valueOf(i12);
                packageStatisticModel.errMsg = string3;
                packageStatisticModel.cleanType = Integer.valueOf(i10);
                packageStatisticModel.cleanDuration = Long.valueOf(j11);
                packageStatisticModel.cleanStrategy = Integer.valueOf(i13);
                arrayList.add(packageStatisticModel);
            } catch (Exception e11) {
                e = e11;
                cursor = cursorQuery;
                GeckoLogger.w("clean-channel", "get all statistic failed!", e);
                cursorQuery = cursor;
            }
        }
        getWritableDatabase().delete("geckox_clean_statistic", null, null);
        CloseableUtils.close(cursorQuery);
        return arrayList;
    }
}
