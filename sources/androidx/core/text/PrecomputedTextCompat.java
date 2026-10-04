package androidx.core.text;

import U0.g;
import U0.h;
import U0.p;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.t;
import e.D;
import e.InterfaceC4326A;
import e.T;
import e.e0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class PrecomputedTextCompat implements Spannable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f111339e = '\n';

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f111340f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    @InterfaceC4326A("sLock")
    public static Executor f111341g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Spannable f111342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Params f111343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final int[] f111344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final PrecomputedText f111345d;

    @T(28)
    public static class a {
        public static Spannable a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    public static class b extends FutureTask<PrecomputedTextCompat> {

        public static class a implements Callable<PrecomputedTextCompat> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Params f111351a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public CharSequence f111352b;

            public a(@NonNull Params params, @NonNull CharSequence charSequence) {
                this.f111351a = params;
                this.f111352b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public PrecomputedTextCompat call() throws Exception {
                return PrecomputedTextCompat.a(this.f111352b, this.f111351a);
            }
        }

        public b(@NonNull Params params, @NonNull CharSequence charSequence) {
            super(new a(params, charSequence));
        }
    }

    public PrecomputedTextCompat(@NonNull CharSequence charSequence, @NonNull Params params, @NonNull int[] iArr) {
        this.f111342a = new SpannableString(charSequence);
        this.f111343b = params;
        this.f111344c = iArr;
        this.f111345d = null;
    }

    @SuppressLint({"WrongConstant"})
    public static PrecomputedTextCompat a(@NonNull CharSequence charSequence, @NonNull Params params) {
        PrecomputedText.Params params2;
        charSequence.getClass();
        params.getClass();
        try {
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params2 = params.f111350e) != null) {
                return new PrecomputedTextCompat(PrecomputedText.create(charSequence, params2), params);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i10 = 0;
            while (i10 < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', i10, length);
                i10 = iIndexOf < 0 ? length : iIndexOf + 1;
                arrayList.add(Integer.valueOf(i10));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), params.f111346a, Integer.MAX_VALUE).setBreakStrategy(params.f111348c).setHyphenationFrequency(params.f111349d).setTextDirection(params.f111347b).build();
            return new PrecomputedTextCompat(charSequence, params, iArr);
        } finally {
            Trace.endSection();
        }
    }

    @e0
    public static Future<PrecomputedTextCompat> g(@NonNull CharSequence charSequence, @NonNull Params params, @Nullable Executor executor) {
        b bVar = new b(params, charSequence);
        if (executor == null) {
            synchronized (f111340f) {
                try {
                    if (f111341g == null) {
                        f111341g = Executors.newFixedThreadPool(1);
                    }
                    executor = f111341g;
                } finally {
                }
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    @D(from = 0)
    public int b() {
        return Build.VERSION.SDK_INT >= 29 ? this.f111345d.getParagraphCount() : this.f111344c.length;
    }

    @D(from = 0)
    public int c(@D(from = 0) int i10) {
        t.g(i10, 0, b(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.f111345d.getParagraphEnd(i10) : this.f111344c[i10];
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f111342a.charAt(i10);
    }

    @D(from = 0)
    public int d(@D(from = 0) int i10) {
        t.g(i10, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f111345d.getParagraphStart(i10);
        }
        if (i10 == 0) {
            return 0;
        }
        return this.f111344c[i10 - 1];
    }

    @NonNull
    public Params e() {
        return this.f111343b;
    }

    @Nullable
    @T(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PrecomputedText f() {
        if (g.a(this.f111342a)) {
            return h.a(this.f111342a);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f111342a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f111342a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f111342a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f111345d.getSpans(i10, i11, cls) : (T[]) this.f111342a.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f111342a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f111342a.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f111345d.removeSpan(obj);
        } else {
            this.f111342a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f111345d.setSpan(obj, i10, i11, i12);
        } else {
            this.f111342a.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f111342a.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f111342a.toString();
    }

    @T(28)
    public PrecomputedTextCompat(@NonNull PrecomputedText precomputedText, @NonNull Params params) {
        this.f111342a = precomputedText;
        this.f111343b = params;
        this.f111344c = null;
        this.f111345d = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public static final class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final TextPaint f111346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final TextDirectionHeuristic f111347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f111348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f111349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f111350e;

        public static class Builder {

            @NonNull
            private final TextPaint mPaint;
            private int mBreakStrategy = 1;
            private int mHyphenationFrequency = 1;
            private TextDirectionHeuristic mTextDir = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public Builder(@NonNull TextPaint textPaint) {
                this.mPaint = textPaint;
            }

            @NonNull
            public Params build() {
                return new Params(this.mPaint, this.mTextDir, this.mBreakStrategy, this.mHyphenationFrequency);
            }

            @T(23)
            public Builder setBreakStrategy(int i10) {
                this.mBreakStrategy = i10;
                return this;
            }

            @T(23)
            public Builder setHyphenationFrequency(int i10) {
                this.mHyphenationFrequency = i10;
                return this;
            }

            public Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.mTextDir = textDirectionHeuristic;
                return this;
            }
        }

        public Params(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f111350e = p.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f111350e = null;
            }
            this.f111346a = textPaint;
            this.f111347b = textDirectionHeuristic;
            this.f111348c = i10;
            this.f111349d = i11;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean a(@NonNull Params params) {
            int i10 = Build.VERSION.SDK_INT;
            if (this.f111348c != params.f111348c || this.f111349d != params.f111349d || this.f111346a.getTextSize() != params.f111346a.getTextSize() || this.f111346a.getTextScaleX() != params.f111346a.getTextScaleX() || this.f111346a.getTextSkewX() != params.f111346a.getTextSkewX() || this.f111346a.getLetterSpacing() != params.f111346a.getLetterSpacing() || !TextUtils.equals(this.f111346a.getFontFeatureSettings(), params.f111346a.getFontFeatureSettings()) || this.f111346a.getFlags() != params.f111346a.getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f111346a.getTextLocales().equals(params.f111346a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f111346a.getTextLocale().equals(params.f111346a.getTextLocale())) {
                return false;
            }
            return this.f111346a.getTypeface() == null ? params.f111346a.getTypeface() == null : this.f111346a.getTypeface().equals(params.f111346a.getTypeface());
        }

        @T(23)
        public int b() {
            return this.f111348c;
        }

        @T(23)
        public int c() {
            return this.f111349d;
        }

        @Nullable
        public TextDirectionHeuristic d() {
            return this.f111347b;
        }

        @NonNull
        public TextPaint e() {
            return this.f111346a;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return a(params) && this.f111347b == params.f111347b;
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? Objects.hash(Float.valueOf(this.f111346a.getTextSize()), Float.valueOf(this.f111346a.getTextScaleX()), Float.valueOf(this.f111346a.getTextSkewX()), Float.valueOf(this.f111346a.getLetterSpacing()), Integer.valueOf(this.f111346a.getFlags()), this.f111346a.getTextLocales(), this.f111346a.getTypeface(), Boolean.valueOf(this.f111346a.isElegantTextHeight()), this.f111347b, Integer.valueOf(this.f111348c), Integer.valueOf(this.f111349d)) : Objects.hash(Float.valueOf(this.f111346a.getTextSize()), Float.valueOf(this.f111346a.getTextScaleX()), Float.valueOf(this.f111346a.getTextSkewX()), Float.valueOf(this.f111346a.getLetterSpacing()), Integer.valueOf(this.f111346a.getFlags()), this.f111346a.getTextLocale(), this.f111346a.getTypeface(), Boolean.valueOf(this.f111346a.isElegantTextHeight()), this.f111347b, Integer.valueOf(this.f111348c), Integer.valueOf(this.f111349d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f111346a.getTextSize());
            sb2.append(", textScaleX=" + this.f111346a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f111346a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f111346a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f111346a.isElegantTextHeight());
            if (i10 >= 24) {
                sb2.append(", textLocale=" + this.f111346a.getTextLocales());
            } else {
                sb2.append(", textLocale=" + this.f111346a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f111346a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f111346a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f111347b);
            sb2.append(", breakStrategy=" + this.f111348c);
            sb2.append(", hyphenationFrequency=" + this.f111349d);
            sb2.append("}");
            return sb2.toString();
        }

        @T(28)
        public Params(@NonNull PrecomputedText.Params params) {
            this.f111346a = params.getTextPaint();
            this.f111347b = params.getTextDirection();
            this.f111348c = params.getBreakStrategy();
            this.f111349d = params.getHyphenationFrequency();
            this.f111350e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
