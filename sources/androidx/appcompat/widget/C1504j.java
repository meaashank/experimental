package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g.C4426a;
import r1.C5520f;

/* JADX INFO: renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1504j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f86393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C5520f f86394b;

    public C1504j(@NonNull TextView textView) {
        this.f86393a = textView;
        this.f86394b = new C5520f(textView, false);
    }

    @NonNull
    public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
        return this.f86394b.f227138a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f86394b.f227138a.b();
    }

    public void c(@Nullable AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f86393a.getContext().obtainStyledAttributes(attributeSet, C4426a.m.f202129v0, i10, 0);
        try {
            int i11 = C4426a.m.f201823K0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void d(boolean z10) {
        this.f86394b.c(z10);
    }

    public void e(boolean z10) {
        this.f86394b.d(z10);
    }

    @Nullable
    public TransformationMethod f(@Nullable TransformationMethod transformationMethod) {
        return this.f86394b.f227138a.f(transformationMethod);
    }
}
