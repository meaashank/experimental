package Ab;

import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2core.DownloadBlock;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface g extends j {
    void D(int i10, @NotNull Download download, @NotNull f fVar);

    void K(int i10, @NotNull Download download, @NotNull f fVar);

    void M(int i10, @NotNull Download download, @NotNull f fVar);

    void Q(int i10, @NotNull Download download, @NotNull Error error, @Nullable Throwable th, @NotNull f fVar);

    void Y(int i10, @NotNull Download download, boolean z10, @NotNull f fVar);

    void d0(int i10, @NotNull Download download, @NotNull f fVar);

    void o0(int i10, @NotNull Download download, @NotNull DownloadBlock downloadBlock, int i11, @NotNull f fVar);

    void q(int i10, @NotNull Download download, long j10, long j11, @NotNull f fVar);

    void s0(int i10, @NotNull Download download, @NotNull f fVar);

    void w0(int i10, @NotNull Download download, @NotNull f fVar);

    void x(int i10, @NotNull Download download, @NotNull f fVar);

    void y(int i10, @NotNull Download download, @NotNull f fVar);

    void y0(int i10, @NotNull Download download, @NotNull List<? extends DownloadBlock> list, int i11, @NotNull f fVar);
}
