package Od;

import java.io.EOFException;
import kotlin.jvm.internal.G;
import okio.C5360j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static final boolean a(@NotNull C5360j c5360j) {
        G.p(c5360j, "<this>");
        try {
            C5360j c5360j2 = new C5360j();
            long j10 = c5360j.f226051b;
            long j11 = 64;
            if (j10 <= 64) {
                j11 = j10;
            }
            c5360j.y(c5360j2, 0L, j11);
            int i10 = 0;
            while (i10 < 16) {
                i10++;
                if (c5360j2.r3()) {
                    return true;
                }
                int iR1 = c5360j2.R1();
                if (Character.isISOControl(iR1) && !Character.isWhitespace(iR1)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
