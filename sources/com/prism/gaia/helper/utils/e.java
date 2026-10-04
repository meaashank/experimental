package com.prism.gaia.helper.utils;

import android.database.Cursor;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f165119a = "asdf-".concat(e.class.getSimpleName());

    public static String a(Cursor cursor) {
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a("(");
        for (int i10 = 0; i10 < cursor.getColumnCount(); i10++) {
            U6.j.F(sbA, cursor.getColumnName(i10), c(cursor, i10));
        }
        U6.j.G(sbA);
        sbA.append(")");
        return sbA.toString();
    }

    public static String[] b(Cursor cursor) {
        int i10 = 0;
        if (cursor.getCount() <= 0) {
            return new String[0];
        }
        int position = cursor.getPosition();
        String[] strArr = new String[cursor.getCount()];
        cursor.moveToFirst();
        while (i10 < cursor.getCount()) {
            strArr[i10] = a(cursor);
            i10++;
            if (!cursor.moveToNext()) {
                break;
            }
        }
        cursor.moveToPosition(position);
        return strArr;
    }

    public static Object c(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 1) {
            return Integer.valueOf(cursor.getInt(i10));
        }
        if (type == 2) {
            return Float.valueOf(cursor.getFloat(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i10);
    }
}
