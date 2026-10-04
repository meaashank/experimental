package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import i.C4541d;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class ArcMotion extends PathMotion {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f117614g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f117615h = 70.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f117616i = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f117617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f117618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f117619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f117620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f117621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f117622f;

    public ArcMotion() {
        this.f117617a = 0.0f;
        this.f117618b = 0.0f;
        this.f117619c = 70.0f;
        this.f117620d = 0.0f;
        this.f117621e = 0.0f;
        this.f117622f = f117616i;
    }

    public static float g(float f10) {
        if (f10 < 0.0f || f10 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f10 / 2.0f));
    }

    public float a() {
        return this.f117619c;
    }

    public float b() {
        return this.f117617a;
    }

    public float c() {
        return this.f117618b;
    }

    public void d(float f10) {
        this.f117619c = f10;
        this.f117622f = g(f10);
    }

    public void e(float f10) {
        this.f117617a = f10;
        this.f117620d = g(f10);
    }

    public void f(float f10) {
        this.f117618b = f10;
        this.f117621e = g(f10);
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f10, float f11, float f12, float f13) {
        float fA;
        float fA2;
        float f14;
        Path path = new Path();
        path.moveTo(f10, f11);
        float f15 = f12 - f10;
        float f16 = f13 - f11;
        float f17 = (f16 * f16) + (f15 * f15);
        float f18 = (f10 + f12) / 2.0f;
        float f19 = (f11 + f13) / 2.0f;
        float f20 = 0.25f * f17;
        boolean z10 = f11 > f13;
        if (Math.abs(f15) < Math.abs(f16)) {
            float fAbs = Math.abs(f17 / (f16 * 2.0f));
            if (z10) {
                fA2 = fAbs + f13;
                fA = f12;
            } else {
                fA2 = fAbs + f11;
                fA = f10;
            }
            f14 = this.f117621e;
        } else {
            float f21 = f17 / (f15 * 2.0f);
            if (z10) {
                fA2 = f11;
                fA = f21 + f10;
            } else {
                fA = f12 - f21;
                fA2 = f13;
            }
            f14 = this.f117620d;
        }
        float f22 = f20 * f14 * f14;
        float f23 = f18 - fA;
        float f24 = f19 - fA2;
        float f25 = (f24 * f24) + (f23 * f23);
        float f26 = this.f117622f;
        float f27 = f20 * f26 * f26;
        if (f25 >= f22) {
            f22 = f25 > f27 ? f27 : 0.0f;
        }
        if (f22 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f22 / f25);
            fA = C4541d.a(fA, f18, fSqrt, f18);
            fA2 = C4541d.a(fA2, f19, fSqrt, f19);
        }
        path.cubicTo((f10 + fA) / 2.0f, (f11 + fA2) / 2.0f, (fA + f12) / 2.0f, (fA2 + f13) / 2.0f, f12, f13);
        return path;
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117617a = 0.0f;
        this.f117618b = 0.0f;
        this.f117619c = 70.0f;
        this.f117620d = 0.0f;
        this.f117621e = 0.0f;
        this.f117622f = f117616i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2708u.f119550j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        f(D0.n.j(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        e(D0.n.r(xmlPullParser, "minimumHorizontalAngle") ? typedArrayObtainStyledAttributes.getFloat(0, 0.0f) : 0.0f);
        d(D0.n.r(xmlPullParser, "maximumAngle") ? typedArrayObtainStyledAttributes.getFloat(2, 70.0f) : 70.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
