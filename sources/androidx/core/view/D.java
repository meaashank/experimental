package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f111485a;

    public D(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a() {
        return this.f111485a.isLongpressEnabled();
    }

    public boolean b(@NonNull MotionEvent motionEvent) {
        return this.f111485a.onTouchEvent(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void c(boolean z10) {
        this.f111485a.setIsLongpressEnabled(z10);
    }

    public void d(@Nullable GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f111485a.setOnDoubleTapListener(onDoubleTapListener);
    }

    public D(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener, @Nullable Handler handler) {
        this.f111485a = new GestureDetector(context, onGestureListener, handler);
    }
}
