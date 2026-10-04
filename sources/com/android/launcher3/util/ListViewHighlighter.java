package com.android.launcher3.util;

import G0.C1162y;
import android.R;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes2.dex */
public class ListViewHighlighter implements AbsListView.OnScrollListener, AbsListView.RecyclerListener, View.OnLayoutChangeListener {
    private boolean mColorAnimated = false;
    private final ListView mListView;
    private int mPosHighlight;

    public ListViewHighlighter(ListView listView, int i10) {
        this.mListView = listView;
        this.mPosHighlight = i10;
        listView.setOnScrollListener(this);
        listView.setRecyclerListener(this);
        listView.addOnLayoutChangeListener(this);
        listView.post(new c(this));
    }

    private ColorDrawable getHighlightBackground() {
        int iD = C1162y.D(Themes.getAttrColor(this.mListView.getContext(), R.attr.colorAccent), 26);
        if (this.mColorAnimated) {
            return new ColorDrawable(iD);
        }
        this.mColorAnimated = true;
        ColorDrawable colorDrawable = new ColorDrawable(-1);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(colorDrawable, "color", -1, iD);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        objectAnimatorOfInt.setDuration(200L);
        objectAnimatorOfInt.setRepeatMode(2);
        objectAnimatorOfInt.setRepeatCount(4);
        objectAnimatorOfInt.start();
        return colorDrawable;
    }

    private boolean highlightIfVisible(int i10, int i11) {
        int i12;
        if (this.mPosHighlight < 0 || this.mListView.getChildCount() == 0 || i10 > (i12 = this.mPosHighlight) || i12 > i11) {
            return false;
        }
        highlightView(this.mListView.getChildAt(i12 - i10));
        this.mListView.setOnScrollListener(null);
        this.mListView.removeOnLayoutChangeListener(this);
        this.mPosHighlight = -1;
        return true;
    }

    private void highlightView(final View view) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(view.getTag(com.app.hider.master.promax.R.id.view_highlighted))) {
            return;
        }
        view.setTag(com.app.hider.master.promax.R.id.view_highlighted, bool);
        view.setTag(com.app.hider.master.promax.R.id.view_unhighlight_background, view.getBackground());
        view.setBackground(getHighlightBackground());
        view.postDelayed(new Runnable() { // from class: com.android.launcher3.util.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f136989a.lambda$highlightView$0(view);
            }
        }, 15000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryHighlight() {
        if (this.mPosHighlight < 0 || this.mListView.getChildCount() == 0 || highlightIfVisible(this.mListView.getFirstVisiblePosition(), this.mListView.getLastVisiblePosition())) {
            return;
        }
        this.mListView.smoothScrollToPosition(this.mPosHighlight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: unhighlightView, reason: merged with bridge method [inline-methods] */
    public void lambda$highlightView$0(View view) {
        if (Boolean.TRUE.equals(view.getTag(com.app.hider.master.promax.R.id.view_highlighted))) {
            Object tag = view.getTag(com.app.hider.master.promax.R.id.view_unhighlight_background);
            if (tag instanceof Drawable) {
                view.setBackground((Drawable) tag);
            }
            view.setTag(com.app.hider.master.promax.R.id.view_unhighlight_background, null);
            view.setTag(com.app.hider.master.promax.R.id.view_highlighted, Boolean.FALSE);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.mListView.post(new c(this));
    }

    @Override // android.widget.AbsListView.RecyclerListener
    public void onMovedToScrapHeap(View view) {
        lambda$highlightView$0(view);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        highlightIfVisible(i10, i11 + i10);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
