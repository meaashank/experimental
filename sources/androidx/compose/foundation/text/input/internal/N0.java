package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import e.InterfaceC4345t;
import h0.C4480h;
import h0.C4481i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(24)
@kotlin.jvm.internal.V({"SMAP\nEditorInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/LocaleListHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,221:1\n1549#2:222\n1620#2,3:223\n37#3,2:226\n*S KotlinDebug\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/LocaleListHelper\n*L\n193#1:222\n193#1:223,3\n193#1:226,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final N0 f93785a = new N0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f93786b = 0;

    @e.T(24)
    @InterfaceC4345t
    public final void a(@NotNull EditorInfo editorInfo, @NotNull C4481i c4481i) {
        C4481i.f202382c.getClass();
        if (kotlin.jvm.internal.G.g(c4481i, C4481i.f202384e)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.J.d0(c4481i, 10));
        Iterator<C4480h> it = c4481i.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f202381a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = M0.a((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
