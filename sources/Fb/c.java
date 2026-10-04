package Fb;

import com.tonyodev.fetch2.NetworkType;
import java.io.Closeable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface c<T> extends Closeable {
    int B2();

    @NotNull
    List<T> D3();

    @NotNull
    NetworkType K3();

    void Y2();

    boolean e0();

    void h(int i10);

    void i(@NotNull NetworkType networkType);

    boolean isPaused();

    void pause();

    void resume();

    void start();

    void stop();

    void y2();
}
