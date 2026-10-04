package O3;

import T3.a;
import androidx.compose.runtime.internal.r;
import java.io.InputStream;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f65141a = 0;

    @Inject
    public b() {
    }

    @Override // O3.a
    @NotNull
    public List<a.C0110a> a(@NotNull InputStream inputStream) {
        G.p(inputStream, "inputStream");
        return W3.r.e(inputStream);
    }
}
