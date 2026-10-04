package com.android.launcher3.popup;

import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.launcher3.AbstractFloatingView;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.DragSource;
import com.android.launcher3.DropTarget;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.ItemInfoWithIcon;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.accessibility.LauncherAccessibilityDelegate;
import com.android.launcher3.accessibility.ShortcutMenuAccessibilityDelegate;
import com.android.launcher3.badge.BadgeInfo;
import com.android.launcher3.dragndrop.DragController;
import com.android.launcher3.dragndrop.DragLayer;
import com.android.launcher3.dragndrop.DragOptions;
import com.android.launcher3.logging.LoggerUtils;
import com.android.launcher3.notification.NotificationInfo;
import com.android.launcher3.notification.NotificationItemView;
import com.android.launcher3.notification.NotificationKeyData;
import com.android.launcher3.notification.NotificationMainView;
import com.android.launcher3.popup.SystemShortcut;
import com.android.launcher3.shortcuts.DeepShortcutView;
import com.android.launcher3.shortcuts.ShortcutDragPreviewProvider;
import com.android.launcher3.touch.ItemLongClickListener;
import com.android.launcher3.userevent.nano.LauncherLogProto;
import com.android.launcher3.util.PackageUserKey;
import com.app.hider.master.promax.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
public class PopupContainerWithArrow extends ArrowPopup implements DragSource, DragController.DragListener, View.OnLongClickListener, View.OnTouchListener {
    private final LauncherAccessibilityDelegate mAccessibilityDelegate;
    private final Point mIconLastTouchPos;
    private final PointF mInterceptTouchDown;
    private NotificationItemView mNotificationItemView;
    private int mNumNotifications;
    private BubbleTextView mOriginalIcon;
    private final List<DeepShortcutView> mShortcuts;
    private final int mStartDragThreshold;
    private ViewGroup mSystemShortcutContainer;

