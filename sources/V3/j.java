package v3;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import w3.InterfaceC5744e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j<Z> extends r<ImageView, Z> implements InterfaceC5744e.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Animatable f239809j;

    public j(ImageView imageView) {
        super(imageView);
    }

    @Override // w3.InterfaceC5744e.a
    @Nullable
    public Drawable a() {
        return ((ImageView) this.f239825b).getDrawable();
    }

    @Override // w3.InterfaceC5744e.a
    public void b(Drawable drawable) {
        ((ImageView) this.f239825b).setImageDrawable(drawable);
    }

    @Override // v3.r, v3.AbstractC5676b, v3.p
    public void d(@Nullable Drawable drawable) {
        super.d(drawable);
        Animatable animatable = this.f239809j;
        if (animatable != null) {
            animatable.stop();
        }
        u(null);
        b(drawable);
    }

    @Override // v3.p
    public void g(@NonNull Z z10, @Nullable InterfaceC5744e<? super Z> interfaceC5744e) {
        if (interfaceC5744e == null || !interfaceC5744e.a(z10, this)) {
            u(z10);
        } else {
            s(z10);
        }
    }

    @Override // v3.r, v3.AbstractC5676b, v3.p
    public void k(@Nullable Drawable drawable) {
        i();
        u(null);
        b(drawable);
    }

    @Override // v3.AbstractC5676b, v3.p
    public void n(@Nullable Drawable drawable) {
        u(null);
        b(drawable);
    }

    @Override // v3.AbstractC5676b, s3.l
    public void onStart() {
        Animatable animatable = this.f239809j;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // v3.AbstractC5676b, s3.l
    public void onStop() {
        Animatable animatable = this.f239809j;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void s(@Nullable Z z10) {
        if (!(z10 instanceof Animatable)) {
            this.f239809j = null;
            return;
        }
        Animatable animatable = (Animatable) z10;
        this.f239809j = animatable;
        animatable.start();
    }

    public abstract void t(@Nullable Z z10);

    public final void u(@Nullable Z z10) {
        t(z10);
        s(z10);
    }

    @Deprecated
    public j(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
