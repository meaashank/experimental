package com.android.launcher3.dragndrop;

import android.content.ComponentName;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.android.launcher3.DragSource;
import com.android.launcher3.DropTarget;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherState;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.accessibility.DragViewStateAnnouncer;
import com.android.launcher3.dragndrop.DragDriver;
import com.android.launcher3.dragndrop.DragOptions;
import com.android.launcher3.util.ItemInfoMatcher;
import com.android.launcher3.util.TouchController;
import com.android.launcher3.util.UiThreadHelper;
import com.app.hider.master.promax.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class DragController implements DragDriver.EventListener, TouchController {
    private static final boolean PROFILE_DRAWING_DURING_DRAG = false;
    private DropTarget.DragObject mDragObject;
    private FlingToDeleteHelper mFlingToDeleteHelper;
    private boolean mIsInPreDrag;
    private DropTarget mLastDropTarget;
    Launcher mLauncher;
    private int mMotionDownX;
    private int mMotionDownY;
    private View mMoveTarget;
    private DragOptions mOptions;
    private IBinder mWindowToken;
    private Rect mRectTemp = new Rect();
    private final int[] mCoordinatesTemp = new int[2];
    private DragDriver mDragDriver = null;
    private ArrayList<DropTarget> mDropTargets = new ArrayList<>();
    private ArrayList<DragListener> mListeners = new ArrayList<>();
    int[] mLastTouch = new int[2];
    long mLastTouchUpTime = -1;
    int mDistanceSinceScroll = 0;
    private int[] mTmpPoint = new int[2];
    private Rect mDragLayerRect = new Rect();

    public interface DragListener {
        void onDragEnd();

        void onDragStart(DropTarget.DragObject dragObject, DragOptions dragOptions);
    }

    public DragController(Launcher launcher) {
        this.mLauncher = launcher;
        this.mFlingToDeleteHelper = new FlingToDeleteHelper(launcher);
    }

    private void callOnDragEnd() {
        DragOptions.PreDragCondition preDragCondition;
        int i10 = 0;
        if (this.mIsInPreDrag && (preDragCondition = this.mOptions.preDragCondition) != null) {
            preDragCondition.onPreDragEnd(this.mDragObject, false);
        }
        this.mIsInPreDrag = false;
        this.mOptions = null;
        ArrayList arrayList = new ArrayList(this.mListeners);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((DragListener) obj).onDragEnd();
        }
    }

    private void callOnDragStart() {
        DragOptions.PreDragCondition preDragCondition = this.mOptions.preDragCondition;
        if (preDragCondition != null) {
            preDragCondition.onPreDragEnd(this.mDragObject, true);
        }
        int i10 = 0;
        this.mIsInPreDrag = false;
        ArrayList arrayList = new ArrayList(this.mListeners);
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((DragListener) obj).onDragStart(this.mDragObject, this.mOptions);
        }
    }

    private void checkTouchMove(DropTarget dropTarget) {
        if (dropTarget != null) {
            DropTarget dropTarget2 = this.mLastDropTarget;
            if (dropTarget2 != dropTarget) {
                if (dropTarget2 != null) {
                    dropTarget2.onDragExit(this.mDragObject);
                }
                dropTarget.onDragEnter(this.mDragObject);
            }
            dropTarget.onDragOver(this.mDragObject);
        } else {
            DropTarget dropTarget3 = this.mLastDropTarget;
            if (dropTarget3 != null) {
                dropTarget3.onDragExit(this.mDragObject);
            }
        }
        this.mLastDropTarget = dropTarget;
    }

    private void dispatchDropComplete(View view, boolean z10) {
        if (!z10) {
            this.mLauncher.getStateManager().goToState(LauncherState.NORMAL, 500L);
            this.mDragObject.deferDragViewCleanupPostAnimation = false;
        }
        DropTarget.DragObject dragObject = this.mDragObject;
        dragObject.dragSource.onDropCompleted(view, dragObject, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void drop(DropTarget dropTarget, Runnable runnable) {
        int[] iArr = this.mCoordinatesTemp;
        DropTarget.DragObject dragObject = this.mDragObject;
        boolean z10 = false;
        dragObject.f136870x = iArr[0];
        dragObject.f136871y = iArr[1];
        DropTarget dropTarget2 = this.mLastDropTarget;
        if (dropTarget != dropTarget2) {
            if (dropTarget2 != null) {
                dropTarget2.onDragExit(dragObject);
            }
            this.mLastDropTarget = dropTarget;
            if (dropTarget != 0) {
                dropTarget.onDragEnter(this.mDragObject);
            }
        }
        DropTarget.DragObject dragObject2 = this.mDragObject;
        dragObject2.dragComplete = true;
        if (this.mIsInPreDrag) {
            if (dropTarget != 0) {
                dropTarget.onDragExit(dragObject2);
                return;
            }
            return;
        }
        if (dropTarget != 0) {
            dropTarget.onDragExit(dragObject2);
            if (dropTarget.acceptDrop(this.mDragObject)) {
                if (runnable != null) {
                    runnable.run();
                } else {
                    dropTarget.onDrop(this.mDragObject, this.mOptions);
                }
                z10 = true;
            }
        }
        View view = dropTarget instanceof View ? (View) dropTarget : null;
        this.mLauncher.getUserEventDispatcher().logDragNDrop(this.mDragObject, view);
        dispatchDropComplete(view, z10);
    }

    private void endDrag() {
        boolean z10;
        if (isDragging()) {
            this.mDragDriver = null;
            DropTarget.DragObject dragObject = this.mDragObject;
            DragView dragView = dragObject.dragView;
            if (dragView != null) {
                z10 = dragObject.deferDragViewCleanupPostAnimation;
                if (!z10) {
                    dragView.remove();
                } else if (this.mIsInPreDrag) {
                    animateDragViewToOriginalPosition(null, null, -1);
                }
                this.mDragObject.dragView = null;
            } else {
                z10 = false;
            }
            if (!z10) {
                callOnDragEnd();
            }
        }
        this.mFlingToDeleteHelper.releaseVelocityTracker();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropTarget findDropTarget(int i10, int i11, int[] iArr) {
        DropTarget.DragObject dragObject = this.mDragObject;
        dragObject.f136870x = i10;
        dragObject.f136871y = i11;
        Rect rect = this.mRectTemp;
        ArrayList<DropTarget> arrayList = this.mDropTargets;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DropTarget dropTarget = arrayList.get(size);
            if (dropTarget.isDropEnabled()) {
                dropTarget.getHitRectRelativeToDragLayer(rect);
                if (rect.contains(i10, i11)) {
                    iArr[0] = i10;
                    iArr[1] = i11;
                    this.mLauncher.getDragLayer().mapCoordInSelfToDescendant((View) dropTarget, iArr);
                    return dropTarget;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
        this.mLauncher.getDragLayer().mapCoordInSelfToDescendant(this.mLauncher.getWorkspace(), iArr);
        return this.mLauncher.getWorkspace();
    }

    private int[] getClampedDragLayerPos(float f10, float f11) {
        this.mLauncher.getDragLayer().getLocalVisibleRect(this.mDragLayerRect);
        int[] iArr = this.mTmpPoint;
        Rect rect = this.mDragLayerRect;
        iArr[0] = (int) Math.max(rect.left, Math.min(f10, rect.right - 1));
        int[] iArr2 = this.mTmpPoint;
        Rect rect2 = this.mDragLayerRect;
        iArr2[1] = (int) Math.max(rect2.top, Math.min(f11, rect2.bottom - 1));
        return this.mTmpPoint;
    }

    private void handleMoveEvent(int i10, int i11) {
        DragOptions.PreDragCondition preDragCondition;
        this.mDragObject.dragView.move(i10, i11);
        int[] iArr = this.mCoordinatesTemp;
        DropTarget dropTargetFindDropTarget = findDropTarget(i10, i11, iArr);
        DropTarget.DragObject dragObject = this.mDragObject;
        dragObject.f136870x = iArr[0];
        dragObject.f136871y = iArr[1];
        checkTouchMove(dropTargetFindDropTarget);
        double d10 = this.mDistanceSinceScroll;
        int[] iArr2 = this.mLastTouch;
        int iHypot = (int) (Math.hypot(iArr2[0] - i10, iArr2[1] - i11) + d10);
        this.mDistanceSinceScroll = iHypot;
        int[] iArr3 = this.mLastTouch;
        iArr3[0] = i10;
        iArr3[1] = i11;
        if (this.mIsInPreDrag && (preDragCondition = this.mOptions.preDragCondition) != null && preDragCondition.shouldStartDrag(iHypot)) {
            callOnDragStart();
        }
    }

    public void addDragListener(DragListener dragListener) {
        this.mListeners.add(dragListener);
    }

    public void addDropTarget(DropTarget dropTarget) {
        this.mDropTargets.add(dropTarget);
    }

    public void animateDragViewToOriginalPosition(final Runnable runnable, final View view, int i10) {
        this.mDragObject.dragView.animateTo(this.mMotionDownX, this.mMotionDownY, new Runnable() { // from class: com.android.launcher3.dragndrop.DragController.1
            @Override // java.lang.Runnable
            public void run() {
                View view2 = view;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }, i10);
    }

    public void cancelDrag() {
        if (isDragging()) {
            DropTarget dropTarget = this.mLastDropTarget;
            if (dropTarget != null) {
                dropTarget.onDragExit(this.mDragObject);
            }
            DropTarget.DragObject dragObject = this.mDragObject;
            dragObject.deferDragViewCleanupPostAnimation = false;
            dragObject.cancelled = true;
            dragObject.dragComplete = true;
            if (!this.mIsInPreDrag) {
                dispatchDropComplete(null, false);
            }
        }
        endDrag();
    }

    public void completeAccessibleDrag(int[] iArr) {
        int[] iArr2 = this.mCoordinatesTemp;
        DropTarget dropTargetFindDropTarget = findDropTarget(iArr[0], iArr[1], iArr2);
        DropTarget.DragObject dragObject = this.mDragObject;
        dragObject.f136870x = iArr2[0];
        dragObject.f136871y = iArr2[1];
        checkTouchMove(dropTargetFindDropTarget);
        dropTargetFindDropTarget.prepareAccessibilityDrop();
        drop(dropTargetFindDropTarget, null);
        endDrag();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.mDragDriver != null;
    }

    public boolean dispatchUnhandledMove(View view, int i10) {
        View view2 = this.mMoveTarget;
        return view2 != null && view2.dispatchUnhandledMove(view, i10);
    }

    public void forceTouchMove() {
        int[] iArr = this.mCoordinatesTemp;
        int[] iArr2 = this.mLastTouch;
        DropTarget dropTargetFindDropTarget = findDropTarget(iArr2[0], iArr2[1], iArr);
        DropTarget.DragObject dragObject = this.mDragObject;
        dragObject.f136870x = iArr[0];
        dragObject.f136871y = iArr[1];
        checkTouchMove(dropTargetFindDropTarget);
    }

    public float getDistanceDragged() {
        return this.mDistanceSinceScroll;
    }

    public long getLastGestureUpTime() {
        return this.mDragDriver != null ? System.currentTimeMillis() : this.mLastTouchUpTime;
    }

    public boolean isDragging() {
        if (this.mDragDriver != null) {
            return true;
        }
        DragOptions dragOptions = this.mOptions;
        return dragOptions != null && dragOptions.isAccessibleDrag;
    }

    public void onAppsRemoved(ItemInfoMatcher itemInfoMatcher) {
        ComponentName targetComponent;
        DropTarget.DragObject dragObject = this.mDragObject;
        if (dragObject != null) {
            ItemInfo itemInfo = dragObject.dragInfo;
            if ((itemInfo instanceof ShortcutInfo) && (targetComponent = itemInfo.getTargetComponent()) != null && itemInfoMatcher.matches(itemInfo, targetComponent)) {
                cancelDrag();
            }
        }
    }

    @Override // com.android.launcher3.util.TouchController
    public boolean onControllerInterceptTouchEvent(MotionEvent motionEvent) {
        DragOptions dragOptions = this.mOptions;
        if (dragOptions == null || !dragOptions.isAccessibleDrag) {
            this.mFlingToDeleteHelper.recordMotionEvent(motionEvent);
            int action = motionEvent.getAction();
            int[] clampedDragLayerPos = getClampedDragLayerPos(motionEvent.getX(), motionEvent.getY());
            int i10 = clampedDragLayerPos[0];
            int i11 = clampedDragLayerPos[1];
            if (action == 0) {
                this.mMotionDownX = i10;
                this.mMotionDownY = i11;
            } else if (action == 1) {
                this.mLastTouchUpTime = System.currentTimeMillis();
            }
            DragDriver dragDriver = this.mDragDriver;
            if (dragDriver != null && dragDriver.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.android.launcher3.util.TouchController
    public boolean onControllerTouchEvent(MotionEvent motionEvent) {
        DragOptions dragOptions;
        if (this.mDragDriver == null || (dragOptions = this.mOptions) == null || dragOptions.isAccessibleDrag) {
            return false;
        }
        this.mFlingToDeleteHelper.recordMotionEvent(motionEvent);
        int action = motionEvent.getAction();
        int[] clampedDragLayerPos = getClampedDragLayerPos(motionEvent.getX(), motionEvent.getY());
        int i10 = clampedDragLayerPos[0];
        int i11 = clampedDragLayerPos[1];
        if (action == 0) {
            this.mMotionDownX = i10;
            this.mMotionDownY = i11;
        }
        return this.mDragDriver.onTouchEvent(motionEvent);
    }

    public void onDeferredEndDrag(DragView dragView) {
        dragView.remove();
        if (this.mDragObject.deferDragViewCleanupPostAnimation) {
            callOnDragEnd();
        }
    }

    public boolean onDragEvent(long j10, DragEvent dragEvent) {
        this.mFlingToDeleteHelper.recordDragEvent(j10, dragEvent);
        DragDriver dragDriver = this.mDragDriver;
        return dragDriver != null && dragDriver.onDragEvent(dragEvent);
    }

    public void onDragViewAnimationEnd() {
    }

    @Override // com.android.launcher3.dragndrop.DragDriver.EventListener
    public void onDriverDragCancel() {
        cancelDrag();
    }

    @Override // com.android.launcher3.dragndrop.DragDriver.EventListener
    public void onDriverDragEnd(float f10, float f11) {
        Runnable flingAnimation = this.mFlingToDeleteHelper.getFlingAnimation(this.mDragObject);
        drop(flingAnimation != null ? this.mFlingToDeleteHelper.getDropTarget() : findDropTarget((int) f10, (int) f11, this.mCoordinatesTemp), flingAnimation);
        endDrag();
    }

    @Override // com.android.launcher3.dragndrop.DragDriver.EventListener
    public void onDriverDragExitWindow() {
        DropTarget dropTarget = this.mLastDropTarget;
        if (dropTarget != null) {
            dropTarget.onDragExit(this.mDragObject);
            this.mLastDropTarget = null;
        }
    }

    @Override // com.android.launcher3.dragndrop.DragDriver.EventListener
    public void onDriverDragMove(float f10, float f11) {
        int[] clampedDragLayerPos = getClampedDragLayerPos(f10, f11);
        handleMoveEvent(clampedDragLayerPos[0], clampedDragLayerPos[1]);
    }

    public void prepareAccessibleDrag(int i10, int i11) {
        this.mMotionDownX = i10;
        this.mMotionDownY = i11;
    }

    public void removeDragListener(DragListener dragListener) {
        this.mListeners.remove(dragListener);
    }

    public void removeDropTarget(DropTarget dropTarget) {
        this.mDropTargets.remove(dropTarget);
    }

    public void resetLastGestureUpTime() {
        this.mLastTouchUpTime = -1L;
    }

    public void setMoveTarget(View view) {
        this.mMoveTarget = view;
    }

    public void setWindowToken(IBinder iBinder) {
        this.mWindowToken = iBinder;
    }

    public DragView startDrag(Bitmap bitmap, int i10, int i11, DragSource dragSource, ItemInfo itemInfo, Point point, Rect rect, float f10, float f11, DragOptions dragOptions) {
        char c10;
        UiThreadHelper.hideKeyboardAsync(this.mLauncher, this.mWindowToken);
        this.mOptions = dragOptions;
        Point point2 = dragOptions.systemDndStartPoint;
        if (point2 != null) {
            this.mMotionDownX = point2.x;
            this.mMotionDownY = point2.y;
        }
        int i12 = this.mMotionDownX - i10;
        int i13 = this.mMotionDownY - i11;
        int i14 = rect == null ? 0 : rect.left;
        int i15 = rect == null ? 0 : rect.top;
        this.mLastDropTarget = null;
        this.mDragObject = new DropTarget.DragObject();
        DragOptions.PreDragCondition preDragCondition = dragOptions.preDragCondition;
        this.mIsInPreDrag = (preDragCondition == null || preDragCondition.shouldStartDrag(0.0d)) ? false : true;
        float dimensionPixelSize = this.mIsInPreDrag ? this.mLauncher.getResources().getDimensionPixelSize(R.dimen.pre_drag_view_scale) : 0.0f;
        DropTarget.DragObject dragObject = this.mDragObject;
        DragView dragView = new DragView(this.mLauncher, bitmap, i12, i13, f10, f11, dimensionPixelSize);
        dragObject.dragView = dragView;
        dragView.setItemInfo(itemInfo);
        DropTarget.DragObject dragObject2 = this.mDragObject;
        dragObject2.dragComplete = false;
        if (this.mOptions.isAccessibleDrag) {
            dragObject2.xOffset = bitmap.getWidth() / 2;
            this.mDragObject.yOffset = bitmap.getHeight() / 2;
            c10 = 1;
            this.mDragObject.accessibleDrag = true;
        } else {
            c10 = 1;
            dragObject2.xOffset = this.mMotionDownX - (i10 + i14);
            dragObject2.yOffset = this.mMotionDownY - (i11 + i15);
            dragObject2.stateAnnouncer = DragViewStateAnnouncer.createFor(dragView);
            this.mDragDriver = DragDriver.create(this.mLauncher, this, this.mDragObject, this.mOptions);
        }
        DropTarget.DragObject dragObject3 = this.mDragObject;
        dragObject3.dragSource = dragSource;
        dragObject3.dragInfo = itemInfo;
        dragObject3.originalDragInfo = new ItemInfo();
        this.mDragObject.originalDragInfo.copyFrom(itemInfo);
        if (point != null) {
            dragView.setDragVisualizeOffset(new Point(point));
        }
        if (rect != null) {
            dragView.setDragRegion(new Rect(rect));
        }
        this.mLauncher.getDragLayer().performHapticFeedback(0);
        dragView.show(this.mMotionDownX, this.mMotionDownY);
        this.mDistanceSinceScroll = 0;
        if (this.mIsInPreDrag) {
            DragOptions.PreDragCondition preDragCondition2 = this.mOptions.preDragCondition;
            if (preDragCondition2 != null) {
                preDragCondition2.onPreDragStart(this.mDragObject);
            }
        } else {
            callOnDragStart();
        }
        int[] iArr = this.mLastTouch;
        int i16 = this.mMotionDownX;
        iArr[0] = i16;
        int i17 = this.mMotionDownY;
        iArr[c10] = i17;
        handleMoveEvent(i16, i17);
        this.mLauncher.getUserEventDispatcher().resetActionDurationMillis();
        return dragView;
    }
}
