package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.room.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2667i0 implements SupportSQLiteOpenHelper.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SupportSQLiteOpenHelper.b f117254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Executor f117255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RoomDatabase.e f117256c;

    public C2667i0(@NotNull SupportSQLiteOpenHelper.b delegate, @NotNull Executor queryCallbackExecutor, @NotNull RoomDatabase.e queryCallback) {
        kotlin.jvm.internal.G.p(delegate, "delegate");
        kotlin.jvm.internal.G.p(queryCallbackExecutor, "queryCallbackExecutor");
        kotlin.jvm.internal.G.p(queryCallback, "queryCallback");
        this.f117254a = delegate;
        this.f117255b = queryCallbackExecutor;
        this.f117256c = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.b
    @NotNull
    public SupportSQLiteOpenHelper a(@NotNull SupportSQLiteOpenHelper.Configuration configuration) {
        kotlin.jvm.internal.G.p(configuration, "configuration");
        return new C2665h0(this.f117254a.a(configuration), this.f117255b, this.f117256c);
    }
}
