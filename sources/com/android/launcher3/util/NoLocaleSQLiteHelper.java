package com.android.launcher3.util;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.launcher3.Utilities;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NoLocaleSQLiteHelper extends SQLiteOpenHelper {

    public static class NoLocalContext extends ContextWrapper {
        public NoLocalContext(Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public SQLiteDatabase openOrCreateDatabase(String str, int i10, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
            return super.openOrCreateDatabase(str, i10 | 16, cursorFactory, databaseErrorHandler);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NoLocaleSQLiteHelper(Context context, String str, int i10) {
        boolean z10 = Utilities.ATLEAST_P;
        super(z10 ? context : new NoLocalContext(context), str, (SQLiteDatabase.CursorFactory) null, i10);
        if (z10) {
            setOpenParams(h.a().addOpenFlags(16).build());
        }
    }
}
