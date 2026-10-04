package com.prism.commons.utils;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.annotation.NonNull;
import java.io.File;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes5.dex */
public class StringUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f162054a = Pattern.compile("^\\p{XDigit}+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f162055b = Pattern.compile("^\\p{Digit}+$");

    public class a extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SpannableStringBuilder f162056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f162057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f162058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f162059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ URLSpan f162060e;

        public a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, b bVar, URLSpan uRLSpan) {
            this.f162056a = spannableStringBuilder;
            this.f162057b = i10;
            this.f162058c = i11;
            this.f162059d = bVar;
            this.f162060e = uRLSpan;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f162059d.a(this.f162056a.subSequence(this.f162057b, this.f162058c).toString(), this.f162060e.getURL());
        }
    }

    public interface b {
        void a(String str, String str2);

        int b(String str);
    }

    public static CharSequence a(String str, b bVar) {
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        int i10 = 0;
        while (i10 < length) {
            final URLSpan uRLSpan = uRLSpanArr[i10];
            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
            int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
            final b bVar2 = bVar;
            a aVar = new a(spannableStringBuilder, spanStart, spanEnd, bVar2, uRLSpan);
            UnderlineSpan underlineSpan = new UnderlineSpan() { // from class: com.prism.commons.utils.StringUtils.2
                @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                public void updateDrawState(@NonNull TextPaint textPaint) {
                    textPaint.setColor(bVar2.b(uRLSpan.getURL()));
                    textPaint.setUnderlineText(false);
                }
            };
            spannableStringBuilder.setSpan(aVar, spanStart, spanEnd, spanFlags);
            spannableStringBuilder.setSpan(underlineSpan, spanStart, spanEnd, spanFlags);
            i10++;
            bVar = bVar2;
        }
        return spannableStringBuilder;
    }

    @NonNull
    public static String b(@NonNull String str, long j10) {
        return new SimpleDateFormat(str, Locale.ENGLISH).format(new Date(j10));
    }

    @NonNull
    public static String c(long j10) {
        return b("yyyy-MM-dd HH:mm:ss", j10);
    }

    @NonNull
    public static String d(@NonNull String str) {
        return b(str, System.currentTimeMillis());
    }

    public static String e(Collection<String> collection) {
        if (collection == null) {
            return HttpUrl.f225216p;
        }
        String[] strArr = (String[]) collection.toArray(new String[0]);
        Arrays.sort(strArr);
        return Arrays.toString(strArr);
    }

    public static String f(long j10) {
        long jAbs = j10 == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(j10);
        if (jAbs < 1024) {
            return String.valueOf(j10);
        }
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("KMGTPE");
        long j11 = jAbs;
        for (int i10 = 40; i10 >= 0 && jAbs > (1152865209611504844 >> i10); i10 -= 10) {
            j11 >>= 10;
            stringCharacterIterator.next();
        }
        return String.format(Locale.US, "%.1f%c", Double.valueOf((j11 * ((long) Long.signum(j10))) / 1024.0d), Character.valueOf(stringCharacterIterator.current()));
    }

    public static String g(long j10) {
        if (-1000 < j10 && j10 < 1000) {
            return String.valueOf(j10);
        }
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("KMGTPE");
        while (true) {
            if (j10 > -999950 && j10 < 999950) {
                return String.format(Locale.US, "%.1f%c", Double.valueOf(j10 / 1000.0d), Character.valueOf(stringCharacterIterator.current()));
            }
            j10 /= 1000;
            stringCharacterIterator.next();
        }
    }

    public static boolean h(String str) {
        return str != null && f162055b.matcher(str).matches();
    }

    public static boolean i(String str) {
        return str != null && f162054a.matcher(str).matches();
    }

    public static boolean j(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String k(Collection<String> collection) {
        StringBuilder sb2 = new StringBuilder();
        HashSet hashSet = new HashSet();
        for (String str : collection) {
            if (str != null && !str.isEmpty() && hashSet.add(str)) {
                if (sb2.length() > 0) {
                    sb2.append(File.pathSeparator);
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }
}
