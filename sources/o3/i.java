package o3;

import B0.C0920d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import e.InterfaceC4346u;
import h.C4472a;
import l.C5128d;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f223213a = true;

    public static Drawable a(Context context, @InterfaceC4346u int i10, @Nullable Resources.Theme theme) {
        return c(context, context, i10, theme);
    }

    public static Drawable b(Context context, Context context2, @InterfaceC4346u int i10) {
        return c(context, context2, i10, null);
    }

    public static Drawable c(Context context, Context context2, @InterfaceC4346u int i10, @Nullable Resources.Theme theme) {
        try {
            if (f223213a) {
                return e(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return C0920d.getDrawable(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f223213a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i10, theme);
    }

    public static Drawable d(Context context, @InterfaceC4346u int i10, @Nullable Resources.Theme theme) {
        return D0.i.g(context.getResources(), i10, theme);
    }

    public static Drawable e(Context context, @InterfaceC4346u int i10, @Nullable Resources.Theme theme) {
        if (theme != null) {
            C5128d c5128d = new C5128d(context, theme);
            c5128d.a(theme.getResources().getConfiguration());
            context = c5128d;
        }
        return C4472a.b(context, i10);
    }
}
