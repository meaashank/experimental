package Bb;

import Bb.d;
import Jb.q;
import com.tonyodev.fetch2.PrioritySort;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.Extras;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements d<DownloadInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d<DownloadInfo> f17485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final q f17486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f17487c;

    public g(@NotNull d<DownloadInfo> fetchDatabaseManager) {
        G.p(fetchDatabaseManager, "fetchDatabaseManager");
        this.f17485a = fetchDatabaseManager;
        this.f17486b = fetchDatabaseManager.u2();
        this.f17487c = new Object();
    }

    @Override // Bb.d
    @Nullable
    public d.a<DownloadInfo> A() {
        d.a<T> aVarA;
        synchronized (this.f17487c) {
            aVarA = this.f17485a.A();
        }
        return aVarA;
    }

    @Override // Bb.d
    public void B(@NotNull List<? extends DownloadInfo> downloadInfoList) {
        G.p(downloadInfoList, "downloadInfoList");
        synchronized (this.f17487c) {
            this.f17485a.B(downloadInfoList);
        }
    }

    @Override // Bb.d
    @Nullable
    public DownloadInfo B0(int i10, @NotNull Extras extras) {
        DownloadInfo downloadInfoB0;
        G.p(extras, "extras");
        synchronized (this.f17487c) {
            downloadInfoB0 = this.f17485a.B0(i10, extras);
        }
        return downloadInfoB0;
    }

    @Override // Bb.d
    @NotNull
    public List<DownloadInfo> C(@NotNull String tag) {
        List<T> listC;
        G.p(tag, "tag");
        synchronized (this.f17487c) {
            listC = this.f17485a.C(tag);
        }
        return listC;
    }

    @Override // Bb.d
    @NotNull
    public List<DownloadInfo> D(long j10) {
        List<T> listD;
        synchronized (this.f17487c) {
            listD = this.f17485a.D(j10);
        }
        return listD;
    }

    @Override // Bb.d
    @NotNull
    public List<Integer> E() {
        List<Integer> listE;
        synchronized (this.f17487c) {
            listE = this.f17485a.E();
        }
        return listE;
    }

    @Override // Bb.d
    public void F(@NotNull DownloadInfo downloadInfo) {
        G.p(downloadInfo, "downloadInfo");
        synchronized (this.f17487c) {
            this.f17485a.F(downloadInfo);
        }
    }

    @Override // Bb.d
    public void F1(@NotNull DownloadInfo downloadInfo) {
        G.p(downloadInfo, "downloadInfo");
        synchronized (this.f17487c) {
            this.f17485a.F1(downloadInfo);
        }
    }

    @Override // Bb.d
    @NotNull
    public Pair<DownloadInfo, Boolean> G(@NotNull DownloadInfo downloadInfo) {
        Pair<T, Boolean> pairG;
        G.p(downloadInfo, "downloadInfo");
        synchronized (this.f17487c) {
            pairG = this.f17485a.G(downloadInfo);
        }
        return pairG;
    }

    @Override // Bb.d
    @NotNull
    public List<DownloadInfo> I(int i10) {
        List<T> listI;
        synchronized (this.f17487c) {
            listI = this.f17485a.I(i10);
        }
        return listI;
    }

    @Override // Bb.d
    @NotNull
    public List<DownloadInfo> I2(@NotNull PrioritySort prioritySort) {
        List<T> listI2;
        G.p(prioritySort, "prioritySort");
        synchronized (this.f17487c) {
            listI2 = this.f17485a.I2(prioritySort);
        }
        return listI2;
    }

    @Override // Bb.d
    public void L(@NotNull List<? extends DownloadInfo> downloadInfoList) {
        G.p(downloadInfoList, "downloadInfoList");
        synchronized (this.f17487c) {
            this.f17485a.L(downloadInfoList);
        }
    }

    @Override // Bb.d
    @NotNull
    public List<Pair<DownloadInfo, Boolean>> R(@NotNull List<? extends DownloadInfo> downloadInfoList) {
        List<Pair<T, Boolean>> listR;
        G.p(downloadInfoList, "downloadInfoList");
        synchronized (this.f17487c) {
            listR = this.f17485a.R(downloadInfoList);
        }
        return listR;
    }

    @Override // Bb.d
    public void S(@NotNull DownloadInfo downloadInfo) {
        G.p(downloadInfo, "downloadInfo");
        synchronized (this.f17487c) {
            this.f17485a.S(downloadInfo);
        }
    }

    @Override // Bb.d
    public void S3(@Nullable d.a<DownloadInfo> aVar) {
        synchronized (this.f17487c) {
            this.f17485a.S3(aVar);
        }
    }

    @Override // Bb.d
    @NotNull
    public List<DownloadInfo> W(@NotNull List<? extends Status> statuses) {
        List<T> listW;
        G.p(statuses, "statuses");
        synchronized (this.f17487c) {
            listW = this.f17485a.W(statuses);
        }
        return listW;
    }

    @Override // Bb.d
    @NotNull
    public DownloadInfo b0() {
        return this.f17485a.b0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f17487c) {
            this.f17485a.close();
        }
    }

    @Override // Bb.d
    @NotNull
    public List<DownloadInfo> d0(@NotNull List<Integer> ids) {
        List<T> listD0;
        G.p(ids, "ids");
        synchronized (this.f17487c) {
            listD0 = this.f17485a.d0(ids);
        }
        return listD0;
    }

    @Override // Bb.d
    @NotNull
    public List<DownloadInfo> get() {
        List<T> list;
        synchronized (this.f17487c) {
            list = this.f17485a.get();
        }
        return list;
    }

    @Override // Bb.d
    @NotNull
    public List<DownloadInfo> h0(@NotNull Status status) {
        List<T> listH0;
        G.p(status, "status");
        synchronized (this.f17487c) {
            listH0 = this.f17485a.h0(status);
        }
        return listH0;
    }

    @Override // Bb.d
    public boolean isClosed() {
        boolean zIsClosed;
        synchronized (this.f17487c) {
            zIsClosed = this.f17485a.isClosed();
        }
        return zIsClosed;
    }

    @Override // Bb.d
    @Nullable
    public DownloadInfo l0(@NotNull String file) {
        DownloadInfo downloadInfoL0;
        G.p(file, "file");
        synchronized (this.f17487c) {
            downloadInfoL0 = this.f17485a.l0(file);
        }
        return downloadInfoL0;
    }

    @Override // Bb.d
    public long l1(boolean z10) {
        long jL1;
        synchronized (this.f17487c) {
            jL1 = this.f17485a.l1(z10);
        }
        return jL1;
    }

    @Override // Bb.d
    @NotNull
    public List<DownloadInfo> m0(int i10, @NotNull List<? extends Status> statuses) {
        List<T> listM0;
        G.p(statuses, "statuses");
        synchronized (this.f17487c) {
            listM0 = this.f17485a.m0(i10, statuses);
        }
        return listM0;
    }

    @Override // Bb.d
    public void t0() {
        synchronized (this.f17487c) {
            this.f17485a.t0();
        }
    }

    @Override // Bb.d
    @NotNull
    public q u2() {
        return this.f17486b;
    }

    @Override // Bb.d
    public void z() {
        synchronized (this.f17487c) {
            this.f17485a.z();
        }
    }

    @Override // Bb.d
    @Nullable
    public DownloadInfo get(int i10) {
        DownloadInfo downloadInfo;
        synchronized (this.f17487c) {
            downloadInfo = this.f17485a.get(i10);
        }
        return downloadInfo;
    }
}
