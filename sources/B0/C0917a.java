package B0;

import android.content.ContentProvider;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: B0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0917a {
    @NonNull
    public static Context a(@NonNull ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
