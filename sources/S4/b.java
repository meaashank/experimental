package S4;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.resource.bitmap.AbstractC3097i;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AbstractC3097i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f68120c;

    public b(float f10) {
        this.f68120c = f10;
    }

    @Override // g3.InterfaceC4444b
    public void b(MessageDigest messageDigest) {
        messageDigest.update(("rotate" + this.f68120c).getBytes());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3097i
    public Bitmap c(e eVar, Bitmap bitmap, int i10, int i11) {
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f68120c);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
