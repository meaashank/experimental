package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.C2713z;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeImageTransform extends Transition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f117683a = "android:changeImageTransform:matrix";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f117684b = "android:changeImageTransform:bounds";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f117685c = {f117683a, f117684b};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TypeEvaluator<Matrix> f117686d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Property<ImageView, Matrix> f117687e = new b(Matrix.class, "animatedTransform");

    public class a implements TypeEvaluator<Matrix> {
        public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
            return null;
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    public class b extends Property<ImageView, Matrix> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        public Matrix a(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            C2700l.a(imageView, matrix);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f117688a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f117688a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f117688a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    private void captureValues(A a10) {
        View view = a10.f117612b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = a10.f117611a;
            map.put(f117684b, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put(f117683a, u(imageView));
        }
    }

    public static Matrix t(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f10 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f11 = intrinsicHeight;
        float fMax = Math.max(width / f10, height / f11);
        int iRound = Math.round((width - (f10 * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f11 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }

    @NonNull
    public static Matrix u(@NonNull ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i10 = c.f117688a[imageView.getScaleType().ordinal()];
        return i10 != 1 ? i10 != 2 ? new Matrix(imageView.getImageMatrix()) : t(imageView) : x(imageView);
    }

    public static Matrix x(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull A a10) {
        captureValues(a10);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull A a10) {
        captureValues(a10);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable A a10, @Nullable A a11) {
        if (a10 == null || a11 == null) {
            return null;
        }
        Rect rect = (Rect) a10.f117611a.get(f117684b);
        Rect rect2 = (Rect) a11.f117611a.get(f117684b);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) a10.f117611a.get(f117683a);
        Matrix matrix2 = (Matrix) a11.f117611a.get(f117683a);
        boolean z10 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z10) {
            return null;
        }
        ImageView imageView = (ImageView) a11.f117612b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return w(imageView);
        }
        if (matrix == null) {
            matrix = C2701m.f117876a;
        }
        if (matrix2 == null) {
            matrix2 = C2701m.f117876a;
        }
        f117687e.set(imageView, matrix);
        return v(imageView, matrix, matrix2);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return f117685c;
    }

    public final ObjectAnimator v(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) f117687e, (TypeEvaluator) new C2713z.a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @NonNull
    public final ObjectAnimator w(@NonNull ImageView imageView) {
        Property<ImageView, Matrix> property = f117687e;
        TypeEvaluator<Matrix> typeEvaluator = f117686d;
        Matrix matrix = C2701m.f117876a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    public ChangeImageTransform(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
