package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f85951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f85952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f85953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f85954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f85955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f85956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f85957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f85958h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue b() {
        if (this.f85955e == null) {
            this.f85955e = new TypedValue();
        }
        return this.f85955e;
    }

    public TypedValue c() {
        if (this.f85956f == null) {
            this.f85956f = new TypedValue();
        }
        return this.f85956f;
    }

    public TypedValue d() {
        if (this.f85953c == null) {
            this.f85953c = new TypedValue();
        }
        return this.f85953c;
    }

    public TypedValue e() {
        if (this.f85954d == null) {
            this.f85954d = new TypedValue();
        }
        return this.f85954d;
    }

    public TypedValue f() {
        if (this.f85951a == null) {
            this.f85951a = new TypedValue();
        }
        return this.f85951a;
    }

    public TypedValue g() {
        if (this.f85952b == null) {
            this.f85952b = new TypedValue();
        }
        return this.f85952b;
    }

    public void h(a aVar) {
        this.f85958h = aVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void i(int i10, int i11, int i12, int i13) {
        this.f85957g.set(i10, i11, i12, i13);
        if (C2507z0.Y0(this)) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f85958h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f85957g = new Rect();
    }
}
