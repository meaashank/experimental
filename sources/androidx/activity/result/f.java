package androidx.activity.result;

import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final int a(@NotNull ActivityResult activityResult) {
        return activityResult.getResultCode();
    }

    @Nullable
    public static final Intent b(@NotNull ActivityResult activityResult) {
        return activityResult.getData();
    }
}
