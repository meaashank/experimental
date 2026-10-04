package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.E;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FitWindowsFrameLayout extends FrameLayout implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E.a f85970a;

    public FitWindowsFrameLayout(@NonNull Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.E
    public void a(E.a aVar) {
        this.f85970a = aVar;
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        E.a aVar = this.f85970a;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
