package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class e implements v2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SQLiteProgram f117475a;

    public e(@NotNull SQLiteProgram delegate) {
        G.p(delegate, "delegate");
        this.f117475a = delegate;
    }

    @Override // v2.e
    public void E1(int i10, long j10) {
        this.f117475a.bindLong(i10, j10);
    }

    @Override // v2.e
    public void J1(int i10, @NotNull byte[] value) {
        G.p(value, "value");
        this.f117475a.bindBlob(i10, value);
    }

    @Override // v2.e
    public void T3() {
        this.f117475a.clearBindings();
    }

    @Override // v2.e
    public void X1(int i10) {
        this.f117475a.bindNull(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f117475a.close();
    }

    @Override // v2.e
    public void t1(int i10, @NotNull String value) {
        G.p(value, "value");
        this.f117475a.bindString(i10, value);
    }

    @Override // v2.e
    public void t2(int i10, double d10) {
        this.f117475a.bindDouble(i10, d10);
    }
}
