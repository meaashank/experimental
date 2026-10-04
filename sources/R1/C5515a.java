package r1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.t;
import e.D;
import e.T;

/* JADX INFO: renamed from: r1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5515a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f227122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f227123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f227124c;

    /* JADX INFO: renamed from: r1.a$a, reason: collision with other inner class name */
    @T(19)
    public static class C0868a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f227125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5521g f227126b;

        public C0868a(@NonNull EditText editText, boolean z10) {
            this.f227125a = editText;
            C5521g c5521g = new C5521g(editText, z10);
            this.f227126b = c5521g;
            editText.addTextChangedListener(c5521g);
            editText.setEditableFactory(C5516b.getInstance());
        }

        @Override // r1.C5515a.b
        public KeyListener a(@Nullable KeyListener keyListener) {
            if (keyListener instanceof C5519e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new C5519e(keyListener);
        }

        @Override // r1.C5515a.b
        public boolean b() {
            return this.f227126b.f227148f;
        }

        @Override // r1.C5515a.b
        public InputConnection c(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection instanceof C5517c ? inputConnection : new C5517c(this.f227125a, inputConnection, editorInfo);
        }

        @Override // r1.C5515a.b
        public void d(int i10) {
            this.f227126b.f227147e = i10;
        }

        @Override // r1.C5515a.b
        public void e(boolean z10) {
            this.f227126b.g(z10);
        }

        @Override // r1.C5515a.b
        public void f(int i10) {
            this.f227126b.f227146d = i10;
        }
    }

    public C5515a(@NonNull EditText editText) {
        this(editText, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int a() {
        return this.f227124c;
    }

    @Nullable
    public KeyListener b(@Nullable KeyListener keyListener) {
        return this.f227122a.a(keyListener);
    }

    public int c() {
        return this.f227123b;
    }

    public boolean d() {
        return this.f227122a.b();
    }

    @Nullable
    public InputConnection e(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f227122a.c(inputConnection, editorInfo);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void f(int i10) {
        this.f227124c = i10;
        this.f227122a.d(i10);
    }

    public void g(boolean z10) {
        this.f227122a.e(z10);
    }

    public void h(@D(from = 0) int i10) {
        t.j(i10, "maxEmojiCount should be greater than 0");
        this.f227123b = i10;
        this.f227122a.f(i10);
    }

    public C5515a(@NonNull EditText editText, boolean z10) {
        this.f227123b = Integer.MAX_VALUE;
        this.f227124c = 0;
        t.m(editText, "editText cannot be null");
        this.f227122a = new C0868a(editText, z10);
    }

    /* JADX INFO: renamed from: r1.a$b */
    public static class b {
        public boolean b() {
            return false;
        }

        @Nullable
        public KeyListener a(@Nullable KeyListener keyListener) {
            return keyListener;
        }

        public void d(int i10) {
        }

        public void e(boolean z10) {
        }

        public void f(int i10) {
        }

        public InputConnection c(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection;
        }
    }
}
