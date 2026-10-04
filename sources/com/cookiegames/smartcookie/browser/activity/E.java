package com.cookiegames.smartcookie.browser.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ParagraphStyle;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nStyleRemovingTextWatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StyleRemovingTextWatcher.kt\ncom/cookiegames/smartcookie/browser/activity/StyleRemovingTextWatcher\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,21:1\n13309#2,2:22\n13309#2,2:24\n*S KotlinDebug\n*F\n+ 1 StyleRemovingTextWatcher.kt\ncom/cookiegames/smartcookie/browser/activity/StyleRemovingTextWatcher\n*L\n17#1:22,2\n18#1:24,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class E implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f140895a = 0;

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable e10) {
        kotlin.jvm.internal.G.p(e10, "e");
        Object[] spans = e10.getSpans(0, e10.length(), CharacterStyle.class);
        kotlin.jvm.internal.G.o(spans, "getSpans(...)");
        for (Object obj : spans) {
            e10.removeSpan(obj);
        }
        Object[] spans2 = e10.getSpans(0, e10.length(), ParagraphStyle.class);
        kotlin.jvm.internal.G.o(spans2, "getSpans(...)");
        for (Object obj2 : spans2) {
            e10.removeSpan(obj2);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i10, int i11, int i12) {
    }
}
