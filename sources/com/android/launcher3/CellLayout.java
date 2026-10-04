package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.C2507z0;
import androidx.datastore.preferences.protobuf.C2538n;
import com.android.launcher3.DropTarget;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.accessibility.DragAndDropAccessibilityDelegate;
import com.android.launcher3.accessibility.DragViewStateAnnouncer;
import com.android.launcher3.accessibility.FolderAccessibilityHelper;
import com.android.launcher3.accessibility.WorkspaceAccessibilityHelper;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.anim.PropertyListBuilder;
import com.android.launcher3.folder.PreviewBackground;
import com.android.launcher3.graphics.DragPreviewProvider;
import com.android.launcher3.util.CellAndSpan;
import com.android.launcher3.util.GridOccupancy;
import com.android.launcher3.util.ParcelableSparseArray;
import com.android.launcher3.util.Themes;
import com.android.launcher3.widget.LauncherAppWidgetHostView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public class CellLayout extends ViewGroup {
    private static final boolean DEBUG_VISUALIZE_OCCUPIED = false;
    private static final boolean DESTRUCTIVE_REORDER = false;
    public static final int FOLDER = 2;
    public static final int FOLDER_ACCESSIBILITY_DRAG = 1;
    public static final int HOTSEAT = 1;
    private static final int INVALID_DIRECTION = -100;
    private static final boolean LOGD = false;
    public static final int MODE_ACCEPT_DROP = 4;
    public static final int MODE_DRAG_OVER = 1;
    public static final int MODE_ON_DROP = 2;
    public static final int MODE_ON_DROP_EXTERNAL = 3;
    public static final int MODE_SHOW_REORDER_HINT = 0;
    private static final int REORDER_ANIMATION_DURATION = 150;
    private static final float REORDER_PREVIEW_MAGNITUDE = 0.12f;
    private static final String TAG = "CellLayout";
    public static final int WORKSPACE = 0;
    public static final int WORKSPACE_ACCESSIBILITY_DRAG = 2;
    private final Drawable mBackground;

    @ViewDebug.ExportedProperty(category = "launcher")
    int mCellHeight;

    @ViewDebug.ExportedProperty(category = "launcher")
    int mCellWidth;
    private final float mChildScale;
    private final int mContainerType;

    @ViewDebug.ExportedProperty(category = "launcher")
    private int mCountX;

    @ViewDebug.ExportedProperty(category = "launcher")
    private int mCountY;
    private final int[] mDirectionVector;
    private final int[] mDragCell;
    final float[] mDragOutlineAlphas;
    private final InterruptibleInOutAnimator[] mDragOutlineAnims;
    private int mDragOutlineCurrent;
    private final Paint mDragOutlinePaint;
    final Rect[] mDragOutlines;
    private boolean mDragging;
    private boolean mDropPending;
    private final TimeInterpolator mEaseOutInterpolator;
    private int mFixedCellHeight;
    private int mFixedCellWidth;
    private int mFixedHeight;
    private int mFixedWidth;
    private final ArrayList<PreviewBackground> mFolderBackgrounds;
    final PreviewBackground mFolderLeaveBehind;
    private View.OnTouchListener mInterceptTouchListener;
    private final ArrayList<View> mIntersectingViews;
    private boolean mIsDragOverlapping;
    private boolean mItemPlacementDirty;
    private final Launcher mLauncher;
    private GridOccupancy mOccupied;
    private final Rect mOccupiedRect;
    final int[] mPreviousReorderDirection;
    final ArrayMap<LayoutParams, Animator> mReorderAnimators;
    final float mReorderPreviewAnimationMagnitude;
    final ArrayMap<View, ReorderPreviewAnimation> mShakeAnimators;
    private final ShortcutAndWidgetContainer mShortcutsAndWidgets;
    private final StylusEventHelper mStylusEventHelper;
    final int[] mTempLocation;
    private final Rect mTempRect;
    private final Stack<Rect> mTempRectStack;
    private GridOccupancy mTmpOccupied;
    final int[] mTmpPoint;
    private DragAndDropAccessibilityDelegate mTouchHelper;
    private boolean mUseTouchHelper;
    private static final int[] BACKGROUND_STATE_ACTIVE = {android.R.attr.state_active};
    private static final int[] BACKGROUND_STATE_DEFAULT = ViewGroup.EMPTY_STATE_SET;
    private static final Paint sPaint = new Paint();

    public static final class CellInfo extends CellAndSpan {
        public final View cell;
        final long container;
        final long screenId;

        public CellInfo(View view, ItemInfo itemInfo) {
            this.cellX = itemInfo.cellX;
            this.cellY = itemInfo.cellY;
            this.spanX = itemInfo.spanX;
            this.spanY = itemInfo.spanY;
            this.cell = view;
            this.screenId = itemInfo.screenId;
            this.container = itemInfo.container;
        }

        @Override // com.android.launcher3.util.CellAndSpan
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Cell[view=");
            View view = this.cell;
            sb2.append(view == null ? "null" : view.getClass());
            sb2.append(", x=");
            sb2.append(this.cellX);
            sb2.append(", y=");
            return android.support.v4.media.d.a(sb2, this.cellY, "]");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ContainerType {
    }

    public static class ItemConfiguration extends CellAndSpan {
        ArrayList<View> intersectingViews;
        boolean isSolution;
        final ArrayMap<View, CellAndSpan> map;
        private final ArrayMap<View, CellAndSpan> savedMap;
        final ArrayList<View> sortedViews;

        public void add(View view, CellAndSpan cellAndSpan) {
            this.map.put(view, cellAndSpan);
            this.savedMap.put(view, new CellAndSpan());
            this.sortedViews.add(view);
        }

        public int area() {
            return this.spanX * this.spanY;
        }

        public void getBoundingRectForViews(ArrayList<View> arrayList, Rect rect) {
            int size = arrayList.size();
            boolean z10 = true;
            int i10 = 0;
            while (i10 < size) {
                View view = arrayList.get(i10);
                i10++;
                CellAndSpan cellAndSpan = this.map.get(view);
                if (z10) {
                    int i11 = cellAndSpan.cellX;
                    int i12 = cellAndSpan.cellY;
                    rect.set(i11, i12, cellAndSpan.spanX + i11, cellAndSpan.spanY + i12);
                    z10 = false;
                } else {
                    int i13 = cellAndSpan.cellX;
                    int i14 = cellAndSpan.cellY;
                    rect.union(i13, i14, cellAndSpan.spanX + i13, cellAndSpan.spanY + i14);
                }
            }
        }

        public void restore() {
            for (View view : this.savedMap.keySet()) {
                this.map.get(view).copyFrom(this.savedMap.get(view));
            }
        }

        public void save() {
            for (View view : this.map.keySet()) {
                this.savedMap.get(view).copyFrom(this.map.get(view));
            }
        }

        private ItemConfiguration() {
            this.map = new ArrayMap<>();
            this.savedMap = new ArrayMap<>();
            this.sortedViews = new ArrayList<>();
            this.isSolution = false;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public boolean canReorder;

        @ViewDebug.ExportedProperty
        public int cellHSpan;

        @ViewDebug.ExportedProperty
        public int cellVSpan;

        @ViewDebug.ExportedProperty
        public int cellX;

        @ViewDebug.ExportedProperty
        public int cellY;
        boolean dropped;
        public boolean isLockedToGrid;
        public int tmpCellX;
        public int tmpCellY;
        public boolean useTmpCoords;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f136867x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f136868y;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.isLockedToGrid = true;
            this.canReorder = true;
            this.cellHSpan = 1;
            this.cellVSpan = 1;
        }

        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        public int getX() {
            return this.f136867x;
        }

        public int getY() {
            return this.f136868y;
        }

        public void setHeight(int i10) {
            ((ViewGroup.MarginLayoutParams) this).height = i10;
        }

        public void setWidth(int i10) {
            ((ViewGroup.MarginLayoutParams) this).width = i10;
        }

        public void setX(int i10) {
            this.f136867x = i10;
        }

        public void setY(int i10) {
            this.f136868y = i10;
        }

        public void setup(int i10, int i11, boolean z10, int i12) {
            setup(i10, i11, z10, i12, 1.0f, 1.0f);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(this.cellX);
            sb2.append(U6.j.f68738d);
            return android.support.v4.media.d.a(sb2, this.cellY, ")");
        }

        public void setup(int i10, int i11, boolean z10, int i12, float f10, float f11) {
            if (this.isLockedToGrid) {
                int i13 = this.cellHSpan;
                int i14 = this.cellVSpan;
                boolean z11 = this.useTmpCoords;
                int i15 = z11 ? this.tmpCellX : this.cellX;
                int i16 = z11 ? this.tmpCellY : this.cellY;
                if (z10) {
                    i15 = (i12 - i15) - i13;
                }
                int i17 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
                ((ViewGroup.MarginLayoutParams) this).width = (int) ((((i13 * i10) / f10) - i17) - ((ViewGroup.MarginLayoutParams) this).rightMargin);
                int i18 = ((ViewGroup.MarginLayoutParams) this).topMargin;
                ((ViewGroup.MarginLayoutParams) this).height = (int) ((((i14 * i11) / f11) - i18) - ((ViewGroup.MarginLayoutParams) this).bottomMargin);
                this.f136867x = (i15 * i10) + i17;
                this.f136868y = (i16 * i11) + i18;
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.isLockedToGrid = true;
            this.canReorder = true;
            this.cellHSpan = 1;
            this.cellVSpan = 1;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.isLockedToGrid = true;
            this.canReorder = true;
            this.cellX = layoutParams.cellX;
            this.cellY = layoutParams.cellY;
            this.cellHSpan = layoutParams.cellHSpan;
            this.cellVSpan = layoutParams.cellVSpan;
        }

        public LayoutParams(int i10, int i11, int i12, int i13) {
            super(-1, -1);
            this.isLockedToGrid = true;
            this.canReorder = true;
            this.cellX = i10;
            this.cellY = i11;
            this.cellHSpan = i12;
            this.cellVSpan = i13;
        }
    }

    public class ReorderPreviewAnimation {
        private static final float CHILD_DIVIDEND = 4.0f;
        private static final int HINT_DURATION = 650;
        public static final int MODE_HINT = 0;
        public static final int MODE_PREVIEW = 1;
        private static final int PREVIEW_DURATION = 300;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Animator f136869a;
        final View child;
        float finalDeltaX;
        float finalDeltaY;
        final float finalScale;
        float initDeltaX;
        float initDeltaY;
        float initScale;
        final int mode;
        boolean repeating = false;

        public ReorderPreviewAnimation(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            CellLayout.this.regionToCenterPoint(i11, i12, i15, i16, CellLayout.this.mTmpPoint);
            int[] iArr = CellLayout.this.mTmpPoint;
            int i17 = iArr[0];
            int i18 = iArr[1];
            CellLayout.this.regionToCenterPoint(i13, i14, i15, i16, iArr);
            int[] iArr2 = CellLayout.this.mTmpPoint;
            int i19 = iArr2[0] - i17;
            int i20 = iArr2[1] - i18;
            this.child = view;
            this.mode = i10;
            setInitialAnimationValues(false);
            this.finalScale = (1.0f - (4.0f / view.getWidth())) * this.initScale;
            float f10 = this.initDeltaX;
            this.finalDeltaX = f10;
            float f11 = this.initDeltaY;
            this.finalDeltaY = f11;
            int i21 = i10 == 0 ? -1 : 1;
            if (i19 == i20 && i19 == 0) {
                return;
            }
            if (i20 == 0) {
                this.finalDeltaX = (Math.signum(i19) * (-i21) * CellLayout.this.mReorderPreviewAnimationMagnitude) + f10;
                return;
            }
            if (i19 == 0) {
                this.finalDeltaY = (Math.signum(i20) * (-i21) * CellLayout.this.mReorderPreviewAnimationMagnitude) + f11;
                return;
            }
            float f12 = i20;
            float f13 = i19;
            double dAtan = Math.atan(f12 / f13);
            float f14 = -i21;
            this.finalDeltaX += (int) (Math.abs(Math.cos(dAtan) * ((double) CellLayout.this.mReorderPreviewAnimationMagnitude)) * ((double) (Math.signum(f13) * f14)));
            this.finalDeltaY += (int) (Math.abs(Math.sin(dAtan) * ((double) CellLayout.this.mReorderPreviewAnimationMagnitude)) * ((double) (Math.signum(f12) * f14)));
        }

        private void cancel() {
            Animator animator = this.f136869a;
            if (animator != null) {
                animator.cancel();
            }
        }

        public void animate() {
            boolean z10 = this.finalDeltaX == this.initDeltaX && this.finalDeltaY == this.initDeltaY;
            if (CellLayout.this.mShakeAnimators.containsKey(this.child)) {
                CellLayout.this.mShakeAnimators.get(this.child).cancel();
                CellLayout.this.mShakeAnimators.remove(this.child);
                if (z10) {
                    completeAnimationImmediately();
                    return;
                }
            }
            if (z10) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = LauncherAnimUtils.ofFloat(0.0f, 1.0f);
            this.f136869a = valueAnimatorOfFloat;
            if (!Utilities.isPowerSaverPreventingAnimation(CellLayout.this.getContext())) {
                valueAnimatorOfFloat.setRepeatMode(2);
                valueAnimatorOfFloat.setRepeatCount(-1);
            }
            valueAnimatorOfFloat.setDuration(this.mode == 0 ? 650L : 300L);
            valueAnimatorOfFloat.setStartDelay((int) (Math.random() * 60.0d));
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.launcher3.CellLayout.ReorderPreviewAnimation.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    ReorderPreviewAnimation reorderPreviewAnimation = ReorderPreviewAnimation.this;
                    float f10 = (reorderPreviewAnimation.mode == 0 && reorderPreviewAnimation.repeating) ? 1.0f : fFloatValue;
                    float f11 = 1.0f - f10;
                    float f12 = (reorderPreviewAnimation.initDeltaX * f11) + (reorderPreviewAnimation.finalDeltaX * f10);
                    float f13 = (f11 * reorderPreviewAnimation.initDeltaY) + (f10 * reorderPreviewAnimation.finalDeltaY);
                    reorderPreviewAnimation.child.setTranslationX(f12);
                    ReorderPreviewAnimation.this.child.setTranslationY(f13);
                    ReorderPreviewAnimation reorderPreviewAnimation2 = ReorderPreviewAnimation.this;
                    float f14 = ((1.0f - fFloatValue) * reorderPreviewAnimation2.initScale) + (reorderPreviewAnimation2.finalScale * fFloatValue);
                    reorderPreviewAnimation2.child.setScaleX(f14);
                    ReorderPreviewAnimation.this.child.setScaleY(f14);
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.CellLayout.ReorderPreviewAnimation.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    ReorderPreviewAnimation.this.setInitialAnimationValues(true);
                    ReorderPreviewAnimation.this.repeating = true;
                }
            });
            CellLayout.this.mShakeAnimators.put(this.child, this);
            valueAnimatorOfFloat.start();
        }

        public void completeAnimationImmediately() {
            Animator animator = this.f136869a;
            if (animator != null) {
                animator.cancel();
            }
            setInitialAnimationValues(true);
            ObjectAnimator duration = LauncherAnimUtils.ofPropertyValuesHolder(this.child, new PropertyListBuilder().scale(this.initScale).translationX(this.initDeltaX).translationY(this.initDeltaY).build()).setDuration(150L);
            this.f136869a = duration;
            duration.setInterpolator(new DecelerateInterpolator(1.5f));
            this.f136869a.start();
        }

        public void setInitialAnimationValues(boolean z10) {
            if (!z10) {
                this.initScale = this.child.getScaleX();
                this.initDeltaX = this.child.getTranslationX();
                this.initDeltaY = this.child.getTranslationY();
                return;
            }
            View view = this.child;
            if (!(view instanceof LauncherAppWidgetHostView)) {
                this.initScale = 1.0f;
                this.initDeltaX = 0.0f;
                this.initDeltaY = 0.0f;
            } else {
                LauncherAppWidgetHostView launcherAppWidgetHostView = (LauncherAppWidgetHostView) view;
                this.initScale = launcherAppWidgetHostView.getScaleToFit();
                this.initDeltaX = launcherAppWidgetHostView.getTranslationForCentering().x;
                this.initDeltaY = launcherAppWidgetHostView.getTranslationForCentering().y;
            }
        }
    }

    public class ViewCluster {
        static final int BOTTOM = 8;
        static final int LEFT = 1;
        static final int RIGHT = 4;
        static final int TOP = 2;
        final int[] bottomEdge;
        boolean boundingRectDirty;
        final ItemConfiguration config;
        int dirtyEdges;
        final int[] leftEdge;
        final int[] rightEdge;
        final int[] topEdge;
        final ArrayList<View> views;
        final Rect boundingRect = new Rect();
        final PositionComparator comparator = new PositionComparator();

        public class PositionComparator implements Comparator<View> {
            int whichEdge = 0;

            public PositionComparator() {
            }

            @Override // java.util.Comparator
            public int compare(View view, View view2) {
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                CellAndSpan cellAndSpan = ViewCluster.this.config.map.get(view);
                CellAndSpan cellAndSpan2 = ViewCluster.this.config.map.get(view2);
                int i15 = this.whichEdge;
                if (i15 == 1) {
                    i10 = cellAndSpan2.cellX + cellAndSpan2.spanX;
                    i11 = cellAndSpan.cellX;
                    i12 = cellAndSpan.spanX;
                } else {
                    if (i15 != 2) {
                        if (i15 != 4) {
                            i13 = cellAndSpan.cellY;
                            i14 = cellAndSpan2.cellY;
                        } else {
                            i13 = cellAndSpan.cellX;
                            i14 = cellAndSpan2.cellX;
                        }
                        return i13 - i14;
                    }
                    i10 = cellAndSpan2.cellY + cellAndSpan2.spanY;
                    i11 = cellAndSpan.cellY;
                    i12 = cellAndSpan.spanY;
                }
                return i10 - (i11 + i12);
            }
        }

        public ViewCluster(ArrayList<View> arrayList, ItemConfiguration itemConfiguration) {
            this.leftEdge = new int[CellLayout.this.mCountY];
            this.rightEdge = new int[CellLayout.this.mCountY];
            this.topEdge = new int[CellLayout.this.mCountX];
            this.bottomEdge = new int[CellLayout.this.mCountX];
            this.views = (ArrayList) arrayList.clone();
            this.config = itemConfiguration;
            resetEdges();
        }

        public void addView(View view) {
            this.views.add(view);
            resetEdges();
        }

        public void computeEdge(int i10) {
            int size = this.views.size();
            for (int i11 = 0; i11 < size; i11++) {
                CellAndSpan cellAndSpan = this.config.map.get(this.views.get(i11));
                if (i10 == 1) {
                    int i12 = cellAndSpan.cellX;
                    for (int i13 = cellAndSpan.cellY; i13 < cellAndSpan.cellY + cellAndSpan.spanY; i13++) {
                        int[] iArr = this.leftEdge;
                        int i14 = iArr[i13];
                        if (i12 < i14 || i14 < 0) {
                            iArr[i13] = i12;
                        }
                    }
                } else if (i10 == 2) {
                    int i15 = cellAndSpan.cellY;
                    for (int i16 = cellAndSpan.cellX; i16 < cellAndSpan.cellX + cellAndSpan.spanX; i16++) {
                        int[] iArr2 = this.topEdge;
                        int i17 = iArr2[i16];
                        if (i15 < i17 || i17 < 0) {
                            iArr2[i16] = i15;
                        }
                    }
                } else if (i10 == 4) {
                    int i18 = cellAndSpan.cellX + cellAndSpan.spanX;
                    for (int i19 = cellAndSpan.cellY; i19 < cellAndSpan.cellY + cellAndSpan.spanY; i19++) {
                        int[] iArr3 = this.rightEdge;
                        if (i18 > iArr3[i19]) {
                            iArr3[i19] = i18;
                        }
                    }
                } else if (i10 == 8) {
                    int i20 = cellAndSpan.cellY + cellAndSpan.spanY;
                    for (int i21 = cellAndSpan.cellX; i21 < cellAndSpan.cellX + cellAndSpan.spanX; i21++) {
                        int[] iArr4 = this.bottomEdge;
                        if (i20 > iArr4[i21]) {
                            iArr4[i21] = i20;
                        }
                    }
                }
            }
        }

        public Rect getBoundingRect() {
            if (this.boundingRectDirty) {
                this.config.getBoundingRectForViews(this.views, this.boundingRect);
            }
            return this.boundingRect;
        }

        public boolean isViewTouchingEdge(View view, int i10) {
            CellAndSpan cellAndSpan = this.config.map.get(view);
            if ((this.dirtyEdges & i10) == i10) {
                computeEdge(i10);
                this.dirtyEdges &= ~i10;
            }
            if (i10 == 1) {
                for (int i11 = cellAndSpan.cellY; i11 < cellAndSpan.cellY + cellAndSpan.spanY; i11++) {
                    if (this.leftEdge[i11] == cellAndSpan.cellX + cellAndSpan.spanX) {
                        return true;
                    }
                }
                return false;
            }
            if (i10 == 2) {
                for (int i12 = cellAndSpan.cellX; i12 < cellAndSpan.cellX + cellAndSpan.spanX; i12++) {
                    if (this.topEdge[i12] == cellAndSpan.cellY + cellAndSpan.spanY) {
                        return true;
                    }
                }
                return false;
            }
            if (i10 == 4) {
                for (int i13 = cellAndSpan.cellY; i13 < cellAndSpan.cellY + cellAndSpan.spanY; i13++) {
                    if (this.rightEdge[i13] == cellAndSpan.cellX) {
                        return true;
                    }
                }
                return false;
            }
            if (i10 != 8) {
                return false;
            }
            for (int i14 = cellAndSpan.cellX; i14 < cellAndSpan.cellX + cellAndSpan.spanX; i14++) {
                if (this.bottomEdge[i14] == cellAndSpan.cellY) {
                    return true;
                }
            }
            return false;
        }

        public void resetEdges() {
            for (int i10 = 0; i10 < CellLayout.this.mCountX; i10++) {
                this.topEdge[i10] = -1;
                this.bottomEdge[i10] = -1;
            }
            for (int i11 = 0; i11 < CellLayout.this.mCountY; i11++) {
                this.leftEdge[i11] = -1;
                this.rightEdge[i11] = -1;
            }
            this.dirtyEdges = 15;
            this.boundingRectDirty = true;
        }

        public void shift(int i10, int i11) {
            ArrayList<View> arrayList = this.views;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                View view = arrayList.get(i12);
                i12++;
                CellAndSpan cellAndSpan = this.config.map.get(view);
                if (i10 == 1) {
                    cellAndSpan.cellX -= i11;
                } else if (i10 == 2) {
                    cellAndSpan.cellY -= i11;
                } else if (i10 != 4) {
                    cellAndSpan.cellY += i11;
                } else {
                    cellAndSpan.cellX += i11;
                }
            }
            resetEdges();
        }

        public void sortConfigurationForEdgePush(int i10) {
            PositionComparator positionComparator = this.comparator;
            positionComparator.whichEdge = i10;
            Collections.sort(this.config.sortedViews, positionComparator);
        }
    }

    public CellLayout(Context context) {
        this(context, null);
    }

    private boolean addViewToTempLocation(View view, Rect rect, int[] iArr, ItemConfiguration itemConfiguration) {
        int i10;
        CellAndSpan cellAndSpan = itemConfiguration.map.get(view);
        boolean z10 = false;
        this.mTmpOccupied.markCells(cellAndSpan, false);
        this.mTmpOccupied.markCells(rect, true);
        findNearestArea(cellAndSpan.cellX, cellAndSpan.cellY, cellAndSpan.spanX, cellAndSpan.spanY, iArr, this.mTmpOccupied.cells, null, this.mTempLocation);
        int[] iArr2 = this.mTempLocation;
        int i11 = iArr2[0];
        if (i11 >= 0 && (i10 = iArr2[1]) >= 0) {
            cellAndSpan.cellX = i11;
            cellAndSpan.cellY = i10;
            z10 = true;
        }
        this.mTmpOccupied.markCells(cellAndSpan, true);
        return z10;
    }

    private boolean addViewsToTempLocation(ArrayList<View> arrayList, Rect rect, int[] iArr, View view, ItemConfiguration itemConfiguration) {
        boolean z10;
        int i10;
        if (arrayList.size() == 0) {
            return true;
        }
        Rect rect2 = new Rect();
        itemConfiguration.getBoundingRectForViews(arrayList, rect2);
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            View view2 = arrayList.get(i12);
            i12++;
            this.mTmpOccupied.markCells(itemConfiguration.map.get(view2), false);
        }
        GridOccupancy gridOccupancy = new GridOccupancy(rect2.width(), rect2.height());
        int i13 = rect2.top;
        int i14 = rect2.left;
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            View view3 = arrayList.get(i15);
            i15++;
            CellAndSpan cellAndSpan = itemConfiguration.map.get(view3);
            gridOccupancy.markCells(cellAndSpan.cellX - i14, cellAndSpan.cellY - i13, cellAndSpan.spanX, cellAndSpan.spanY, true);
        }
        this.mTmpOccupied.markCells(rect, true);
        findNearestArea(rect2.left, rect2.top, rect2.width(), rect2.height(), iArr, this.mTmpOccupied.cells, gridOccupancy.cells, this.mTempLocation);
        int[] iArr2 = this.mTempLocation;
        int i16 = iArr2[0];
        if (i16 < 0 || (i10 = iArr2[1]) < 0) {
            z10 = false;
        } else {
            int i17 = i16 - rect2.left;
            int i18 = i10 - rect2.top;
            int size3 = arrayList.size();
            int i19 = 0;
            while (i19 < size3) {
                View view4 = arrayList.get(i19);
                i19++;
                CellAndSpan cellAndSpan2 = itemConfiguration.map.get(view4);
                cellAndSpan2.cellX += i17;
                cellAndSpan2.cellY += i18;
            }
            z10 = true;
        }
        int size4 = arrayList.size();
        while (i11 < size4) {
            View view5 = arrayList.get(i11);
            i11++;
            this.mTmpOccupied.markCells(itemConfiguration.map.get(view5), true);
        }
        return z10;
    }

    private void animateItemsToSolution(ItemConfiguration itemConfiguration, View view, boolean z10) {
        CellAndSpan cellAndSpan;
        GridOccupancy gridOccupancy = this.mTmpOccupied;
        gridOccupancy.clear();
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.mShortcutsAndWidgets.getChildAt(i10);
            if (childAt != view && (cellAndSpan = itemConfiguration.map.get(childAt)) != null) {
                animateChildToPosition(childAt, cellAndSpan.cellX, cellAndSpan.cellY, 150, 0, false, false);
                gridOccupancy.markCells(cellAndSpan, true);
            }
        }
        if (z10) {
            gridOccupancy.markCells((CellAndSpan) itemConfiguration, true);
        }
    }

    private boolean attemptPushInDirection(ArrayList<View> arrayList, Rect rect, int[] iArr, View view, ItemConfiguration itemConfiguration) {
        if (Math.abs(iArr[1]) + Math.abs(iArr[0]) > 1) {
            int i10 = iArr[1];
            iArr[1] = 0;
            if (pushViewsToTempLocation(arrayList, rect, iArr, view, itemConfiguration)) {
                return true;
            }
            iArr[1] = i10;
            int i11 = iArr[0];
            iArr[0] = 0;
            if (pushViewsToTempLocation(arrayList, rect, iArr, view, itemConfiguration)) {
                return true;
            }
            iArr[0] = i11;
            iArr[0] = i11 * (-1);
            int i12 = iArr[1] * (-1);
            iArr[1] = i12;
            iArr[1] = 0;
            if (pushViewsToTempLocation(arrayList, rect, iArr, view, itemConfiguration)) {
                return true;
            }
            iArr[1] = i12;
            int i13 = iArr[0];
            iArr[0] = 0;
            if (pushViewsToTempLocation(arrayList, rect, iArr, view, itemConfiguration)) {
                return true;
            }
            iArr[0] = i13;
            iArr[0] = i13 * (-1);
            iArr[1] = iArr[1] * (-1);
        } else {
            if (pushViewsToTempLocation(arrayList, rect, iArr, view, itemConfiguration)) {
                return true;
            }
            iArr[0] = iArr[0] * (-1);
            iArr[1] = iArr[1] * (-1);
            if (pushViewsToTempLocation(arrayList, rect, iArr, view, itemConfiguration)) {
                return true;
            }
            int i14 = iArr[0] * (-1);
            iArr[0] = i14;
            int i15 = iArr[1] * (-1);
            iArr[1] = i15;
            iArr[1] = i14;
            iArr[0] = i15;
            if (pushViewsToTempLocation(arrayList, rect, iArr, view, itemConfiguration)) {
                return true;
            }
            iArr[0] = iArr[0] * (-1);
            iArr[1] = iArr[1] * (-1);
            if (pushViewsToTempLocation(arrayList, rect, iArr, view, itemConfiguration)) {
                return true;
            }
            int i16 = iArr[0] * (-1);
            iArr[0] = i16;
            int i17 = iArr[1] * (-1);
            iArr[1] = i17;
            iArr[1] = i16;
            iArr[0] = i17;
        }
        return false;
    }

    private void beginOrAdjustReorderPreviewAnimations(ItemConfiguration itemConfiguration, View view, int i10, int i11) {
        ArrayList<View> arrayList;
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.mShortcutsAndWidgets.getChildAt(i12);
            if (childAt != view) {
                CellAndSpan cellAndSpan = itemConfiguration.map.get(childAt);
                boolean z10 = (i11 != 0 || (arrayList = itemConfiguration.intersectingViews) == null || arrayList.contains(childAt)) ? false : true;
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (cellAndSpan != null && !z10) {
                    new ReorderPreviewAnimation(childAt, i11, layoutParams.cellX, layoutParams.cellY, cellAndSpan.cellX, cellAndSpan.cellY, cellAndSpan.spanX, cellAndSpan.spanY).animate();
                }
            }
        }
    }

    private void commitTempPlacement() {
        int i10;
        this.mTmpOccupied.copyTo(this.mOccupied);
        long idForScreen = this.mLauncher.getWorkspace().getIdForScreen(this);
        if (this.mContainerType == 1) {
            idForScreen = -1;
            i10 = LauncherSettings.Favorites.CONTAINER_HOTSEAT;
        } else {
            i10 = -100;
        }
        long j10 = idForScreen;
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.mShortcutsAndWidgets.getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ItemInfo itemInfo = (ItemInfo) childAt.getTag();
            if (itemInfo != null) {
                int i12 = itemInfo.cellX;
                int i13 = layoutParams.tmpCellX;
                boolean z10 = (i12 == i13 && itemInfo.cellY == layoutParams.tmpCellY && itemInfo.spanX == layoutParams.cellHSpan && itemInfo.spanY == layoutParams.cellVSpan) ? false : true;
                layoutParams.cellX = i13;
                itemInfo.cellX = i13;
                int i14 = layoutParams.tmpCellY;
                layoutParams.cellY = i14;
                itemInfo.cellY = i14;
                itemInfo.spanX = layoutParams.cellHSpan;
                itemInfo.spanY = layoutParams.cellVSpan;
                if (z10) {
                    this.mLauncher.getModelWriter().modifyItemInDatabase(itemInfo, i10, j10, itemInfo.cellX, itemInfo.cellY, itemInfo.spanX, itemInfo.spanY);
                }
            }
        }
    }

    private void completeAndClearReorderPreviewAnimations() {
        Iterator<ReorderPreviewAnimation> it = this.mShakeAnimators.values().iterator();
        while (it.hasNext()) {
            it.next().completeAnimationImmediately();
        }
        this.mShakeAnimators.clear();
    }

    private void computeDirectionVector(float f10, float f11, int[] iArr) {
        double dAtan = Math.atan(f11 / f10);
        iArr[0] = 0;
        iArr[1] = 0;
        if (Math.abs(Math.cos(dAtan)) > 0.5d) {
            iArr[0] = (int) Math.signum(f10);
        }
        if (Math.abs(Math.sin(dAtan)) > 0.5d) {
            iArr[1] = (int) Math.signum(f11);
        }
    }

    private void copyCurrentStateToSolution(ItemConfiguration itemConfiguration, boolean z10) {
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.mShortcutsAndWidgets.getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            itemConfiguration.add(childAt, z10 ? new CellAndSpan(layoutParams.tmpCellX, layoutParams.tmpCellY, layoutParams.cellHSpan, layoutParams.cellVSpan) : new CellAndSpan(layoutParams.cellX, layoutParams.cellY, layoutParams.cellHSpan, layoutParams.cellVSpan));
        }
    }

    private void copySolutionToTempState(ItemConfiguration itemConfiguration, View view) {
        this.mTmpOccupied.clear();
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.mShortcutsAndWidgets.getChildAt(i10);
            if (childAt != view) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                CellAndSpan cellAndSpan = itemConfiguration.map.get(childAt);
                if (cellAndSpan != null) {
                    layoutParams.tmpCellX = cellAndSpan.cellX;
                    layoutParams.tmpCellY = cellAndSpan.cellY;
                    layoutParams.cellHSpan = cellAndSpan.spanX;
                    layoutParams.cellVSpan = cellAndSpan.spanY;
                    this.mTmpOccupied.markCells(cellAndSpan, true);
                }
            }
        }
        this.mTmpOccupied.markCells((CellAndSpan) itemConfiguration, true);
    }

    private ItemConfiguration findConfigurationNoShuffle(int i10, int i11, int i12, int i13, int i14, int i15, View view, ItemConfiguration itemConfiguration) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        findNearestVacantArea(i10, i11, i12, i13, i14, i15, iArr, iArr2);
        if (iArr[0] < 0 || iArr[1] < 0) {
            itemConfiguration.isSolution = false;
            return itemConfiguration;
        }
        copyCurrentStateToSolution(itemConfiguration, false);
        itemConfiguration.cellX = iArr[0];
        itemConfiguration.cellY = iArr[1];
        itemConfiguration.spanX = iArr2[0];
        itemConfiguration.spanY = iArr2[1];
        itemConfiguration.isSolution = true;
        return itemConfiguration;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] findNearestArea(int r26, int r27, int r28, int r29, int r30, int r31, boolean r32, int[] r33, int[] r34) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.CellLayout.findNearestArea(int, int, int, int, int, int, boolean, int[], int[]):int[]");
    }

    private ItemConfiguration findReorderSolution(int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, View view, boolean z10, ItemConfiguration itemConfiguration) {
        copyCurrentStateToSolution(itemConfiguration, false);
        this.mOccupied.copyTo(this.mTmpOccupied);
        int[] iArrFindNearestArea = findNearestArea(i10, i11, i14, i15, new int[2]);
        if (rearrangementExists(iArrFindNearestArea[0], iArrFindNearestArea[1], i14, i15, iArr, view, itemConfiguration)) {
            itemConfiguration.isSolution = true;
            itemConfiguration.cellX = iArrFindNearestArea[0];
            itemConfiguration.cellY = iArrFindNearestArea[1];
            itemConfiguration.spanX = i14;
            itemConfiguration.spanY = i15;
            return itemConfiguration;
        }
        if (i14 > i12 && (i13 == i15 || z10)) {
            return findReorderSolution(i10, i11, i12, i13, i14 - 1, i15, iArr, view, false, itemConfiguration);
        }
        if (i15 > i13) {
            return findReorderSolution(i10, i11, i12, i13, i14, i15 - 1, iArr, view, true, itemConfiguration);
        }
        itemConfiguration.isSolution = false;
        return itemConfiguration;
    }

    private void getDirectionVectorForDrop(int i10, int i11, int i12, int i13, View view, int[] iArr) {
        int[] iArr2 = new int[2];
        findNearestArea(i10, i11, i12, i13, iArr2);
        Rect rect = new Rect();
        regionToRect(iArr2[0], iArr2[1], i12, i13, rect);
        rect.offset(i10 - rect.centerX(), i11 - rect.centerY());
        Rect rect2 = new Rect();
        getViewsIntersectingRegion(iArr2[0], iArr2[1], i12, i13, view, rect2, this.mIntersectingViews);
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        regionToRect(rect2.left, rect2.top, rect2.width(), rect2.height(), rect2);
        int iCenterX = (rect2.centerX() - i10) / i12;
        int iCenterY = (rect2.centerY() - i11) / i13;
        int i14 = this.mCountX;
        if (iWidth == i14 || i12 == i14) {
            iCenterX = 0;
        }
        int i15 = this.mCountY;
        if (iHeight == i15 || i13 == i15) {
            iCenterY = 0;
        }
        if (iCenterX != 0 || iCenterY != 0) {
            computeDirectionVector(iCenterX, iCenterY, iArr);
        } else {
            iArr[0] = 1;
            iArr[1] = 0;
        }
    }

    private ParcelableSparseArray getJailedArray(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(com.app.hider.master.promax.R.id.cell_layout_jail_id);
        return parcelable instanceof ParcelableSparseArray ? (ParcelableSparseArray) parcelable : new ParcelableSparseArray();
    }

    private void getViewsIntersectingRegion(int i10, int i11, int i12, int i13, View view, Rect rect, ArrayList<View> arrayList) {
        if (rect != null) {
            rect.set(i10, i11, i10 + i12, i11 + i13);
        }
        arrayList.clear();
        Rect rect2 = new Rect(i10, i11, i12 + i10, i13 + i11);
        Rect rect3 = new Rect();
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = this.mShortcutsAndWidgets.getChildAt(i14);
            if (childAt != view) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i15 = layoutParams.cellX;
                int i16 = layoutParams.cellY;
                rect3.set(i15, i16, layoutParams.cellHSpan + i15, layoutParams.cellVSpan + i16);
                if (Rect.intersects(rect2, rect3)) {
                    this.mIntersectingViews.add(childAt);
                    if (rect != null) {
                        rect.union(rect3);
                    }
                }
            }
        }
    }

    private void lazyInitTempRectStack() {
        if (this.mTempRectStack.isEmpty()) {
            for (int i10 = 0; i10 < this.mCountX * this.mCountY; i10++) {
                this.mTempRectStack.push(new Rect());
            }
        }
    }

    private boolean pushViewsToTempLocation(ArrayList<View> arrayList, Rect rect, int[] iArr, View view, ItemConfiguration itemConfiguration) {
        int i10;
        int i11;
        boolean z10;
        ViewCluster viewCluster = new ViewCluster(arrayList, itemConfiguration);
        Rect boundingRect = viewCluster.getBoundingRect();
        int i12 = 0;
        int i13 = iArr[0];
        if (i13 < 0) {
            i10 = boundingRect.right - rect.left;
            i11 = 1;
        } else if (i13 > 0) {
            i10 = rect.right - boundingRect.left;
            i11 = 4;
        } else if (iArr[1] < 0) {
            i10 = boundingRect.bottom - rect.top;
            i11 = 2;
        } else {
            i10 = rect.bottom - boundingRect.top;
            i11 = 8;
        }
        if (i10 <= 0) {
            return false;
        }
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            View view2 = arrayList.get(i14);
            i14++;
            this.mTmpOccupied.markCells(itemConfiguration.map.get(view2), false);
        }
        itemConfiguration.save();
        viewCluster.sortConfigurationForEdgePush(i11);
        boolean z11 = false;
        while (i10 > 0 && !z11) {
            ArrayList<View> arrayList2 = itemConfiguration.sortedViews;
            int size2 = arrayList2.size();
            int i15 = 0;
            while (true) {
                if (i15 < size2) {
                    View view3 = arrayList2.get(i15);
                    i15++;
                    View view4 = view3;
                    if (!viewCluster.views.contains(view4) && view4 != view && viewCluster.isViewTouchingEdge(view4, i11)) {
                        if (!((LayoutParams) view4.getLayoutParams()).canReorder) {
                            z11 = true;
                            break;
                        }
                        viewCluster.addView(view4);
                        this.mTmpOccupied.markCells(itemConfiguration.map.get(view4), false);
                    }
                }
            }
            i10--;
            viewCluster.shift(i11, 1);
        }
        Rect boundingRect2 = viewCluster.getBoundingRect();
        if (z11 || boundingRect2.left < 0 || boundingRect2.right > this.mCountX || boundingRect2.top < 0 || boundingRect2.bottom > this.mCountY) {
            itemConfiguration.restore();
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList<View> arrayList3 = viewCluster.views;
        int size3 = arrayList3.size();
        while (i12 < size3) {
            View view5 = arrayList3.get(i12);
            i12++;
            this.mTmpOccupied.markCells(itemConfiguration.map.get(view5), true);
        }
        return z10;
    }

    private boolean rearrangementExists(int i10, int i11, int i12, int i13, int[] iArr, View view, ItemConfiguration itemConfiguration) {
        CellAndSpan cellAndSpan;
        if (i10 < 0 || i11 < 0) {
            return false;
        }
        this.mIntersectingViews.clear();
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        this.mOccupiedRect.set(i10, i11, i14, i15);
        if (view != null && (cellAndSpan = itemConfiguration.map.get(view)) != null) {
            cellAndSpan.cellX = i10;
            cellAndSpan.cellY = i11;
        }
        Rect rect = new Rect(i10, i11, i14, i15);
        Rect rect2 = new Rect();
        for (View view2 : itemConfiguration.map.keySet()) {
            if (view2 != view) {
                CellAndSpan cellAndSpan2 = itemConfiguration.map.get(view2);
                LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                int i16 = cellAndSpan2.cellX;
                int i17 = cellAndSpan2.cellY;
                rect2.set(i16, i17, cellAndSpan2.spanX + i16, cellAndSpan2.spanY + i17);
                if (!Rect.intersects(rect, rect2)) {
                    continue;
                } else {
                    if (!layoutParams.canReorder) {
                        return false;
                    }
                    this.mIntersectingViews.add(view2);
                }
            }
        }
        itemConfiguration.intersectingViews = new ArrayList<>(this.mIntersectingViews);
        if (attemptPushInDirection(this.mIntersectingViews, this.mOccupiedRect, iArr, view, itemConfiguration) || addViewsToTempLocation(this.mIntersectingViews, this.mOccupiedRect, iArr, view, itemConfiguration)) {
            return true;
        }
        ArrayList<View> arrayList = this.mIntersectingViews;
        int size = arrayList.size();
        int i18 = 0;
        while (i18 < size) {
            View view3 = arrayList.get(i18);
            i18++;
            if (!addViewToTempLocation(view3, this.mOccupiedRect, iArr, itemConfiguration)) {
                return false;
            }
        }
        return true;
    }

    private void recycleTempRects(Stack<Rect> stack) {
        while (!stack.isEmpty()) {
            this.mTempRectStack.push(stack.pop());
        }
    }

    private void setUseTempCoords(boolean z10) {
        int childCount = this.mShortcutsAndWidgets.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((LayoutParams) this.mShortcutsAndWidgets.getChildAt(i10).getLayoutParams()).useTmpCoords = z10;
        }
    }

    public boolean acceptsWidget() {
        return this.mContainerType == 0;
    }

    public void addFolderBackground(PreviewBackground previewBackground) {
        this.mFolderBackgrounds.add(previewBackground);
    }

    public boolean addViewToCellLayout(View view, int i10, int i11, LayoutParams layoutParams, boolean z10) {
        int i12;
        if (view instanceof BubbleTextView) {
            ((BubbleTextView) view).setTextVisibility(this.mContainerType != 1);
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        int i13 = layoutParams.cellX;
        if (i13 >= 0) {
            int i14 = this.mCountX;
            if (i13 <= i14 - 1 && (i12 = layoutParams.cellY) >= 0) {
                int i15 = this.mCountY;
                if (i12 <= i15 - 1) {
                    if (layoutParams.cellHSpan < 0) {
                        layoutParams.cellHSpan = i14;
                    }
                    if (layoutParams.cellVSpan < 0) {
                        layoutParams.cellVSpan = i15;
                    }
                    view.setId(i11);
                    this.mShortcutsAndWidgets.addView(view, i10, layoutParams);
                    if (z10) {
                        markCellsAsOccupiedForView(view);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public boolean animateChildToPosition(final View view, int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        int i14;
        int i15;
        ShortcutAndWidgetContainer shortcutsAndWidgets = getShortcutsAndWidgets();
        if (shortcutsAndWidgets.indexOfChild(view) == -1) {
            return false;
        }
        final LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        ItemInfo itemInfo = (ItemInfo) view.getTag();
        if (this.mReorderAnimators.containsKey(layoutParams)) {
            this.mReorderAnimators.get(layoutParams).cancel();
            this.mReorderAnimators.remove(layoutParams);
        }
        final int i16 = layoutParams.f136867x;
        final int i17 = layoutParams.f136868y;
        if (z11) {
            GridOccupancy gridOccupancy = z10 ? this.mOccupied : this.mTmpOccupied;
            gridOccupancy.markCells(layoutParams.cellX, layoutParams.cellY, layoutParams.cellHSpan, layoutParams.cellVSpan, false);
            i14 = i10;
            i15 = i11;
            gridOccupancy.markCells(i14, i15, layoutParams.cellHSpan, layoutParams.cellVSpan, true);
        } else {
            i14 = i10;
            i15 = i11;
        }
        layoutParams.isLockedToGrid = true;
        if (z10) {
            itemInfo.cellX = i14;
            layoutParams.cellX = i14;
            itemInfo.cellY = i15;
            layoutParams.cellY = i15;
        } else {
            layoutParams.tmpCellX = i14;
            layoutParams.tmpCellY = i15;
        }
        shortcutsAndWidgets.setupLp(view);
        layoutParams.isLockedToGrid = false;
        final int i18 = layoutParams.f136867x;
        final int i19 = layoutParams.f136868y;
        layoutParams.f136867x = i16;
        layoutParams.f136868y = i17;
        if (i16 == i18 && i17 == i19) {
            layoutParams.isLockedToGrid = true;
            return true;
        }
        ValueAnimator valueAnimatorOfFloat = LauncherAnimUtils.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(i12);
        this.mReorderAnimators.put(layoutParams, valueAnimatorOfFloat);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.launcher3.CellLayout.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LayoutParams layoutParams2 = layoutParams;
                float f10 = 1.0f - fFloatValue;
                layoutParams2.f136867x = (int) ((i18 * fFloatValue) + (i16 * f10));
                layoutParams2.f136868y = (int) ((fFloatValue * i19) + (f10 * i17));
                view.requestLayout();
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.CellLayout.4
            boolean cancelled = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.cancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!this.cancelled) {
                    layoutParams.isLockedToGrid = true;
                    view.requestLayout();
                }
                if (CellLayout.this.mReorderAnimators.containsKey(layoutParams)) {
                    CellLayout.this.mReorderAnimators.remove(layoutParams);
                }
            }
        });
        valueAnimatorOfFloat.setStartDelay(i13);
        valueAnimatorOfFloat.start();
        return true;
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).cancelLongPress();
        }
    }

    public void cellToCenterPoint(int i10, int i11, int[] iArr) {
        regionToCenterPoint(i10, i11, 1, 1, iArr);
    }

    public void cellToPoint(int i10, int i11, int[] iArr) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        iArr[0] = (i10 * this.mCellWidth) + paddingLeft;
        iArr[1] = (i11 * this.mCellHeight) + paddingTop;
    }

    public void cellToRect(int i10, int i11, int i12, int i13, Rect rect) {
        int i14 = this.mCellWidth;
        int i15 = this.mCellHeight;
        int paddingLeft = (i10 * i14) + getPaddingLeft();
        int paddingTop = (i11 * i15) + getPaddingTop();
        rect.set(paddingLeft, paddingTop, (i12 * i14) + paddingLeft, (i13 * i15) + paddingTop);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void clearDragOutlines() {
        this.mDragOutlineAnims[this.mDragOutlineCurrent].animateOut();
        int[] iArr = this.mDragCell;
        iArr[1] = -1;
        iArr[0] = -1;
    }

    public void clearFolderLeaveBehind() {
        PreviewBackground previewBackground = this.mFolderLeaveBehind;
        previewBackground.delegateCellX = -1;
        previewBackground.delegateCellY = -1;
        invalidate();
    }

    public boolean createAreaForResize(int i10, int i11, int i12, int i13, View view, int[] iArr, boolean z10) {
        int[] iArr2 = new int[2];
        regionToCenterPoint(i10, i11, i12, i13, iArr2);
        ItemConfiguration itemConfigurationFindReorderSolution = findReorderSolution(iArr2[0], iArr2[1], i12, i13, i12, i13, iArr, view, true, new ItemConfiguration());
        setUseTempCoords(true);
        if (itemConfigurationFindReorderSolution != null && itemConfigurationFindReorderSolution.isSolution) {
            copySolutionToTempState(itemConfigurationFindReorderSolution, view);
            setItemPlacementDirty(true);
            animateItemsToSolution(itemConfigurationFindReorderSolution, view, z10);
            if (z10) {
                commitTempPlacement();
                completeAndClearReorderPreviewAnimations();
                setItemPlacementDirty(false);
            } else {
                beginOrAdjustReorderPreviewAnimations(itemConfigurationFindReorderSolution, view, 150, 1);
            }
            this.mShortcutsAndWidgets.requestLayout();
        }
        return itemConfigurationFindReorderSolution.isSolution;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        for (int i10 = 0; i10 < this.mFolderBackgrounds.size(); i10++) {
            PreviewBackground previewBackground = this.mFolderBackgrounds.get(i10);
            if (previewBackground.isClipping) {
                cellToPoint(previewBackground.delegateCellX, previewBackground.delegateCellY, this.mTempLocation);
                canvas.save();
                int[] iArr = this.mTempLocation;
                canvas.translate(iArr[0], iArr[1]);
                previewBackground.drawBackgroundStroke(canvas);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.mUseTouchHelper && this.mTouchHelper.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        super.dispatchRestoreInstanceState(getJailedArray(sparseArray));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        ParcelableSparseArray jailedArray = getJailedArray(sparseArray);
        super.dispatchSaveInstanceState(jailedArray);
        sparseArray.put(com.app.hider.master.promax.R.id.cell_layout_jail_id, jailedArray);
    }

    public void enableAccessibleDrag(boolean z10, int i10) {
        this.mUseTouchHelper = z10;
        if (z10) {
            if (i10 == 2 && !(this.mTouchHelper instanceof WorkspaceAccessibilityHelper)) {
                this.mTouchHelper = new WorkspaceAccessibilityHelper(this);
            } else if (i10 == 1 && !(this.mTouchHelper instanceof FolderAccessibilityHelper)) {
                this.mTouchHelper = new FolderAccessibilityHelper(this);
            }
            C2507z0.G1(this, this.mTouchHelper);
            setImportantForAccessibility(1);
            getShortcutsAndWidgets().setImportantForAccessibility(1);
            setOnClickListener(this.mTouchHelper);
        } else {
            C2507z0.G1(this, null);
            setImportantForAccessibility(2);
            getShortcutsAndWidgets().setImportantForAccessibility(2);
            setOnClickListener(null);
        }
        if (getParent() != null) {
            getParent().notifySubtreeAccessibilityStateChanged(this, this, 1);
        }
    }

    public void enableHardwareLayer(boolean z10) {
        this.mShortcutsAndWidgets.setLayerType(z10 ? 2 : 0, sPaint);
    }

    public boolean existsEmptyCell() {
        return findCellForSpan(null, 1, 1);
    }

    public boolean findCellForSpan(int[] iArr, int i10, int i11) {
        if (iArr == null) {
            iArr = new int[2];
        }
        return this.mOccupied.findVacantCell(iArr, i10, i11);
    }

    public int[] findNearestVacantArea(int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2) {
        return findNearestArea(i10, i11, i12, i13, i14, i15, true, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCellHeight() {
        return this.mCellHeight;
    }

    public int getCellWidth() {
        return this.mCellWidth;
    }

    public View getChildAt(int i10, int i11) {
        return this.mShortcutsAndWidgets.getChildAt(i10, i11);
    }

    public int getCountX() {
        return this.mCountX;
    }

    public int getCountY() {
        return this.mCountY;
    }

    public int getDesiredHeight() {
        return (this.mCountY * this.mCellHeight) + getPaddingBottom() + getPaddingTop();
    }

    public int getDesiredWidth() {
        return (this.mCountX * this.mCellWidth) + getPaddingRight() + getPaddingLeft();
    }

    public float getDistanceFromCell(float f10, float f11, int[] iArr) {
        cellToCenterPoint(iArr[0], iArr[1], this.mTmpPoint);
        int[] iArr2 = this.mTmpPoint;
        return (float) Math.hypot(f10 - iArr2[0], f11 - iArr2[1]);
    }

    public boolean getIsDragOverlapping() {
        return this.mIsDragOverlapping;
    }

    @SuppressLint({"StringFormatMatches"})
    public String getItemMoveDescription(int i10, int i11) {
        return this.mContainerType == 1 ? getContext().getString(com.app.hider.master.promax.R.string.move_to_hotseat_position, Integer.valueOf(Math.max(i10, i11) + 1)) : getContext().getString(com.app.hider.master.promax.R.string.move_to_empty_cell, Integer.valueOf(i11 + 1), Integer.valueOf(i10 + 1));
    }

    public Drawable getScrimBackground() {
        return this.mBackground;
    }

    public ShortcutAndWidgetContainer getShortcutsAndWidgets() {
        return this.mShortcutsAndWidgets;
    }

    public int getUnusedHorizontalSpace() {
        return ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - (this.mCountX * this.mCellWidth);
    }

    public boolean hasReorderSolution(ItemInfo itemInfo) {
        CellLayout cellLayout = this;
        int[] iArr = new int[2];
        int i10 = 0;
        while (i10 < cellLayout.getCountX()) {
            int i11 = 0;
            while (i11 < cellLayout.getCountY()) {
                cellLayout.cellToPoint(i10, i11, iArr);
                if (cellLayout.findReorderSolution(iArr[0], iArr[1], itemInfo.minSpanX, itemInfo.minSpanY, itemInfo.spanX, itemInfo.spanY, cellLayout.mDirectionVector, null, true, new ItemConfiguration()).isSolution) {
                    return true;
                }
                i11++;
                cellLayout = this;
            }
            i10++;
            cellLayout = this;
        }
        return false;
    }

    public boolean isDropPending() {
        return this.mDropPending;
    }

    public boolean isItemPlacementDirty() {
        return this.mItemPlacementDirty;
    }

    public boolean isNearestDropLocationOccupied(int i10, int i11, int i12, int i13, View view, int[] iArr) {
        int[] iArrFindNearestArea = findNearestArea(i10, i11, i12, i13, iArr);
        getViewsIntersectingRegion(iArrFindNearestArea[0], iArrFindNearestArea[1], i12, i13, view, null, this.mIntersectingViews);
        return !this.mIntersectingViews.isEmpty();
    }

    public boolean isOccupied(int i10, int i11) {
        if (i10 >= this.mCountX || i11 >= this.mCountY) {
            throw new RuntimeException("Position exceeds the bound of this CellLayout");
        }
        return this.mOccupied.cells[i10][i11];
    }

    public boolean isRegionVacant(int i10, int i11, int i12, int i13) {
        return this.mOccupied.isRegionVacant(i10, i11, i12, i13);
    }

    public void markCellsAsOccupiedForView(View view) {
        if (view == null || view.getParent() != this.mShortcutsAndWidgets) {
            return;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        this.mOccupied.markCells(layoutParams.cellX, layoutParams.cellY, layoutParams.cellHSpan, layoutParams.cellVSpan, true);
    }

    public void markCellsAsUnoccupiedForView(View view) {
        if (view == null || view.getParent() != this.mShortcutsAndWidgets) {
            return;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        this.mOccupied.markCells(layoutParams.cellX, layoutParams.cellY, layoutParams.cellHSpan, layoutParams.cellVSpan, false);
    }

    public void onDragEnter() {
        this.mDragging = true;
    }

    public void onDragExit() {
        if (this.mDragging) {
            this.mDragging = false;
        }
        int[] iArr = this.mDragCell;
        iArr[1] = -1;
        iArr[0] = -1;
        this.mDragOutlineAnims[this.mDragOutlineCurrent].animateOut();
        this.mDragOutlineCurrent = (this.mDragOutlineCurrent + 1) % this.mDragOutlineAnims.length;
        revertTempState();
        setIsDragOverlapping(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        if (this.mBackground.getAlpha() > 0) {
            this.mBackground.draw(canvas);
        }
        Paint paint = this.mDragOutlinePaint;
        for (int i11 = 0; i11 < this.mDragOutlines.length; i11++) {
            float f10 = this.mDragOutlineAlphas[i11];
            if (f10 > 0.0f) {
                Bitmap bitmap = (Bitmap) this.mDragOutlineAnims[i11].getTag();
                paint.setAlpha((int) (f10 + 0.5f));
                canvas.drawBitmap(bitmap, (Rect) null, this.mDragOutlines[i11], paint);
            }
        }
        for (int i12 = 0; i12 < this.mFolderBackgrounds.size(); i12++) {
            PreviewBackground previewBackground = this.mFolderBackgrounds.get(i12);
            cellToPoint(previewBackground.delegateCellX, previewBackground.delegateCellY, this.mTempLocation);
            canvas.save();
            int[] iArr = this.mTempLocation;
            canvas.translate(iArr[0], iArr[1]);
            previewBackground.drawBackground(canvas);
            if (!previewBackground.isClipping) {
                previewBackground.drawBackgroundStroke(canvas);
            }
            canvas.restore();
        }
        PreviewBackground previewBackground2 = this.mFolderLeaveBehind;
        int i13 = previewBackground2.delegateCellX;
        if (i13 < 0 || (i10 = previewBackground2.delegateCellY) < 0) {
            return;
        }
        cellToPoint(i13, i10, this.mTempLocation);
        canvas.save();
        int[] iArr2 = this.mTempLocation;
        canvas.translate(iArr2[0], iArr2[1]);
        this.mFolderLeaveBehind.drawLeaveBehind(canvas);
        canvas.restore();
    }

    public void onDropChild(View view) {
        if (view != null) {
            ((LayoutParams) view.getLayoutParams()).dropped = true;
            view.requestLayout();
            markCellsAsOccupiedForView(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mUseTouchHelper) {
            return true;
        }
        View.OnTouchListener onTouchListener = this.mInterceptTouchListener;
        return onTouchListener != null && onTouchListener.onTouch(this, motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft() + ((int) Math.ceil(getUnusedHorizontalSpace() / 2.0f));
        int paddingRight = ((i12 - i10) - getPaddingRight()) - ((int) Math.ceil(getUnusedHorizontalSpace() / 2.0f));
        int paddingTop = getPaddingTop();
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        this.mShortcutsAndWidgets.layout(paddingLeft, paddingTop, paddingRight, paddingBottom);
        this.mBackground.getPadding(this.mTempRect);
        this.mBackground.setBounds((paddingLeft - this.mTempRect.left) - getPaddingLeft(), (paddingTop - this.mTempRect.top) - getPaddingTop(), getPaddingRight() + paddingRight + this.mTempRect.right, getPaddingBottom() + paddingBottom + this.mTempRect.bottom);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = size2 - (getPaddingBottom() + getPaddingTop());
        if (this.mFixedCellWidth < 0 || this.mFixedCellHeight < 0) {
            int i13 = this.mCountX;
            int i14 = paddingRight / i13;
            int i15 = this.mCountY;
            int i16 = paddingBottom / i15;
            if (i14 != this.mCellWidth || i16 != this.mCellHeight) {
                this.mCellWidth = i14;
                this.mCellHeight = i16;
                this.mShortcutsAndWidgets.setCellDimensions(i14, i16, i13, i15);
            }
        }
        int i17 = this.mFixedWidth;
        if (i17 > 0 && (i12 = this.mFixedHeight) > 0) {
            paddingRight = i17;
            paddingBottom = i12;
        } else if (mode == 0 || mode2 == 0) {
            throw new RuntimeException("CellLayout cannot have UNSPECIFIED dimensions");
        }
        this.mShortcutsAndWidgets.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        int measuredWidth = this.mShortcutsAndWidgets.getMeasuredWidth();
        int measuredHeight = this.mShortcutsAndWidgets.getMeasuredHeight();
        if (this.mFixedWidth <= 0 || this.mFixedHeight <= 0) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.mLauncher.isInState(LauncherState.OVERVIEW) && this.mStylusEventHelper.onMotionEvent(motionEvent)) {
            return true;
        }
        return zOnTouchEvent;
    }

    public int[] performReorder(int i10, int i11, int i12, int i13, int i14, int i15, View view, int[] iArr, int[] iArr2, int i16) {
        int[] iArr3;
        int i17;
        boolean z10;
        int[] iArrFindNearestArea = findNearestArea(i10, i11, i14, i15, iArr);
        int[] iArr4 = iArr2 == null ? new int[2] : iArr2;
        if ((i16 == 2 || i16 == 3 || i16 == 4) && (i17 = (iArr3 = this.mPreviousReorderDirection)[0]) != -100) {
            int[] iArr5 = this.mDirectionVector;
            iArr5[0] = i17;
            iArr5[1] = iArr3[1];
            if (i16 == 2 || i16 == 3) {
                iArr3[0] = -100;
                iArr3[1] = -100;
            }
        } else {
            getDirectionVectorForDrop(i10, i11, i14, i15, view, this.mDirectionVector);
            int[] iArr6 = this.mPreviousReorderDirection;
            int[] iArr7 = this.mDirectionVector;
            iArr6[0] = iArr7[0];
            iArr6[1] = iArr7[1];
        }
        ItemConfiguration itemConfigurationFindReorderSolution = findReorderSolution(i10, i11, i12, i13, i14, i15, this.mDirectionVector, view, true, new ItemConfiguration());
        ItemConfiguration itemConfigurationFindConfigurationNoShuffle = findConfigurationNoShuffle(i10, i11, i12, i13, i14, i15, view, new ItemConfiguration());
        if (itemConfigurationFindReorderSolution.isSolution && itemConfigurationFindReorderSolution.area() >= itemConfigurationFindConfigurationNoShuffle.area()) {
            itemConfigurationFindConfigurationNoShuffle = itemConfigurationFindReorderSolution;
        } else if (!itemConfigurationFindConfigurationNoShuffle.isSolution) {
            itemConfigurationFindConfigurationNoShuffle = null;
        }
        if (i16 == 0) {
            if (itemConfigurationFindConfigurationNoShuffle == null) {
                iArr4[1] = -1;
                iArr4[0] = -1;
                iArrFindNearestArea[1] = -1;
                iArrFindNearestArea[0] = -1;
                return iArrFindNearestArea;
            }
            beginOrAdjustReorderPreviewAnimations(itemConfigurationFindConfigurationNoShuffle, view, 0, 0);
            iArrFindNearestArea[0] = itemConfigurationFindConfigurationNoShuffle.cellX;
            iArrFindNearestArea[1] = itemConfigurationFindConfigurationNoShuffle.cellY;
            iArr4[0] = itemConfigurationFindConfigurationNoShuffle.spanX;
            iArr4[1] = itemConfigurationFindConfigurationNoShuffle.spanY;
            return iArrFindNearestArea;
        }
        setUseTempCoords(true);
        if (itemConfigurationFindConfigurationNoShuffle != null) {
            iArrFindNearestArea[0] = itemConfigurationFindConfigurationNoShuffle.cellX;
            iArrFindNearestArea[1] = itemConfigurationFindConfigurationNoShuffle.cellY;
            iArr4[0] = itemConfigurationFindConfigurationNoShuffle.spanX;
            iArr4[1] = itemConfigurationFindConfigurationNoShuffle.spanY;
            if (i16 == 1 || i16 == 2 || i16 == 3) {
                copySolutionToTempState(itemConfigurationFindConfigurationNoShuffle, view);
                setItemPlacementDirty(true);
                animateItemsToSolution(itemConfigurationFindConfigurationNoShuffle, view, i16 == 2);
                if (i16 == 2 || i16 == 3) {
                    commitTempPlacement();
                    completeAndClearReorderPreviewAnimations();
                    setItemPlacementDirty(false);
                } else {
                    beginOrAdjustReorderPreviewAnimations(itemConfigurationFindConfigurationNoShuffle, view, 150, 1);
                }
            }
            z10 = true;
        } else {
            iArr4[1] = -1;
            iArr4[0] = -1;
            iArrFindNearestArea[1] = -1;
            iArrFindNearestArea[0] = -1;
            z10 = false;
        }
        if (i16 == 2 || !z10) {
            setUseTempCoords(false);
        }
        this.mShortcutsAndWidgets.requestLayout();
        return iArrFindNearestArea;
    }

    public void pointToCellExact(int i10, int i11, int[] iArr) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i12 = (i10 - paddingLeft) / this.mCellWidth;
        iArr[0] = i12;
        int i13 = (i11 - paddingTop) / this.mCellHeight;
        iArr[1] = i13;
        int i14 = this.mCountX;
        int i15 = this.mCountY;
        if (i12 < 0) {
            iArr[0] = 0;
        }
        if (iArr[0] >= i14) {
            iArr[0] = i14 - 1;
        }
        if (i13 < 0) {
            iArr[1] = 0;
        }
        if (iArr[1] >= i15) {
            iArr[1] = i15 - 1;
        }
    }

    public void pointToCellRounded(int i10, int i11, int[] iArr) {
        pointToCellExact((this.mCellWidth / 2) + i10, (this.mCellHeight / 2) + i11, iArr);
    }

    public void regionToCenterPoint(int i10, int i11, int i12, int i13, int[] iArr) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i14 = this.mCellWidth;
        iArr[0] = C2538n.a(i12, i14, 2, (i10 * i14) + paddingLeft);
        int i15 = this.mCellHeight;
        iArr[1] = C2538n.a(i13, i15, 2, (i11 * i15) + paddingTop);
    }

    public void regionToRect(int i10, int i11, int i12, int i13, Rect rect) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i14 = this.mCellWidth;
        int i15 = (i10 * i14) + paddingLeft;
        int i16 = this.mCellHeight;
        int i17 = (i11 * i16) + paddingTop;
        rect.set(i15, i17, (i12 * i14) + i15, (i13 * i16) + i17);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        this.mOccupied.clear();
        this.mShortcutsAndWidgets.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        if (this.mShortcutsAndWidgets.getChildCount() > 0) {
            this.mOccupied.clear();
            this.mShortcutsAndWidgets.removeAllViewsInLayout();
        }
    }

    public void removeFolderBackground(PreviewBackground previewBackground) {
        this.mFolderBackgrounds.remove(previewBackground);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        markCellsAsUnoccupiedForView(view);
        this.mShortcutsAndWidgets.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        markCellsAsUnoccupiedForView(this.mShortcutsAndWidgets.getChildAt(i10));
        this.mShortcutsAndWidgets.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        markCellsAsUnoccupiedForView(view);
        this.mShortcutsAndWidgets.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            markCellsAsUnoccupiedForView(this.mShortcutsAndWidgets.getChildAt(i12));
        }
        this.mShortcutsAndWidgets.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            markCellsAsUnoccupiedForView(this.mShortcutsAndWidgets.getChildAt(i12));
        }
        this.mShortcutsAndWidgets.removeViewsInLayout(i10, i11);
    }

    public void restoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchRestoreInstanceState(sparseArray);
    }

    public void revertTempState() {
        completeAndClearReorderPreviewAnimations();
        if (isItemPlacementDirty()) {
            int childCount = this.mShortcutsAndWidgets.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.mShortcutsAndWidgets.getChildAt(i10);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i11 = layoutParams.tmpCellX;
                int i12 = layoutParams.cellX;
                if (i11 != i12 || layoutParams.tmpCellY != layoutParams.cellY) {
                    layoutParams.tmpCellX = i12;
                    int i13 = layoutParams.cellY;
                    layoutParams.tmpCellY = i13;
                    animateChildToPosition(childAt, i12, i13, 150, 0, false, false);
                }
            }
            setItemPlacementDirty(false);
        }
    }

    public void setCellDimensions(int i10, int i11) {
        this.mCellWidth = i10;
        this.mFixedCellWidth = i10;
        this.mCellHeight = i11;
        this.mFixedCellHeight = i11;
        this.mShortcutsAndWidgets.setCellDimensions(i10, i11, this.mCountX, this.mCountY);
    }

    public void setDropPending(boolean z10) {
        this.mDropPending = z10;
    }

    public void setFixedSize(int i10, int i11) {
        this.mFixedWidth = i10;
        this.mFixedHeight = i11;
    }

    public void setFolderLeaveBehindCell(int i10, int i11) {
        View childAt = getChildAt(i10, i11);
        this.mFolderLeaveBehind.setup(this.mLauncher, null, childAt.getMeasuredWidth(), childAt.getPaddingTop());
        PreviewBackground previewBackground = this.mFolderLeaveBehind;
        previewBackground.delegateCellX = i10;
        previewBackground.delegateCellY = i11;
        invalidate();
    }

    public void setGridSize(int i10, int i11) {
        this.mCountX = i10;
        this.mCountY = i11;
        this.mOccupied = new GridOccupancy(i10, i11);
        this.mTmpOccupied = new GridOccupancy(this.mCountX, this.mCountY);
        this.mTempRectStack.clear();
        this.mShortcutsAndWidgets.setCellDimensions(this.mCellWidth, this.mCellHeight, this.mCountX, this.mCountY);
        requestLayout();
    }

    public void setInvertIfRtl(boolean z10) {
        this.mShortcutsAndWidgets.setInvertIfRtl(z10);
    }

    public void setIsDragOverlapping(boolean z10) {
        if (this.mIsDragOverlapping != z10) {
            this.mIsDragOverlapping = z10;
            this.mBackground.setState(z10 ? BACKGROUND_STATE_ACTIVE : BACKGROUND_STATE_DEFAULT);
            invalidate();
        }
    }

    public void setItemPlacementDirty(boolean z10) {
        this.mItemPlacementDirty = z10;
    }

    public void setOnInterceptTouchListener(View.OnTouchListener onTouchListener) {
        this.mInterceptTouchListener = onTouchListener;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mBackground;
    }

    public void visualizeDropLocation(View view, DragPreviewProvider dragPreviewProvider, int i10, int i11, int i12, int i13, boolean z10, DropTarget.DragObject dragObject) {
        Bitmap bitmap;
        int width;
        int height;
        int width2;
        int height2;
        int[] iArr = this.mDragCell;
        int i14 = iArr[0];
        int i15 = iArr[1];
        if (dragPreviewProvider == null || (bitmap = dragPreviewProvider.generatedDragOutline) == null) {
            return;
        }
        if (i10 == i14 && i11 == i15) {
            return;
        }
        Point dragVisualizeOffset = dragObject.dragView.getDragVisualizeOffset();
        Rect dragRegion = dragObject.dragView.getDragRegion();
        int[] iArr2 = this.mDragCell;
        iArr2[0] = i10;
        iArr2[1] = i11;
        int i16 = this.mDragOutlineCurrent;
        this.mDragOutlineAnims[i16].animateOut();
        Rect[] rectArr = this.mDragOutlines;
        int length = (i16 + 1) % rectArr.length;
        this.mDragOutlineCurrent = length;
        Rect rect = rectArr[length];
        if (z10) {
            cellToRect(i10, i11, i12, i13, rect);
            if (view instanceof LauncherAppWidgetHostView) {
                PointF pointF = this.mLauncher.getDeviceProfile().appWidgetScale;
                Utilities.shrinkRect(rect, pointF.x, pointF.y);
            }
        } else {
            int[] iArr3 = this.mTmpPoint;
            cellToPoint(i10, i11, iArr3);
            int i17 = iArr3[0];
            int i18 = iArr3[1];
            if (view == null || dragVisualizeOffset != null) {
                if (dragVisualizeOffset == null || dragRegion == null) {
                    width = (((this.mCellWidth * i12) - bitmap.getWidth()) / 2) + i17;
                    height = i18 + (((this.mCellHeight * i13) - bitmap.getHeight()) / 2);
                } else {
                    width = (((this.mCellWidth * i12) - dragRegion.width()) / 2) + dragVisualizeOffset.x + i17;
                    height = i18 + dragVisualizeOffset.y + ((int) Math.max(0.0f, (this.mCellHeight - getShortcutsAndWidgets().getCellContentHeight()) / 2.0f));
                }
                int i19 = height;
                width2 = width;
                height2 = i19;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int i20 = i17 + marginLayoutParams.leftMargin;
                height2 = (((this.mCellHeight * i13) - bitmap.getHeight()) / 2) + i18 + marginLayoutParams.topMargin;
                width2 = (((this.mCellWidth * i12) - bitmap.getWidth()) / 2) + i20;
            }
            rect.set(width2, height2, bitmap.getWidth() + width2, bitmap.getHeight() + height2);
        }
        Utilities.scaleRectAboutCenter(rect, 1.0f);
        this.mDragOutlineAnims[this.mDragOutlineCurrent].setTag(bitmap);
        this.mDragOutlineAnims[this.mDragOutlineCurrent].animateIn();
        DragViewStateAnnouncer dragViewStateAnnouncer = dragObject.stateAnnouncer;
        if (dragViewStateAnnouncer != null) {
            dragViewStateAnnouncer.announce(getItemMoveDescription(i10, i11));
        }
    }

    public CellLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public CellLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mDropPending = false;
        this.mTmpPoint = new int[2];
        this.mTempLocation = new int[2];
        this.mFolderBackgrounds = new ArrayList<>();
        PreviewBackground previewBackground = new PreviewBackground();
        this.mFolderLeaveBehind = previewBackground;
        this.mFixedWidth = -1;
        this.mFixedHeight = -1;
        this.mIsDragOverlapping = false;
        this.mDragOutlines = new Rect[4];
        this.mDragOutlineAlphas = new float[4];
        this.mDragOutlineAnims = new InterruptibleInOutAnimator[4];
        this.mDragOutlineCurrent = 0;
        this.mDragOutlinePaint = new Paint();
        this.mReorderAnimators = new ArrayMap<>();
        this.mShakeAnimators = new ArrayMap<>();
        this.mItemPlacementDirty = false;
        this.mDragCell = new int[]{-1, -1};
        this.mDragging = false;
        this.mChildScale = 1.0f;
        this.mIntersectingViews = new ArrayList<>();
        this.mOccupiedRect = new Rect();
        this.mDirectionVector = new int[2];
        this.mPreviousReorderDirection = new int[]{-100, -100};
        this.mTempRect = new Rect();
        this.mUseTouchHelper = false;
        this.mTempRectStack = new Stack<>();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CellLayout, i10, 0);
        this.mContainerType = typedArrayObtainStyledAttributes.getInteger(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        setClipToPadding(false);
        Launcher launcher = Launcher.getLauncher(context);
        this.mLauncher = launcher;
        DeviceProfile deviceProfile = launcher.getDeviceProfile();
        this.mCellHeight = -1;
        this.mCellWidth = -1;
        this.mFixedCellHeight = -1;
        this.mFixedCellWidth = -1;
        InvariantDeviceProfile invariantDeviceProfile = deviceProfile.inv;
        int i11 = invariantDeviceProfile.numColumns;
        this.mCountX = i11;
        int i12 = invariantDeviceProfile.numRows;
        this.mCountY = i12;
        this.mOccupied = new GridOccupancy(i11, i12);
        this.mTmpOccupied = new GridOccupancy(this.mCountX, this.mCountY);
        previewBackground.delegateCellX = -1;
        previewBackground.delegateCellY = -1;
        setAlwaysDrawnWithCacheEnabled(false);
        Resources resources = getResources();
        Drawable drawable = resources.getDrawable(com.app.hider.master.promax.R.drawable.bg_celllayout);
        this.mBackground = drawable;
        drawable.setCallback(this);
        drawable.setAlpha(0);
        this.mReorderPreviewAnimationMagnitude = deviceProfile.iconSizePx * 0.12f;
        this.mEaseOutInterpolator = Interpolators.DEACCEL_2_5;
        int i13 = 0;
        while (true) {
            Rect[] rectArr = this.mDragOutlines;
            if (i13 >= rectArr.length) {
                break;
            }
            rectArr[i13] = new Rect(-1, -1, -1, -1);
            i13++;
        }
        this.mDragOutlinePaint.setColor(Themes.getAttrColor(context, com.app.hider.master.promax.R.attr.workspaceTextColor));
        int integer = resources.getInteger(com.app.hider.master.promax.R.integer.config_dragOutlineFadeTime);
        float integer2 = resources.getInteger(com.app.hider.master.promax.R.integer.config_dragOutlineMaxAlpha);
        Arrays.fill(this.mDragOutlineAlphas, 0.0f);
        for (final int i14 = 0; i14 < this.mDragOutlineAnims.length; i14++) {
            final InterruptibleInOutAnimator interruptibleInOutAnimator = new InterruptibleInOutAnimator(this, integer, 0.0f, integer2);
            interruptibleInOutAnimator.getAnimator().setInterpolator(this.mEaseOutInterpolator);
            interruptibleInOutAnimator.getAnimator().addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.launcher3.CellLayout.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (((Bitmap) interruptibleInOutAnimator.getTag()) == null) {
                        valueAnimator.cancel();
                        return;
                    }
                    CellLayout.this.mDragOutlineAlphas[i14] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    CellLayout cellLayout = CellLayout.this;
                    cellLayout.invalidate(cellLayout.mDragOutlines[i14]);
                }
            });
            interruptibleInOutAnimator.getAnimator().addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.CellLayout.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue() == 0.0f) {
                        interruptibleInOutAnimator.setTag(null);
                    }
                }
            });
            this.mDragOutlineAnims[i14] = interruptibleInOutAnimator;
        }
        ShortcutAndWidgetContainer shortcutAndWidgetContainer = new ShortcutAndWidgetContainer(context, this.mContainerType);
        this.mShortcutsAndWidgets = shortcutAndWidgetContainer;
        shortcutAndWidgetContainer.setCellDimensions(this.mCellWidth, this.mCellHeight, this.mCountX, this.mCountY);
        this.mStylusEventHelper = new StylusEventHelper(new SimpleOnStylusPressListener(this), this);
        addView(shortcutAndWidgetContainer);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] findNearestArea(int r19, int r20, int r21, int r22, int[] r23, boolean[][] r24, boolean[][] r25, int[] r26) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            r2 = r22
            if (r26 == 0) goto Lb
            r3 = r26
            goto Le
        Lb:
            r3 = 2
            int[] r3 = new int[r3]
        Le:
            int r4 = r0.mCountX
            int r5 = r0.mCountY
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 0
            r10 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L18:
            int r11 = r2 + (-1)
            int r11 = r5 - r11
            r12 = 1
            if (r9 >= r11) goto L8f
            r11 = 0
        L20:
            int r13 = r1 + (-1)
            int r13 = r4 - r13
            if (r11 >= r13) goto L87
            r13 = 0
        L27:
            if (r13 >= r1) goto L4a
            r14 = 0
        L2a:
            if (r14 >= r2) goto L47
            int r15 = r11 + r13
            r15 = r24[r15]
            int r16 = r9 + r14
            boolean r15 = r15[r16]
            if (r15 == 0) goto L44
            if (r25 == 0) goto L3e
            r15 = r25[r13]
            boolean r15 = r15[r14]
            if (r15 == 0) goto L44
        L3e:
            r26 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r16 = 0
            goto L84
        L44:
            int r14 = r14 + 1
            goto L2a
        L47:
            int r13 = r13 + 1
            goto L27
        L4a:
            int r13 = r11 - r19
            double r14 = (double) r13
            r26 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r6 = r9 - r20
            r17 = r8
            r16 = 0
            double r7 = (double) r6
            double r7 = java.lang.Math.hypot(r14, r7)
            float r7 = (float) r7
            int[] r8 = r0.mTmpPoint
            float r13 = (float) r13
            float r6 = (float) r6
            r0.computeDirectionVector(r13, r6, r8)
            r6 = r23[r16]
            r13 = r8[r16]
            int r6 = r6 * r13
            r13 = r23[r12]
            r8 = r8[r12]
            int r13 = r13 * r8
            int r13 = r13 + r6
            int r6 = java.lang.Float.compare(r7, r10)
            if (r6 < 0) goto L7e
            int r6 = java.lang.Float.compare(r7, r10)
            r8 = r17
            if (r6 != 0) goto L84
            if (r13 <= r8) goto L84
        L7e:
            r3[r16] = r11
            r3[r12] = r9
            r10 = r7
            r8 = r13
        L84:
            int r11 = r11 + 1
            goto L20
        L87:
            r26 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r16 = 0
            int r9 = r9 + 1
            goto L18
        L8f:
            r26 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r16 = 0
            int r1 = (r10 > r26 ? 1 : (r10 == r26 ? 0 : -1))
            if (r1 != 0) goto L9d
            r1 = -1
            r3[r16] = r1
            r3[r12] = r1
        L9d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.CellLayout.findNearestArea(int, int, int, int, int[], boolean[][], boolean[][], int[]):int[]");
    }

    public int[] findNearestArea(int i10, int i11, int i12, int i13, int[] iArr) {
        return findNearestArea(i10, i11, i12, i13, i12, i13, false, iArr, null);
    }
}
