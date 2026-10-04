package r1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.c;
import e.T;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: r1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class C5518d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f227132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.g f227133b;

    /* JADX INFO: renamed from: r1.d$a */
    @T(19)
    public static class a extends c.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference<TextView> f227134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Reference<C5518d> f227135b;

        public a(TextView textView, C5518d c5518d) {
            this.f227134a = new WeakReference(textView);
            this.f227135b = new WeakReference(c5518d);
        }

        @Override // androidx.emoji2.text.c.g
        public void b() {
            CharSequence text;
            CharSequence charSequenceX;
            TextView textView = this.f227134a.get();
            if (c(textView, this.f227135b.get()) && textView.isAttachedToWindow() && text != (charSequenceX = androidx.emoji2.text.c.c().x((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceX);
                int selectionEnd = Selection.getSelectionEnd(charSequenceX);
                textView.setText(charSequenceX);
                if (charSequenceX instanceof Spannable) {
                    C5518d.b((Spannable) charSequenceX, selectionStart, selectionEnd);
                }
            }
        }

        public final boolean c(@Nullable TextView textView, @Nullable InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public C5518d(@NonNull TextView textView) {
        this.f227132a = textView;
    }

    public static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    public final c.g a() {
        if (this.f227133b == null) {
            this.f227133b = new a(this.f227132a, this);
        }
        return this.f227133b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f227132a.isInEditMode()) {
            return charSequence;
        }
        int i14 = androidx.emoji2.text.c.c().i();
        if (i14 != 0) {
            if (i14 == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f227132a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.c.c().y(charSequence, 0, charSequence.length());
            }
            if (i14 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.c.c().B(a());
        return charSequence;
    }
}
