package v;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface q {
    boolean a(@Nullable Bundle bundle);

    void b(@NonNull Context context);

    boolean onPostMessage(@NonNull String str, @Nullable Bundle bundle);
}
