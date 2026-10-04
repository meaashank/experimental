package Ab;

import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2core.Reason;
import java.util.List;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b implements h {
    @Override // Ab.h
    public void a(@NotNull List<? extends Download> data, @NotNull Download triggerDownload, @NotNull Reason reason) {
        G.p(data, "data");
        G.p(triggerDownload, "triggerDownload");
        G.p(reason, "reason");
    }

    @Override // Jb.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull List<? extends Download> data, @NotNull Reason reason) {
        G.p(data, "data");
        G.p(reason, "reason");
    }
}
