package Db;

import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.DownloadBlock;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface e extends Runnable {

    public interface a {
        @NotNull
        DownloadInfo b0();

        void c(@NotNull Download download, @NotNull Error error, @Nullable Throwable th);

        void d(@NotNull Download download, long j10, long j11);

        void e(@NotNull Download download, @NotNull List<? extends DownloadBlock> list, int i10);

        void h(@NotNull Download download, @NotNull DownloadBlock downloadBlock, int i10);

        boolean l();

        void m(@NotNull Download download);

        void n(@NotNull Download download);
    }

    @Nullable
    a A();

    @NotNull
    Download L0();

    boolean M1();

    boolean l();

    boolean m2();

    void p(@Nullable a aVar);

    void r(boolean z10);

    void y(boolean z10);
}
