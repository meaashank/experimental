package v3;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: v3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5681g extends j<Drawable> {
    public C5681g(ImageView imageView) {
        super(imageView);
    }

    @Override // v3.j
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void t(@Nullable Drawable drawable) {
        ((ImageView) this.f239825b).setImageDrawable(drawable);
    }

    @Deprecated
    public C5681g(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
