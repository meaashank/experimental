package ga;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: ga.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4465a extends FrameLayout {
    public C4465a(Context context) {
        super(context);
        setMinimumHeight(1);
        setImportantForAccessibility(2);
    }

    public void a(boolean z10) {
        int iRound = z10 ? Math.round(getResources().getDisplayMetrics().density * 12.0f) : 0;
        setMinimumHeight(!z10 ? 1 : 0);
        setPadding(0, iRound, 0, 0);
        setImportantForAccessibility(z10 ? 0 : 2);
        requestLayout();
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -2);
    }
}
