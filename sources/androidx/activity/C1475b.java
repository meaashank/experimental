package androidx.activity;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T(26)
public final class C1475b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1475b f84915a = new C1475b();

    public final void a(@NotNull Activity activity, @NotNull Rect rect) {
        activity.setPictureInPictureParams(new PictureInPictureParams.Builder().setSourceRectHint(rect).build());
    }
}
