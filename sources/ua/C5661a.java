package ua;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: ua.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5661a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f239648a = "lib_downloader.db";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f239649b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C5661a f239650c;

    public C5661a(Context context) {
        super(context, f239648a, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static C5661a a(Context context) {
        if (f239650c == null) {
            synchronized (C5661a.class) {
                try {
                    if (f239650c == null) {
                        f239650c = new C5661a(context);
                    }
                } finally {
                }
            }
        }
        return f239650c;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C5662b.b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
