package kotlin.collections;

import androidx.collection.M0;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.collections.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C4873o {
    @NotNull
    public static final <T> T[] a(@NotNull T[] reference, int i10) {
        kotlin.jvm.internal.G.p(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        kotlin.jvm.internal.G.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    @dd.j(name = "contentDeepHashCode")
    public static final <T> int b(@Nullable T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @InterfaceC4887e0(version = "1.3")
    public static final void c(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException(M0.a("toIndex (", i10, ") is greater than size (", i11, ")."));
        }
    }

    public static final <T> T[] d(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        kotlin.jvm.internal.G.P();
        throw null;
    }

    @Xc.f
    public static final String e(byte[] bArr, Charset charset) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(charset, "charset");
        return new String(bArr, charset);
    }

    public static final <T> T[] f(Collection<? extends T> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        kotlin.jvm.internal.G.P();
        throw null;
    }
}
