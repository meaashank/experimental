package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,609:1\n33#2,6:610\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n*L\n168#1:610,6\n*E\n"})
public final class C2239f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f103815A = 8;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f103816B = 5;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f103817C = 4;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f103818D = 1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f103819E = 1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f103820F = 4;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f103821G = 8;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f103822H = 4;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f103823I = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f103824a = "plain text";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte f103825b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte f103826c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte f103827d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte f103828e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte f103829f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte f103830g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte f103831h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte f103832i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte f103833j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte f103834k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte f103835l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte f103836m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte f103837n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte f103838o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte f103839p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte f103840q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte f103841r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte f103842s = 9;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte f103843t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte f103844u = 11;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte f103845v = 12;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f103846w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f103847x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f103848y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f103849z = 8;

    @Nullable
    public static final AnnotatedString a(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new AnnotatedString(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i10 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int iOe = kotlin.collections.B.Oe(annotationArr);
        if (iOe >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i10];
                if (kotlin.jvm.internal.G.g(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new AnnotatedString.b(new C2240f0(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i10 == iOe) {
                    break;
                }
                i10++;
            }
        }
        return new AnnotatedString(charSequence.toString(), arrayList, null, 4, null);
    }

    @NotNull
    public static final CharSequence b(@NotNull AnnotatedString annotatedString) {
        if (annotatedString.h().isEmpty()) {
            return annotatedString.f104196a;
        }
        SpannableString spannableString = new SpannableString(annotatedString.f104196a);
        C2261m0 c2261m0 = new C2261m0();
        List<AnnotatedString.b<androidx.compose.ui.text.I>> listH = annotatedString.h();
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.b<androidx.compose.ui.text.I> bVar = listH.get(i10);
            androidx.compose.ui.text.I i11 = bVar.f104205a;
            int i12 = bVar.f104206b;
            int i13 = bVar.f104207c;
            c2261m0.q();
            c2261m0.e(i11);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", c2261m0.p()), i12, i13, 33);
        }
        return spannableString;
    }

    @NotNull
    public static final Z c(@NotNull ClipData clipData) {
        return new Z(clipData);
    }

    @NotNull
    public static final C2225a0 d(@NotNull ClipDescription clipDescription) {
        return new C2225a0(clipDescription);
    }
}
