package androidx.emoji2.text;

import G0.F;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.c;
import e.InterfaceC4330d;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4330d
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class b implements c.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f113259b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f113260c = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f113261a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.f113261a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f113260c;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.c.f
    public boolean a(@NonNull CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i10 < i11) {
            sbB.append(charSequence.charAt(i10));
            i10++;
        }
        return F.a(this.f113261a, sbB.toString());
    }
}
