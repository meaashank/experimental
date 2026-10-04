package androidx.core.os;

import android.os.PersistableBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@e.T(22)
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final E f111245a = new E();

    @dd.o
    public static final void a(@NotNull PersistableBundle persistableBundle, @Nullable String str, boolean z10) {
        persistableBundle.putBoolean(str, z10);
    }

    @dd.o
    public static final void b(@NotNull PersistableBundle persistableBundle, @Nullable String str, @NotNull boolean[] zArr) {
        persistableBundle.putBooleanArray(str, zArr);
    }
}
