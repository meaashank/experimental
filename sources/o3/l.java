package o3;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.s;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends j<Drawable> {
    public l(Drawable drawable) {
        super(drawable);
    }

    @Nullable
    public static s<Drawable> d(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new l(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    public Class<Drawable> b() {
        return this.f223214a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return Math.max(1, this.f223214a.getIntrinsicHeight() * this.f223214a.getIntrinsicWidth() * 4);
    }

    @Override // com.bumptech.glide.load.engine.s
    public void a() {
    }
}
