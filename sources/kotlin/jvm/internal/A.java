package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class A extends N<float[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final float[] f217866d;

    public A(int i10) {
        super(i10);
        this.f217866d = new float[i10];
    }

    public final void h(float f10) {
        float[] fArr = this.f217866d;
        int i10 = this.f217891b;
        this.f217891b = i10 + 1;
        fArr[i10] = f10;
    }

    @Override // kotlin.jvm.internal.N
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull float[] fArr) {
        G.p(fArr, "<this>");
        return fArr.length;
    }

    @NotNull
    public final float[] j() {
        float[] fArr = this.f217866d;
        float[] fArr2 = new float[f()];
        g(fArr, fArr2);
        return fArr2;
    }
}
