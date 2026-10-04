package com.android.launcher3.keyboard;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.launcher3.keyboard.FocusIndicatorHelper;

/* JADX INFO: loaded from: classes2.dex */
public class FocusedItemDecorator extends RecyclerView.n {
    private FocusIndicatorHelper mHelper;

    public FocusedItemDecorator(View view) {
        this.mHelper = new FocusIndicatorHelper.SimpleFocusIndicatorHelper(view);
    }

    public View.OnFocusChangeListener getFocusListener() {
        return this.mHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        this.mHelper.draw(canvas);
    }
}
