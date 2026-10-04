package androidx.compose.ui.graphics;

import android.graphics.PathMeasure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n38#2,5:87\n38#2,5:92\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n43#1:87,5\n49#1:92,5\n*E\n"})
public final class C2023e0 implements E2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PathMeasure f101095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public float[] f101096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public float[] f101097c;

    public C2023e0(@NotNull PathMeasure pathMeasure) {
        this.f101095a = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.E2
    public long a(float f10) {
        if (this.f101096b == null) {
            this.f101096b = new float[2];
        }
        if (this.f101097c == null) {
            this.f101097c = new float[2];
        }
        if (!this.f101095a.getPosTan(f10, this.f101096b, this.f101097c)) {
            P.g.f65503b.getClass();
            return P.g.f65506e;
        }
        float[] fArr = this.f101097c;
        kotlin.jvm.internal.G.m(fArr);
        float f11 = fArr[0];
        float[] fArr2 = this.f101097c;
        kotlin.jvm.internal.G.m(fArr2);
        return P.h.a(f11, fArr2[1]);
    }

    @Override // androidx.compose.ui.graphics.E2
    public boolean b(float f10, float f11, @NotNull Path path, boolean z10) {
        PathMeasure pathMeasure = this.f101095a;
        if (path instanceof Z) {
            return pathMeasure.getSegment(f10, f11, ((Z) path).f100925b, z10);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.E2
    public void c(@Nullable Path path, boolean z10) {
        android.graphics.Path path2;
        PathMeasure pathMeasure = this.f101095a;
        if (path == null) {
            path2 = null;
        } else {
            if (!(path instanceof Z)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path2 = ((Z) path).f100925b;
        }
        pathMeasure.setPath(path2, z10);
    }

    @Override // androidx.compose.ui.graphics.E2
    public long d(float f10) {
        if (this.f101096b == null) {
            this.f101096b = new float[2];
        }
        if (this.f101097c == null) {
            this.f101097c = new float[2];
        }
        if (!this.f101095a.getPosTan(f10, this.f101096b, this.f101097c)) {
            P.g.f65503b.getClass();
            return P.g.f65506e;
        }
        float[] fArr = this.f101096b;
        kotlin.jvm.internal.G.m(fArr);
        float f11 = fArr[0];
        float[] fArr2 = this.f101096b;
        kotlin.jvm.internal.G.m(fArr2);
        return P.h.a(f11, fArr2[1]);
    }

    @Override // androidx.compose.ui.graphics.E2
    public float getLength() {
        return this.f101095a.getLength();
    }
}
