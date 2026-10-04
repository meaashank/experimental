package m3;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.s;
import y3.m;

/* JADX INFO: loaded from: classes2.dex */
public class j<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f221098a;

    public j(@NonNull T t10) {
        m.f(t10, "Argument must not be null");
        this.f221098a = t10;
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    public Class<T> b() {
        return (Class<T>) this.f221098a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    public final T get() {
        return this.f221098a;
    }

    @Override // com.bumptech.glide.load.engine.s
    public final int getSize() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.s
    public void a() {
    }
}
