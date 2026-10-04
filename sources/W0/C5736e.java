package w0;

import android.view.View;

/* JADX INFO: renamed from: w0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5736e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f240058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f240059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f240060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f240061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f240062e;

    public void a(View v10) {
        this.f240059b = v10.getLeft();
        this.f240060c = v10.getTop();
        this.f240061d = v10.getRight();
        this.f240062e = v10.getBottom();
        this.f240058a = v10.getRotation();
    }

    public int b() {
        return this.f240062e - this.f240060c;
    }

    public int c() {
        return this.f240061d - this.f240059b;
    }
}
