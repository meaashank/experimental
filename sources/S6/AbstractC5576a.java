package s6;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: s6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5576a {
    public void a(int i10, int i11, @Nullable Intent intent) {
        b(i10, i11, intent);
    }

    public abstract void b(int i10, int i11, @Nullable Intent intent);

    public abstract void c(int i10, @NonNull String[] strArr, @NonNull int[] iArr);

    public void d(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        c(i10, strArr, iArr);
    }
}
