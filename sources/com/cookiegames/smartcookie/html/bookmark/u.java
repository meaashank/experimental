package com.cookiegames.smartcookie.html.bookmark;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.inject.Inject;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nBookmarkPageReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookmarkPageReader.kt\ncom/cookiegames/smartcookie/html/bookmark/BookmarkPageReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f141329a = 0;

    @Inject
    public u() {
    }

    @NotNull
    public final String a(@NotNull Context context) throws IOException {
        G.p(context, "context");
        InputStream inputStreamOpen = context.getAssets().open("bookmarks.html");
        G.o(inputStreamOpen, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
        try {
            String strM = kotlin.io.u.m(bufferedReader);
            bufferedReader.close();
            return strM;
        } finally {
        }
    }
}
