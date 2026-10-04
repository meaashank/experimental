package H0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
@T(21)
public class h extends i {
    public h(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // H0.i
    public void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
        Gravity.apply(i10, i11, i12, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        t();
        outline.setRoundRect(this.f45431h, c());
    }

    @Override // H0.i
    public boolean h() {
        Bitmap bitmap = this.f45424a;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // H0.i
    public void o(boolean z10) {
        Bitmap bitmap = this.f45424a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z10);
            invalidateSelf();
        }
    }
}
