package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface s {
    @Nullable
    PorterDuff.Mode a();

    @Nullable
    ColorStateList b();

    void c(@Nullable PorterDuff.Mode mode);

    void d(@Nullable ColorStateList colorStateList);
}
