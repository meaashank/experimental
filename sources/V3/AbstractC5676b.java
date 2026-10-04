package v3;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: v3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class AbstractC5676b<Z> implements p<Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.bumptech.glide.request.e f239781a;

    @Override // v3.p
    @Nullable
    public com.bumptech.glide.request.e getRequest() {
        return this.f239781a;
    }

    @Override // v3.p
    public void m(@Nullable com.bumptech.glide.request.e eVar) {
        this.f239781a = eVar;
    }

    @Override // s3.l
    public void onDestroy() {
    }

    @Override // s3.l
    public void onStart() {
    }

    @Override // s3.l
    public void onStop() {
    }

    @Override // v3.p
    public void d(@Nullable Drawable drawable) {
    }

    @Override // v3.p
    public void k(@Nullable Drawable drawable) {
    }

    @Override // v3.p
    public void n(@Nullable Drawable drawable) {
    }
}
