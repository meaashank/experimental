package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: androidx.transition.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2703o<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Property<T, PointF> f117877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PathMeasure f117878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f117879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f117880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PointF f117881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f117882f;

    public C2703o(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f117880d = new float[2];
        this.f117881e = new PointF();
        this.f117877a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f117878b = pathMeasure;
        this.f117879c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t10) {
        return Float.valueOf(this.f117882f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t10, Float f10) {
        this.f117882f = f10.floatValue();
        this.f117878b.getPosTan(f10.floatValue() * this.f117879c, this.f117880d, null);
        PointF pointF = this.f117881e;
        float[] fArr = this.f117880d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f117877a.set(t10, pointF);
    }
}
