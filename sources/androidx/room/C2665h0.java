package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.room.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2665h0 implements SupportSQLiteOpenHelper, InterfaceC2672l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SupportSQLiteOpenHelper f117251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Executor f117252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RoomDatabase.e f117253c;

    public C2665h0(@NotNull SupportSQLiteOpenHelper delegate, @NotNull Executor queryCallbackExecutor, @NotNull RoomDatabase.e queryCallback) {
        kotlin.jvm.internal.G.p(delegate, "delegate");
        kotlin.jvm.internal.G.p(queryCallbackExecutor, "queryCallbackExecutor");
        kotlin.jvm.internal.G.p(queryCallback, "queryCallback");
        this.f117251a = delegate;
        this.f117252b = queryCallbackExecutor;
        this.f117253c = queryCallback;
    }

    @Override // androidx.room.InterfaceC2672l
    @NotNull
    public SupportSQLiteOpenHelper A() {
        return this.f117251a;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f117251a.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    public String getDatabaseName() {
        return this.f117251a.getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public v2.d getReadableDatabase() {
        return new C2663g0(this.f117251a.getReadableDatabase(), this.f117252b, this.f117253c);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public v2.d getWritableDatabase() {
        return new C2663g0(this.f117251a.getWritableDatabase(), this.f117252b, this.f117253c);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @e.T(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f117251a.setWriteAheadLoggingEnabled(z10);
    }
}
