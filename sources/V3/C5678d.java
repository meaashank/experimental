package v3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: renamed from: v3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5678d extends q<Bitmap> {
    public C5678d(ImageView imageView) {
        super(imageView);
    }

    @Override // v3.q
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Drawable v(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.f239825b).getResources(), bitmap);
    }

    @Deprecated
    public C5678d(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
