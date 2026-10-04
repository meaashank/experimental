package com.android.launcher3.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.launcher3.BubbleTextView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetsRowViewHolder extends RecyclerView.C {
    public final ViewGroup cellContainer;
    public final BubbleTextView title;

    public WidgetsRowViewHolder(ViewGroup viewGroup) {
        super(viewGroup);
        this.cellContainer = (ViewGroup) viewGroup.findViewById(R.id.widgets_cell_list);
        BubbleTextView bubbleTextView = (BubbleTextView) viewGroup.findViewById(R.id.section);
        this.title = bubbleTextView;
        bubbleTextView.setAccessibilityDelegate(null);
    }
}
