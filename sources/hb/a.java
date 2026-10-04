package Hb;

import Bb.g;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.PrioritySort;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2.database.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nDownloadProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadProvider.kt\ncom/tonyodev/fetch2/provider/DownloadProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n360#2,7:45\n*S KotlinDebug\n*F\n+ 1 DownloadProvider.kt\ncom/tonyodev/fetch2/provider/DownloadProvider\n*L\n29#1:45,7\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g f50732a;

    public a(@NotNull g fetchDatabaseManagerWrapper) {
        G.p(fetchDatabaseManagerWrapper, "fetchDatabaseManagerWrapper");
        this.f50732a = fetchDatabaseManagerWrapper;
    }

    @NotNull
    public final List<Download> a(int i10) {
        return this.f50732a.I(i10);
    }

    @NotNull
    public final List<Download> b(int i10, @NotNull Download download) {
        G.p(download, "download");
        List<DownloadInfo> listI = this.f50732a.I(i10);
        G.n(listI, "null cannot be cast to non-null type java.util.ArrayList<com.tonyodev.fetch2.Download>");
        ArrayList arrayList = (ArrayList) listI;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i11 = -1;
                break;
            }
            Object obj = arrayList.get(i12);
            i12++;
            if (((Download) obj).getId() == download.getId()) {
                break;
            }
            i11++;
        }
        if (i11 != -1) {
            arrayList.set(i11, download);
        }
        return arrayList;
    }

    @NotNull
    public final List<Download> c(@NotNull Status status) {
        G.p(status, "status");
        return this.f50732a.h0(status);
    }

    @Nullable
    public final Download d(int i10) {
        return this.f50732a.get(i10);
    }

    @NotNull
    public final List<Download> e() {
        return this.f50732a.get();
    }

    @NotNull
    public final List<Download> f(@NotNull List<Integer> ids) {
        G.p(ids, "ids");
        return this.f50732a.d0(ids);
    }

    @NotNull
    public final List<Download> g(@NotNull PrioritySort prioritySort) {
        G.p(prioritySort, "prioritySort");
        return this.f50732a.I2(prioritySort);
    }
}
