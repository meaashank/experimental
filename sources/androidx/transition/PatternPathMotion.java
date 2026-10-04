package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class PatternPathMotion extends PathMotion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Path f117763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f117764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f117765c;

    public PatternPathMotion() {
        Path path = new Path();
        this.f117764b = path;
        this.f117765c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f117763a = path;
    }

    public static float a(float f10, float f11) {
        return (float) Math.sqrt((f11 * f11) + (f10 * f10));
    }

    public Path b() {
        return this.f117763a;
    }

    public void c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f10 = fArr[0];
        float f11 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f12 = fArr[0];
        float f13 = fArr[1];
        if (f12 == f10 && f13 == f11) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f117765c.setTranslate(-f12, -f13);
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fA = 1.0f / a(f14, f15);
        this.f117765c.postScale(fA, fA);
        this.f117765c.postRotate((float) Math.toDegrees(-Math.atan2(f15, f14)));
        path.transform(this.f117765c, this.f117764b);
        this.f117763a = path;
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float fA = a(f14, f15);
        double dAtan2 = Math.atan2(f15, f14);
        this.f117765c.setScale(fA, fA);
        this.f117765c.postRotate((float) Math.toDegrees(dAtan2));
        this.f117765c.postTranslate(f10, f11);
        Path path = new Path();
        this.f117764b.transform(this.f117765c, path);
        return path;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this.f117764b = new Path();
        this.f117765c = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2708u.f119551k);
        try {
            String strM = D0.n.m(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strM != null) {
                c(G0.I.e(strM));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public PatternPathMotion(Path path) {
        this.f117764b = new Path();
        this.f117765c = new Matrix();
        c(path);
    }
}
