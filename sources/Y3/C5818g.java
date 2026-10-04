package y3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.f;

/* JADX INFO: renamed from: y3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5818g<T> implements f.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f241066a;

    public C5818g(int i10, int i11) {
        this.f241066a = new int[]{i10, i11};
    }

    @Override // com.bumptech.glide.f.b
    @Nullable
    public int[] a(@NonNull T t10, int i10, int i11) {
        return this.f241066a;
    }
}
