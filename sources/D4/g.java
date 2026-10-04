package d4;

import B0.C0920d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.widget.Toast;
import e.InterfaceC4337k;
import e.InterfaceC4339m;
import e.InterfaceC4342p;
import e.InterfaceC4346u;
import e.Z;
import java.util.Locale;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    @InterfaceC4337k
    public static final int a(@NotNull Context context, @InterfaceC4339m int i10) {
        G.p(context, "<this>");
        return C0920d.getColor(context, i10);
    }

    public static final int b(@NotNull Context context, @InterfaceC4342p int i10) {
        G.p(context, "<this>");
        return context.getResources().getDimensionPixelSize(i10);
    }

    @NotNull
    public static final Drawable c(@NotNull Context context, @InterfaceC4346u int i10) {
        G.p(context, "<this>");
        Drawable drawable = C0920d.getDrawable(context, i10);
        G.m(drawable);
        return drawable;
    }

    @NotNull
    public static final LayoutInflater d(@NotNull Context context) {
        G.p(context, "<this>");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        G.o(layoutInflaterFrom, "from(...)");
        return layoutInflaterFrom;
    }

    @NotNull
    public static final Locale e(@NotNull Context context) {
        G.p(context, "<this>");
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            G.m(locale);
            return locale;
        }
        Locale locale2 = context.getResources().getConfiguration().locale;
        G.m(locale2);
        return locale2;
    }

    public static final void f(@NotNull Context context, @Z int i10) {
        G.p(context, "<this>");
        Toast.makeText(context, i10, 0).show();
    }
}
