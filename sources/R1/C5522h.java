package r1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.T;

/* JADX INFO: renamed from: r1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C5522h implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TransformationMethod f227150a;

    public C5522h(@Nullable TransformationMethod transformationMethod) {
        this.f227150a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f227150a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(@Nullable CharSequence charSequence, @NonNull View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f227150a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.c.c().i() != 1) ? charSequence : androidx.emoji2.text.c.c().x(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f227150a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
