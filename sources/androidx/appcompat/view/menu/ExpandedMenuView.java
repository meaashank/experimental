package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.W;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements h.b, p, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f85502c = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f85503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85504b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.h.b
    public boolean a(k kVar) {
        return this.f85503a.performItemAction(kVar, 0);
    }

    @Override // androidx.appcompat.view.menu.p
    public int getWindowAnimations() {
        return this.f85504b;
    }

    @Override // androidx.appcompat.view.menu.p
    public void initialize(h hVar) {
        this.f85503a = hVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        a((k) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        W wG = W.G(context, attributeSet, f85502c, i10, 0);
        if (wG.f86249b.hasValue(0)) {
            setBackgroundDrawable(wG.h(0));
        }
        if (wG.f86249b.hasValue(1)) {
            setDivider(wG.h(1));
        }
        wG.I();
    }
}
