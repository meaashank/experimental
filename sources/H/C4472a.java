package h;

import B0.C0920d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.J;
import e.InterfaceC4339m;
import e.InterfaceC4346u;

/* JADX INFO: renamed from: h.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class C4472a {
    public static ColorStateList a(@NonNull Context context, @InterfaceC4339m int i10) {
        return C0920d.getColorStateList(context, i10);
    }

    @Nullable
    public static Drawable b(@NonNull Context context, @InterfaceC4346u int i10) {
        return J.h().j(context, i10);
    }
}
