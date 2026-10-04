package androidx.sqlite.db.framework;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements SupportSQLiteOpenHelper.b {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.b
    @NotNull
    public SupportSQLiteOpenHelper a(@NotNull SupportSQLiteOpenHelper.Configuration configuration) {
        G.p(configuration, "configuration");
        return new FrameworkSQLiteOpenHelper(configuration.f117430a, configuration.f117431b, configuration.f117432c, configuration.f117433d, configuration.f117434e);
    }
}
