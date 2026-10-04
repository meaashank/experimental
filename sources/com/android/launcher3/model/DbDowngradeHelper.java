package com.android.launcher3.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.SparseArray;
import com.android.launcher3.provider.LauncherDbUtils;
import com.android.launcher3.util.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DbDowngradeHelper {
    private static final String KEY_DOWNGRADE_TO = "downgrade_to_";
    private static final String KEY_VERSION = "version";
    private static final String TAG = "DbDowngradeHelper";
    private final SparseArray<String[]> mStatements = new SparseArray<>();
    public final int version;

    private DbDowngradeHelper(int i10) {
        this.version = i10;
    }

    public static DbDowngradeHelper parse(File file) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject(new String(IOUtils.toByteArray(file)));
        DbDowngradeHelper dbDowngradeHelper = new DbDowngradeHelper(jSONObject.getInt("version"));
        for (int i10 = dbDowngradeHelper.version - 1; i10 > 0; i10--) {
            if (jSONObject.has(KEY_DOWNGRADE_TO + i10)) {
                JSONArray jSONArray = jSONObject.getJSONArray(KEY_DOWNGRADE_TO + i10);
                int length = jSONArray.length();
                String[] strArr = new String[length];
                for (int i11 = 0; i11 < length; i11++) {
                    strArr[i11] = jSONArray.getString(i11);
                }
                dbDowngradeHelper.mStatements.put(i10, strArr);
            }
        }
        return dbDowngradeHelper;
    }

    public static void updateSchemaFile(File file, int i10, Context context, int i11) {
        try {
            if (parse(file).version >= i10) {
                return;
            }
        } catch (Exception unused) {
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i11);
                try {
                    IOUtils.copy(inputStreamOpenRawResource, fileOutputStream);
                    inputStreamOpenRawResource.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            Log.e(TAG, "Error writing schema file", e10);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = i10 - 1; i12 >= i11; i12--) {
            String[] strArr = this.mStatements.get(i12);
            if (strArr == null) {
                throw new SQLiteException(android.support.v4.media.c.a("Downgrade path not supported to version ", i12));
            }
            Collections.addAll(arrayList, strArr);
        }
        LauncherDbUtils.SQLiteTransaction sQLiteTransaction = new LauncherDbUtils.SQLiteTransaction(sQLiteDatabase);
        try {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                sQLiteDatabase.execSQL((String) obj);
            }
            sQLiteTransaction.commit();
            sQLiteTransaction.close();
        } catch (Throwable th) {
            try {
                sQLiteTransaction.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
