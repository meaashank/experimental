package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g.C4426a;
import r1.C5515a;

/* JADX INFO: renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1503i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final EditText f86391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C5515a f86392b;

    public C1503i(@NonNull EditText editText) {
        this.f86391a = editText;
        this.f86392b = new C5515a(editText, false);
    }

    @Nullable
    public KeyListener a(@Nullable KeyListener keyListener) {
        return b(keyListener) ? this.f86392b.f227122a.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public boolean c() {
        return this.f86392b.f227122a.b();
    }

    public void d(@Nullable AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f86391a.getContext().obtainStyledAttributes(attributeSet, C4426a.m.f202129v0, i10, 0);
        try {
            int i11 = C4426a.m.f201823K0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            f(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Nullable
    public InputConnection e(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return this.f86392b.e(inputConnection, editorInfo);
    }

    public void f(boolean z10) {
        this.f86392b.g(z10);
    }
}
