package com.android.launcher3.dragndrop;

import android.content.Context;
import android.view.DragEvent;
import android.view.MotionEvent;
import com.android.launcher3.DropTarget;
import com.android.launcher3.Utilities;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DragDriver {
    protected final EventListener mEventListener;

    public interface EventListener {
        void onDriverDragCancel();

        void onDriverDragEnd(float f10, float f11);

        void onDriverDragExitWindow();

        void onDriverDragMove(float f10, float f11);
    }

    public DragDriver(EventListener eventListener) {
        this.mEventListener = eventListener;
    }

    public static DragDriver create(Context context, DragController dragController, DropTarget.DragObject dragObject, DragOptions dragOptions) {
        return (!Utilities.ATLEAST_NOUGAT || dragOptions.systemDndStartPoint == null) ? new InternalDragDriver((EventListener) dragController) : new SystemDragDriver(dragController, context, dragObject);
    }

    public abstract boolean onDragEvent(DragEvent dragEvent);

    public void onDragViewAnimationEnd() {
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1) {
            this.mEventListener.onDriverDragEnd(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action != 3) {
            return true;
        }
        this.mEventListener.onDriverDragCancel();
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1) {
            this.mEventListener.onDriverDragMove(motionEvent.getX(), motionEvent.getY());
            this.mEventListener.onDriverDragEnd(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action == 2) {
            this.mEventListener.onDriverDragMove(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        if (action != 3) {
            return true;
        }
        this.mEventListener.onDriverDragCancel();
        return true;
    }
}
