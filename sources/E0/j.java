package e0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.runtime.internal.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPlaceholderSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderSpan.android.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
@r(parameters = 0)
public final class j extends ReplacementSpan {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f199965k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f199966l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f199967m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f199968n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f199969o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f199970p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f199971q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f199972r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f199973s = 6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f199974t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f199975u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f199976v = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f199977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f199978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f199979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f199980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f199981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f199982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint.FontMetricsInt f199983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f199984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f199985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f199986j;

    public static final class a {

        /* JADX INFO: renamed from: e0.j$a$a, reason: collision with other inner class name */
        @Lc.c(AnnotationRetention.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0723a {
        }

        @Lc.c(AnnotationRetention.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        public @interface b {
        }

        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public j(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.f199977a = f10;
        this.f199978b = i10;
        this.f199979c = f11;
        this.f199980d = i11;
        this.f199981e = f12;
        this.f199982f = i12;
    }

    @NotNull
    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f199983g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        G.S("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f199986j) {
            return this.f199985i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    public final int c() {
        return this.f199982f;
    }

    public final int d() {
        if (this.f199986j) {
            return this.f199984h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(@NotNull Paint paint, @Nullable CharSequence charSequence, int i10, int i11, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        int iA;
        this.f199986j = true;
        float textSize = paint.getTextSize();
        this.f199983g = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        int i12 = this.f199978b;
        if (i12 == 0) {
            f10 = this.f199977a * this.f199981e;
        } else {
            if (i12 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f10 = this.f199977a * textSize;
        }
        this.f199984h = k.a(f10);
        int i13 = this.f199980d;
        if (i13 == 0) {
            iA = k.a(this.f199979c * this.f199981e);
        } else {
            if (i13 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            iA = k.a(this.f199979c * textSize);
        }
        this.f199985i = iA;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f199982f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = b() + iB;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return d();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @Nullable CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @NotNull Paint paint) {
    }
}
