package r1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.c;
import e.T;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: r1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class C5521g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f227143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.g f227145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f227146d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f227147e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f227148f = true;

    /* JADX INFO: renamed from: r1.g$a */
    @T(19)
    public static class a extends c.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference<EditText> f227149a;

        public a(EditText editText) {
            this.f227149a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.g
        public void b() {
            C5521g.e(this.f227149a.get(), 1);
        }
    }

    public C5521g(EditText editText, boolean z10) {
        this.f227143a = editText;
        this.f227144b = z10;
    }

    public static void e(@Nullable EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.c.c().x(editableText);
            C5518d.b(editableText, selectionStart, selectionEnd);
        }
    }

    public int a() {
        return this.f227147e;
    }

    public final c.g b() {
        if (this.f227145c == null) {
            this.f227145c = new a(this.f227143a);
        }
        return this.f227145c;
    }

    public int c() {
        return this.f227146d;
    }

    public boolean d() {
        return this.f227148f;
    }

    public void f(int i10) {
        this.f227147e = i10;
    }

    public void g(boolean z10) {
        if (this.f227148f != z10) {
            if (this.f227145c != null) {
                androidx.emoji2.text.c.c().F(this.f227145c);
            }
            this.f227148f = z10;
            if (z10) {
                e(this.f227143a, androidx.emoji2.text.c.c().i());
            }
        }
    }

    public void h(int i10) {
        this.f227146d = i10;
    }

    public final boolean i() {
        if (this.f227148f) {
            return (this.f227144b || androidx.emoji2.text.c.q()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f227143a.isInEditMode() || i() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int i13 = androidx.emoji2.text.c.c().i();
        if (i13 != 0) {
            if (i13 == 1) {
                androidx.emoji2.text.c.c().A((Spannable) charSequence, i10, i10 + i12, this.f227146d, this.f227147e);
                return;
            } else if (i13 != 3) {
                return;
            }
        }
        androidx.emoji2.text.c.c().B(b());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
