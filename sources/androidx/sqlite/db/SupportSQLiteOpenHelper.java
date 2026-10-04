package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.compose.foundation.text.C1758e;
import androidx.constraintlayout.motion.widget.r;
import dd.g;
import dd.o;
import e.T;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.F;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v2.d;

/* JADX INFO: loaded from: classes2.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    @V({"SMAP\nSupportSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,426:1\n1#2:427\n1855#3,2:428\n107#4:430\n79#4,22:431\n*S KotlinDebug\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n*L\n243#1:428,2\n251#1:430\n251#1:431,22\n*E\n"})
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0330a f117435b = new C0330a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f117436c = "SupportSQLite";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @g
        public final int f117437a;

        /* JADX INFO: renamed from: androidx.sqlite.db.SupportSQLiteOpenHelper$a$a, reason: collision with other inner class name */
        public static final class C0330a {
            public C0330a() {
            }

            public C0330a(C4969v c4969v) {
            }
        }

        public a(int i10) {
            this.f117437a = i10;
        }

        public final void a(String str) {
            if (F.e2(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = G.t(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            r.a("deleting the database file: ", str, "SupportSQLite");
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(@NotNull d db2) {
            G.p(db2, "db");
        }

        public void c(@NotNull d db2) {
            G.p(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String path = db2.getPath();
                if (path != null) {
                    a(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> listU0 = null;
            try {
                try {
                    listU0 = db2.u0();
                } catch (SQLiteException unused) {
                }
                try {
                    db2.close();
                } catch (IOException unused2) {
                }
                if (listU0 != null) {
                    return;
                }
            } finally {
                if (listU0 != null) {
                    Iterator<T> it = listU0.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        G.o(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String path2 = db2.getPath();
                    if (path2 != null) {
                        a(path2);
                    }
                }
            }
        }

        public abstract void d(@NotNull d dVar);

        public void e(@NotNull d db2, int i10, int i11) {
            G.p(db2, "db");
            throw new SQLiteException(C1758e.a("Can't downgrade database from version ", i10, " to ", i11));
        }

        public void f(@NotNull d db2) {
            G.p(db2, "db");
        }

        public abstract void g(@NotNull d dVar, int i10, int i11);
    }

    public interface b {
        @NotNull
        SupportSQLiteOpenHelper a(@NotNull Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Nullable
    String getDatabaseName();

    @NotNull
    d getReadableDatabase();

    @NotNull
    d getWritableDatabase();

    @T(api = 16)
    void setWriteAheadLoggingEnabled(boolean z10);

    public static final class Configuration {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final a f117429f = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @g
        @NotNull
        public final Context f117430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @g
        @Nullable
        public final String f117431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @g
        @NotNull
        public final a f117432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @g
        public final boolean f117433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @g
        public final boolean f117434e;

        public static class Builder {
            private boolean allowDataLossOnRecovery;

            @Nullable
            private a callback;

            @NotNull
            private final Context context;

            @Nullable
            private String name;
            private boolean useNoBackupDirectory;

            public Builder(@NotNull Context context) {
                G.p(context, "context");
                this.context = context;
            }

            @NotNull
            public Builder allowDataLossOnRecovery(boolean z10) {
                this.allowDataLossOnRecovery = z10;
                return this;
            }

            @NotNull
            public Configuration build() {
                String str;
                a aVar = this.callback;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.useNoBackupDirectory && ((str = this.name) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new Configuration(this.context, this.name, aVar, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
            }

            @NotNull
            public Builder callback(@NotNull a callback) {
                G.p(callback, "callback");
                this.callback = callback;
                return this;
            }

            @NotNull
            public Builder name(@Nullable String str) {
                this.name = str;
                return this;
            }

            @NotNull
            public Builder noBackupDirectory(boolean z10) {
                this.useNoBackupDirectory = z10;
                return this;
            }
        }

        public static final class a {
            public a() {
            }

            @o
            @NotNull
            public final Builder a(@NotNull Context context) {
                G.p(context, "context");
                return new Builder(context);
            }

            public a(C4969v c4969v) {
            }
        }

        public Configuration(@NotNull Context context, @Nullable String str, @NotNull a callback, boolean z10, boolean z11) {
            G.p(context, "context");
            G.p(callback, "callback");
            this.f117430a = context;
            this.f117431b = str;
            this.f117432c = callback;
            this.f117433d = z10;
            this.f117434e = z11;
        }

        @o
        @NotNull
        public static final Builder a(@NotNull Context context) {
            return f117429f.a(context);
        }

        public /* synthetic */ Configuration(Context context, String str, a aVar, boolean z10, boolean z11, int i10, C4969v c4969v) {
            this(context, str, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
        }
    }
}
