package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s2.C5569b;
import w2.C5739a;

/* JADX INFO: loaded from: classes2.dex */
public final class E0 implements SupportSQLiteOpenHelper, InterfaceC2672l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f117054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f117055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final File f117056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Callable<InputStream> f117057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f117058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SupportSQLiteOpenHelper f117059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2668j f117060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f117061h;

    public static final class a extends SupportSQLiteOpenHelper.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f117062d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11) {
            super(i11);
            this.f117062d = i10;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.a
        public void d(@NotNull v2.d db2) {
            kotlin.jvm.internal.G.p(db2, "db");
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.a
        public void f(@NotNull v2.d db2) {
            kotlin.jvm.internal.G.p(db2, "db");
            int i10 = this.f117062d;
            if (i10 < 1) {
                db2.n3(i10);
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.a
        public void g(@NotNull v2.d db2, int i10, int i11) {
            kotlin.jvm.internal.G.p(db2, "db");
        }
    }

    public E0(@NotNull Context context, @Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, int i10, @NotNull SupportSQLiteOpenHelper delegate) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(delegate, "delegate");
        this.f117054a = context;
        this.f117055b = str;
        this.f117056c = file;
        this.f117057d = callable;
        this.f117058e = i10;
        this.f117059f = delegate;
    }

    @Override // androidx.room.InterfaceC2672l
    @NotNull
    public SupportSQLiteOpenHelper A() {
        return this.f117059f;
    }

    public final void a(File file, boolean z10) throws Throwable {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f117055b != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f117054a.getAssets().open(this.f117055b));
            kotlin.jvm.internal.G.o(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f117056c != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f117056c).getChannel();
            kotlin.jvm.internal.G.o(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.f117057d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
                kotlin.jvm.internal.G.o(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f117054a.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel output = new FileOutputStream(fileCreateTempFile).getChannel();
        kotlin.jvm.internal.G.o(output, "output");
        s2.c.a(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        c(fileCreateTempFile, z10);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    public final SupportSQLiteOpenHelper b(File file) {
        try {
            int iG = C5569b.g(file);
            return new androidx.sqlite.db.framework.d().a(SupportSQLiteOpenHelper.Configuration.f117429f.a(this.f117054a).name(file.getAbsolutePath()).callback(new a(iG, iG >= 1 ? iG : 1)).build());
        } catch (IOException e10) {
            throw new RuntimeException("Malformed database file, unable to read version.", e10);
        }
    }

    public final void c(File file, boolean z10) {
        C2668j c2668j = this.f117060g;
        if (c2668j == null) {
            kotlin.jvm.internal.G.S("databaseConfiguration");
            throw null;
        }
        if (c2668j.f117273q == null) {
            return;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelperB = b(file);
        try {
            v2.d writableDatabase = z10 ? ((FrameworkSQLiteOpenHelper) supportSQLiteOpenHelperB).getWritableDatabase() : ((FrameworkSQLiteOpenHelper) supportSQLiteOpenHelperB).getReadableDatabase();
            C2668j c2668j2 = this.f117060g;
            if (c2668j2 == null) {
                kotlin.jvm.internal.G.S("databaseConfiguration");
                throw null;
            }
            RoomDatabase.d dVar = c2668j2.f117273q;
            kotlin.jvm.internal.G.m(dVar);
            dVar.a(writableDatabase);
            ((FrameworkSQLiteOpenHelper) supportSQLiteOpenHelperB).close();
        } finally {
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f117059f.close();
        this.f117061h = false;
    }

    public final void d(@NotNull C2668j databaseConfiguration) {
        kotlin.jvm.internal.G.p(databaseConfiguration, "databaseConfiguration");
        this.f117060g = databaseConfiguration;
    }

    public final void e(boolean z10) {
        String databaseName = this.f117059f.getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.f117054a.getDatabasePath(databaseName);
        C2668j c2668j = this.f117060g;
        if (c2668j == null) {
            kotlin.jvm.internal.G.S("databaseConfiguration");
            throw null;
        }
        C5739a c5739a = new C5739a(databaseName, this.f117054a.getFilesDir(), c2668j.f117276t);
        try {
            C5739a.c(c5739a, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    a(databasePath, z10);
                    c5739a.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                int iG = C5569b.g(databasePath);
                int i10 = this.f117058e;
                if (iG == i10) {
                    c5739a.d();
                    return;
                }
                C2668j c2668j2 = this.f117060g;
                if (c2668j2 == null) {
                    kotlin.jvm.internal.G.S("databaseConfiguration");
                    throw null;
                }
                if (c2668j2.a(iG, i10)) {
                    c5739a.d();
                    return;
                }
                if (this.f117054a.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath, z10);
                    } catch (IOException e11) {
                        Log.w(w0.f117306b, "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w(w0.f117306b, "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c5739a.d();
                return;
            } catch (IOException e12) {
                Log.w(w0.f117306b, "Unable to read database version.", e12);
                c5739a.d();
                return;
            }
        } catch (Throwable th) {
            c5739a.d();
            throw th;
        }
        c5739a.d();
        throw th;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    public String getDatabaseName() {
        return this.f117059f.getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public v2.d getReadableDatabase() {
        if (!this.f117061h) {
            e(false);
            this.f117061h = true;
        }
        return this.f117059f.getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public v2.d getWritableDatabase() {
        if (!this.f117061h) {
            e(true);
            this.f117061h = true;
        }
        return this.f117059f.getWritableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @e.T(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f117059f.setWriteAheadLoggingEnabled(z10);
    }
}
