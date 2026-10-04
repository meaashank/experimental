package o3;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.o;
import com.bumptech.glide.load.engine.s;
import q3.C5424c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j<T extends Drawable> implements s<T>, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f223214a;

    public j(T t10) {
        y3.m.f(t10, "Argument must not be null");
        this.f223214a = t10;
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f223214a.getConstantState();
        return constantState == null ? this.f223214a : (T) constantState.newDrawable();
    }

    public void initialize() {
        T t10 = this.f223214a;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof C5424c) {
            ((C5424c) t10).e().prepareToDraw();
        }
    }
}
