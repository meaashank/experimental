package com.android.launcher3.keyboard;

import android.graphics.Rect;
import android.view.View;
import com.android.launcher3.PagedView;

/* JADX INFO: loaded from: classes2.dex */
public class ViewGroupFocusHelper extends FocusIndicatorHelper {
    private final View mContainer;

    public ViewGroupFocusHelper(View view) {
        super(view);
        this.mContainer = view;
    }

    private void computeLocationRelativeToContainer(View view, Rect rect) {
        View view2 = (View) view.getParent();
        rect.left = (int) (view.getX() + rect.left);
        rect.top = (int) (view.getY() + rect.top);
        if (view2 != this.mContainer) {
            if (view2 instanceof PagedView) {
                PagedView pagedView = (PagedView) view2;
                rect.left -= pagedView.getScrollForPage(pagedView.indexOfChild(view));
            }
            computeLocationRelativeToContainer(view2, rect);
        }
    }

    @Override // com.android.launcher3.keyboard.FocusIndicatorHelper
    public void viewToRect(View view, Rect rect) {
        rect.left = 0;
        rect.top = 0;
        computeLocationRelativeToContainer(view, rect);
        rect.left = (int) ((((1.0f - view.getScaleX()) * view.getWidth()) / 2.0f) + rect.left);
        rect.top = (int) ((((1.0f - view.getScaleY()) * view.getHeight()) / 2.0f) + rect.top);
        rect.right = rect.left + ((int) (view.getScaleX() * view.getWidth()));
        rect.bottom = rect.top + ((int) (view.getScaleY() * view.getHeight()));
    }
}
