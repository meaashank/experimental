package M;

import androidx.collection.C1545m0;
import androidx.compose.foundation.text.C1758e;
import androidx.compose.runtime.internal.r;
import dd.o;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f58784a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58785b = 0;

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
    public static final boolean d(@NotNull Collection<?> collection, @NotNull Collection<?> collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!G.g(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    @o
    public static final int e(@NotNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }
}
