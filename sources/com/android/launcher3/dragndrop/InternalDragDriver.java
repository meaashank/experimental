package com.android.launcher3.dragndrop;

import android.view.DragEvent;

/* JADX INFO: loaded from: classes2.dex */
class InternalDragDriver extends DragDriver {
    public InternalDragDriver(DragController dragController) {
        super(dragController);
    }

    @Override // com.android.launcher3.dragndrop.DragDriver
    public boolean onDragEvent(DragEvent dragEvent) {
        return false;
    }
}