    public PopupContainerWithArrow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mShortcuts = new ArrayList();
        this.mInterceptTouchDown = new PointF();
        this.mIconLastTouchPos = new Point();
        this.mStartDragThreshold = getResources().getDimensionPixelSize(R.dimen.deep_shortcuts_start_drag_threshold);
        this.mAccessibilityDelegate = new ShortcutMenuAccessibilityDelegate(this.mLauncher);
    }

    public static PopupContainerWithArrow getOpen(Launcher launcher) {
        return (PopupContainerWithArrow) AbstractFloatingView.getOpenView(launcher, 2);
    }

    private String getTitleForAccessibility() {
        return getContext().getString(this.mNumNotifications == 0 ? R.string.action_deep_shortcut : R.string.shortcuts_menu_with_notifications_description);
    }

    private void initializeSystemShortcut(int i10, ViewGroup viewGroup, SystemShortcut systemShortcut) {
        View viewInflateAndAdd = inflateAndAdd(i10, viewGroup);
        if (viewInflateAndAdd instanceof DeepShortcutView) {
            DeepShortcutView deepShortcutView = (DeepShortcutView) viewInflateAndAdd;
            deepShortcutView.getIconView().setBackgroundResource(systemShortcut.iconResId);
            deepShortcutView.getBubbleText().setText(systemShortcut.labelResId);
        } else if (viewInflateAndAdd instanceof ImageView) {
            ImageView imageView = (ImageView) viewInflateAndAdd;
            imageView.setImageResource(systemShortcut.iconResId);
            imageView.setContentDescription(getContext().getText(systemShortcut.labelResId));
        }
        viewInflateAndAdd.setTag(systemShortcut);
        viewInflateAndAdd.setOnClickListener(systemShortcut.getOnClickListener(this.mLauncher, (ItemInfo) this.mOriginalIcon.getTag()));
    }

    @TargetApi(28)
    private void populateAndShow(BubbleTextView bubbleTextView, List<String> list, List<NotificationKeyData> list2, List<SystemShortcut> list3) {
        int size = list2.size();
        this.mNumNotifications = size;
        this.mOriginalIcon = bubbleTextView;
        if (size > 0) {
            View.inflate(getContext(), R.layout.notification_content, this);
            NotificationItemView notificationItemView = new NotificationItemView(this);
            this.mNotificationItemView = notificationItemView;
            if (this.mNumNotifications == 1) {
                notificationItemView.removeFooter();
            }
            updateNotificationHeader();
        }
        int childCount = getChildCount();
        this.mSystemShortcutContainer = this;
        if (!list.isEmpty()) {
            NotificationItemView notificationItemView2 = this.mNotificationItemView;
            if (notificationItemView2 != null) {
                notificationItemView2.addGutter();
            }
            for (int size2 = list.size(); size2 > 0; size2--) {
                this.mShortcuts.add((DeepShortcutView) inflateAndAdd(R.layout.deep_shortcut, this));
            }
            updateHiddenShortcuts();
            if (!list3.isEmpty()) {
                this.mSystemShortcutContainer = (ViewGroup) inflateAndAdd(R.layout.system_shortcut_icons, this);
                Iterator<SystemShortcut> it = list3.iterator();
                while (it.hasNext()) {
                    initializeSystemShortcut(R.layout.system_shortcut_icon_only, this.mSystemShortcutContainer, it.next());
                }
            }
        } else if (!list3.isEmpty()) {
            NotificationItemView notificationItemView3 = this.mNotificationItemView;
            if (notificationItemView3 != null) {
                notificationItemView3.addGutter();
            }
            Iterator<SystemShortcut> it2 = list3.iterator();
            while (it2.hasNext()) {
                initializeSystemShortcut(R.layout.system_shortcut, this, it2.next());
            }
        }
        reorderAndShow(childCount);
        ItemInfo itemInfo = (ItemInfo) bubbleTextView.getTag();
        if (Build.VERSION.SDK_INT >= 28) {
            setAccessibilityPaneTitle(getTitleForAccessibility());
        }
        this.mLauncher.getDragController().addDragListener(this);
        this.mOriginalIcon.forceHideBadge(true);
        setLayoutTransition(new LayoutTransition());
        new Handler(LauncherModel.getWorkerLooper()).postAtFrontOfQueue(PopupPopulator.createUpdateRunnable(this.mLauncher, itemInfo, new Handler(Looper.getMainLooper()), this, list, this.mShortcuts, list2));
    }

    public static PopupContainerWithArrow showForIcon(BubbleTextView bubbleTextView) {
        if (getOpen(Launcher.getLauncher(bubbleTextView.getContext())) != null) {
            bubbleTextView.clearFocus();
            return null;
        }
        return null;
    }

    private void updateDividers() {
        int childCount = getChildCount();
        DeepShortcutView deepShortcutView = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (childAt instanceof DeepShortcutView)) {
                if (deepShortcutView != null) {
                    deepShortcutView.setDividerVisibility(0);
                }
                DeepShortcutView deepShortcutView2 = (DeepShortcutView) childAt;
                deepShortcutView2.setDividerVisibility(4);
                deepShortcutView = deepShortcutView2;
            }
        }
    }

    private void updateHiddenShortcuts() {
        int i10 = this.mNotificationItemView != null ? 2 : 4;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.bg_popup_item_height);
        int dimensionPixelSize2 = this.mNotificationItemView != null ? getResources().getDimensionPixelSize(R.dimen.bg_popup_item_condensed_height) : dimensionPixelSize;
        float f10 = dimensionPixelSize2 / dimensionPixelSize;
        int size = this.mShortcuts.size();
        int i11 = 0;
        while (i11 < size) {
            DeepShortcutView deepShortcutView = this.mShortcuts.get(i11);
            deepShortcutView.setVisibility(i11 >= i10 ? 8 : 0);
            deepShortcutView.getLayoutParams().height = dimensionPixelSize2;
            deepShortcutView.getIconView().setScaleX(f10);
            deepShortcutView.getIconView().setScaleY(f10);
            i11++;
        }
    }

    public void applyNotificationInfos(List<NotificationInfo> list) {
        this.mNotificationItemView.applyNotificationInfos(list);
    }

    @Override // com.android.launcher3.popup.ArrowPopup
    public void closeComplete() {
        super.closeComplete();
        BubbleTextView bubbleTextView = this.mOriginalIcon;
        bubbleTextView.setTextVisibility(bubbleTextView.shouldTextBeVisible());
        this.mOriginalIcon.forceHideBadge(false);
    }

    public DragOptions.PreDragCondition createPreDragCondition() {
        return new DragOptions.PreDragCondition() { // from class: com.android.launcher3.popup.PopupContainerWithArrow.1
            @Override // com.android.launcher3.dragndrop.DragOptions.PreDragCondition
            public void onPreDragEnd(DropTarget.DragObject dragObject, boolean z10) {
                PopupContainerWithArrow.this.mOriginalIcon.setIconVisible(true);
                if (z10) {
                    PopupContainerWithArrow.this.mOriginalIcon.setVisibility(4);
                    return;
                }
                PopupContainerWithArrow.this.mLauncher.getUserEventDispatcher().logDeepShortcutsOpen(PopupContainerWithArrow.this.mOriginalIcon);
                PopupContainerWithArrow popupContainerWithArrow = PopupContainerWithArrow.this;
                if (popupContainerWithArrow.mIsAboveIcon) {
                    return;
                }
                popupContainerWithArrow.mOriginalIcon.setVisibility(0);
                PopupContainerWithArrow.this.mOriginalIcon.setTextVisibility(false);
            }

            @Override // com.android.launcher3.dragndrop.DragOptions.PreDragCondition
            public void onPreDragStart(DropTarget.DragObject dragObject) {
                PopupContainerWithArrow popupContainerWithArrow = PopupContainerWithArrow.this;
                if (!popupContainerWithArrow.mIsAboveIcon) {
                    popupContainerWithArrow.mOriginalIcon.setVisibility(4);
                } else {
                    popupContainerWithArrow.mOriginalIcon.setIconVisible(false);
                    PopupContainerWithArrow.this.mOriginalIcon.setVisibility(0);
                }
            }

            @Override // com.android.launcher3.dragndrop.DragOptions.PreDragCondition
            public boolean shouldStartDrag(double d10) {
                return d10 > ((double) PopupContainerWithArrow.this.mStartDragThreshold);
            }
        };
    }

    @Override // com.android.launcher3.logging.UserEventDispatcher.LogContainerProvider
    public void fillInLogContainerData(View view, ItemInfo itemInfo, LauncherLogProto.Target target, LauncherLogProto.Target target2) {
        if (itemInfo == NotificationMainView.NOTIFICATION_ITEM_INFO) {
            target.itemType = 8;
        } else {
            target.itemType = 5;
            target.rank = itemInfo.rank;
        }
        target2.containerType = 9;
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public Pair<View, String> getAccessibilityTarget() {
        return Pair.create(this, "");
    }

    @Override // com.android.launcher3.popup.ArrowPopup
    public void getTargetObjectLocation(Rect rect) {
        this.mLauncher.getDragLayer().getDescendantRectRelativeToSelf(this.mOriginalIcon, rect);
        rect.top = this.mOriginalIcon.getPaddingTop() + rect.top;
        rect.left = this.mOriginalIcon.getPaddingLeft() + rect.left;
        rect.right -= this.mOriginalIcon.getPaddingRight();
        rect.bottom = rect.top + (this.mOriginalIcon.getIcon() != null ? this.mOriginalIcon.getIcon().getBounds().height() : this.mOriginalIcon.getHeight());
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public boolean isOfType(int i10) {
        return (i10 & 2) != 0;
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public void logActionCommand(int i10) {
        this.mLauncher.getUserEventDispatcher().logActionCommand(i10, this.mOriginalIcon, 9);
    }

    @Override // com.android.launcher3.util.TouchController
    public boolean onControllerInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        DragLayer dragLayer = this.mLauncher.getDragLayer();
        if (dragLayer.isEventOverView(this, motionEvent)) {
            return false;
        }
        this.mLauncher.getUserEventDispatcher().logActionTapOutside(LoggerUtils.newContainerTarget(9));
        close(true);
        BubbleTextView bubbleTextView = this.mOriginalIcon;
        return bubbleTextView == null || !dragLayer.isEventOverView(bubbleTextView, motionEvent);
    }

    @Override // com.android.launcher3.popup.ArrowPopup
    public void onCreateCloseAnimation(AnimatorSet animatorSet) {
        animatorSet.play(this.mOriginalIcon.createTextAlphaAnimator(true));
        this.mOriginalIcon.forceHideBadge(false);
    }

    @Override // com.android.launcher3.dragndrop.DragController.DragListener
    public void onDragEnd() {
        if (this.mIsOpen) {
            return;
        }
        if (this.mOpenCloseAnimator != null) {
            this.mDeferContainerRemoval = false;
        } else if (this.mDeferContainerRemoval) {
            closeComplete();
        }
    }

    @Override // com.android.launcher3.dragndrop.DragController.DragListener
    public void onDragStart(DropTarget.DragObject dragObject, DragOptions dragOptions) {
        this.mDeferContainerRemoval = true;
        animateClose();
    }

    @Override // com.android.launcher3.DragSource
    public void onDropCompleted(View view, DropTarget.DragObject dragObject, boolean z10) {
    }

    @Override // com.android.launcher3.popup.ArrowPopup
    public void onInflationComplete(boolean z10) {
        NotificationItemView notificationItemView;
        if (z10 && (notificationItemView = this.mNotificationItemView) != null) {
            notificationItemView.inverseGutterMargin();
        }
        int childCount = getChildCount();
        DeepShortcutView deepShortcutView = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (childAt instanceof DeepShortcutView)) {
                if (deepShortcutView != null) {
                    deepShortcutView.setDividerVisibility(0);
                }
                DeepShortcutView deepShortcutView2 = (DeepShortcutView) childAt;
                deepShortcutView2.setDividerVisibility(4);
                deepShortcutView = deepShortcutView2;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mInterceptTouchDown.set(motionEvent.getX(), motionEvent.getY());
        }
        NotificationItemView notificationItemView = this.mNotificationItemView;
        return (notificationItemView != null && notificationItemView.onInterceptTouchEvent(motionEvent)) || Math.hypot((double) (this.mInterceptTouchDown.x - motionEvent.getX()), (double) (this.mInterceptTouchDown.y - motionEvent.getY())) > ((double) ViewConfiguration.get(getContext()).getScaledTouchSlop());
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (!ItemLongClickListener.canStartDrag(this.mLauncher) || !(view.getParent() instanceof DeepShortcutView)) {
            return false;
        }
        DeepShortcutView deepShortcutView = (DeepShortcutView) view.getParent();
        deepShortcutView.setWillDrawIcon(false);
        Point point = new Point();
        point.x = this.mIconLastTouchPos.x - deepShortcutView.getIconCenter().x;
        point.y = this.mIconLastTouchPos.y - this.mLauncher.getDeviceProfile().iconSizePx;
        this.mLauncher.getWorkspace().beginDragShared(deepShortcutView.getIconView(), this, deepShortcutView.getFinalInfo(), new ShortcutDragPreviewProvider(deepShortcutView.getIconView(), point), new DragOptions()).animateShift(-point.x, -point.y);
        AbstractFloatingView.closeOpenContainer(this.mLauncher, 1);
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && action != 2) {
            return false;
        }
        this.mIconLastTouchPos.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return false;
    }

    @Override // com.android.launcher3.AbstractFloatingView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        NotificationItemView notificationItemView = this.mNotificationItemView;
        if (notificationItemView != null) {
            notificationItemView.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public void onWidgetsBound() {
        View childAt;
        ItemInfo itemInfo = (ItemInfo) this.mOriginalIcon.getTag();
        SystemShortcut.Widgets widgets = new SystemShortcut.Widgets();
        View.OnClickListener onClickListener = widgets.getOnClickListener(this.mLauncher, itemInfo);
        int childCount = this.mSystemShortcutContainer.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                childAt = null;
                break;
            }
            childAt = this.mSystemShortcutContainer.getChildAt(i10);
            if (childAt.getTag() instanceof SystemShortcut.Widgets) {
                break;
            } else {
                i10++;
            }
        }
        if (onClickListener != null && childAt == null) {
            ViewGroup viewGroup = this.mSystemShortcutContainer;
            if (viewGroup != this) {
                initializeSystemShortcut(R.layout.system_shortcut_icon_only, viewGroup, widgets);
                return;
            } else {
                close(false);
                showForIcon(this.mOriginalIcon);
                return;
            }
        }
        if (onClickListener != null || childAt == null) {
            return;
        }
        ViewGroup viewGroup2 = this.mSystemShortcutContainer;
        if (viewGroup2 != this) {
            viewGroup2.removeView(childAt);
        } else {
            close(false);
            showForIcon(this.mOriginalIcon);
        }
    }

    public void trimNotifications(Map<PackageUserKey, BadgeInfo> map) {
        if (this.mNotificationItemView == null) {
            return;
        }
        BadgeInfo badgeInfo = map.get(PackageUserKey.fromItemInfo((ItemInfo) this.mOriginalIcon.getTag()));
        if (badgeInfo != null && badgeInfo.getNotificationKeys().size() != 0) {
            this.mNotificationItemView.trimNotifications(NotificationKeyData.extractKeysOnly(badgeInfo.getNotificationKeys()));
            return;
        }
        this.mNotificationItemView.removeAllViews();
        this.mNotificationItemView = null;
        updateHiddenShortcuts();
        updateDividers();
    }

    public void updateNotificationHeader(Set<PackageUserKey> set) {
        if (set.contains(PackageUserKey.fromItemInfo((ItemInfo) this.mOriginalIcon.getTag()))) {
            updateNotificationHeader();
        }
    }

    @Override // android.view.View
    public LauncherAccessibilityDelegate getAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    private void updateNotificationHeader() {
        ItemInfoWithIcon itemInfoWithIcon = (ItemInfoWithIcon) this.mOriginalIcon.getTag();
        BadgeInfo badgeInfoForItem = this.mLauncher.getBadgeInfoForItem(itemInfoWithIcon);
        NotificationItemView notificationItemView = this.mNotificationItemView;
        if (notificationItemView == null || badgeInfoForItem == null) {
            return;
        }
        notificationItemView.updateHeader(badgeInfoForItem.getNotificationDisplayCount(), itemInfoWithIcon.iconColor);
    }

    public PopupContainerWithArrow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PopupContainerWithArrow(Context context) {
        this(context, null, 0);
    }
}
