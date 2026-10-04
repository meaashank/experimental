package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1760g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f93570a = "androidx.compose.foundation.text.inlineContent";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f93571b = "�";

    public static final void a(@NotNull AnnotatedString.Builder builder, @NotNull String str, @NotNull String str2) {
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("alternateText can't be an empty string.");
        }
        builder.pushStringAnnotation(f93570a, str);
        builder.append(str2);
        builder.pop();
    }

    public static /* synthetic */ void b(AnnotatedString.Builder builder, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = f93571b;
        }
        a(builder, str, str2);
    }
}
