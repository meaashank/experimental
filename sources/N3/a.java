package N3;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import androidx.compose.runtime.internal.r;
import dd.o;
import e.InterfaceC4346u;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f59060a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f59061b = 0;

    /* JADX INFO: renamed from: N3.a$a, reason: collision with other inner class name */
    public static final class C0081a extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f59062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f59063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f59064c;

        public C0081a(ImageView imageView, int i10) {
            this.f59063b = imageView;
            this.f59064c = i10;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation t10) {
            G.p(t10, "t");
            if (f10 < 0.5f) {
                this.f59063b.setRotationY(f10 * 90.0f * 2.0f);
                return;
            }
            if (!this.f59062a) {
                this.f59062a = true;
                this.f59063b.setImageResource(this.f59064c);
            }
            this.f59063b.setRotationY((((f10 - 0.5f) * 90.0f) * 2.0f) - 90);
        }
    }

    @o
    @NotNull
    public static final Animation a(@NotNull ImageView imageView, @InterfaceC4346u int i10) {
        G.p(imageView, "imageView");
        C0081a c0081a = new C0081a(imageView, i10);
        c0081a.setDuration(300L);
        c0081a.setInterpolator(new AccelerateDecelerateInterpolator());
        return c0081a;
    }
}
