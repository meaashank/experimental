package com.prism.commons.utils;

import android.database.Cursor;

/* JADX INFO: renamed from: com.prism.commons.utils.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3849m {
    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }

    public static long b(Cursor cursor, int i10, long j10) {
        return !cursor.isNull(i10) ? cursor.getLong(i10) : j10;
    }

    public static long c(Cursor cursor, String str, long j10) {
        int columnIndex = cursor.getColumnIndex(str);
        return (columnIndex >= 0 && !cursor.isNull(columnIndex)) ? cursor.getLong(columnIndex) : j10;
    }

    public static String d(Cursor cursor, int i10, String str) {
        return !cursor.isNull(i10) ? cursor.getString(i10) : str;
    }

    public static String e(Cursor cursor, String str, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        return (columnIndex >= 0 && !cursor.isNull(columnIndex)) ? cursor.getString(columnIndex) : str2;
    }
}
