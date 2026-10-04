package Ab;

import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2core.DownloadBlock;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface j {
    void A0(@NotNull Download download);

    void G(@NotNull Download download);

    void H(@NotNull Download download);

    void P(@NotNull Download download, boolean z10);

    void c(@NotNull Download download, @NotNull Error error, @Nullable Throwable th);

    void d(@NotNull Download download, long j10, long j11);

    void e(@NotNull Download download, @NotNull List<? extends DownloadBlock> list, int i10);

    void h(@NotNull Download download, @NotNull DownloadBlock downloadBlock, int i10);

    void i0(@NotNull Download download);

    void p(@NotNull Download download);

    void q0(@NotNull Download download);

    void v(@NotNull Download download);

    void z0(@NotNull Download download);
}
