package H0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.r;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45437a = "RoundedBitmapDrawableFa";

    public static class a extends i {
        public a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // H0.i
        public void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
            Gravity.apply(i10, i11, i12, rect, rect2, 0);
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

    @NonNull
    public static i a(@NonNull Resources resources, @Nullable Bitmap bitmap) {
        return new h(resources, bitmap);
    }

    @NonNull
    public static i b(@NonNull Resources resources, @NonNull InputStream inputStream) {
        h hVar = new h(resources, BitmapFactory.decodeStream(inputStream));
        if (hVar.f45424a == null) {
            Log.w(f45437a, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return hVar;
    }

    @NonNull
    public static i c(@NonNull Resources resources, @NonNull String str) {
        h hVar = new h(resources, BitmapFactory.decodeFile(str));
        if (hVar.f45424a == null) {
            r.a("RoundedBitmapDrawable cannot decode ", str, f45437a);
        }
        return hVar;
    }
}
