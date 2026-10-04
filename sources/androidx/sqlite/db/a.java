package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import dd.o;
import e.T;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: androidx.sqlite.db.a$a, reason: collision with other inner class name */
    @T(16)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class C0331a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0331a f117438a = new C0331a();

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void a(@NotNull CancellationSignal cancellationSignal) {
            G.p(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final CancellationSignal b() {
            return new CancellationSignal();
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean c(@NotNull File file) {
            G.p(file, "file");
            return SQLiteDatabase.deleteDatabase(file);
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void d(@NotNull SQLiteDatabase sQLiteDatabase) {
            G.p(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean e(@NotNull SQLiteDatabase sQLiteDatabase) {
            G.p(sQLiteDatabase, "sQLiteDatabase");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final Cursor f(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @NotNull String[] selectionArgs, @Nullable String str, @NotNull CancellationSignal cancellationSignal, @NotNull SQLiteDatabase.CursorFactory cursorFactory) {
            G.p(sQLiteDatabase, "sQLiteDatabase");
            G.p(sql, "sql");
            G.p(selectionArgs, "selectionArgs");
            G.p(cancellationSignal, "cancellationSignal");
            G.p(cursorFactory, "cursorFactory");
            Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
            G.o(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return cursorRawQueryWithFactory;
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void g(@NotNull SQLiteDatabase sQLiteDatabase, boolean z10) {
            G.p(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(z10);
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void h(@NotNull SQLiteOpenHelper sQLiteOpenHelper, boolean z10) {
            G.p(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
        }
    }

    @T(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f117439a = new b();

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final Uri a(@NotNull Cursor cursor) {
            G.p(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            G.o(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean b(@NotNull ActivityManager activityManager) {
            G.p(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    @T(21)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f117440a = new c();

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final File a(@NotNull Context context) {
            G.p(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            G.o(noBackupFilesDir, "context.noBackupFilesDir");
            return noBackupFilesDir;
        }
    }

    @T(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f117441a = new d();

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void a(@NotNull Cursor cursor, @NotNull Bundle extras) {
            G.p(cursor, "cursor");
            G.p(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    @T(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f117442a = new e();

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final List<Uri> a(@NotNull Cursor cursor) {
            G.p(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            G.m(notificationUris);
            return notificationUris;
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void b(@NotNull Cursor cursor, @NotNull ContentResolver cr, @NotNull List<? extends Uri> uris) {
            G.p(cursor, "cursor");
            G.p(cr, "cr");
            G.p(uris, "uris");
            cursor.setNotificationUris(cr, uris);
        }
    }
}
