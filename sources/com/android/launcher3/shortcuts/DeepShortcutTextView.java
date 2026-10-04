package com.android.launcher3.shortcuts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Toast;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.Utilities;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class DeepShortcutTextView extends BubbleTextView {
    private final Rect mDragHandleBounds;
    private final int mDragHandleWidth;
    private Toast mInstructionToast;
    private boolean mShowInstructionToast;

    public DeepShortcutTextView(Context context) {
        this(context, null, 0);
    }

    private void showToast() {
        Toast toast = this.mInstructionToast;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(getContext(), Utilities.wrapForTts(getContext().getText(R.string.long_press_shortcut_to_add), getContext().getString(R.string.long_accessible_way_to_add_shortcut)), 0);
        this.mInstructionToast = toastMakeText;
        toastMakeText.show();
    }

    @Override // com.android.launcher3.BubbleTextView
    public void applyCompoundDrawables(Drawable drawable) {
    }

    @Override // com.android.launcher3.BubbleTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.mDragHandleBounds.set(0, 0, this.mDragHandleWidth, getMeasuredHeight());
        if (Utilities.isRtl(getResources())) {
            return;
        }
        this.mDragHandleBounds.offset(getMeasuredWidth() - this.mDragHandleBounds.width(), 0);
    }

    @Override // com.android.launcher3.BubbleTextView, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mShowInstructionToast = this.mDragHandleBounds.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (!this.mShowInstructionToast) {
            return super.performClick();
        }
        showToast();
        return true;
    }

    public DeepShortcutTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DeepShortcutTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mDragHandleBounds = new Rect();
        this.mShowInstructionToast = false;
        Resources resources = getResources();
        this.mDragHandleWidth = (resources.getDimensionPixelSize(R.dimen.deep_shortcut_drawable_padding) / 2) + resources.getDimensionPixelSize(R.dimen.deep_shortcut_drag_handle_size) + resources.getDimensionPixelSize(R.dimen.popup_padding_end);
    }
}
