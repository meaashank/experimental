package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.core.view.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2438a0 extends InterfaceC2444c0 {
    void onNestedPreScroll(@NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12);

    void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, int i14);

    void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i10, int i11);

    boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i10, int i11);

    void onStopNestedScroll(@NonNull View view, int i10);
}
