package androidx.webkit;

import H2.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.e0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@e0
public interface ProfileStore {
    boolean deleteProfile(@NonNull String str);

    @NonNull
    List<String> getAllProfileNames();

    @NonNull
    d getOrCreateProfile(@NonNull String str);

    @Nullable
    d getProfile(@NonNull String str);
}
