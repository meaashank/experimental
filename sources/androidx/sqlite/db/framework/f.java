package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v2.h;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends e implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SQLiteStatement f117476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull SQLiteStatement delegate) {
        super(delegate);
        G.p(delegate, "delegate");
        this.f117476b = delegate;
    }

    @Override // v2.h
    @Nullable
    public String L2() {
        return this.f117476b.simpleQueryForString();
    }

    @Override // v2.h
    public void execute() {
        this.f117476b.execute();
    }

    @Override // v2.h
    public long j3() {
        return this.f117476b.executeInsert();
    }

    @Override // v2.h
    public long p1() {
        return this.f117476b.simpleQueryForLong();
    }

    @Override // v2.h
    public int y0() {
        return this.f117476b.executeUpdateDelete();
    }
}
