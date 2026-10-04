package kotlin.reflect;

import java.util.List;
import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.1")
public interface s extends g {
    boolean a();

    @NotNull
    KVariance b();

    @NotNull
    String getName();

    @NotNull
    List<r> getUpperBounds();
}
