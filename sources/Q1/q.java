package q1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.core.text.PrecomputedTextCompat;
import e.T;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes2.dex */
public class q implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f226738a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public Spannable f226739b;

    @T(24)
    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    public static class b {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    @T(28)
    public static class c extends b {
        @Override // q1.q.b
        public boolean a(CharSequence charSequence) {
            return U0.g.a(charSequence) || (charSequence instanceof PrecomputedTextCompat);
        }
    }

    public q(@NonNull Spannable spannable) {
        this.f226739b = spannable;
    }

    public static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    public final void a() {
        Spannable spannable = this.f226739b;
        if (!this.f226738a && c().a(spannable)) {
            this.f226739b = new SpannableString(spannable);
        }
        this.f226738a = true;
    }

    public Spannable b() {
        return this.f226739b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f226739b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @T(api = 24)
    public IntStream chars() {
        return this.f226739b.chars();
    }

    @Override // java.lang.CharSequence
    @NonNull
    @T(api = 24)
    public IntStream codePoints() {
        return this.f226739b.codePoints();
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f226739b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f226739b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f226739b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f226739b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f226739b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f226739b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f226739b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f226739b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public CharSequence subSequence(int i10, int i11) {
        return this.f226739b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f226739b.toString();
    }

    public q(@NonNull Spanned spanned) {
        this.f226739b = new SpannableString(spanned);
    }

    public q(@NonNull CharSequence charSequence) {
        this.f226739b = new SpannableString(charSequence);
    }
}
