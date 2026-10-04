package ud;

import androidx.collection.C1545m0;
import androidx.compose.foundation.text.C1758e;
import dd.o;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f239702a = new e();

    @o
    public static final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(C1758e.a("index: ", i10, ", size: ", i11));
        }
    }

    @o
    public static final void b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(C1758e.a("index: ", i10, ", size: ", i11));
        }
    }

    @o
    public static final void c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbA = C1545m0.a("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbA.append(i12);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(C1758e.a("fromIndex: ", i10, " > toIndex: ", i11));
        }
    }

    @o
    public static final boolean d(@NotNull Collection<?> c10, @NotNull Collection<?> other) {
        G.p(c10, "c");
        G.p(other, "other");
        if (c10.size() != other.size()) {
            return false;
        }
        Iterator<?> it = other.iterator();
        Iterator<?> it2 = c10.iterator();
        while (it2.hasNext()) {
            if (!G.g(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    @o
    public static final int e(@NotNull Collection<?> c10) {
        G.p(c10, "c");
        Iterator<?> it = c10.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }
}
