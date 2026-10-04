package Bb;

import androidx.room.C;
import androidx.room.InterfaceC2664h;
import androidx.room.InterfaceC2674m;
import androidx.room.M0;
import androidx.room.T;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2.database.DownloadInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC2664h
public interface b {
    @InterfaceC2674m
    void B(@NotNull List<? extends DownloadInfo> list);

    @T("SELECT * FROM requests WHERE _tag = :tag")
    @NotNull
    List<DownloadInfo> C(@NotNull String str);

    @T("SELECT * FROM requests WHERE _identifier = :identifier")
    @NotNull
    List<DownloadInfo> D(long j10);

    @T("SELECT DISTINCT _group from requests")
    @NotNull
    List<Integer> E();

    @M0(onConflict = 1)
    void F(@NotNull DownloadInfo downloadInfo);

    @C(onConflict = 3)
    long G(@NotNull DownloadInfo downloadInfo);

    @T("SELECT * FROM requests WHERE _group = :group")
    @NotNull
    List<DownloadInfo> I(int i10);

    @M0(onConflict = 1)
    void L(@NotNull List<? extends DownloadInfo> list);

    @C(onConflict = 3)
    @NotNull
    List<Long> R(@NotNull List<? extends DownloadInfo> list);

    @InterfaceC2674m
    void S(@NotNull DownloadInfo downloadInfo);

    @T("SELECT * FROM requests WHERE _status IN (:statuses)")
    @NotNull
    List<DownloadInfo> W(@NotNull List<Status> list);

    @T("SELECT * FROM requests WHERE _id IN (:ids)")
    @NotNull
    List<DownloadInfo> d0(@NotNull List<Integer> list);

    @T("SELECT * FROM requests WHERE _id = :id")
    @Nullable
    DownloadInfo get(int i10);

    @T("SELECT * FROM requests")
    @NotNull
    List<DownloadInfo> get();

    @T("SELECT * FROM requests WHERE _status = :status")
    @NotNull
    List<DownloadInfo> h0(@NotNull Status status);

    @T("SELECT * FROM requests WHERE _file = :file")
    @Nullable
    DownloadInfo l0(@NotNull String str);

    @T("SELECT * FROM requests WHERE _status = :status ORDER BY _priority DESC, _created ASC")
    @NotNull
    List<DownloadInfo> m0(@NotNull Status status);

    @T("SELECT * FROM requests WHERE _group = :group AND _status IN (:statuses)")
    @NotNull
    List<DownloadInfo> n0(int i10, @NotNull List<Status> list);

    @T("SELECT * FROM requests WHERE _status = :status ORDER BY _priority DESC, _created DESC")
    @NotNull
    List<DownloadInfo> o0(@NotNull Status status);

    @T("DELETE FROM requests")
    void z();
}
