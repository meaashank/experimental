package v3;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.C1758e;

/* JADX INFO: renamed from: v3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5679e<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f239782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f239783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public com.bumptech.glide.request.e f239784c;

    public AbstractC5679e() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // v3.p
    @Nullable
    public final com.bumptech.glide.request.e getRequest() {
        return this.f239784c;
    }

    @Override // v3.p
    public final void h(@NonNull o oVar) {
        oVar.d(this.f239782a, this.f239783b);
    }

    @Override // v3.p
    public final void m(@Nullable com.bumptech.glide.request.e eVar) {
        this.f239784c = eVar;
    }

    public AbstractC5679e(int i10, int i11) {
        if (!y3.o.x(i10, i11)) {
            throw new IllegalArgumentException(C1758e.a("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", i10, " and height: ", i11));
        }
        this.f239782a = i10;
        this.f239783b = i11;
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
    public final void f(@NonNull o oVar) {
    }

    @Override // v3.p
    public void k(@Nullable Drawable drawable) {
    }

    @Override // v3.p
    public void n(@Nullable Drawable drawable) {
    }
}
