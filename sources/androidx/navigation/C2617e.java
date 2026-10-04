package androidx.navigation;

import androidx.core.app.C2382e;
import androidx.navigation.ActivityNavigator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.navigation.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2617e {
    @NotNull
    public static final ActivityNavigator.Extras a(@Nullable C2382e c2382e, int i10) {
        ActivityNavigator.Extras.Builder builder = new ActivityNavigator.Extras.Builder();
        if (c2382e != null) {
            builder.setActivityOptions(c2382e);
        }
        builder.addFlags(i10);
        return builder.build();
    }

    public static /* synthetic */ ActivityNavigator.Extras b(C2382e c2382e, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c2382e = null;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return a(c2382e, i10);
    }
}
