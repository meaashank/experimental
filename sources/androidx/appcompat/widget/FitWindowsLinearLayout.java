package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.E;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FitWindowsLinearLayout extends LinearLayout implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E.a f85971a;

    public FitWindowsLinearLayout(@NonNull Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.E
    public void a(E.a aVar) {
        this.f85971a = aVar;
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        E.a aVar = this.f85971a;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
