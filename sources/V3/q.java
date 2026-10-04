package v3;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q<T> extends j<T> {
    public q(ImageView imageView) {
        super(imageView);
    }

    @Override // v3.j
    public void t(@Nullable T t10) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f239825b).getLayoutParams();
        Drawable drawableV = v(t10);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            drawableV = new C5683i(drawableV, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.f239825b).setImageDrawable(drawableV);
    }

    public abstract Drawable v(T t10);

    @Deprecated
    public q(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
