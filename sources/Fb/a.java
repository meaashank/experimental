package Fb;

import Bb.g;
import com.tonyodev.fetch2.database.DownloadInfo;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g f39875a;

    public a(@NotNull g fetchDatabaseManagerWrapper) {
        G.p(fetchDatabaseManagerWrapper, "fetchDatabaseManagerWrapper");
        this.f39875a = fetchDatabaseManagerWrapper;
    }

    @NotNull
    public final DownloadInfo a() {
        return this.f39875a.f17485a.b0();
    }

    public final void b(@NotNull DownloadInfo downloadInfo) {
        G.p(downloadInfo, "downloadInfo");
        this.f39875a.F(downloadInfo);
    }

    public final void c(@NotNull DownloadInfo downloadInfo) {
        G.p(downloadInfo, "downloadInfo");
        this.f39875a.F1(downloadInfo);
    }
}
