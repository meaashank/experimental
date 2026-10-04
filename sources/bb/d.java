package Bb;

import Jb.q;
import com.tonyodev.fetch2.PrioritySort;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.Extras;
import java.io.Closeable;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface d<T extends DownloadInfo> extends Closeable {

    public interface a<T extends DownloadInfo> {
        void a(@NotNull T t10);
    }

    @Nullable
    a<T> A();

    void B(@NotNull List<? extends T> list);

    @Nullable
    T B0(int i10, @NotNull Extras extras);

    @NotNull
    List<T> C(@NotNull String str);

    @NotNull
    List<T> D(long j10);

    @NotNull
    List<Integer> E();

    void F(@NotNull T t10);

    void F1(@NotNull T t10);

    @NotNull
    Pair<T, Boolean> G(@NotNull T t10);

    @NotNull
    List<T> I(int i10);

    @NotNull
    List<T> I2(@NotNull PrioritySort prioritySort);

    void L(@NotNull List<? extends T> list);

    @NotNull
    List<Pair<T, Boolean>> R(@NotNull List<? extends T> list);

    void S(@NotNull T t10);

    void S3(@Nullable a<T> aVar);

    @NotNull
    List<T> W(@NotNull List<? extends Status> list);

    @NotNull
    T b0();

    @NotNull
    List<T> d0(@NotNull List<Integer> list);

    @Nullable
    T get(int i10);

    @NotNull
    List<T> get();

    @NotNull
    List<T> h0(@NotNull Status status);

    boolean isClosed();

    @Nullable
    T l0(@NotNull String str);

    long l1(boolean z10);

    @NotNull
    List<T> m0(int i10, @NotNull List<? extends Status> list);

    void t0();

    @NotNull
    q u2();

    void z();
}
