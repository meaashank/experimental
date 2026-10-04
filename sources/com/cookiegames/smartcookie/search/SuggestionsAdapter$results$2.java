package com.cookiegames.smartcookie.search;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.C5027t;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SuggestionsAdapter$results$2 extends FunctionReferenceImpl implements ed.l<String, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuggestionsAdapter$results$2 f147745a = new SuggestionsAdapter$results$2();

    public SuggestionsAdapter$results$2() {
        super(1, C5027t.class, "isNotEmpty", "isNotEmpty(Ljava/lang/CharSequence;)Z", 1);
    }

    @Override // ed.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(String p02) {
        kotlin.jvm.internal.G.p(p02, "p0");
        return Boolean.valueOf(p02.length() > 0);
    }
}
