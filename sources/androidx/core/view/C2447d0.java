package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.core.view.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2447d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f111908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f111909b;

    public C2447d0(@NonNull ViewGroup viewGroup) {
    }

    public int a() {
        return this.f111908a | this.f111909b;
    }

    public void b(@NonNull View view, @NonNull View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(@NonNull View view, @NonNull View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f111909b = i10;
        } else {
            this.f111908a = i10;
        }
    }

    public void d(@NonNull View view) {
        e(view, 0);
    }

    public void e(@NonNull View view, int i10) {
        if (i10 == 1) {
            this.f111909b = 0;
        } else {
            this.f111908a = 0;
        }
    }
}
