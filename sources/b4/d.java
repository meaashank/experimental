package B4;

import B4.e;
import D0.i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.cookiegames.smartcookie.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    @Nullable
    public static final Drawable a(@NotNull Context context, @NotNull e sslState) {
        G.p(context, "<this>");
        G.p(sslState, "sslState");
        if (sslState instanceof e.b) {
            return i.g(context.getResources(), p.h.f144039b5, context.getTheme());
        }
        if (sslState instanceof e.c) {
            return i.g(context.getResources(), p.h.f144210v4, context.getTheme());
        }
        if (sslState instanceof e.a) {
            return i.g(context.getResources(), p.h.f144048c5, context.getTheme());
        }
        throw new NoWhenBranchMatchedException();
    }
}
