package U0;

import android.text.Spannable;
import android.text.SpannableString;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nSpannableString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n31#2,4:67\n13579#3,2:71\n*S KotlinDebug\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n32#1:67,4\n32#1:71,2\n*E\n"})
public final class A {
    public static final void a(@NotNull Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void b(@NotNull Spannable spannable, int i10, int i11, @NotNull Object obj) {
        spannable.setSpan(obj, i10, i11, 17);
    }

    public static final void c(@NotNull Spannable spannable, @NotNull md.l lVar, @NotNull Object obj) {
        spannable.setSpan(obj, lVar.f221139a, lVar.f221140b, 17);
    }

    @NotNull
    public static final Spannable d(@NotNull CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }
}
