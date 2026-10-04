package v;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4345t;
import e.T;

/* JADX INFO: renamed from: v.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T(33)
public class C5667a {
    @InterfaceC4345t
    public static <T> T a(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }
}
