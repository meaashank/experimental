package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class F0 implements SupportSQLiteOpenHelper.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f117063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final File f117064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Callable<InputStream> f117065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SupportSQLiteOpenHelper.b f117066d;

    public F0(@Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, @NotNull SupportSQLiteOpenHelper.b mDelegate) {
        kotlin.jvm.internal.G.p(mDelegate, "mDelegate");
        this.f117063a = str;
        this.f117064b = file;
        this.f117065c = callable;
        this.f117066d = mDelegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.b
    @NotNull
    public SupportSQLiteOpenHelper a(@NotNull SupportSQLiteOpenHelper.Configuration configuration) {
        kotlin.jvm.internal.G.p(configuration, "configuration");
        return new E0(configuration.f117430a, this.f117063a, this.f117064b, this.f117065c, configuration.f117432c.f117437a, this.f117066d.a(configuration));
    }
}
