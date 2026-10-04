package Db;

import Db.e;
import com.tonyodev.fetch2.Download;
import java.io.Closeable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends Closeable {
    @NotNull
    List<Download> E3();

    boolean I3(@NotNull Download download);

    boolean K1(int i10);

    @NotNull
    e.a P1();

    int P2();

    @NotNull
    List<Integer> P3();

    void cancelAll();

    void d1(int i10);

    int f3();

    @NotNull
    String g3(@NotNull Download download);

    boolean isClosed();

    boolean t(int i10);

    @Nullable
    e w(@NotNull Download download);

    boolean y3();
}
