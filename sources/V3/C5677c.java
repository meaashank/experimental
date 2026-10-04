package v3;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: renamed from: v3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5677c extends j<Bitmap> {
    public C5677c(ImageView imageView) {
        super(imageView);
    }

    @Override // v3.j
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void t(Bitmap bitmap) {
        ((ImageView) this.f239825b).setImageBitmap(bitmap);
    }

    @Deprecated
    public C5677c(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
