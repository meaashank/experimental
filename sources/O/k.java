package O;

import android.view.ViewStructure;
import e.InterfaceC4345t;
import e.T;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T(23)
@androidx.compose.runtime.internal.r(parameters = 1)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f65117a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f65118b = 0;

    @T(23)
    @InterfaceC4345t
    public final int a(@NotNull ViewStructure viewStructure, int i10) {
        return viewStructure.addChildCount(i10);
    }

    @T(23)
    @InterfaceC4345t
    @Nullable
    public final ViewStructure b(@NotNull ViewStructure viewStructure, int i10) {
        return viewStructure.newChild(i10);
    }

    @T(23)
    @InterfaceC4345t
    public final void c(@NotNull ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    @T(23)
    @InterfaceC4345t
    public final void d(@NotNull ViewStructure viewStructure, int i10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        viewStructure.setId(i10, str, str2, str3);
    }
}
