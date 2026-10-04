package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.AbstractC2360m;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InterfaceC2358k;
import androidx.compose.ui.text.e0;
import java.util.WeakHashMap;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nURLSpanCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLSpanCache.android.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,82:1\n361#2,7:83\n361#2,7:90\n361#2,7:97\n*S KotlinDebug\n*F\n+ 1 URLSpanCache.android.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n*L\n59#1:83,7\n63#1:90,7\n72#1:97,7\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@InterfaceC2358k
public final class A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104874d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WeakHashMap<e0, URLSpan> f104875a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WeakHashMap<AnnotatedString.b<AbstractC2360m.b>, URLSpan> f104876b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final WeakHashMap<AnnotatedString.b<AbstractC2360m>, q> f104877c = new WeakHashMap<>();

    @Nullable
    public final ClickableSpan a(@NotNull AnnotatedString.b<AbstractC2360m> bVar) {
        WeakHashMap<AnnotatedString.b<AbstractC2360m>, q> weakHashMap = this.f104877c;
        q qVar = weakHashMap.get(bVar);
        if (qVar == null) {
            qVar = new q(bVar.f104205a);
            weakHashMap.put(bVar, qVar);
        }
        return qVar;
    }

    @NotNull
    public final URLSpan b(@NotNull AnnotatedString.b<AbstractC2360m.b> bVar) {
        WeakHashMap<AnnotatedString.b<AbstractC2360m.b>, URLSpan> weakHashMap = this.f104876b;
        URLSpan uRLSpan = weakHashMap.get(bVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(bVar.f104205a.f104871b);
            weakHashMap.put(bVar, uRLSpan);
        }
        return uRLSpan;
    }

    @NotNull
    public final URLSpan c(@NotNull e0 e0Var) {
        WeakHashMap<e0, URLSpan> weakHashMap = this.f104875a;
        URLSpan uRLSpan = weakHashMap.get(e0Var);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(e0Var.f104423a);
            weakHashMap.put(e0Var, uRLSpan);
        }
        return uRLSpan;
    }
}
